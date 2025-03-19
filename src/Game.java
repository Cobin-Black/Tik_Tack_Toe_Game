import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        
        char[] board_spots = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

        int winner = 0;
        int number_of_moves = 9;

        int coin_flip = rand.nextInt(2);
        System.out.println("Heads is Player 1:(X) and Tails is Player 2:(O)");
        System.out.println("\nCoin flip result: " + (coin_flip == 0 ? "Heads (Player 1) Starts" : "Tails (Player 2) Starts"));

        int current_player = coin_flip;

        while(winner == 0 || number_of_moves < 0)
        {
            System.out.println("\n" + board_spots[0] + " | " + board_spots[1] + " | " + board_spots[2] + "\n" +
                         "--|---|--\n" +
                         board_spots[3] + " | " + board_spots[4] + " | " + board_spots[5] + "\n" +
                         "--|---|--\n" +
                         board_spots[6] + " | " + board_spots[7] + " | " + board_spots[8]);


            System.out.println("\nPlayer " + ((current_player == 0) ? "1:(X)" : "2:(O)"));
            System.out.print("Enter Your Move (number 0-8):");

            int player_move = scnr.nextInt();

            if(player_move >= 0 && player_move <= 8 && board_spots[player_move] != 'X' && board_spots[player_move] != 'O')//Checks to see if players input is in the right bound and spot isn't taken up already
            {
                board_spots[player_move] = current_player == 0 ? 'X' : 'O';
                current_player = 1 - current_player;
                number_of_moves--;
            }
            else
            {
                System.out.println("\nInvalid move. Try again.");
            }

            
            winner = checkWinner(board_spots);

            if(winner == 1)
            {
                System.out.println("\nPlayer 1 Wins");
                break;
            }
            else if(winner == 2)
            {
                System.out.println("\nPlayer 2 Wins");
                break;
            }

            if(number_of_moves == 0)
            {
                System.out.println("\nNo One Wins");
                break;
            }
        }

        System.out.print("\n" + board_spots[0] + " | " + board_spots[1] + " | " + board_spots[2] + "\n" +
                         "--|---|--\n" +
                         board_spots[3] + " | " + board_spots[4] + " | " + board_spots[5] + "\n" +
                         "--|---|--\n" +
                         board_spots[6] + " | " + board_spots[7] + " | " + board_spots[8]);
    }

    public static int checkWinner(char[] board)
    {
        int[][] win_combination = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, //Row Win
            {0, 3 ,6}, {1, 4, 7}, {2, 5, 8}, //Column Win
            {0, 4, 8}, {2, 4, 6}             //Diagonal win
        };

        for(int[] combo : win_combination)
        {
            if(board[combo[0]] == board[combo[1]] && board[combo[1]] == board[combo[2]]) //Checking the position of each array are equal to one another. Ex: {6, 7, 8} = {0, 1, 2}
            {
                if(board[combo[0]] == 'X')
                {
                    return 1; //Player 1
                }
                else if(board[combo[0]] == 'O')
                {
                    return 2; //Player 2
                }
            }
        }
        return 0; //No one wins
    }
}
