import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashSet;

public class isValidSudoku {


    public static boolean isValidRow(char[][] board,int currentRow,int currentCol,char Elm){
        for(int row = 0;row < board.length;row++){
            if(row!=currentRow && board[row][currentCol]!='.'){
                if(Elm==board[row][currentCol]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidCol(char[][] board,int currentRow,int currentCol,char Elm){

        for(int col = 0;col < board.length;col++){
            if(col!=currentCol && board[currentRow][col]!='.'){
                if(Elm==board[currentRow][col]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidSubBoard(char[][] board,int i,int j,char Elm){
        for (int n = 0; n < 9; n++) {
            if(board[3 * (i / 3) + n / 3][3 * (j / 3) + n % 3] == Elm && 3 * (i / 3) + n / 3 != i
                    && (3 * (j / 3) + n % 3) != j){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidBoard(char[][] board) {
        System.out.println("check valid row");

        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char pickElm = board[i][j];
                System.out.println("Pick Elm:"+pickElm);

                System.out.println("validate row");
                if(!isValidRow(board,i,j,pickElm)){
                    System.out.println("row false");
                    return false;
                }
                System.out.println("validate row passed");

                System.out.println("validate col");
                if(!isValidCol(board,i,j,pickElm)){
                    System.out.println("col false");
                    return false;
                }
                System.out.println("validate col passed");

                System.out.println("validate sub-board");
                if(!isValidSubBoard(board,i,j,pickElm)){
                    System.out.println("sub-board false");
                    return false;
                }
                System.out.println("validate sub-board passed");

            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidBoard(board));
    }
}