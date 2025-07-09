package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayCitas;
import clases.Citas;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerCitas extends JDialog implements KeyListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable TablaCitas;
	private JTextField txtDniCliente;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerCitas dialog = new VerCitas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerCitas() {
		setTitle("HISTORIAL DE CITAS");
		setBounds(100, 100, 705, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 205));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 669, 373);
		contentPanel.add(scrollPane);
		{
			TablaCitas = new JTable();
			scrollPane.setViewportView(TablaCitas);
		}
		{
			txtDniCliente = new JTextField();
			txtDniCliente.addKeyListener(this);
			txtDniCliente.setBounds(95, 19, 181, 20);
			contentPanel.add(txtDniCliente);
			txtDniCliente.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("DNI Veterinario");
			lblNewLabel.setBounds(10, 22, 75, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			btnNewButton = new JButton("Volver al Menú");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(558, 458, 121, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 250, 240));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		ListarCitas("");
	}
	
	public void ListarCitas(String dniCliente) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayCitas ac = new ArrayCitas();
	    ArrayList<Citas> lista;

	    if (dniCliente.length() == 0) {
	        lista = ac.listarCitas();  
	    } else {
	        lista = ac.consultarDniEmpleado(dniCliente);  // ✅ Buscar por DNI Cliente
	    }

	    modelo.addColumn("ID");
	    modelo.addColumn("Día");
	    modelo.addColumn("Mes");
	    modelo.addColumn("Año");
	    modelo.addColumn("Hora");
	    modelo.addColumn("DNI Cliente");
	    modelo.addColumn("ID Mascota");
	    modelo.addColumn("DNI Veterinario");
	    modelo.addColumn("ID Servicio");

	    for (Citas c : lista) {
	        modelo.addRow(new Object[]{
	            c.getIdCita(), c.getDia(), c.getMes(), c.getAño(), c.getHora(),
	            c.getDniCliente(), c.getIdMascota(), c.getDniEmpleado(), c.getIdServicio()
	        });
	    }

	    TablaCitas.setModel(modelo);
	}
	
	
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtDniCliente) {
	        String dni = txtDniCliente.getText();  // Aquí ya se actualizó el texto
	        ListarCitas(dni);
	    }
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == txtDniCliente) {
			do_txtDniCliente_keyTyped(e);
		}
	}
	protected void do_txtDniCliente_keyTyped(KeyEvent e) {
		
		String ID=(txtDniCliente.getText());
		ListarCitas(ID);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		MenuVeterinario mv = new MenuVeterinario();
		mv.setVisible(true);
		this.setVisible(false);
	}
}
