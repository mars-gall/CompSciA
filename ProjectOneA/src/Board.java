public class Board {

    public static int[][] connectFour = new int [6][7];

    public String printBoard() {
        for (int i = 0; i <= 5; i++) {
            System.out.println();
            System.out.println();
            for (int k = 0; k <= 6; k++) {
                System.out.print(" ");
                System.out.print(connectFour[i][k]);
            }
        }
        System.out.println();
        return "wowza";

    }

    
    
}