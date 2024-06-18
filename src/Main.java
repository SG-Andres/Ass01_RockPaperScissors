import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1;
        String player2;
        boolean again;

        do {

            do {
                System.out.println("Player 1, enter your move (R, P, or S):");
                player1 = scanner.nextLine().trim().toUpperCase();
                if (!player1.equals("R") && !player1.equals("P") && !player1.equals("S")) {
                    System.out.println("Invalid move. Please input R, P, or S.");
                }
            } while (!player1.equals("R") && !player1.equals("P") && !player1.equals("S"));


            do {
                System.out.println("Player 2, enter your move (R, P, or S):");
                player2 = scanner.nextLine().trim().toUpperCase();
                if (!player2.equals("R") && !player2.equals("P") && !player2.equals("S")) {
                    System.out.println("Invalid move. Please input R, P, or S.");
                }
            } while (!player2.equals("R") && !player2.equals("P") && !player2.equals("S"));


            if (player1.equals(player2)) {
                System.out.println("It's a tie!");
            } else if (player1.equals("R") && player2.equals("P")) {
                System.out.println("Paper covers Rock. Player 2 wins!");
            } else if (player1.equals("R") && player2.equals("S")) {
                System.out.println("Rock breaks Scissors. Player 1 wins!");
            } else if (player1.equals("S") && player2.equals("P")) {
                System.out.println("Scissors cuts Paper. Player 1 wins!");
            } else if (player1.equals("S") && player2.equals("R")) {
                System.out.println("Rock breaks Scissors. Player 2 wins!");
            } else if (player1.equals("P") && player2.equals("S")) {
                System.out.println("Scissors cuts Paper. Player 2 wins!");
            } else if (player1.equals("P") && player2.equals("R")) {
                System.out.println("Paper covers Rock. Player 1 wins!");
            }


            System.out.println("Would you like to play again? (Y/N)");
            again = scanner.nextLine().trim().equalsIgnoreCase("Y");
        } while (again);

        scanner.close();
    }
}