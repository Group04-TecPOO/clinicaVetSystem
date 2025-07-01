package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.multi.MultiPopupMenuUI;

import clases.Recepcionista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblContrasea;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("USUARIO:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setBounds(90, 72, 94, 26);
			contentPane.add(lblNewLabel);
		}
		{
			lblContrasea = new JLabel("CONTRASEÑA:");
			lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblContrasea.setBounds(65, 126, 119, 26);
			contentPane.add(lblContrasea);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(194, 59, 160, 33);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			txtContraseña = new JTextField();
			txtContraseña.setColumns(10);
			txtContraseña.setBounds(194, 119, 160, 33);
			contentPane.add(txtContraseña);
		}
		{
			btnIngresar = new JButton("INGRESAR");
			btnIngresar.addActionListener(this);
			btnIngresar.setBackground(new Color(204, 153, 255));
			btnIngresar.setBounds(126, 231, 203, 46);
			contentPane.add(btnIngresar);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
		
		Object tipo;
		if(tipo.equals("Veterinario")) {
			
		}
	}
}
