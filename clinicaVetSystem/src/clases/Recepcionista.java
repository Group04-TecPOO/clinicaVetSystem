package clases;

public class Recepcionista extends Empleado{
	
	public Recepcionista(String dniEmpleado, String nombreCompleto, String telefono, String direccion,
			Boolean disponibilidad, Boolean jefe, String contraseña) {
		super(dniEmpleado, nombreCompleto, telefono, direccion, disponibilidad, jefe, contraseña);
		// TODO Auto-generated constructor stub
	}

	private boolean Certificado;

	@Override
	public String IniciarSesion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ModificarDatosEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String MostrarDatosEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
