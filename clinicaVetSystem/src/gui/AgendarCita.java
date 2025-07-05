package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AgendarCita extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JLabel lblNewLabel;
	private JComboBox cboVeterinarios;
	private JLabel lblDnicliente;
	private JTextField txtDniCliente;
	private JScrollPane scrollPane;
	private JTable tblAgendar;
	private JButton btnAgendar;
	private JScrollPane scrollPane_1;
	private JTable tblServicio;
	private JLabel lblNewLabel_1;
	private JTextField txtServicio;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtHora;

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
		setBounds(100, 100, 924, 672);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 250, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Veterinarios:");
			lblNewLabel.setBounds(431, 87, 76, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			cboVeterinarios = new JComboBox();
			cboVeterinarios.setBounds(517, 83, 109, 22);
			contentPanel.add(cboVeterinarios);
		}
		{
			lblDnicliente = new JLabel("DNI-Cliente:");
			lblDnicliente.setBounds(431, 30, 76, 14);
			contentPanel.add(lblDnicliente);
		}
		{
			txtDniCliente = new JTextField();
			txtDniCliente.setBounds(517, 27, 109, 20);
			contentPanel.add(txtDniCliente);
			txtDniCliente.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 248, 600, 316);
			contentPanel.add(scrollPane);
			{
				tblAgendar = new JTable();
				scrollPane.setViewportView(tblAgendar);
			}
		}
		{
			btnAgendar = new JButton("Agendar");
			btnAgendar.setBackground(new Color(255, 192, 203));
			btnAgendar.setBounds(709, 55, 114, 48);
			contentPanel.add(btnAgendar);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 11, 390, 151);
			contentPanel.add(scrollPane_1);
			{
				tblServicio = new JTable();
				scrollPane_1.setViewportView(tblServicio);
			}
		}
		{
			lblNewLabel_1 = new JLabel("Servicio:");
			lblNewLabel_1.setBounds(45, 185, 56, 22);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtServicio = new JTextField();
			txtServicio.setBounds(111, 185, 174, 22);
			contentPanel.add(txtServicio);
			txtServicio.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Fecha:");
			lblNewLabel_2.setBounds(345, 189, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Hora:");
			lblNewLabel_3.setBounds(473, 189, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			txtHora = new JTextField();
			txtHora.setBounds(517, 178, 109, 28);
			contentPanel.add(txtHora);
			txtHora.setColumns(10);
		}
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
}
