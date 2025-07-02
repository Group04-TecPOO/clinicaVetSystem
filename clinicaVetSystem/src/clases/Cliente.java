package clases;

public class Cliente {
	private int IdCliente;
	private String nombreCompleto;
	private String DniCliente;
	private String Direccion;
	private String Telefono;
	public Cliente(int idCliente, String nombreCompleto, String dniCliente, String direccion, String telefono) {
		super();
		IdCliente = idCliente;
		this.nombreCompleto = nombreCompleto;
		DniCliente = dniCliente;
		Direccion = direccion;
		Telefono = telefono;
	}
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getDniCliente() {
		return DniCliente;
	}
	public void setDniCliente(String dniCliente) {
		DniCliente = dniCliente;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	
	

	
	
	
}
