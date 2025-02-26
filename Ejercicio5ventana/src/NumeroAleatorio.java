import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumeroAleatorio {
    private JPanel panel1;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JTextField resultado;
    private JButton generarButton;

    public NumeroAleatorio() {
        JFrame frame = new JFrame("Número al azar");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Random rand = new Random();

        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int min = Integer.valueOf(spinner1.getValue().toString());
                int max = Integer.valueOf(spinner2.getValue().toString()) + 1;
                resultado.setText(Integer.toString(rand.nextInt(min, max)));
            }
        });
    }

    public static void main(String[] args) {
        new NumeroAleatorio();
    }
}
