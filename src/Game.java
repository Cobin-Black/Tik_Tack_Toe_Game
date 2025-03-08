import java.util.Scanner;
//import java.util.Arrays;

public class Game {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        char[] board_spots = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};

        System.out.print(board_spots[0] + " | " + board_spots[1] + " | " + board_spots[2] + "\n" +
                         "--|---|--\n" +
                         board_spots[3] + " | " + board_spots[4] + " | " + board_spots[5] + "\n" +
                         "--|---|--\n" +
                         board_spots[6] + " | " + board_spots[7] + " | " + board_spots[8]);
    }
}
