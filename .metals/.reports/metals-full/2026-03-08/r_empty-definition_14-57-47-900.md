error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java:_empty_/m#length#
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java
empty definition using pc, found symbol in pc: _empty_/m#length#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 3607
uri: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java
text:
```scala
package solver;
public class MySudokuSolver implements SudokuSolver {
    private int[][] board;

    public MySudokuSolver() {
        this.board = new int[9][9];
    }

    @Override
    public boolean solve() {
    
    }

    @Override
    public void set(int row, int col, int digit) {
        checkOutOfRange(row, col);

        if(digit < 0 || digit > 9){
            throw new IllegalArgumentException("Siffran måste vara mellan 0 och 9");
        }
        
        this.board[row][col] = digit;
    }

    @Override
    public int get(int row, int col) {
        checkOutOfRange(row, col);
        return this.board[row][col];
    }

    @Override
    public void clear(int row, int col) {
        checkOutOfRange(row, col);
        this.board[row][col] = 0;
    }

    @Override
    public void clearAll() {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                this.board[i][j] = 0;
            }
        }
    }
	/**
	 * Checks that the digit in the box row, col follows the sudoku rules.
	 * 
	 * @param row The row
	 * @param col The column
	 * @throws IndexOutOfBoundsException if row or col is outside the range [0..8]
	 * @return true if the box is empty or if the digit in the box row, col follows 
	 * the sudoku rules.
	 */

    @Override
    public boolean isValid(int row, int col) {
        checkOutOfRange(row, col);

        if(board[row][col] == 0) return true;

        //Checking row
        for(int i = 0; i < board[row].length; i++){
            if(i != col && board[row][i] == board[row][col]) return false;
        }

        //Checking col
        for(int i = 0; i < board.length; i++){
            if(i != row && board[i][col] == board[row][col]) return false;
        }

        //Checking region. (box 0-2)
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        
        for(int i = 0; i < startRow + 3; i++){
            if(i != row && board[i][col] == board[row][col]) return false;

            for(int j = 0; j < startCol + 3; j++){
                if(j != col && board[i][j] == board[row][col]) return false;
            }
        }

        return true;
    }

    @Override
    public boolean isAllValid() {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != 0 && !isValid(i, j)) return false;
            }
        }
        return true;
    }

    	/**
	 * Fills the grid with the digits in m. The digit 0 represents an empty box.
	 * 
	 * @param m the matrix with the digits to insert
	 * @throws IllegalArgumentException if m has the wrong dimension or contains
	 *                                  values outside the range [0..9]
	 */
    @Override
    public void setGrid(int[][] m) {
        checkMatrix(m);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = m[i][j];
            }
        }
    }

    @Override
    public int[][] getGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrid'");
    }

    /* Helper methods*/

    private void checkOutOfRange(int row, int col){
        if(row < 0 || row > 8 || col < 0 || col > 8){
            throw new IndexOutOfBoundsException("Rad och kolumn måste vara mellan 0 och 8");
        }
    }

    private void checkMatrix(){
        if(m.length < 0 || m.@@length > 9 || m[0].length > 9 ||m[0].length < 0 ) throw new IllegalArgumentException("Fel dimensioner för matris");
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/m#length#