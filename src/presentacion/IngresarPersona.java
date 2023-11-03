package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame{
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField textCodigo;
    private JLabel lblApellido;
    private JTextField textNombre;
    private JTextField textApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbidioma;

    public IngresarPersona() {
        this.setTitle("Ventana Ingresar Persona");
        this.setContentPane(pnlPrincipal);
        this.setSize(400,300);
        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = textCodigo.getText();
                String nombre = textNombre.getText();
                String apellido = textApellido.getText();
                String mensaje = "tus datos son: \n" +
                                 "Codigo:" + codigo + "\n" +
                                 "Nombre:" + nombre + "\n" +
                                 "Apellido:" + apellido;
             JOptionPane.showMessageDialog(btnGuardar,mensaje);
            }
        });
    }
}
