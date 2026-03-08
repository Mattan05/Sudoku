error id: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java:javax/swing/JButton#
file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
empty definition using pc, found symbol in pc: javax/swing/JButton#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 841
uri: file:///C:/Users/Mattis/Documents/datateknik/sudoku/src/view/SudokuGUIController.java
text:
```scala
package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SudokuGUIController {
    public SudokuGUIController(){
        SwingUtilities.invokeLater(()-> createWindow("Sudoku"));
    }

    private void createWindow(String title){
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        JPanel gridPanel = new JPanel(new GridLayout(9,9));

        for(int r = 0; r < 9; r++){
            for(int c= 0; c < 9; c++){
                cells[r][c] 
            }
        }

        JButton solve = new J@@Button("Solve");
        JButton clear = new JButton("Clear");

        frame.pack();
        frame.setVisible(true);
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: javax/swing/JButton#