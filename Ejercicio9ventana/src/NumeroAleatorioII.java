import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumeroAleatorioII {
    private JPanel panel1;
    private JSlider slider1;
    private JLabel resultado;
    private JLabel numeroSlider;
    private JButton generarNúmeroAleatorioButton;

    public NumeroAleatorioII() {
        JFrame frame = new JFrame("Numero aleatorio II");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Random rand = new Random();


        generarNúmeroAleatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(String.valueOf(rand.nextInt(0,slider1.getValue() + 1)));
            }
        });

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                numeroSlider.setText(String.valueOf(slider1.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        new NumeroAleatorioII();
    }
}
