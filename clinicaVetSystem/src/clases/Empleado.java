package clases;

public abstract class Empleado {
	private String DniEmpleado;
	private String NombreCompleto;
	private String Telefono;
	private String Direccion;
	private Boolean Disponibilidad;
	private Boolean Jefe;
	private String Contraseña;
	
	
	public Empleado(String dniEmpleado, String nombreCompleto, String telefono, String direccion,
			Boolean disponibilidad, Boolean jefe, String contraseña) {
		super();
		DniEmpleado = dniEmpleado;
		NombreCompleto = nombreCompleto;
		Telefono = telefono;
		Direccion = direccion;
		Disponibilidad = disponibilidad;
		Jefe = jefe;
		Contraseña = contraseña;
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


	public Boolean getJefe() {
		return Jefe;
	}


	public void setJefe(Boolean jefe) {
		Jefe = jefe;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	
	//Method
	public abstract String IniciarSesion();
	public abstract String ModificarDatosEmpleado();
	public abstract String MostrarDatosEmpleado();
	
}
