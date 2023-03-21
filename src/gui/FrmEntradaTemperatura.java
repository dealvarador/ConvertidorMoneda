package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import Clases.Conversiones;
import Clases.ExcepcionError;

public class FrmEntradaTemperatura extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCantidad;
	JButton btnCancelar;
	JButton btnOk;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEntradaTemperatura frame = new FrmEntradaTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FrmEntradaTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		setTitle("Ingrese -> " + Conversiones.getTipoConverTemp());

		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 373, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTexto = new JLabel("Ingrese la cantidad de dinero que desea convertir:");
		lblTexto.setBounds(61, 11, 285, 14);
		contentPane.add(lblTexto);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(61, 36, 257, 20);
		txtCantidad.addActionListener(this);
		contentPane.add(txtCantidad);

		txtCantidad.setColumns(10);

		btnOk = new JButton("OK");
		btnOk.setBounds(85, 67, 89, 23);
		btnOk.addActionListener(this);
		contentPane.add(btnOk);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(184, 67, 89, 23);
		btnCancelar.addActionListener(this);
		contentPane.add(btnCancelar);

		txtCantidad.addKeyListener((KeyListener) new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0' && c <= '9') || c == KeyEvent.VK_BACK_SPACE || c == '.')) {
					e.consume();
				}
				if (c == '.' && txtCantidad.getText().contains(".")) {
					e.consume();
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// if (!Texto.isEmpty() && Texto.isNumeric()) {

		if (btnOk == e.getSource()) {
			Conversiones convertir = new Conversiones();
			String Texto = txtCantidad.getText();
			if (esNumerico(Texto)) {
				convertir.setTempEntra(Double.parseDouble(Texto));
				conversionMetodo(Conversiones.getSimboloTemp(), convertir.getTempEntra(),
				Conversiones.getNombreTemp(), Conversiones.getTipoConverTemp());
				metodoSeleccion();
			}else {
				JOptionPane.showMessageDialog(null, "El campo no debe estar vacio o con letras");
			}
		}

		if (btnCancelar == e.getSource()) {
			FrmSeleccionTemperatura conversionMonedaFrame = new FrmSeleccionTemperatura();
			conversionMonedaFrame.setVisible(true); 
			this.setVisible(false);
		}

	}

	public boolean esNumerico(String texto) {
		if (texto == null || texto.isEmpty()) {
			return false;
		}
		boolean puntoDecimalEncontrado = false;
		for (char c : texto.toCharArray()) {
			if (!Character.isDigit(c)) {
				if (c == '.' && !puntoDecimalEncontrado) {
					puntoDecimalEncontrado = true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	private void metodoSeleccion() {
		int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?", "Seleccione una opcion",
				JOptionPane.YES_NO_CANCEL_OPTION);
		switch (respuesta) {
		case JOptionPane.YES_OPTION:
			this.dispose();			
			FrmSeleccionTemperatura conversionMonedaFrame = new FrmSeleccionTemperatura();
			conversionMonedaFrame.setVisible(true); 
			break;
		case JOptionPane.NO_OPTION:
			this.setVisible(false);
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);
			break;
		case JOptionPane.CANCEL_OPTION:
			this.setVisible(false);
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);
			break;
		}

	}

	private void conversionMetodo(String Simbolo, double Entra,  String nombre, String tipo) {
		Conversiones convertir = new Conversiones();
		try {
			this.setVisible(false);
			JOptionPane.showMessageDialog(null,
					"Son: " +  (convertir.ConvertirTemperatura(tipo,Entra) + " " + Simbolo + " -> " + nombre));

		} catch (ExcepcionError e1) {
			e1.printStackTrace();
		}
	}
}
