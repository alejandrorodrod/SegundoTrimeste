import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculadoraII {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JRadioButton sumaRadioButton;
    private JRadioButton multiplicaciónRadioButton;
    private JRadioButton elevarRadioButton;
    private JButton calcularButton;
    private JTextField resultado;

    public MiniCalculadoraII() {
        JFrame frame = new JFrame("Mini calculadora II");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(textField1.getText());
                int numero2 = Integer.parseInt(textField2.getText());
                int respuesta;

                if (sumaRadioButton.isSelected()) {
                    respuesta = numero1 + numero2;
                    resultado.setText(Integer.toString(respuesta));
                } else if (multiplicaciónRadioButton.isSelected()) {
                    respuesta = numero1 * numero2;
                    resultado.setText(Integer.toString(respuesta));
                } else if (elevarRadioButton.isSelected()) {
                    respuesta = (int) Math.pow((double) numero1, (double) numero2);
                    resultado.setText(Integer.toString(respuesta));
                }

                textField1.setText("");
                textField2.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new MiniCalculadoraII();
    }
}
