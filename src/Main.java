import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        enum PieceType {
            PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING
        }

        Scanner input = new Scanner(System.in);
        Chessboard board = new Chessboard();
        ChessPiece [] chessPieces = new ChessPiece[6];
        
        for(int i = 0; i < chessPieces.length; i++){

            PieceType selection = null;

            while (selection == null){
                System.out.println("Enter a piece by typing its name: ");
                String name = input.next().toUpperCase();

                try {
                    selection = PieceType.valueOf(name);
                    System.out.println("Piece name: " + selection + ".");
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid piece name! Try Again.");
                }
            }

            String color = "";
            while (!color.equals("WHITE") && !color.equals("BLACK")) {
                System.out.println("Enter piece color (WHITE or BLACK):");
                color = input.next().toUpperCase();
                if (!color.equals("WHITE") && !color.equals("BLACK")) {
                    System.out.println("Invalid color. Enter WHITE or BLACK.");
                }
            }
            
            char startCol = ' ';
            int startRow = 0;
            boolean validPosition = false;
            
            while(!validPosition){
                System.out.println("Enter starting column (a-h)");
                
                String colInput = input.next();
            if(colInput.length() != 1){
                System.out.println("Invalid input. Input a letter a - h.");
                continue;
            }
            startCol = colInput.charAt(0);
            
            System.out.println("Enter starting row (1-8)");
            if(!input.hasNextInt()){
                System.out.println("Invalid row. Input a number 1-8");
                input.next();
                continue;
            }
            startRow = input.nextInt();
            
            validPosition = board.isWithinBoard(startCol, startRow);
            
            if (!validPosition){
                System.out.println("Invalid position. Column must be a-h and the row must be 1-8");
            }
        }
        
        switch (selection) {
            case PAWN:
                
                 chessPieces[i] = new Pawn(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );
                    break;
                case ROOK:

                    chessPieces[i] = new Rook(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );

                    break;


                case KNIGHT:

                    chessPieces[i] = new Knight(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );

                    break;


                case BISHOP:

                    chessPieces[i] = new Bishop(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );

                    break;


                case QUEEN:

                    chessPieces[i] = new Queen(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );

                    break;


                case KING:

                    chessPieces[i] = new King(
                        selection.toString(),
                        color,
                        startCol,
                        startRow
                    );

                    break;
                }
                System.out.println();
            }
            char targetCol = ' ';
            int targetRow = 0;
            boolean validTarget = false;

            while (!validTarget){
                System.out.println("Enter the target column (a-h): ");

                String columnInput = input.next();

                if(columnInput.length() != 1){
                    System.out.println("Invalid column. Enter a letter from a-h.");
                    continue;
                }
                
                targetCol = columnInput.charAt(0);
                System.out.println("Enter the target row (1-8): ");
                if(!input.hasNextInt()){
                    System.out.println("Invalid row. Enter a number from 1-8.");
                    input.next();
                    continue;
                }
                targetRow = input.nextInt();
                validTarget = board.isWithinBoard(targetCol, targetRow);
                if(!validTarget){
                System.out.println("Invalid target position. " + "Column must be a-h and row must be 1-8.");
            }
        }

        System.out.println();
        System.out.println("Move Results:");
        System.out.println();
        
        for(ChessPiece piece : chessPieces){
            boolean validMove = piece.validateMove(targetCol, targetRow);

            String result = validMove ? "can move" : "can NOT move";

            System.out.println( piece.getPieceName() + " at " + Character.toUpperCase(piece.getColumn()) + ", " + piece.getRow() + " " +
            result + " to " + Character.toUpperCase(targetCol) + ", " + targetRow );
        }
        input.close();
        }
    }