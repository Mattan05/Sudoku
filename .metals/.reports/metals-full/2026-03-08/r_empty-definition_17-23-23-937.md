error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java:java/lang/String#valueOf(+5).
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
empty definition using pc, found symbol in pc: java/lang/String#valueOf(+5).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 3531
uri: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
text:
```scala
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import solver.MySudokuSolver;

public class SudokuGUIController {
    JTextField[][] cells = new JTextField[9][9];

    public SudokuGUIController(MySudokuSolver solver){
        SwingUtilities.invokeLater(()-> createWindow("Sudoku", solver));
    }

    private void createWindow(String title, MySudokuSolver solver){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        JPanel gridPanel = new JPanel(new GridLayout(9,9));

        for(int r = 0; r < 9; r++){
            for(int c= 0; c < 9; c++){
                JTextField textField = new JTextField(1);
                Font newFont = new Font("Arial", Font.BOLD, 25);
                textField.setFont(newFont);
                cells[r][c] = textField;

                if((r/3 + c/3) % 2 == 0) cells[r][c].setBackground(Color.RED);
                
                gridPanel.add(cells[r][c]);
            }
        }

        JButton solve = new JButton("Solve");
        JButton clear = new JButton("Clear");

        clear.addActionListener(e -> {
            solver.clearAll();
            updateGrid(solver.getGrid()); 
            JOptionPane.showMessageDialog(frame, "Rutorna är tömda");
        });

        solve.addActionListener(e -> {
            readGrid(solver);

            boolean isSolved = solver.solve();

            if(isSolved){
                int[][] gridCopy = solver.getGrid();
                updateGrid(gridCopy);
                 JOptionPane.showMessageDialog(frame, "Sudokut är löst!", "Information", JOptionPane.INFORMATION_MESSAGE);
                
            }
            JOptionPane.showMessageDialog(frame, "Ingen lösning finns", "Information", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(solve);
        buttonPanel.add(clear);

        pane.add(gridPanel, BorderLayout.CENTER);
        pane.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(600,600);
        frame.setVisible(true);
    }

    private void readGrid(MySudokuSolver solver){
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                String text = cells[r][c].getText();

                /* JOptionPane.showMessageDialog(frame, 
                              "Fel: Ogiltig siffra i rutan!", 
                              "Error", 
                              JOptionPane.ERROR_MESSAGE); */

                if(!text.isEmpty()){ /* MÅSTE KONTROLLERA SÅ ATT MAN INTE SKRIVER IN BOKSTÄVER */
                    int digit = Integer.parseInt(text);
                    solver.set(r, c, digit);
                }else{
                    solver.set(r, c, 0);
                }

            }
        }
    }

    private void updateGrid(int[][] grid){
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(cells[r][c] != 0){
                    
                }
                cells[r][c].setText(String.valueOf@@(grid[r][c]));
            }
        }
}

}
/* todo.
* lägg till en loader spinner
textstorlek


*/
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/String#valueOf(+5).