public class NQueen {
    

    public static boolean checkcondition(char nums[][], int row, int col) {
    
        //for the middle column
        for (int i = row - 1; i >= 0; i--) {
            if (nums[i][col] == 'Q')
                return false;
        }

        //For the upper left row&col
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nums[i][j] == 'Q')
                return false;

        }
        
        //For the upper left row&col
        for (int i = row - 1, j = col +1; i >= 0 && j < nums.length; i--, j++) {
            if (nums[i][j] == 'Q')
                return false;

        }
        return true;
    }
    public static void PlaceQueens(char CB[][], int row) {
        
        //Base case
        if (row == CB.length) {
            System.out.println("-----------chess board-----------");
            PrintCB(CB);
            return;
        }

        //Recursion
        for (int j = 0; j < CB.length; j++) {
            if (checkcondition(CB, row, j)) {
                CB[row][j] = 'Q';
                PlaceQueens(CB, row + 1);
                CB[row][j] = '*';
            }
        }
    }

    public static void PrintCB(char CB[][]) {
        for (int i = 0; i < CB.length; i++) {
            for (int j = 0; j < CB.length; j++) {
                System.out.print(CB[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char chessboard[][]= new char[n][n];
        
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                chessboard[i][j] = '*';
            }
        }

        PlaceQueens(chessboard, 0);

    
    }
}
