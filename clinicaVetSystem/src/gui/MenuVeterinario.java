package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class MenuVeterinario extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuVeterinario dialog = new MenuVeterinario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuVeterinario() {
		setTitle("MENÚ VETERINARIO");
		setBounds(100, 100, 395, 189);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(245, 255, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		btnNewButton = new JButton("Ver citas");
		btnNewButton.addActionListener(this);
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.setBounds(118, 39, 147, 42);
		contentPanel.add(btnNewButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(245, 255, 250));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver al Iniciar Sesion");
				cancelButton.setBackground(new Color(102, 205, 170));
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
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
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		VerCitas vc = new VerCitas();
		vc.setVisible(true);
		this.setVisible(false);
	}
}
