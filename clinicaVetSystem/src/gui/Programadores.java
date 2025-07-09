package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Programadores extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnProgramadores;
	private JButton btnNewButton;
	private JButton btnCarlos;
	private JButton btnSebastinHermoza;
	private JButton btnSebastinHernandez;
	private JButton btnJeanFranco;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Programadores dialog = new Programadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Programadores() {
		setBounds(100, 100, 997, 356);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(242, 196, 55));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			btnProgramadores = new JButton("PROGRAMADORES INVOLUCRADOS EN EL PROYECTO");
			btnProgramadores.setBackground(new Color(242, 196, 55));
			btnProgramadores.setFont(new Font("Cambria Math", Font.BOLD, 18));
			btnProgramadores.setContentAreaFilled(false);
			btnProgramadores.setBorderPainted(false);
			btnProgramadores.setBounds(209, 11, 506, 38);
			contentPanel.add(btnProgramadores);
		}
		{
			btnNewButton = new JButton("<html><div style='text-align:center;'>Melissa Stephanie Alejandra<br>Guillen Olivera</div></html>");
			btnNewButton.addActionListener(this);
			btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 13));
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBounds(30, 232, 209, 57);
			contentPanel.add(btnNewButton);
		}
		{
			btnCarlos = new JButton("<html><div style='text-align:center;'>Carlos Raúl<br>García Janampa</div></html>");
			btnCarlos.addActionListener(this);
			btnCarlos.setFont(new Font("Cambria", Font.PLAIN, 13));
			btnCarlos.setContentAreaFilled(false);
			btnCarlos.setBorderPainted(false);
			btnCarlos.setBounds(249, 225, 120, 64);
			contentPanel.add(btnCarlos);
		}
		{
			btnSebastinHermoza = new JButton("<html><div style='text-align:center;'>Sebastián Felipe<br>Hermoza Quispe</div></html>");
			btnSebastinHermoza.addActionListener(this);
			btnSebastinHermoza.setFont(new Font("Cambria", Font.PLAIN, 13));
			btnSebastinHermoza.setContentAreaFilled(false);
			btnSebastinHermoza.setBorderPainted(false);
			btnSebastinHermoza.setBounds(415, 245, 158, 30);
			contentPanel.add(btnSebastinHermoza);
		}
		{
			btnSebastinHernandez = new JButton("<html><div style='text-align:center;'>Arturo Sebastián<br>Hernandez Maguiña</div></html>");
			btnSebastinHernandez.addActionListener(this);
			btnSebastinHernandez.setFont(new Font("Cambria", Font.PLAIN, 13));
			btnSebastinHernandez.setContentAreaFilled(false);
			btnSebastinHernandez.setBorderPainted(false);
			btnSebastinHernandez.setBounds(595, 245, 158, 30);
			contentPanel.add(btnSebastinHernandez);
		}
		{
			btnJeanFranco = new JButton("<html><div style='text-align:center;'>Jean Franco<br>Gomez Gargate</div></html>");
			btnJeanFranco.addActionListener(this);
			btnJeanFranco.setFont(new Font("Cambria", Font.PLAIN, 13));
			btnJeanFranco.setContentAreaFilled(false);
			btnJeanFranco.setBorderPainted(false);
			btnJeanFranco.setBounds(779, 245, 158, 30);
			contentPanel.add(btnJeanFranco);
		}
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(67, 93, 140, 141);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(249, 93, 140, 141);
			contentPanel.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(421, 93, 140, 141);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setBounds(602, 93, 140, 141);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(784, 93, 140, 141);
			contentPanel.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setIcon(new ImageIcon(Programadores.class.getResource("/imagenes/UPN_83x81.png")));
			lblNewLabel_5.setBounds(695, 11, 83, 64);
			contentPanel.add(lblNewLabel_5);
			setLocationRelativeTo(null);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnJeanFranco) {
			do_btnJeanFranco_actionPerformed(e);
		}
		if (e.getSource() == btnSebastinHernandez) {
			do_btnSebastinHernandez_actionPerformed(e);
		}
		if (e.getSource() == btnSebastinHermoza) {
			do_btnSebastinHermoza_actionPerformed(e);
		}
		if (e.getSource() == btnCarlos) {
			do_btnCarlos_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Melissa.jpeg"));
		 Image imagen = icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		 lblNewLabel.setIcon(new ImageIcon(imagen));
	}
	protected void do_btnCarlos_actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Carlos.jpeg"));
		 Image imagen = icon.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH);
		 lblNewLabel_1.setIcon(new ImageIcon(imagen));
	}
	protected void do_btnSebastinHermoza_actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/SebastianHQ.png"));
		 Image imagen = icon.getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), Image.SCALE_SMOOTH);
		 lblNewLabel_2.setIcon(new ImageIcon(imagen));
	}
	
	protected void do_btnSebastinHernandez_actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/ASebastian.JPG"));
		 Image imagen = icon.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH);
		 lblNewLabel_3.setIcon(new ImageIcon(imagen));
	}
	protected void do_btnJeanFranco_actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Jean.png"));
		 Image imagen = icon.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH);
		 lblNewLabel_4.setIcon(new ImageIcon(imagen));
	}
}
