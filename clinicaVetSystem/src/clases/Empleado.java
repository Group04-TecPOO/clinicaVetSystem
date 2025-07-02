package clases;

public class Empleado {
	private String DniEmpleado;
	private String NombreCompleto;
	private String Telefono;
	private String Direccion;
	private Boolean Disponibilidad;
	
	public Empleado(String dniEmpleado, String nombreCompleto, String telefono, String direccion,
			Boolean disponibilidad) {
		super();
		DniEmpleado = dniEmpleado;
		NombreCompleto = nombreCompleto;
		Telefono = telefono;
		Direccion = direccion;
		Disponibilidad = disponibilidad;
	}

	public String getDniEmpleado() {
		return DniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}

	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public Boolean getDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}
	
	
}
