package tictactoe;
import java.util.Scanner;

public class UC2_ChooseLetter {
    int i;
    static char[] board = new char[10];
    static char player, computer;

    Scanner scanner = new Scanner(System.in);

    public void initialize() {
        for (i = 1; i < 10; i++) {   //initialize
            board[i] = ' ';
        }
    }
    public void check() {
        System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X') {
            player = 'X';
            computer = 'O';
        } else if (choice == 'O') {
            player = 'O';
            computer = 'X';
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        UC2_ChooseLetter obj1 = new UC2_ChooseLetter();
        obj1.check();
    }

}
