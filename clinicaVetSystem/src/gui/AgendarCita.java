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
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTable tblAgendar;
	private JButton btnAgendar;

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
			lblNewLabel = new JLabel("Veterinario");
			lblNewLabel.setBounds(26, 26, 76, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			cboVeterinarios = new JComboBox();
			cboVeterinarios.setBounds(112, 22, 109, 22);
			contentPanel.add(cboVeterinarios);
		}
		{
			lblDnicliente = new JLabel("DNI-Cliente:");
			lblDnicliente.setBounds(26, 72, 76, 14);
			contentPanel.add(lblDnicliente);
		}
		{
			textField = new JTextField();
			textField.setBounds(112, 69, 109, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
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
