import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Menu {
    private JLabel ham;
    private JLabel pan;
    private JLabel pata;
    private JLabel bebi;
    private JLabel ext;
    private JLabel sal;
    private JRadioButton repartoADomicilioRadioButton;
    private JRadioButton recogidaEnLocal20RadioButton;
    private JButton CALCULARButton;
    private JPanel panel1;
    private JLabel pre;
    private JLabel pvp;
    private JLabel iva;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton polloRadioButton;
    private JRadioButton cerdoRadioButton;
    private JRadioButton ternera1€RadioButton;
    private JRadioButton vegana1€RadioButton;
    private JRadioButton normalRadioButton;
    private JRadioButton integralRadioButton;
    private JRadioButton centenoRadioButton;
    private JRadioButton fritasRadioButton;
    private JRadioButton gajoRadioButton;
    private JRadioButton caseras1€RadioButton;
    private JRadioButton colaRadioButton;
    private JRadioButton naranjaRadioButton;
    private JRadioButton limónRadioButton;
    private JRadioButton aguaRadioButton;
    private JRadioButton cervezaRadioButton;
    private JCheckBox hamburguesaDoble2€CheckBox;
    private JCheckBox extraDeQueso0CheckBox;
    private JCheckBox extraDePatatas1€CheckBox;
    private JSpinner ketchup;
    private JSpinner barbacoa;
    private JSpinner mostaza;
    private JSpinner thai;
    private JLabel precio;
    private int antiguokep;
    private int antiguomos;
    private int antiguobar;
    private int antiguothai;

    public Menu() {
        JFrame frame = new JFrame("Burguer Menu APP");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        textField1.setText("8 €");

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(precio.getText());

                textField1.setText(String.valueOf(valor));
                textField2.setText(String.valueOf(valor * 0.21));
                textField3.setText(String.valueOf(valor * 1.21));
            }
        });

        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                double valor = Double.parseDouble(precio.getText());

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valor++;
                    precio.setText(String.valueOf(valor));
                } else {
                    valor--;
                    precio.setText(String.valueOf(valor));
                }
            }
        };

        ternera1€RadioButton.addItemListener(listener);
        vegana1€RadioButton.addItemListener(listener);

        caseras1€RadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    double valor = Double.parseDouble(precio.getText());

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        valor++;
                        precio.setText(String.valueOf(valor));
                    } else {
                        valor--;
                        precio.setText(String.valueOf(valor));
                    }
                }
            }
        });

        hamburguesaDoble2€CheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                double valor = Double.parseDouble(precio.getText());

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valor += 2;
                    precio.setText(String.valueOf(valor));
                } else {
                    valor -= 2;
                    precio.setText(String.valueOf(valor));
                }
            }
        });

        extraDeQueso0CheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                double valor = Double.parseDouble(precio.getText());

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valor += 0.5;
                    precio.setText(String.valueOf(valor));
                } else {
                    valor -= 0.5;
                    precio.setText(String.valueOf(valor));
                }
            }
        });

        extraDePatatas1€CheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                double valor = Double.parseDouble(precio.getText());

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    valor++;
                    precio.setText(String.valueOf(valor));
                } else {
                    valor--;
                    precio.setText(String.valueOf(valor));
                }
            }
        });

        ketchup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numbolsas = Integer.parseInt(ketchup.getValue().toString());
                double valor = Double.parseDouble(precio.getText());

                if (numbolsas >= 0) {
                    if (numbolsas > antiguokep) {
                        valor += 0.5;
                    } else {
                        valor -= 0.5;
                    }
                }

                if (numbolsas <= 0) {
                    ketchup.setValue(0);
                }

                precio.setText(String.valueOf(valor));
                antiguokep = numbolsas;
            }
        });

        mostaza.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numbolsas = Integer.parseInt(mostaza.getValue().toString());
                double valor = Double.parseDouble(precio.getText());

                if (numbolsas >= 0) {
                    if (numbolsas > antiguomos) {
                        valor += 0.5;
                    } else {
                        valor -= 0.5;
                    }
                }

                if (numbolsas <= 0) {
                    mostaza.setValue(0);
                }

                precio.setText(String.valueOf(valor));
                antiguomos = numbolsas;
            }
        });

        barbacoa.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numbolsas = Integer.parseInt(barbacoa.getValue().toString());
                double valor = Double.parseDouble(precio.getText());

                if (numbolsas >= 0) {
                    if (numbolsas > antiguobar) {
                        valor += 0.5;
                    } else {
                        valor -= 0.5;
                    }
                }

                if (numbolsas <= 0) {
                    barbacoa.setValue(0);
                }

                precio.setText(String.valueOf(valor));
                antiguobar = numbolsas;
            }
        });

        thai.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int numbolsas = Integer.parseInt(thai.getValue().toString());
                double valor = Double.parseDouble(precio.getText());

                if (numbolsas >= 0) {
                    if (numbolsas > antiguothai) {
                        valor += 0.5;
                    } else {
                        valor -= 0.5;
                    }
                }

                if (numbolsas <= 0) {
                    thai.setValue(0);
                }

                precio.setText(String.valueOf(valor));
                antiguothai = numbolsas;
            }
        });
    }

    public static void main(String[] args) {
        new Menu();
    }
}
