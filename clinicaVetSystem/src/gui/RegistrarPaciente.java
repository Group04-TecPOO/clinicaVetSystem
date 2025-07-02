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
import clases.Cliente;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class RegistrarPaciente extends JDialog implements ActionListener, MouseListener {

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
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JTable tablaPropietario;
	private JTextField txtIdCli;
	private JLabel lblIdCliente;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblDni_1;
	private JTextField textField_1;
	private JLabel lblDireccion_1;
	private JTextField textField_2;
	private JLabel lblTelefono_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblIdCliente_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarPaciente dialog = new RegistrarPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarPaciente() {
		setBounds(100, 100, 979, 719);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Propietario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 11, 342, 273);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				lblNewLabel = new JLabel("Nombre Completo");
				lblNewLabel.setBounds(10, 63, 94, 14);
				panel.add(lblNewLabel);
			}
			{
				txtNomCli = new JTextField();
				txtNomCli.setBounds(20, 88, 248, 20);
				panel.add(txtNomCli);
				txtNomCli.setColumns(10);
			}
			{
				lblDni = new JLabel("DNI");
				lblDni.setBounds(10, 119, 94, 14);
				panel.add(lblDni);
			}
			{
				txtDniCli = new JTextField();
				txtDniCli.setColumns(10);
				txtDniCli.setBounds(20, 137, 248, 20);
				panel.add(txtDniCli);
			}
			{
				lblDireccion = new JLabel("Direccion");
				lblDireccion.setBounds(10, 168, 94, 14);
				panel.add(lblDireccion);
			}
			{
				txtDireCli = new JTextField();
				txtDireCli.setColumns(10);
				txtDireCli.setBounds(20, 190, 248, 20);
				panel.add(txtDireCli);
			}
			{
				lblTelefono = new JLabel("Telefono");
				lblTelefono.setBounds(10, 217, 94, 14);
				panel.add(lblTelefono);
			}
			{
				txtTelCli = new JTextField();
				txtTelCli.setColumns(10);
				txtTelCli.setBounds(20, 242, 248, 20);
				panel.add(txtTelCli);
			}
			{
				txtIdCli = new JTextField();
				txtIdCli.setColumns(10);
				txtIdCli.setBounds(20, 36, 248, 20);
				panel.add(txtIdCli);
			}
			{
				lblIdCliente = new JLabel("ID Cliente");
				lblIdCliente.setBounds(10, 11, 94, 14);
				panel.add(lblIdCliente);
			}
		}
		{
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setBounds(362, 261, 89, 23);
			contentPanel.add(btnRegistrar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(this);
			scrollPane.setBounds(10, 295, 342, 290);
			contentPanel.add(scrollPane);
			{
				tablaPropietario = new JTable();
				scrollPane.setViewportView(tablaPropietario);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mascota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(461, 11, 492, 273);
			contentPanel.add(panel_1);
			{
				lblNewLabel_1 = new JLabel("Nombre Completo");
				lblNewLabel_1.setBounds(10, 63, 94, 14);
				panel_1.add(lblNewLabel_1);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(20, 88, 248, 20);
				panel_1.add(textField);
			}
			{
				lblDni_1 = new JLabel("DNI");
				lblDni_1.setBounds(10, 119, 94, 14);
				panel_1.add(lblDni_1);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(20, 137, 248, 20);
				panel_1.add(textField_1);
			}
			{
				lblDireccion_1 = new JLabel("Direccion");
				lblDireccion_1.setBounds(10, 168, 94, 14);
				panel_1.add(lblDireccion_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(20, 190, 248, 20);
				panel_1.add(textField_2);
			}
			{
				lblTelefono_1 = new JLabel("Telefono");
				lblTelefono_1.setBounds(10, 217, 94, 14);
				panel_1.add(lblTelefono_1);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(20, 242, 248, 20);
				panel_1.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(20, 36, 248, 20);
				panel_1.add(textField_4);
			}
			{
				lblIdCliente_1 = new JLabel("ID Cliente");
				lblIdCliente_1.setBounds(10, 11, 94, 14);
				panel_1.add(lblIdCliente_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Volver al Menu");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		Listar("");
	}

	public void Listar(String dni) {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayCliente ac = new ArrayCliente();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		if(dni.length() == 0) lista = ac.listarCliente();
		else lista = ac.consultarCliente(dni);
		
		modelo.setRowCount(lista.size());
		Iterator<Cliente> it = lista.iterator();
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("DNI");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Cliente cl = (Cliente)obj;
			modelo.setValueAt(cl.getIdCliente(), i, 0);
			modelo.setValueAt(cl.getNombreCompleto(), i, 1);
			modelo.setValueAt(cl.getDniCliente(), i, 2);
			modelo.setValueAt(cl.getDireccion(), i, 3);
			modelo.setValueAt(cl.getTelefono(), i, 4);
			i++;
		}
		tablaPropietario.setModel(modelo);
	}

	
	public void actionPerformed(ActionEvent e) {
		try {
			Cliente cl = new Cliente(0, txtNomCli.getText(),txtDniCli.getText(), txtDireCli.getText(), txtTelCli.getText());
			ArrayCliente ac = new ArrayCliente();
			ac.Insertar(cl);
			Listar("");
			Limpiar();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Datos incompletos");}
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
		txtIdCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 0)));
		txtNomCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 1)));
		txtDniCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 2)));
		txtDireCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 3)));
		txtTelCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 4)));
	}
	
	void Limpiar() {
		txtNomCli.setText("");
		txtDniCli.setText("");
		txtDireCli.setText("");
		txtTelCli.setText("");
	}
}
