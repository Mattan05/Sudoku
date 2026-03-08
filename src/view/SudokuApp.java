package view;

import solver.MySudokuSolver;

public class SudokuApp {
    public static void main(String[] args){
        MySudokuSolver solver = new MySudokuSolver();
        SudokuGUIController app = new SudokuGUIController(solver);
    }
}