import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Encuesta {
    private JPanel panel1;
    private JRadioButton windowsRadioButton;
    private JRadioButton linuxRadioButton;
    private JRadioButton macRadioButton;
    private JCheckBox programaciónCheckBox;
    private JCheckBox diseñoGráficoCheckBox;
    private JCheckBox administraciónCheckBox;
    private JSlider slider1;
    private JButton generarButton;
    private JLabel valor;

    public Encuesta() {
        JFrame frame = new JFrame("Encuesta");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        generarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String sistema = "";
                String especialidad = "";

                if (windowsRadioButton.isSelected()) {
                    sistema = "Windows";
                }else if(linuxRadioButton.isSelected()) {
                    sistema = "Linux";
                }else if(macRadioButton.isSelected()) {
                    sistema = "Mac";
                }

                if (programaciónCheckBox.isSelected()) {
                    especialidad += "Programacion ";
                }
                if (diseñoGráficoCheckBox.isSelected()) {
                    especialidad += "Diseño gráfico ";
                }
                if (administraciónCheckBox.isSelected()) {
                    especialidad += "Administracion";
                }

                JOptionPane.showMessageDialog(null,
                        "Tu sistema operativo preferido es " + sistema + "\n" +
                        "tus especialidades son " + especialidad + "\n" +
                        "y el número de horas dedicadas al ordenador son " + slider1.getValue());
            }
        });

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                valor.setText(String.valueOf(slider1.getValue()));

            }
        });
    }

    public static void main(String[] args) {
        new Encuesta();
    }
}
