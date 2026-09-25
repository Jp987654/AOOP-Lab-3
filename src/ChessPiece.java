abstract public class ChessPiece { // Author Dante Alanis
    //attributes for the parent abstract class
    private String pieceName;
    private String color;
    private char startCol;
    private int startRow;

    //empty constructor
    public ChessPiece (){}

    //constructor with parameters
    public ChessPiece(String pieceName, String color, char startCol, int startRow){
        this.pieceName = pieceName;
        this.color = color;
        this.startCol = startCol;
        this.startRow = startRow;
    }

    //setters
    public void setPieceName(String pieceName) { this.pieceName = pieceName; }
    public void setColor(String color){ this.color = color; }
    public void setColumn(char startCol) { this.startCol = startCol; }
    public void setRow(int startRow) { this.startRow = startRow; }

    //getters
    public String getPieceName(){ return this.pieceName; }
    public String getColor(){ return this.color; }
    public char getColumn() { return this.startCol; }
    public int getRow() { return this.startRow; }

    //abstract method
    public abstract boolean validateMove(char targetCol, int targetRow);
}

