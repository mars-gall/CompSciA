public class Piece {

    private  int color = 1;

    public int validPieceLocation(int xPos) {
        int i = 5;
        while (Board.connectFour [xPos - 1][i] != 0 && i >= 0) {
            i--;
        }
            return i;
    }

    public int newPiece(int xPos) {
        if (validPieceLocation(xPos) == -1) {
            System.out.println("No valid position in this column");
            return 0;
        }
        else { 
            Board.connectFour[xPos][validPieceLocation(xPos)] = color;
            swapPieceColor(color);
            System.out.println(color + " piece has been placed on " + xPos + ", " + validPieceLocation(xPos));
            return 1;
        }
    }

    public String swapPieceColor(String color) {
        if (color == white) {
            return black;
        }
        else {
            return white;
        }
    }

    



}
