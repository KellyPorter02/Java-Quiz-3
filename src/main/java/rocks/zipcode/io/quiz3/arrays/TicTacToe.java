package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String let = row[0];
        for (int i = 1; i < 3; i++) {
            if (!let.equals(row[i])) {
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        String letter = column[0];
        for (int i = 1; i < 3; i++) {
            if (!letter.equals(column[i])) {
                return false;
            }
        }
        return true;
    }

    public Boolean isDiagonalHomogeneous(Integer rowIndex) {
        String[] diagonal = getDiagonal(rowIndex);
        String letter = diagonal[0];
        for (int i = 1; i < 3; i++) {
            if (!letter.equals(diagonal[i])) {
                return false;
            }
        }
        return true;
    }

    public String[] getDiagonal(Integer rowIndex) {
        String[] diagonal = new String[3];
        if (rowIndex == 0) {
            for (int i = 0; i < 3; i++) {
                diagonal[rowIndex] = board[rowIndex][i];
                rowIndex++;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                diagonal[rowIndex] = board[rowIndex][i];
                rowIndex--;
            }
        }
        return diagonal;
    }

    public String getWinner() {
        // check row for same, if same get let of that row, return
        // check columns
        String answer = "";
        for (int i = 0; i < 3; i++) {
            String[] currRow = getRow(i);
            String[] currCol = getColumn(i);
            if (isRowHomogenous(i)) {
                answer = currRow[0];
            }
            if (isColumnHomogeneous(i)) {
                answer = currCol[0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (j == 1) {
                continue;
            }
            String[] currDiag = getDiagonal(j);
            if (isDiagonalHomogeneous(j)) {
                answer = currDiag[0];
            }
        }

        return answer;
    }

    public String[][] getBoard() {
        return board;
    }
}
