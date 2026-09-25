public class Chessboard { // Author Dante Alanis
    public enum Column {
        A, B, C, D, E, F, G, H
    }
    //attributes
    private static final int MIN_ROW = 1;
    private static final int MAX_ROW = 8;

    //we do not need constructors for this class because we are using constant values

    //method to verify if the position given by the user is within the board or not
    public boolean isWithinBoard(char targetCol, int targetRow) {
        char col = Character.toUpperCase(targetCol);
        try {
            Column.valueOf(String.valueOf(col)); //checks if the column value prompted by user is valid
        } catch (IllegalArgumentException e) {
            return false;
        }
        return (targetRow >= MIN_ROW && targetRow <= MAX_ROW);
    }
}
