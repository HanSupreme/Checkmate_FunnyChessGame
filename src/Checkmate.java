import java.util.Scanner;

public class Checkmate {

    private static Scanner sc; //create scanner to get user input for their moves

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Knight placement on 8x8 chessboard");

        int knightX = sc.nextInt(); //assigning scanner input will be the Knight's first move

        System.out.println("Enter second Knight placement on 8x8 chessboard");

        int knightY = sc.nextInt(); //assigning scanner input will be the Knight's second move

        System.out.println("Enter first King placement on 8x8 chessboard");

        final int kingX = sc.nextInt(); //assigning scanner input will be the King's first move

        System.out.println("Enter second King placement on 8x8 chessboard");

        final int kingY = sc.nextInt(); //assigning scanner input will be the King's second move

        int newKnightX; //will assign new knight move x here
        int newKnightY; //will assign new knight move y here
        boolean hasCheckmate = false; //we're checking to see if there is checkmate

        newKnightX = knightX - 1; //(move 1) of 8 will be this equation
        newKnightY = knightY - 2;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) { //checking if user input plus new assigned move stays on the 8x8 board or not
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX + 1; //move 2 of 8
        newKnightY = knightY - 2;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX + 2; //move 3
        newKnightY = knightY - 1;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX + 2; //move 4
        newKnightY = knightY + 1;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX + 1; //move 5
        newKnightY = knightY + 2;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX - 2; //move 6
        newKnightY = knightY + 1;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX - 1; //move 7
        newKnightY = knightY + 2;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "} ");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        newKnightX = knightX - 2; //move 8
        newKnightY = knightY - 1;
        if (newKnightX <= 8 && newKnightX >= 1 && newKnightY <= 8 && newKnightY >= 1) {
            System.out.print("{" + newKnightX + ", " + newKnightY + "}");
            if (newKnightX == kingX && newKnightY == kingY) {
                hasCheckmate = true;
            }
        }

        if (hasCheckmate) { //checking if it has checkmate or not
            System.out.println("\ncheckmate");
        } else {
            System.out.println("\nno checkmate");
        }

    }

} //closing braces for main method
