package swing00;
//LIBRERIA SWING

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    PanelPrincipal p = new PanelPrincipal();

    public VentanaPrincipal() {
        this.add(p);
        this.setSize(500, 500);
        this.setTitle("Mi primera Ventana");
        this.setVisible(true);

    }
}

class PanelPrincipal extends JPanel {

    JLabel lblNombre = new JLabel("Numero1:");
    JTextField txtN1 = new JTextField();
    JLabel lblApellido = new JLabel("Numero2");
    JTextField txtN2 = new JTextField();
    JButton btnMostrar = new JButton("Mostrar");
    JButton btnLimpiar = new JButton("Limpiar");
    JLabel lblResultado = new JLabel("Resultado");
    JTextField txtResultado = new JTextField();
    JLabel lblOpciones = new JLabel("Opcion");
    JComboBox opciones = new JComboBox();

    {
        opciones.addItem("Sumar");
        opciones.addItem("Restar");
        opciones.addItem("Multiplicar");
        opciones.addItem("Dividir");
    }

    public PanelPrincipal() {
        this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
        this.add(lblNombre);
        txtN1.setBounds(150, 20, 120, 20);
        this.add(txtN1);
        lblApellido.setBounds(20, 50, 120, 20);
        txtN2.setBounds(150, 50, 120, 20);
        this.add(lblApellido);
        this.add(txtN2);
        lblOpciones.setBounds(20, 80, 120, 20);
        opciones.setBounds(150, 80, 120, 20);
        this.add(lblOpciones);
        this.add(opciones);
        btnMostrar.setBounds(20, 110, 120, 20);
        btnLimpiar.setBounds(150, 110, 160, 20);
        this.add(btnMostrar);
        this.add(btnLimpiar);
        lblResultado.setBounds(20, 140, 120, 20);
        txtResultado.setBounds(150, 140, 160, 20);
        this.add(lblResultado);
        this.add(txtResultado);
        Oyente o1 = new Oyente();
        btnMostrar.addActionListener(o1);
        Oyente2 o2 = new Oyente2();
        btnLimpiar.addActionListener(o2);

    }

    class Oyente implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(txtN1.getText());
            int n2 = Integer.parseInt(txtN2.getText());
            OMatematica om = new OMatematica();
            om.setN1(n1);
            om.setN2(n2);
            if (opciones.getSelectedItem().equals("Sumar")) {
                txtResultado.setText("" + om.getSuma());
            } else if (opciones.getSelectedItem().equals("Restar")) {
                txtResultado.setText("" + om.getResta());
            } else if (opciones.getSelectedItem().equals("Multiplicar")) {
                txtResultado.setText("" + om.getMultiplicacion());
            } else if (opciones.getSelectedItem().equals("Dividir")) {
                txtResultado.setText("" + om.getDivision());
            }

        }
    }

    class Oyente2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtN1.setText("");
            txtN2.setText("");
            txtResultado.setText("");
        }
    }
}