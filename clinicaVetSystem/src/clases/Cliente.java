package clases;

public class Cliente {
	
	private String DniCliente;
	private String nombreCompleto;
	private String Direccion;
	private String Telefono;
	
	public Cliente(String dniCliente, String nombreCompleto, String direccion, String telefono) {
		DniCliente = dniCliente;
		this.nombreCompleto = nombreCompleto;
		Direccion = direccion;
		Telefono = telefono;
	}
	
	public String getDniCliente() {
		return DniCliente;
	}
	public void setDniCliente(String dniCliente) {
		DniCliente = dniCliente;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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
