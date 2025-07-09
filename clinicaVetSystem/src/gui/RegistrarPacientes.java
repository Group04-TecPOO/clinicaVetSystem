package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ArrayClases.ArrayCliente;
import ArrayClases.ArrayMascota;
import clases.Cliente;
import clases.Mascota;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class RegistrarPacientes extends JDialog implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField txtNomCli;
	private JLabel lblDni;
	private JTextField txtDniCli;
	private JLabel lblDireccion;
	private JTextField txtDireCli;
	private JLabel lblTelefono;
	private JTextField txtTelCli;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField txtNombreMascota;
	private JLabel lblDni_1;
	private JTextField txtEdadMascota;
	private JLabel lblDireccion_1;
	private JTextField txtEspecieMascota;
	private JLabel lblTelefono_1;
	private JTextField txtIDMascota;
	private JLabel lblIdCliente_1;
	private JLabel lblDni_2;
	private JTextField txtPesoMascota;
	private JLabel lblTelefono_2;
	private JTextField txtRazaMascota;
	private JLabel lblDni_3;
	private JButton btnRegistrarMascota;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JTable tablaPropietario;
	private JScrollPane scrollPane_1;
	private JTable tablaMascota;
	private JButton cancelButton;
	private JButton btnLimpiarCampos;
	private JComboBox cboEsterilizado;
	private JComboBox cboSexo;
	private JButton btnLimpiarCampos_1;
	private JLabel lblPerrito;
	private JButton btnBorrar;
	private JButton btnBorrar_1;
	private JButton btnModificar;
	private JButton btnBorrar_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarPacientes dialog = new RegistrarPacientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarPacientes() {
		setTitle("Registro de Pacientes");
		setBounds(100, 100, 1077, 787);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(240, 248, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(10, 11, 468, 295);
			panel.setBackground(new Color(230, 230, 250));
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Propietario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel);
			{
				lblNewLabel = new JLabel("Nombre Completo");
				lblNewLabel.setBounds(10, 67, 94, 14);
				panel.add(lblNewLabel);
			}
			{
				lblDni = new JLabel("DNI");
				lblDni.setBounds(10, 11, 94, 14);
				panel.add(lblDni);
			}
			{
				txtDniCli = new JTextField();
				txtDniCli.setColumns(10);
				txtDniCli.setBounds(20, 36, 248, 20);
				panel.add(txtDniCli);
			}
			{
				lblDireccion = new JLabel("Direccion");
				lblDireccion.setBounds(10, 116, 94, 14);
				panel.add(lblDireccion);
			}
			{
				txtDireCli = new JTextField();
				txtDireCli.setColumns(10);
				txtDireCli.setBounds(20, 138, 248, 20);
				panel.add(txtDireCli);
			}
			{
				lblTelefono = new JLabel("Telefono");
				lblTelefono.setBounds(10, 165, 94, 14);
				panel.add(lblTelefono);
			}
			{
				txtTelCli = new JTextField();
				txtTelCli.setColumns(10);
				txtTelCli.setBounds(20, 190, 248, 20);
				panel.add(txtTelCli);
			}
			{
				btnRegistrar = new JButton("Registrar");
				btnRegistrar.setBackground(new Color(216, 191, 216));
				btnRegistrar.setBounds(10, 239, 89, 45);
				panel.add(btnRegistrar);
				{
					txtNomCli = new JTextField();
					txtNomCli.setBounds(20, 85, 248, 20);
					panel.add(txtNomCli);
					txtNomCli.setColumns(10);
				}
				{
					btnLimpiarCampos = new JButton("Limpiar Campos");
					btnLimpiarCampos.setBackground(new Color(216, 191, 216));
					btnLimpiarCampos.addActionListener(this);
					btnLimpiarCampos.setBounds(109, 239, 135, 45);
					panel.add(btnLimpiarCampos);
				}
				{
					btnBorrar = new JButton("Borrar");
					btnBorrar.addActionListener(this);
					btnBorrar.setBackground(new Color(216, 191, 216));
					btnBorrar.setBounds(254, 239, 89, 45);
					panel.add(btnBorrar);
				}
				
				btnModificar = new JButton("Modificar");
				btnModificar.addActionListener(this);
				btnModificar.setBackground(new Color(216, 191, 216));
				btnModificar.setBounds(354, 239, 89, 45);
				panel.add(btnModificar);
				btnRegistrar.addActionListener(this);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBounds(505, 11, 546, 295);
			panel_1.setBackground(new Color(230, 230, 250));
			panel_1.setLayout(null);
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mascota", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel_1);
			{
				lblNewLabel_1 = new JLabel("Nombre Mascota");
				lblNewLabel_1.setBounds(10, 63, 159, 14);
				panel_1.add(lblNewLabel_1);
			}
			{
				txtNombreMascota = new JTextField();
				txtNombreMascota.setColumns(10);
				txtNombreMascota.setBounds(10, 88, 169, 20);
				panel_1.add(txtNombreMascota);
			}
			{
				lblDni_1 = new JLabel("Edad");
				lblDni_1.setBounds(10, 119, 59, 14);
				panel_1.add(lblDni_1);
			}
			{
				txtEdadMascota = new JTextField();
				txtEdadMascota.setColumns(10);
				txtEdadMascota.setBounds(10, 137, 51, 20);
				panel_1.add(txtEdadMascota);
			}
			{
				lblDireccion_1 = new JLabel("Especie");
				lblDireccion_1.setBounds(10, 168, 94, 14);
				panel_1.add(lblDireccion_1);
			}
			{
				txtEspecieMascota = new JTextField();
				txtEspecieMascota.setColumns(10);
				txtEspecieMascota.setBounds(10, 186, 169, 20);
				panel_1.add(txtEspecieMascota);
			}
			{
				lblTelefono_1 = new JLabel("Sexo");
				lblTelefono_1.setBounds(10, 217, 69, 14);
				panel_1.add(lblTelefono_1);
			}
			{
				txtIDMascota = new JTextField();
				txtIDMascota.setColumns(10);
				txtIDMascota.setBounds(10, 36, 169, 20);
				panel_1.add(txtIDMascota);
			}
			{
				lblIdCliente_1 = new JLabel("ID Mascota");
				lblIdCliente_1.setBounds(10, 11, 94, 14);
				panel_1.add(lblIdCliente_1);
			}
			{
				lblDni_2 = new JLabel("Peso");
				lblDni_2.setBounds(67, 119, 51, 14);
				panel_1.add(lblDni_2);
			}
			{
				txtPesoMascota = new JTextField();
				txtPesoMascota.setColumns(10);
				txtPesoMascota.setBounds(67, 137, 51, 20);
				panel_1.add(txtPesoMascota);
			}
			{
				lblTelefono_2 = new JLabel("Esterilización");
				lblTelefono_2.setBounds(110, 217, 94, 14);
				panel_1.add(lblTelefono_2);
			}
			{
				txtRazaMascota = new JTextField();
				txtRazaMascota.setColumns(10);
				txtRazaMascota.setBounds(128, 137, 59, 20);
				panel_1.add(txtRazaMascota);
			}
			{
				lblDni_3 = new JLabel("Raza");
				lblDni_3.setBounds(128, 119, 59, 14);
				panel_1.add(lblDni_3);
			}
			{
				cboEsterilizado = new JComboBox();
				cboEsterilizado.setModel(new DefaultComboBoxModel(new String[] {"Sí", "No"}));
				cboEsterilizado.setBounds(110, 241, 59, 21);
				panel_1.add(cboEsterilizado);
			}
			{
				cboSexo = new JComboBox();
				cboSexo.setModel(new DefaultComboBoxModel(new String[] {"", "Macho", "Hembra"}));
				cboSexo.setBounds(10, 240, 59, 22);
				panel_1.add(cboSexo);
			}
			{
				btnRegistrarMascota = new JButton("Registrar Mascota");
				btnRegistrarMascota.setBackground(new Color(216, 191, 216));
				btnRegistrarMascota.setBounds(370, 24, 151, 44);
				panel_1.add(btnRegistrarMascota);
				{
					btnLimpiarCampos_1 = new JButton("Limpiar Campos");
					btnLimpiarCampos_1.addActionListener(this);
					btnLimpiarCampos_1.setBackground(new Color(216, 191, 216));
					btnLimpiarCampos_1.setBounds(370, 213, 151, 49);
					panel_1.add(btnLimpiarCampos_1);
				}
				{
					lblPerrito = new JLabel("");
					lblPerrito.setBounds(214, 36, 134, 203);
					panel_1.add(lblPerrito);
				}
				{
					btnBorrar_1 = new JButton("Borrar");
					btnBorrar_1.addActionListener(this);
					btnBorrar_1.setBackground(new Color(216, 191, 216));
					btnBorrar_1.setBounds(370, 88, 151, 45);
					panel_1.add(btnBorrar_1);
				}
				{
					btnBorrar_2 = new JButton("Modificar");
					btnBorrar_2.addActionListener(this);
					btnBorrar_2.setBackground(new Color(216, 191, 216));
					btnBorrar_2.setBounds(370, 153, 151, 45);
					panel_1.add(btnBorrar_2);
				}
				btnRegistrarMascota.addActionListener(this);
			}
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 330, 468, 374);
			scrollPane.addMouseListener(this);
			contentPanel.add(scrollPane);
			{
				tablaPropietario = new JTable();
				scrollPane.setViewportView(tablaPropietario);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.addMouseListener(this);
			scrollPane_1.setBounds(505, 330, 546, 374);
			contentPanel.add(scrollPane_1);
			{
				tablaMascota = new JTable();
				scrollPane_1.setViewportView(tablaMascota);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Volver al Menu");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
		}
		Listar("");
		ListarMascota("");
	}
	public void Listar(String dni) {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayCliente ac = new ArrayCliente();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		if(dni.length() == 0) lista = ac.listarCliente();
		else lista = ac.consultarCliente(dni);
		
		modelo.setRowCount(lista.size());
		Iterator<Cliente> it = lista.iterator();
		modelo.addColumn("DNI");
		modelo.addColumn("Nombre");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		int i = 0;
		
		while (it.hasNext()) {
			Object obj = it.next();
			Cliente cl = (Cliente)obj;
			modelo.setValueAt(cl.getDniCliente(), i, 0);
			modelo.setValueAt(cl.getNombreCompleto(), i, 1);
			modelo.setValueAt(cl.getDireccion(), i, 2);
			modelo.setValueAt(cl.getTelefono(), i, 3);
			i++;
		}
		tablaPropietario.setModel(modelo);
	}
	public void ListarMascota(String dni) {
	    DefaultTableModel modelo = new DefaultTableModel();
	    ArrayMascota am = new ArrayMascota();
	    ArrayList<Mascota> lista = new ArrayList<Mascota>();
	    if (dni.length() == 0) {
	        lista = am.listarMascotas();
	    } else {
	        lista = am.consultarID(dni);
	    }

	    modelo.addColumn("ID");
	    modelo.addColumn("Nombre");
	    modelo.addColumn("Edad");
	    modelo.addColumn("Peso");
	    modelo.addColumn("Raza");
	    modelo.addColumn("Especie");
	    modelo.addColumn("Sexo");
	    modelo.addColumn("Esterilización");
	    modelo.addColumn("DNI Cliente");

	    modelo.setRowCount(lista.size());
	    Iterator<Mascota> it = lista.iterator();
	    int i = 0;

	    while (it.hasNext()) {
	        Mascota mas = it.next();
	        modelo.setValueAt(mas.getIdMascota(), i, 0);
	        modelo.setValueAt(mas.getNomMascota(), i, 1);
	        modelo.setValueAt(mas.getEdad(), i, 2);
	        modelo.setValueAt(mas.getPeso(), i, 3);
	        modelo.setValueAt(mas.getRaza(), i, 4);
	        modelo.setValueAt(mas.getEspecie(), i, 5);
	        modelo.setValueAt(mas.getSexo(), i, 6);
	        modelo.setValueAt(mas.isEsterilizado() ? "Sí" : "No", i, 7);
	        modelo.setValueAt(mas.getDniCliente(), i, 8);
	        i++;
	    }

	    tablaMascota.setModel(modelo);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar_2) {
			do_btnBorrar_2_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnBorrar) {
			do_btnBorrar_actionPerformed(e);
		}
		if (e.getSource() == btnBorrar_1) {
			do_btnBorrar_1_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiarCampos_1) {
			do_btnLimpiarCampos_1_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiarCampos) {
			do_btnLimpiarCampos_actionPerformed(e);
		}
		if (e.getSource() == cancelButton) {
			do_cancelButton_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarMascota) {
			do_btnRegistrarMascota_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		if (!txtDniCli.getText().trim().isEmpty()) {
		    try {
		        String dni = txtDniCli.getText().trim();
		        ArrayCliente ac = new ArrayCliente();
		        ArrayList<Cliente> existente = ac.consultarCliente(dni);

		        if (existente.isEmpty()) {
		            Cliente cl = new Cliente(dni, txtNomCli.getText(), txtDireCli.getText(), txtTelCli.getText());
		            ac.Insertar(cl);
		            Listar("");
		            Limpiar();
		            JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
		        } else {
		            JOptionPane.showMessageDialog(null, "El cliente con DNI " + dni + " ya existe");
		        }
		    } catch (Exception e2) {
		        JOptionPane.showMessageDialog(null, "Error al registrar cliente: " + e2.getMessage());
		    }
		} else {
		    JOptionPane.showMessageDialog(null, "El campo DNI no puede estar vacío");
		}
	}
	
	void Limpiar() {
		txtNomCli.setText("");
		txtDniCli.setText("");
		txtDireCli.setText("");
		txtTelCli.setText("");
	}
	void LimpiarMascota() {
		txtNombreMascota.setText("");
		txtEdadMascota.setText("");
		txtPesoMascota.setText("");
		txtRazaMascota.setText("");
		txtEspecieMascota.setText(""); 
	}
	
	protected void do_btnRegistrarMascota_actionPerformed(ActionEvent e) {
		 try {
		        String nombre = txtNombreMascota.getText();
		        int edad = Integer.parseInt(txtEdadMascota.getText());
		        double peso = Double.parseDouble(txtPesoMascota.getText());
		        String raza = txtRazaMascota.getText();
		        String especie = txtEspecieMascota.getText();
		        String sexo = cboSexo.getSelectedItem().toString();
		        String dni = txtDniCli.getText();
		        boolean esterilizado = cboEsterilizado.getSelectedItem().toString().equals("Sí");

		        if (nombre.isEmpty() || dni.isEmpty()) {
		            throw new Exception("Campos obligatorios vacíos");
		        }

		        Mascota mas = new Mascota(nombre, edad, peso, raza, especie, sexo, esterilizado, dni);
		        ArrayMascota am = new ArrayMascota();
		        am.insertarMascota(mas);

		        ListarMascota(""); 
		        LimpiarMascota();
		        lblPerrito.setIcon(new ImageIcon(RegistrarPacientes.class.getResource("/imagenes/perrito.jpg")));
		        JOptionPane.showMessageDialog(null, "Mascota registrada correctamente");

		    } catch (NumberFormatException e1) {
		        JOptionPane.showMessageDialog(null, "Edad y peso deben ser numéricos");
		    } catch (Exception e2) {
		        JOptionPane.showMessageDialog(null, "Error al registrar mascota: " + e2.getMessage());
		    }
	}
	
	protected void do_cancelButton_actionPerformed(ActionEvent e) {
		MenuRecepcionista mr = new MenuRecepcionista();
		mr.setVisible(true);
		this.dispose();
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == scrollPane) {
			do_scrollPane_mouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
		if (e.getSource() == scrollPane_1) {
			do_scrollPane_1_mouseReleased(e);
		}
	}
	protected void do_scrollPane_mouseClicked(MouseEvent e) {
		int fila = tablaPropietario.getSelectedRow();
		txtDniCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 0)));
		txtNomCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 1)));
		txtDireCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 2)));
		txtTelCli.setText(String.valueOf(tablaPropietario.getValueAt(fila, 3)));
	}
	protected void do_btnLimpiarCampos_actionPerformed(ActionEvent e) {
		Limpiar();
	}
	protected void do_btnLimpiarCampos_1_actionPerformed(ActionEvent e) {
		LimpiarMascota();
	}
	protected void do_btnBorrar_1_actionPerformed(ActionEvent e) {
		try {
	        int id = Integer.parseInt(txtIDMascota.getText().trim());
	        ArrayMascota am = new ArrayMascota();
	        am.eliminarMascota(id);
	        JOptionPane.showMessageDialog(null, "Mascota eliminada correctamente");
	        ListarMascota(""); 
	    } catch (NumberFormatException ex) {
	        JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ID de la mascota");
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar mascota: " + ex.getMessage());
	    }
	}
	protected void do_btnBorrar_actionPerformed(ActionEvent e) {
		String dni = txtDniCli.getText();
	    if (!dni.isEmpty()) {
	        int confirm = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar al cliente con DNI " + dni + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
	        if (confirm == JOptionPane.YES_OPTION) {
	            ArrayCliente ac = new ArrayCliente();
	            ac.Eliminar(dni);
	            Listar("");     
	            Limpiar();       
	        }
	    } else {
	        JOptionPane.showMessageDialog(null, "Ingrese el DNI del cliente a eliminar.");
	    }
		
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		
		try {
	        String dni = txtDniCli.getText().trim();
	        String nombre = txtNomCli.getText().trim();
	        String direccion = txtDireCli.getText().trim();
	        String telefono = txtTelCli.getText().trim();

	        if (dni.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
	            return;
	        }

	        Cliente c = new Cliente(dni, nombre, direccion, telefono);
	        ArrayCliente ac = new ArrayCliente();
	        ac.Modificar(c);

	        Listar("");
	        Limpiar();
	        JOptionPane.showMessageDialog(null, "Cliente modificado exitosamente");

	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
	    }
		
	}
	protected void do_btnBorrar_2_actionPerformed(ActionEvent e) {
		
		int fila = tablaMascota.getSelectedRow();

	    if (fila == -1) {
	        JOptionPane.showMessageDialog(null, "Seleccione una mascota para modificar.");
	        return;
	    }

	    try {
	        int id = Integer.parseInt(tablaMascota.getValueAt(fila, 0).toString());
	        String nombre = txtNombreMascota.getText().trim();
	        int edad = Integer.parseInt(txtEdadMascota.getText().trim());
	        double peso = Double.parseDouble(txtPesoMascota.getText().trim());
	        String raza = txtRazaMascota.getText().trim();
	        String especie = txtEspecieMascota.getText().trim();
	        String sexo = cboSexo.getSelectedItem().toString();
	        boolean esterilizado = cboEsterilizado.getSelectedItem().toString().equals("Sí");
	        String dni = txtDniCli.getText().trim();

	        Mascota m = new Mascota(id, nombre, edad, peso, raza, especie, sexo, esterilizado, dni);
	        ArrayMascota am = new ArrayMascota();
	        am.Modificar(m);

	        ListarMascota(""); // Refresca tabla
	        JOptionPane.showMessageDialog(null, "Mascota modificada correctamente.");
	        LimpiarMascota();
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
	    }
		
	}
	protected void do_scrollPane_1_mouseReleased(MouseEvent e) {
		int fila = tablaMascota.getSelectedRow();
	    if (fila != -1) {
	        txtNombreMascota.setText(String.valueOf(tablaMascota.getValueAt(fila, 1)));
	        txtEdadMascota.setText(String.valueOf(tablaMascota.getValueAt(fila, 2)));
	        txtPesoMascota.setText(String.valueOf(tablaMascota.getValueAt(fila, 3)));
	        txtRazaMascota.setText(String.valueOf(tablaMascota.getValueAt(fila, 4)));
	        txtEspecieMascota.setText(String.valueOf(tablaMascota.getValueAt(fila, 5)));
	        cboSexo.setSelectedItem(String.valueOf(tablaMascota.getValueAt(fila, 6)));
	        cboEsterilizado.setSelectedItem(String.valueOf(tablaMascota.getValueAt(fila, 7)));
	        txtDniCli.setText(String.valueOf(tablaMascota.getValueAt(fila, 8)));
	    }
	    
	}
}
