error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java:
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/solver/MySudokuSolver.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 2425
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
        return solve(0,0);
    }

    private boolean solve(int r, int c){
        int nextRow = (c == 8) ? r+1 : r;
        int nextCol = (c == 8) ? 0 : c+1;
        /* om man nått slutet */
        if(r == 9) return true;

        /* om rutan är ifylld kollar om de stämmer */
        if(board[r][c] != 0){
            if(!isValid(r, c)) return false;
            return solve(nextRow, nextCol);
        }        
        /* provar siffrorna 1-9 */
        for(int i = 1; i <= 9; i++){
            board[r][c] = i;
            if(isValid(r, c)){
                if(solve(nextRow, nextCol)) return true;
            }
            board[r][c] = 0;
        }

        return false; /* ingen siffra funkar */
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
            if(i != row@@ && board[i][col] == board[row][col]) return false;

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

    @Override
    public void setGrid(int[][] m) {
        checkMatrix(m);

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = m[i][j];
            }
        }
    }

    /* får ej skicka return board  --> referens till board (kan ändra) --> den är private */
    @Override
    public int[][] getGrid() {
        int[][] copy = new int[9][9];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                copy[i][j] = this.board[i][j];
            }
        }

        return copy;
    }


    /* Helper methods*/
    private void checkOutOfRange(int row, int col){
        if(row < 0 || row > 8 || col < 0 || col > 8){
            throw new IndexOutOfBoundsException("Rad och kolumn måste vara mellan 0 och 8");
        }
    }

    private void checkMatrix(int[][] m){
        if(m.length != 9) throw new IllegalArgumentException("Matrisen måste ha 9st rader");

        for(int i = 0; i < m.length; i++){
            if(m[i].length != 9) throw new IllegalArgumentException("Matrisen måste ha 9 kolumner per rad");
            for(int j = 0; j < 9; j++){
                if(m[i][j] < 0 || m[i][j] > 9) throw new IllegalArgumentException("Värden måste vara mellan 0 och 9");
            }
        }
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 