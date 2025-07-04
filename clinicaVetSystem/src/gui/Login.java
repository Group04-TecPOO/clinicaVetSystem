package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.multi.MultiPopupMenuUI;

import ArrayClases.ArrayLogin;
import clases.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblContrasea;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private String tipo;
	private JPasswordField txtContra;
	private int intentosLogin=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login("");
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
	public Login(String tipo) {
		this.tipo= tipo;
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
			txtUsuario.setBounds(194, 71, 160, 33);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			btnIngresar = new JButton("INGRESAR");
			btnIngresar.addActionListener(this);
			btnIngresar.setBackground(new Color(204, 153, 255));
			btnIngresar.setBounds(126, 231, 203, 46);
			contentPane.add(btnIngresar);
		}
		{
			txtContra = new JPasswordField();
			txtContra.setBounds(194, 122, 160, 33);
			contentPane.add(txtContra);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {		
		String usuario = txtUsuario.getText().trim();
	    String contra = txtContra.getText().trim();
	    
	    
	
	    Usuario u = ArrayLogin.VerificarCredenciales(usuario, contra);

	    if (u != null) {
	        String tipo = u.getTipo().toLowerCase(); 

	        switch (tipo) {
	            case "veterinario":
	                JOptionPane.showMessageDialog(this, "Bienvenido Veterinario"); 
	                MenuVeterinario mv = new MenuVeterinario();
	                mv.setVisible(true);
	                this.dispose();
	                break;
	            case "recepcionista":
	                JOptionPane.showMessageDialog(this, "Bienvenido Recepcionista");
	                MenuRecepcionista mr = new MenuRecepcionista();
	                mr.setVisible(true);
	                this.dispose();
	                break;
	            case "jefe":
	                JOptionPane.showMessageDialog(this, "Bienvenido Jefe");
	                MenuJefe mj = new MenuJefe();
	                mj.setVisible(true);
	                this.dispose();
	                break;
	            default:
	                JOptionPane.showMessageDialog(this, "Rol no reconocido");
	        }

	    } else {
	    	intentosLogin++;
	        JOptionPane.showMessageDialog(this, "No existes. Intento " + intentosLogin + " de 3", "Error", JOptionPane.ERROR_MESSAGE);
	        
	    }
	    
	    //maximum attempts check--------------------------------------------------------------
	    if(intentosLogin >= 3) {
	    	JOptionPane.showMessageDialog(this, "Superó el número máximo de 3 intentos", "Advertencia", JOptionPane.WARNING_MESSAGE);
	    	
	    	 txtUsuario.setEnabled(false);
	    	 txtContra.setEnabled(false);
	    	 btnIngresar.setEnabled(false);
	    	 intentosLogin++;
	    	 this.dispose();
	    }
		
	}
}
