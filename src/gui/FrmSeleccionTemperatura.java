package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Conversiones;
import Clases.ListasyValores;
import Clases.ListasyValores.Moneda;
import Clases.Temperaturas;
import Clases.Temperaturas.Temperatura;
import Clases.Valores;

public class FrmSeleccionTemperatura extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	JComboBox<String> cboOpciones;
	JLabel lblOpciones;
	Moneda monedaSeleccionada;
	Temperatura tempSeleccionada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSeleccionTemperatura frame = new FrmSeleccionTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmSeleccionTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		setTitle("Temperaturas");

		setResizable(false);
		setLocationRelativeTo(null);

	}

	private void iniciarComponentes() {

		setBounds(100, 100, 328, 172);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		JLabel lblOpciones = new JLabel("Elije la temperatura a la que deseas convertir");
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOpciones.setBounds(10, 11, 292, 14);
		panelPrincipal.add(lblOpciones);

		cboOpciones = new JComboBox();
		cboOpciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cboOpciones.setBounds(10, 36, 280, 22);
		cboOpciones.addActionListener(this);
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
		for (Temperatura temp : Temperaturas.ListaTemp) {
			modelo.addElement(temp.getTipo());
		}
		cboOpciones.setModel(modelo);
		panelPrincipal.add(cboOpciones);

		//Conversiones.setTipoMoneda(cboOpciones.getSelectedItem().toString());
		cboOpciones.addItemListener(event -> {
			if (event.getStateChange() == ItemEvent.SELECTED) {
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (cboOpciones == e.getSource()) {
			
			int indiceSeleccionado = cboOpciones.getSelectedIndex();
			tempSeleccionada = (Temperaturas.ListaTemp.get(indiceSeleccionado));
		
			Conversiones.setTipoConverTemp(tempSeleccionada.getTipo());
			Conversiones.setNombreTemp(tempSeleccionada.getNombre());
			Conversiones.setSimboloTemp(tempSeleccionada.getSimbolo());
			FrmEntradaTemperatura conversionMonedaFrame = new FrmEntradaTemperatura();
			conversionMonedaFrame.setVisible(true);
			this.setVisible(false);
		}
	}

}
