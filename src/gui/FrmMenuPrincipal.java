package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class FrmMenuPrincipal extends JFrame implements ActionListener{

	private JPanel panelPrincipal;
	JComboBox cboOpciones;
	JLabel lblOpciones;
	 String seleccion;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenuPrincipal frame = new FrmMenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FrmMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();
		setTitle("Menu");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 269, 172);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		JLabel lblOpciones = new JLabel("Seleccione una opcion de conversion");
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOpciones.setBounds(10, 11, 218, 14);
		panelPrincipal.add(lblOpciones);

		cboOpciones = new JComboBox();
		cboOpciones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cboOpciones.setModel(new DefaultComboBoxModel(
				new String[] { "Conversion de Moneda", "Conversion de Temperatura"}));
		cboOpciones.setBounds(10, 36, 234, 22);
		cboOpciones.addActionListener(this);
		panelPrincipal.add(cboOpciones);
		
		seleccion = cboOpciones.getSelectedItem().toString();
		cboOpciones.addItemListener(event -> {
		    if (event.getStateChange() == ItemEvent.SELECTED) {
		       seleccion = event.getItem().toString();
		        lblOpciones.setText(seleccion);
		    }
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (cboOpciones == e.getSource()) {
			if (seleccion == "Conversion de Moneda") {			
				 FrmSeleccionMoneda conversionMonedaFrame = new FrmSeleccionMoneda();
		            conversionMonedaFrame.setVisible(true); 
		            this.setVisible(false);
			} else if (seleccion == "Conversion de Temperatura") {
				FrmSeleccionTemperatura conversionMonedaFrame = new FrmSeleccionTemperatura();
		            conversionMonedaFrame.setVisible(true);
		            this.setVisible(false);
			} 
		}
	}
}
