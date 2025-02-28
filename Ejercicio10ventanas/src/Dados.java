import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Dados {
    private JButton d6Button;
    private JButton d8Button;
    private JButton d10Button;
    private JButton d12Button;
    private JButton d20Button;
    private JPanel panel1;
    private JLabel cara;
    private JPanel lista;
    private String[] resultado = new String[0];
    private JLabel resultados;

    public Dados() {
        JFrame frame = new JFrame("Dados");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Random rand = new Random();



        d6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dado = "D6 ";
                int numero = rand.nextInt(7);

                ImageIcon icono = new ImageIcon(getClass().getResource("/D6_" + numero +".png"));
                cara.setIcon(icono);

                resultado = anadirTirada(dado, numero);

                resultados.setText(imprimir());
            }
        });

        d8Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cara.setText("D8 " + Integer.toString(rand.nextInt(9)));
            }
        });

        d10Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cara.setText("D10 " + Integer.toString(rand.nextInt(11)));
            }
        });

        d12Button.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = rand.nextInt(13);

                ImageIcon icono = new ImageIcon(getClass().getResource("/D12_" + numero +".png"));
                cara.setIcon(icono);
            }

        });

        d20Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cara.setText("D20 " + Integer.toString(rand.nextInt(21)));
            }
        });
    }

    public String[] anadirTirada(String dado, int numero) {
        String[] aux = new String[resultado.length + 1];
        String num = String.valueOf(numero);

        for (int i = 0; i < resultado.length; i++) {
            aux[i] = resultado[i];
        }
        aux[aux.length - 1] = dado + Integer.toString(numero);
        return aux;
    }

    public String imprimir() {
        String res = "";
        int contador = 0;

        for(int i = 0; i < resultado.length; i++) {
            if (contador < 5) {
                res += resultado[i] + " ";
                contador++;
            } else {
                res += ("\n" + resultado[i]);
                contador = 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        new Dados();
    }
}
