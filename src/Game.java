import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        
        char[] board_spots = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

        int winner = 0;

        int coin_flip = rand.nextInt(2);
        System.out.println("Heads is Player 1:(X) and Tails is Player 2:(O)");
        System.out.println("\nCoin flip result: " + (coin_flip == 0 ? "Heads (Player 1) starts" : "Tails (Player 2) starts"));

        int current_player = coin_flip;

        System.out.print(current_player);

        // while(winner == 0)
        // {
        //     System.out.println(board_spots[0] + " | " + board_spots[1] + " | " + board_spots[2] + "\n" +
        //                  "--|---|--\n" +
        //                  board_spots[3] + " | " + board_spots[4] + " | " + board_spots[5] + "\n" +
        //                  "--|---|--\n" +
        //                  board_spots[6] + " | " + board_spots[7] + " | " + board_spots[8]);

            
        // }

    //     System.out.print(board_spots[0] + " | " + board_spots[1] + " | " + board_spots[2] + "\n" +
    //                      "--|---|--\n" +
    //                      board_spots[3] + " | " + board_spots[4] + " | " + board_spots[5] + "\n" +
    //                      "--|---|--\n" +
    //                      board_spots[6] + " | " + board_spots[7] + " | " + board_spots[8]);
    // }
    }
}
