public class Queen extends Rook { // Author Dante Alanis
    //extends Rook class so it can use the same logic as the Rook and if not implements the Bishop logic
    //empty constructor
    public Queen () {}

    //constructor with parameters
    public Queen (String pieceName, String color, char startCol, int startRow) {
        super(pieceName, color, startCol, startRow); //attributes inherited from parent class
    }

    //overriding abstract method from parent class
    @Override
    public boolean validateMove(char targetCol, int targetRow) {
        char startCol = Character.toUpperCase(getColumn());
        targetCol = Character.toUpperCase(targetCol);
        int startRow = getRow();

        //override the method from rook
        if (super.validateMove(targetCol, targetRow)){
            return true;
        }

        int colDiff = Math.abs(targetCol - startCol);
        int rowDiff = Math.abs(targetRow - startRow);

        // validating the movements for the Queen using Bishop's logic.
        return (colDiff == rowDiff);
    }
}
