public class Piece {

    int color = 1;

    public int validPieceLocation(int xPos) {
        int yPos = 5;
        while (Board.connectFour [yPos][xPos - 1] != 0 && yPos > 0) {
            yPos--;
        }
            return yPos;
    }

    public void newPiece(int xPos) {
        if (validPieceLocation(xPos) == -1) {
            System.out.println("No valid position in this column");
        }
        else { 
            Board.connectFour[validPieceLocation(xPos)][xPos - 1] = color;
            System.out.println(color + " piece has been placed on " + "(" + xPos + ", " + validPieceLocation(xPos) + ")");
            swapPieceColor(color);
        }
    }

    public void swapPieceColor(int inputColor) {
        if (inputColor == 1) {
            color = 2;
        }
        else {
            color = 1;
        }
    }


    



}
