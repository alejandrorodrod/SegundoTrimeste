import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LetraNIF {
    private JPanel panel1;
    private JTextField textField1;
    private JButton validarLetraButton;
    private JLabel valido;

    public LetraNIF() {
        JFrame frame = new JFrame("Letra NIF");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        validarLetraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numerodni = Integer.parseInt(textField1.getText().substring(0, 8));

                if (letras[numerodni%23] == textField1.getText().toUpperCase().charAt(8)) {
                    valido.setText("La letra es válida");
                } else {
                    valido.setText("La letra no es válida");
                }

                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new LetraNIF();
    }
}
