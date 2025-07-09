package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayCitas;
import ArrayClases.ArrayMascota;
import ArrayClases.ArrayServicio;
import clases.Citas;
import clases.Mascota;
import clases.Servicio;

import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class AgendarCita extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JTextField txtDniCli;
	private JTextField txtHora;
	private JTable tblCitas;
	private JTable tblServi;
	private JButton btnRegiCita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgendarCita dialog = new AgendarCita();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	private JComboBox<String> cboDia;
	private JComboBox<String> cboMes;
	private JComboBox<String> cboAño;
	private JComboBox<String> cboVeterinario;
	private JComboBox<String> cboServi;
	private JLabel lblNewLabel_5;
	private JTextField txtIdCita;
	private JTextField txtIdMasco;
	private JTextField txtVete;
	private JTextField txtSer;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAño;
	
	
	public AgendarCita() {
		setTitle("Agendar Cita");
		setBounds(100, 100, 728, 570);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "DATOS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(13, 15, 292, 240);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dueño: ");
		lblNewLabel.setBounds(35, 48, 46, 14);
		panel.add(lblNewLabel);
		
		txtDniCli = new JTextField();
		txtDniCli.setBounds(84, 45, 175, 20);
		panel.add(txtDniCli);
		txtDniCli.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(35, 111, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hora: ");
		lblNewLabel_2.setBounds(35, 136, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtHora = new JTextField();
		txtHora.setBounds(91, 133, 173, 20);
		panel.add(txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Veterinario");
		lblNewLabel_3.setBounds(29, 158, 68, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Servicios");
		lblNewLabel_4.setBounds(29, 183, 55, 14);
		panel.add(lblNewLabel_4);
		
		btnRegiCita = new JButton("Registrar");
		btnRegiCita.addActionListener(this);
		btnRegiCita.setBounds(79, 206, 116, 23);
		panel.add(btnRegiCita);
		{
			lblNewLabel_5 = new JLabel("Id Cita");
			lblNewLabel_5.setBounds(35, 23, 46, 14);
			panel.add(lblNewLabel_5);
		}
		{
			txtIdCita = new JTextField();
			txtIdCita.setColumns(10);
			txtIdCita.setBounds(84, 20, 175, 20);
			panel.add(txtIdCita);
		}
		
		JLabel lblNewLabel_6 = new JLabel("Id Mascota");
		lblNewLabel_6.setBounds(10, 86, 71, 14);
		panel.add(lblNewLabel_6);
		
		txtIdMasco = new JTextField();
		txtIdMasco.setColumns(10);
		txtIdMasco.setBounds(84, 76, 175, 20);
		panel.add(txtIdMasco);
		
		txtVete = new JTextField();
		txtVete.setColumns(10);
		txtVete.setBounds(86, 155, 173, 20);
		panel.add(txtVete);
		
		txtSer = new JTextField();
		txtSer.setColumns(10);
		txtSer.setBounds(81, 180, 173, 20);
		panel.add(txtSer);
		
		txtDia = new JTextField();
		txtDia.setBounds(90, 108, 23, 20);
		panel.add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(123, 108, 23, 20);
		panel.add(txtMes);
		
		txtAño = new JTextField();
		txtAño.setColumns(10);
		txtAño.setBounds(156, 108, 68, 20);
		panel.add(txtAño);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 261, 601, 225);
		contentPanel.add(scrollPane);
		
		tblCitas = new JTable();
		scrollPane.setViewportView(tblCitas);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(311, 20, 374, 231);
		contentPanel.add(scrollPane_1);
		
		tblServi = new JTable();
		scrollPane_1.setViewportView(tblServi);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver al Menu");
				cancelButton.setBackground(new Color(255, 192, 203));
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		ListarServicio();
		ListarCitas();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegiCita) {
			do_btnRegiCita_actionPerformed(e);
		}
		if (e.getSource() == cancelButton) {
			do_cancelButton_actionPerformed(e);
		}
	}
	protected void do_cancelButton_actionPerformed(ActionEvent e) {
		MenuRecepcionista mr = new MenuRecepcionista();
		mr.setVisible(true);
		this.dispose();
	}
	
	public void ListarServicio() {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayServicio as = new ArrayServicio();
	    ArrayList<Servicio> lista = as.listarServicio();

	    modelo.setRowCount(lista.size());
	    modelo.addColumn("ID");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Precio");

	    Iterator<Servicio> it = lista.iterator();
	    int i = 0;
	    while (it.hasNext()) {
	        Servicio s = it.next();
	        modelo.setValueAt(s.getIdServicio(), i, 0);
	        modelo.setValueAt(s.getNombreServicio(), i, 1);
	        modelo.setValueAt(s.getPrecioServicio(), i, 2);
	        i++;
	    }

	    tblServi.setModel(modelo);
	}
	
	public void ListarCitas() {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayCitas ac = new ArrayCitas();
	    ArrayList<Citas> lista = ac.listarCitas();

	    modelo.setRowCount(lista.size());
	    modelo.addColumn("ID");
	    modelo.addColumn("Día");
	    modelo.addColumn("Mes");
	    modelo.addColumn("Año");
	    modelo.addColumn("Hora");
	    modelo.addColumn("DNI Cliente");
	    modelo.addColumn("ID Mascota");
	    modelo.addColumn("DNI Veterinario");
	    modelo.addColumn("ID Servicio");

	    Iterator<Citas> it = lista.iterator();
	    int i = 0;
	    while (it.hasNext()) {
	        Citas c = it.next();
	        modelo.setValueAt(c.getIdCita(), i, 0);
	        modelo.setValueAt(c.getDia(), i, 1);
	        modelo.setValueAt(c.getMes(), i, 2);
	        modelo.setValueAt(c.getAño(), i, 3);
	        modelo.setValueAt(c.getHora(), i, 4);
	        modelo.setValueAt(c.getDniCliente(), i, 5);
	        modelo.setValueAt(c.getIdMascota(), i, 6);
	        modelo.setValueAt(c.getDniEmpleado(), i, 7);
	        modelo.setValueAt(c.getIdServicio(), i, 8);
	        i++;
	    }

	    tblCitas.setModel(modelo);
	}
	
	void LimpiarCitas() {
		txtIdCita.setText("");
		txtDniCli.setText("");
		txtHora.setText("");
		cboDia.setSelectedIndex(0);
		cboMes.setSelectedIndex(0);
		cboAño.setSelectedIndex(0);
		cboVeterinario.setSelectedIndex(0);
		cboServi.setSelectedIndex(0);
	}
	
	

	protected void do_btnRegiCita_actionPerformed(ActionEvent e) {
		try {
				int cita = Integer.parseInt(txtIdCita.getText());
				String dniCli = txtDniCli.getText().trim();
	            String dia = txtDia.getText();
	            String mes = txtMes.getText();
	            String año = txtAño.getText(); 
	            String hora = txtHora.getText().trim();
	            String dniVet = txtVete.getText();
	            String idServicio = txtSer.getText();
	            String idMascota = txtIdMasco.getText().trim();
	            
	            Citas ci = new Citas(Integer.parseInt(txtIdCita.getText()), txtDia.getText(), txtMes.getText(), txtAño.getText(), txtHora.getText(), txtDniCli.getText(), txtIdMasco.getText(), txtVete.getText(), txtSer.getText());
	            ArrayCitas ac = new ArrayCitas();
	            ac.Insertar(ci);
	            ListarCitas();
	            JOptionPane.showMessageDialog(this, "Agregado con exito");

		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Eerror al agregar la cita");
		}        
	}
}
