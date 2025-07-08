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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayServicio;
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
		lblNewLabel.setBounds(35, 30, 46, 14);
		panel.add(lblNewLabel);
		
		txtDniCli = new JTextField();
		txtDniCli.setBounds(79, 27, 175, 20);
		panel.add(txtDniCli);
		txtDniCli.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(35, 62, 46, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox cboDia = new JComboBox();
		cboDia.setBounds(79, 58, 41, 22);
		panel.add(cboDia);
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		JComboBox cboMes = new JComboBox();
		cboMes.setBounds(130, 58, 46, 22);
		panel.add(cboMes);
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		
		JComboBox cboAño = new JComboBox();
		cboAño.setBounds(187, 58, 66, 22);
		panel.add(cboAño);
		cboAño.setModel(new DefaultComboBoxModel(new String[] {"2025", "2026", "2027", "2028", "2029", "2030"}));
		
		JLabel lblNewLabel_2 = new JLabel("Hora: ");
		lblNewLabel_2.setBounds(35, 87, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtHora = new JTextField();
		txtHora.setBounds(79, 87, 173, 20);
		panel.add(txtHora);
		txtHora.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Veterinario");
		lblNewLabel_3.setBounds(29, 120, 68, 14);
		panel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 116, 150, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Servicios");
		lblNewLabel_4.setBounds(29, 155, 55, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox cboServi = new JComboBox();
		cboServi.setBounds(99, 151, 150, 22);
		panel.add(cboServi);
		
		JButton btnRegiCita = new JButton("Registrar");
		btnRegiCita.setBounds(74, 197, 116, 23);
		panel.add(btnRegiCita);
		
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
	}

	public void actionPerformed(ActionEvent e) {
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
	
	
}
