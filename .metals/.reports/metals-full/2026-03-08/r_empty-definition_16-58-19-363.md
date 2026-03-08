error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java:_empty_/I#
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
empty definition using pc, found symbol in pc: _empty_/I#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1409
uri: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
text:
```scala
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
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
                cells[r][c] = new JTextField(1);

                if((r/3 + c/3) % 2 == 0) cells[r][c].setBackground(Color.RED);
                
                gridPanel.add(cells[r][c]);
            }
        }

        JButton solve = new JButton("Solve");
        JButton clear = new JButton("Clear");

        solve.addActionListener(e -> {
            for(int r = 0; r < 9; r++){
                for(int c = 0; c < 9; c++){
                    @@I digit = cells[r][c].getText();
                    solver.set(r,c,digit);
                }
            }
        });

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(solve);
        buttonPanel.add(clear);

        pane.add(gridPanel, BorderLayout.CENTER);
        pane.add(buttonPanel, BorderLayout.SOUTH);

        frame.setSize(600,600);
        frame.setVisible(true);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/I#