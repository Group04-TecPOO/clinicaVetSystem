package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuRecepcionista extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnRegistrar;
	private JLabel lblNewLabel;
	private JButton cancelButton;
	private JButton btnAgendarCita;
	private JButton btnFactura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuRecepcionista dialog = new MenuRecepcionista();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuRecepcionista() {
		setTitle("Menú Recepcionista");
		setBounds(100, 100, 692, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnRegistrar = new JButton("");
			btnRegistrar.addActionListener(this);
			btnRegistrar.setIcon(new ImageIcon(MenuRecepcionista.class.getResource("/imagenes/registrar.png")));
			btnRegistrar.setBounds(95, 68, 151, 128);
			contentPanel.add(btnRegistrar);
		}
		{
			btnAgendarCita = new JButton("");
			btnAgendarCita.addActionListener(this);
			btnAgendarCita.setIcon(new ImageIcon(MenuRecepcionista.class.getResource("/imagenes/calendario.png")));
			btnAgendarCita.setBounds(392, 68, 151, 128);
			contentPanel.add(btnAgendarCita);
		}
		{
			btnFactura = new JButton("");
			btnFactura.addActionListener(this);
			btnFactura.setIcon(new ImageIcon(MenuRecepcionista.class.getResource("/imagenes/facturacion (1).png")));
			btnFactura.setBounds(249, 271, 151, 128);
			contentPanel.add(btnFactura);
		}
		{
			lblNewLabel = new JLabel("REGISTRAR PACIENTE");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(95, 195, 151, 28);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblAgendarPaciente = new JLabel("AGENDAR PACIENTE");
			lblAgendarPaciente.setHorizontalAlignment(SwingConstants.CENTER);
			lblAgendarPaciente.setBounds(392, 195, 151, 28);
			contentPanel.add(lblAgendarPaciente);
		}
		{
			JLabel lblFactura = new JLabel("FACTURA");
			lblFactura.setHorizontalAlignment(SwingConstants.CENTER);
			lblFactura.setBounds(249, 397, 151, 28);
			contentPanel.add(lblFactura);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver Al Inicio de Sesion");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnFactura) {
			do_btnFactura_actionPerformed(e);
		}
		if (e.getSource() == btnAgendarCita) {
			do_btnAgendarCita_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
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
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		RegistrarPacientes rp = new RegistrarPacientes();
		rp.setVisible(true);
		this.dispose();
				
	}
	protected void do_btnAgendarCita_actionPerformed(ActionEvent e) {
		AgendarCita ac = new AgendarCita();
		ac.setVisible(true);
		this.dispose();
	}
	protected void do_btnFactura_actionPerformed(ActionEvent e) {
		Factura f = new Factura();
		f.setVisible(true);
		this.dispose();
	}
}
