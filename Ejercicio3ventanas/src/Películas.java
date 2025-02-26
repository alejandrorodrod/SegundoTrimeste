import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Películas {
    private JTextField textField1;
    private JButton añadirButton;
    private JComboBox comboBox1;
    private JPanel panel1;

    public Películas() {
        JFrame frame = new JFrame("Películas");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese un texto");
                } else {
                    comboBox1.addItem(textField1.getText());
                    textField1.setText("");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Películas();
    }
}
