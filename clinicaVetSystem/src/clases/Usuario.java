package clases;

public class Usuario {
	private String user, contra, tipo;
	private Empleado emple;
	public Usuario(String user, String contra, String tipo, Empleado emple) {
		super();
		this.user = user;
		this.contra = contra;
		this.tipo = tipo;
		this.emple = emple;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Empleado getEmple() {
		return emple;
	}
	public void setEmple(Empleado emple) {
		this.emple = emple;
	}
}
