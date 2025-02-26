import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Holamundo {
    private JPanel panel1;
    private JTextField textField1;
    private JButton saludarButton;

    public Holamundo() {
        JFrame frame = new JFrame("Holamundo");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hola " + textField1.getText());
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Holamundo();
    }
}
