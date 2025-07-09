package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MenuJefe extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuJefe dialog = new MenuJefe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuJefe() {
		setTitle("MENÚ DE JEFE");
		setBounds(100, 100, 362, 278);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(245, 222, 179));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnNewButton = new JButton("Historial de Clientes");
			btnNewButton.addActionListener(this);
			btnNewButton.setBackground(new Color(250, 128, 114));
			btnNewButton.setBounds(77, 48, 144, 23);
			contentPanel.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Historial de Mascota");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBackground(new Color(250, 128, 114));
			btnNewButton_1.setBounds(77, 80, 144, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Ventas");
			btnNewButton_2.setBackground(new Color(250, 128, 114));
			btnNewButton_2.setBounds(77, 114, 144, 23);
			contentPanel.add(btnNewButton_2);
		}
		
		btnNewButton_2_1 = new JButton("Ver Programadores");
		btnNewButton_2_1.addActionListener(this);
		btnNewButton_2_1.setBackground(new Color(250, 128, 114));
		btnNewButton_2_1.setBounds(10, 172, 144, 23);
		contentPanel.add(btnNewButton_2_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(245, 222, 179));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver a Iniciar Sesion");
				cancelButton.setBackground(new Color(250, 128, 114));
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2_1) {
			do_btnNewButton_2_1_actionPerformed(e);
		}
		if (e.getSource() == cancelButton) {
			do_cancelButton_actionPerformed(e);
		}
	}
	protected void do_cancelButton_actionPerformed(ActionEvent e) {
		Login lg = new Login(getName());
		lg.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_2_1_actionPerformed(ActionEvent e) {
		Programadores p = new Programadores();
		p.setVisible(true);
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		HistorialCliente hc = new HistorialCliente();
		hc.setVisible(true);
		this.setVisible(false);
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		HistorialMascota hm = new HistorialMascota();
		hm.setVisible(true);
		this.setVisible(false);
	}
}
