public class Bishop extends ChessPiece { // Author Dante Alanis
    //empty constructor
    public Bishop () {}

    //constructor with parameters
    public Bishop (String pieceName, String color, char startCol, int startRow) {
        super(pieceName, color, startCol, startRow); //attributes inherited from parent class
    }

    //overriding abstract method from parent class
    @Override
    public boolean validateMove(char targetCol, int targetRow) {
        char startCol = Character.toUpperCase(getColumn());
        targetCol = Character.toUpperCase(targetCol);
        int startRow = getRow();

        //checking if the target position is the same as the start position.
        if (startCol == targetCol && startRow == targetRow){
            return false;
        }

        int colDiff = Math.abs(targetCol - startCol);
        int rowDiff = Math.abs(targetRow - startRow);

        // equal movement in both column and row for the bishop.
        return (colDiff == rowDiff);
    }
}
