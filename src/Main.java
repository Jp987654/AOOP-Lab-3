import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        enum PieceType {
            PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
        }

        PieceType selection = null;
        while (selection == null){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a piece by typing its name: ");
            String name = input.next().toUpperCase();
            try {
                selection = PieceType.valueOf(name);
                System.out.println("Piece name: " + selection + ".");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid piece name! Try Again.");
            }
        }
    }
}