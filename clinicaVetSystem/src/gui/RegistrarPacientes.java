package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayCliente;
/*import ArrayClases.ArrayMascota;*/
import clases.Cliente;
import clases.Mascota;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class RegistrarPacientes extends JDialog implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtNomCli;
	private JLabel lblDni;
	private JTextField txtDniCli;
	private JLabel lblDireccion;
	private JTextField txtDireCli;
	private JLabel lblTelefono;
	private JTextField txtTelCli;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField txtNombreMascota;
	private JLabel lblDni_1;
	private JTextField txtEdadMascota;
	private JLabel lblDireccion_1;
	private JTextField txtEspecieMascota;
	private JLabel lblTelefono_1;
	private JTextField txtSexoMascota;
	private JTextField txtIDMascota;
	private JLabel lblIdCliente_1;
	private JLabel lblDni_2;
	private JTextField txtPesoMascota;
	private JLabel lblTelefono_2;
	private JTextField txtEsteMascota;
	private JTextField txtRazaMascota;
	private JLabel lblDni_3;
	private JButton btnRegistrarMascota;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JTable tablaPropietario;
	private JScrollPane scrollPane_1;
	private JTable tablaMascota;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarPacientes dialog = new RegistrarPacientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarPacientes() {
		setBounds(100, 100, 1038, 676);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Propietario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(0, 0, 342, 273);
			contentPanel.add(panel);
			{
				lblNewLabel = new JLabel("Nombre Completo");
				lblNewLabel.setBounds(10, 11, 94, 14);
				panel.add(lblNewLabel);
			}
			{
				txtNomCli = new JTextField();
				txtNomCli.setColumns(10);
				txtNomCli.setBounds(20, 36, 248, 20);
				panel.add(txtNomCli);
			}
			{
				lblDni = new JLabel("DNI");
				lblDni.setBounds(10, 67, 94, 14);
				panel.add(lblDni);
			}
			{
				txtDniCli = new JTextField();
				txtDniCli.setColumns(10);
				txtDniCli.setBounds(20, 85, 248, 20);
				panel.add(txtDniCli);
			}
			{
				lblDireccion = new JLabel("Direccion");
				lblDireccion.setBounds(10, 116, 94, 14);
				panel.add(lblDireccion);
			}
			{
				txtDireCli = new JTextField();
				txtDireCli.setColumns(10);
				txtDireCli.setBounds(20, 138, 248, 20);
				panel.add(txtDireCli);
			}
			{
				lblTelefono = new JLabel("Telefono");
				lblTelefono.setBounds(10, 165, 94, 14);
				panel.add(lblTelefono);
			}
			{
				txtTelCli = new JTextField();
				txtTelCli.setColumns(10);
				txtTelCli.setBounds(20, 190, 248, 20);
				panel.add(txtTelCli);
			}
			{
				btnRegistrar = new JButton("Registrar");
				btnRegistrar.setBounds(102, 239, 89, 23);
				panel.add(btnRegistrar);
				btnRegistrar.addActionListener(this);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mascota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(451, 0, 311, 273);
			contentPanel.add(panel_1);
			{
				lblNewLabel_1 = new JLabel("Nombre Mascota");
				lblNewLabel_1.setBounds(10, 63, 94, 14);
				panel_1.add(lblNewLabel_1);
			}
			{
				txtNombreMascota = new JTextField();
				txtNombreMascota.setColumns(10);
				txtNombreMascota.setBounds(10, 88, 159, 20);
				panel_1.add(txtNombreMascota);
			}
			{
				lblDni_1 = new JLabel("Edad");
				lblDni_1.setBounds(10, 119, 59, 14);
				panel_1.add(lblDni_1);
			}
			{
				txtEdadMascota = new JTextField();
				txtEdadMascota.setColumns(10);
				txtEdadMascota.setBounds(10, 137, 51, 20);
				panel_1.add(txtEdadMascota);
			}
			{
				lblDireccion_1 = new JLabel("Especie");
				lblDireccion_1.setBounds(10, 168, 94, 14);
				panel_1.add(lblDireccion_1);
			}
			{
				txtEspecieMascota = new JTextField();
				txtEspecieMascota.setColumns(10);
				txtEspecieMascota.setBounds(10, 186, 159, 20);
				panel_1.add(txtEspecieMascota);
			}
			{
				lblTelefono_1 = new JLabel("Sexo");
				lblTelefono_1.setBounds(10, 217, 69, 14);
				panel_1.add(lblTelefono_1);
			}
			{
				txtSexoMascota = new JTextField();
				txtSexoMascota.setColumns(10);
				txtSexoMascota.setBounds(10, 242, 69, 20);
				panel_1.add(txtSexoMascota);
			}
			{
				txtIDMascota = new JTextField();
				txtIDMascota.setEnabled(false);
				txtIDMascota.setColumns(10);
				txtIDMascota.setBounds(10, 36, 159, 20);
				panel_1.add(txtIDMascota);
			}
			{
				lblIdCliente_1 = new JLabel("ID Mascota");
				lblIdCliente_1.setBounds(10, 11, 94, 14);
				panel_1.add(lblIdCliente_1);
			}
			{
				lblDni_2 = new JLabel("Peso");
				lblDni_2.setBounds(67, 119, 51, 14);
				panel_1.add(lblDni_2);
			}
			{
				txtPesoMascota = new JTextField();
				txtPesoMascota.setColumns(10);
				txtPesoMascota.setBounds(67, 137, 51, 20);
				panel_1.add(txtPesoMascota);
			}
			{
				lblTelefono_2 = new JLabel("Esterilización");
				lblTelefono_2.setBounds(89, 217, 94, 14);
				panel_1.add(lblTelefono_2);
			}
			{
				txtEsteMascota = new JTextField();
				txtEsteMascota.setColumns(10);
				txtEsteMascota.setBounds(89, 242, 69, 20);
				panel_1.add(txtEsteMascota);
			}
			{
				txtRazaMascota = new JTextField();
				txtRazaMascota.setColumns(10);
				txtRazaMascota.setBounds(128, 137, 51, 20);
				panel_1.add(txtRazaMascota);
			}
			{
				lblDni_3 = new JLabel("Raza");
				lblDni_3.setBounds(128, 119, 59, 14);
				panel_1.add(lblDni_3);
			}
		}
		{
			btnRegistrarMascota = new JButton("Registrar Mascota");
			btnRegistrarMascota.addActionListener(this);
			btnRegistrarMascota.setBounds(789, 250, 154, 23);
			contentPanel.add(btnRegistrarMascota);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(this);
			scrollPane.setBounds(10, 273, 375, 309);
			contentPanel.add(scrollPane);
			{
				tablaPropietario = new JTable();
				scrollPane.setViewportView(tablaPropietario);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(450, 271, 493, 311);
			contentPanel.add(scrollPane_1);
			{
				tablaMascota = new JTable();
				scrollPane_1.setViewportView(tablaMascota);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver al Menu");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
		}
		Listar("");
		ListarMascota(0);
	}
	public void Listar(String dni) {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayCliente ac = new ArrayCliente();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		if(dni.length() == 0) lista = ac.listarCliente();
		else lista = ac.consultarCliente(dni);
		
		modelo.setRowCount(lista.size());
		Iterator<Cliente> it = lista.iterator();
		modelo.addColumn("Nombre");
		modelo.addColumn("DNI");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Cliente cl = (Cliente)obj;
			modelo.setValueAt(cl.getDniCliente(), i, 0);
			modelo.setValueAt(cl.getNombreCompleto(), i, 1);
			modelo.setValueAt(cl.getDireccion(), i, 2);
			modelo.setValueAt(cl.getTelefono(), i, 3);
			i++;
		}
		tablaPropietario.setModel(modelo);
	}
	public void ListarMascota(int IdMascota) {
		/*DefaultTableModel modelo = new DefaultTableModel();
		ArrayMascota am = new ArrayMascota();
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		if(IdMascota == 0) lista = am.ListarMascota();
		else lista = am.consultarID(IdMascota);
		
		modelo.setRowCount(lista.size());
		Iterator<Mascota> it = lista.iterator();
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Peso");
		modelo.addColumn("Raza");
		modelo.addColumn("Especie");
		modelo.addColumn("Sexo");
		modelo.addColumn("Esterilizacion");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Mascota mas = (Mascota)obj;
			modelo.setValueAt(mas.getIdMascota(), i, 0);
			modelo.setValueAt(mas.getNomMascota(), i, 1);
			modelo.setValueAt(mas.getEdad(), i, 2);
			modelo.setValueAt(mas.getPeso(), i, 3);
			modelo.setValueAt(mas.getRaza(), i, 4);
			modelo.setValueAt(mas.getEspecie(), i, 5);
			modelo.setValueAt(mas.getSexo(), i, 6);
			modelo.setValueAt(mas.getEsterilizacion(), i, 7);
			i++;
		}
		tablaMascota.setModel(modelo);
		*/
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelButton) {
			do_cancelButton_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarMascota) {
			do_btnRegistrarMascota_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		try {
			Cliente cl = new Cliente(txtDniCli.getText(), txtNomCli.getText(), txtDireCli.getText(), txtTelCli.getText());
			ArrayCliente ac = new ArrayCliente();
			ac.Insertar(cl);
			Listar("");
			Limpiar();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Datos incompletos");
	}
	}
	void Limpiar() {
		txtNomCli.setText("");
		txtDniCli.setText("");
		txtDireCli.setText("");
		txtTelCli.setText("");
	}
	void LimpiarMascota() {
		txtNombreMascota.setText("");
		txtEdadMascota.setText("");
		txtPesoMascota.setText("");
		txtRazaMascota.setText("");
		txtEspecieMascota.setText(""); 
		txtSexoMascota.setText("");
		txtEsteMascota.setText("");
	}
	
	protected void do_btnRegistrarMascota_actionPerformed(ActionEvent e) {
		/*
		try {
			Mascota mas = new Mascota(0, txtNombreMascota.getText(),Integer.parseInt(txtEdadMascota.getText()),Double.parseDouble(txtPesoMascota.getText()),txtRazaMascota.getText(),txtEspecieMascota.getText(),txtSexoMascota.getText(),txtEsteMascota.getText());
			ArrayMascota am = new ArrayMascota();
			am.InsertarMascota(mas);
			ListarMascota(0);
			LimpiarMascota();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Datos incompletos");
		}	
		*/
	}
	
	protected void do_cancelButton_actionPerformed(ActionEvent e) {
		MenuRecepcionista mr = new MenuRecepcionista();
		mr.setVisible(true);
		this.dispose();
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == scrollPane) {
			do_scrollPane_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void do_scrollPane_mouseClicked(MouseEvent e) {
		int fila = tablaPropietario.getSelectedRow();
		txtDniCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 0)));
		txtNomCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 1)));
		txtDireCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 2)));
		txtTelCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 3)));
	}
}
