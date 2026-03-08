error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java:_empty_/col#
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java
empty definition using pc, found symbol in pc: _empty_/col#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 667
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
        if(row < 0 || row > 8 || col < 0 || col > 8){
            throw new IndexOutOfBoundsException();
        }
        if(digit < 0 || digit > 9){
            throw new IllegalArgumentException();
        }
        
        this.board[row][col] = digit;
    }

    private void checkOutOfRange(int row, int col){
        if(row < 0 || row > 8 || @@col < 0 || col > 8){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
	 * Returns the digit in the box row, col.
	 * 
	 * @param row The row
	 * @param col The column
	 * @throws IndexOutOfBoundsException if row or col is outside the range[0..8]
	 * @return the digit in box row, col or 0 if the box i empty
	 */
    @Override
    public int get(int row, int col) {

       return board[row][col];
    }

    @Override
    public void clear(int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public void clearAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearAll'");
    }

    @Override
    public boolean isValid(int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isValid'");
    }

    @Override
    public boolean isAllValid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAllValid'");
    }

    @Override
    public void setGrid(int[][] m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGrid'");
    }

    @Override
    public int[][] getGrid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrid'");
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/col#