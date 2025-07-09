package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayMascota;
import clases.Mascota;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class HistorialMascota extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton;
	private JTable tablaMascota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HistorialMascota dialog = new HistorialMascota();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HistorialMascota() {
		setTitle("HISTORIAL DE MASCOTA");
		setBounds(100, 100, 710, 486);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(245, 222, 179));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblHistorialDeMascota = new JLabel("Historial de Mascota");
			lblHistorialDeMascota.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblHistorialDeMascota.setBounds(216, 28, 274, 43);
			contentPanel.add(lblHistorialDeMascota);
		}
		{
			JScrollPane tablaPro = new JScrollPane();
			tablaPro.setBounds(10, 82, 671, 310);
			contentPanel.add(tablaPro);
			{
				tablaMascota = new JTable();
				tablaPro.setViewportView(tablaMascota);
			}
		}
		{
			btnNewButton = new JButton("Volver al Menú");
			btnNewButton.setBackground(new Color(255, 250, 205));
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(519, 403, 162, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		ListarMascota("");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		MenuJefe mj = new MenuJefe();
		mj.setVisible(true);
		this.dispose();
		
	}
	
	public void ListarMascota(String dni) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayMascota am = new ArrayMascota();
	    ArrayList<Mascota> lista = new ArrayList<Mascota>();
	    if (dni.length() == 0) {
	        lista = am.listarMascotas();
	    } else {
	        lista = am.consultarID(dni);
	    }

	    modelo.addColumn("ID");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Edad");
	    modelo.addColumn("Peso");
	    modelo.addColumn("Raza");
	    modelo.addColumn("Especie");
	    modelo.addColumn("Sexo");
	    modelo.addColumn("Esterilización");
	    modelo.addColumn("DNI Cliente");

	    modelo.setRowCount(lista.size());
	    Iterator<Mascota> it = lista.iterator();
	    int i = 0;

	    while (it.hasNext()) {
	        Mascota mas = it.next();
	        modelo.setValueAt(mas.getIdMascota(), i, 0);
	        modelo.setValueAt(mas.getNomMascota(), i, 1);
	        modelo.setValueAt(mas.getEdad(), i, 2);
	        modelo.setValueAt(mas.getPeso(), i, 3);
	        modelo.setValueAt(mas.getRaza(), i, 4);
	        modelo.setValueAt(mas.getEspecie(), i, 5);
	        modelo.setValueAt(mas.getSexo(), i, 6);
	        modelo.setValueAt(mas.isEsterilizado() ? "Sí" : "No", i, 7);
	        modelo.setValueAt(mas.getDniCliente(), i, 8);
	        i++;
	    }

	    tablaMascota.setModel(modelo);
	}
	
	
	
}
