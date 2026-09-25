public class Pawn extends ChessPiece { // Author Dante Alanis
    //empty constructor
    public Pawn () {}

    //constructor with parameters
    public Pawn (String pieceName, String color, char startCol, int startRow) {
        super(pieceName, color, startCol, startRow); //attributes inherited from parent class
    }

    //overriding abstract method from parent class
    @Override
    public boolean validateMove(char targetCol, int targetRow) {
        char startCol = Character.toUpperCase(getColumn());
        targetCol = Character.toUpperCase(targetCol);
        int startRow = getRow();

        //if the column changes it is not a valid move
        if (startCol != targetCol){
            return false;
        }
        // logic to validate the pawn movement based on the color.
        if (getColor().equalsIgnoreCase("WHITE")){
            return targetRow == startRow + 1;
        } else if (getColor().equalsIgnoreCase("BLACK")) {
            return targetRow == startRow - 1;
        }
        return false;
    }
}
