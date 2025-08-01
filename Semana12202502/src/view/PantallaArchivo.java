package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class PantallaArchivo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JTextField tfResultado;
	private JTextArea taContenido;
	private JLabel lblMensajes;
	private JLabel lblMessageNum2;
	private JLabel lblMeesageNum1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PantallaArchivo frame = new PantallaArchivo();
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
	public PantallaArchivo() {
		File resultadosOperacion = new File("resultadosOperacion.txt");
		try {
			if (!resultadosOperacion.exists()) {
				resultadosOperacion.createNewFile();
			}
		} catch (IOException ioEx) {
			JOptionPane.showMessageDialog(contentPane, "Error", "Problemas", JOptionPane.ERROR_MESSAGE);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal principal = new Principal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnRegresar.setBounds(786, 11, 89, 23);
		contentPane.add(btnRegresar);

		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(6, 32, 76, 14);
		contentPane.add(lblNumero1);

		tfNumero1 = new JTextField();
		tfNumero1.setBounds(105, 29, 86, 20);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);

		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(6, 64, 76, 14);
		contentPane.add(lblNumero2);

		tfNumero2 = new JTextField();
		tfNumero2.setBounds(105, 60, 86, 20);
		contentPane.add(tfNumero2);
		tfNumero2.setColumns(10);

		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfNumero2.getText().equals("")) {
					lblMessageNum2.setText("*Se requiere un valor");
					lblMessageNum2.setForeground(new Color(255, 0, 0));
				}else {
					lblMessageNum2.setText("");

				}
				if(tfNumero1.getText().equals("")) {
					lblMeesageNum1.setVisible(true);
				}else {
					lblMeesageNum1.setVisible(false);

				}
				int resultado = sumar(tfNumero1.getText(), tfNumero2.getText());
				tfResultado.setText(String.valueOf(resultado));
			}
		});
		btnSumar.setBounds(105, 121, 89, 23);
		contentPane.add(btnSumar);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter fw = new FileWriter(resultadosOperacion, true);
					BufferedWriter bw = new BufferedWriter(fw);

					bw.write(tfResultado.getText());
					bw.newLine();
					bw.close();
					JOptionPane.showMessageDialog(btnGuardar, "Guardado con exito");
				} catch (IOException ioEx) {
					JOptionPane.showMessageDialog(contentPane, "Error", "Problemas", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGuardar.setBounds(6, 162, 89, 23);
		contentPane.add(btnGuardar);

		JButton btnLeer = new JButton("Leer");
		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader(resultadosOperacion);
					BufferedReader br = new BufferedReader(fr);
					String linea = br.readLine();
					String contenido = "";
					while(linea != null) {
						contenido = contenido + linea + "\n";
						linea = br.readLine();
					}
					br.close();
					taContenido.setText(contenido);
					
				} catch (FileNotFoundException notFoundException) {
					JOptionPane.showMessageDialog(contentPane, notFoundException.getMessage(), "Problemas", JOptionPane.ERROR_MESSAGE);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(contentPane, e1.getMessage(), "Problemas", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnLeer.setBounds(105, 162, 89, 23);
		contentPane.add(btnLeer);

		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setBounds(105, 90, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(6, 93, 76, 14);
		contentPane.add(lblResultado);
		
		taContenido = new JTextArea();
		taContenido.setBounds(33, 196, 242, 178);
		contentPane.add(taContenido);
		
		lblMensajes = new JLabel("");
		lblMensajes.setBounds(36, 385, 239, 14);
		contentPane.add(lblMensajes);
		
		lblMessageNum2 = new JLabel("");
		lblMessageNum2.setBounds(201, 64, 352, 14);
		contentPane.add(lblMessageNum2);
		
		lblMeesageNum1 = new JLabel("Se requiere un valor**");
		lblMeesageNum1.setVisible(false);
		lblMeesageNum1.setForeground(new Color(255, 0, 0));
		lblMeesageNum1.setBounds(204, 32, 220, 14);
		contentPane.add(lblMeesageNum1);
	}

	public int sumar(String numero1, String numero2) {
		try {
			int num1 = Integer.parseInt(numero1);
			int num2 = Integer.parseInt(numero2);
			lblMensajes.setText("Operacion con exito");
			lblMensajes.setForeground(new Color(0, 255, 0));

			return num1 + num2;

		} catch (NumberFormatException nfe) {
			lblMensajes.setText(nfe.getMessage());
			lblMensajes.setForeground(new Color(255, 0, 0));
			JOptionPane.showMessageDialog(contentPane, "Error", "Problemas", JOptionPane.ERROR_MESSAGE);
		}
		return 0;
	}

}
