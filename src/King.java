public class King extends Queen { // Author Dante Alanis
    //empty constructor
    public King () {}

    //constructor with parameters
    public King (String pieceName, String color, char startCol, int startRow) {
        super(pieceName, color, startCol, startRow); //attributes inherited from parent class
    }

    //overriding abstract method from parent class
    @Override
    public boolean validateMove(char targetCol, int targetRow) {
        char startCol = Character.toUpperCase(getColumn());
        targetCol = Character.toUpperCase(targetCol);
        int startRow = getRow();

        int colDiff = Math.abs(targetCol - startCol);
        int rowDiff = Math.abs(targetRow - startRow);

        if (colDiff > 1 || rowDiff > 1){
            return false;
        } else {
            return super.validateMove(targetCol, targetRow);
        }
    }
}
