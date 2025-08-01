package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JLabel lblNombre;
	private JSpinner spEdad;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Principal frame = new Principal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 22, 68, 14);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(10, 71, 46, 14);
		contentPane.add(lblEdad);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(128, 19, 284, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnMostrarDatos = new JButton("Mostrar Datos");
		btnMostrarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre  = tfNombre.getText();
				int edad = (int) spEdad.getValue();
				JOptionPane.showMessageDialog(btnMostrarDatos, "Los datos son: \n" + nombre + "\n" + edad);
			}
		});
		btnMostrarDatos.setBounds(87, 137, 146, 23);
		contentPane.add(btnMostrarDatos);
		
		JRadioButton rdbtnSoltero = new JRadioButton("Soltero");
		rdbtnSoltero.setBounds(6, 103, 109, 23);
		contentPane.add(rdbtnSoltero);
		
		spEdad = new JSpinner();
		spEdad.setBounds(128, 68, 61, 20);
		contentPane.add(spEdad);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(128, 171, 284, 79);
		contentPane.add(textArea);
		
		JButton btnNavegarPA = new JButton("Pantalla Archivo");
		btnNavegarPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaArchivo pantallaArchivo = new PantallaArchivo();
				pantallaArchivo.setVisible(true);
				setVisible(false);
			}
		});
		btnNavegarPA.setBounds(335, 50, 136, 23);
		contentPane.add(btnNavegarPA);
	}
}
