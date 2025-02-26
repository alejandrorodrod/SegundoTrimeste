import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParoImpar {
    private JTextField textField1;
    private JButton parOImparButton;
    private JPanel panel1;

    public ParoImpar() {
        JFrame frame = new JFrame("");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        parOImparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(textField1.getText());

                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(frame, "El número " + textField1.getText() + " es par");
                } else {
                    JOptionPane.showMessageDialog(frame, "El número " + textField1.getText() + " es impar");
                }
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new ParoImpar();
    }
}
