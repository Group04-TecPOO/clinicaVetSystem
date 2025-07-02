package clases;

public class Usuario {
	private String user, contra, tipo;

	
	public Usuario(String user, String contra, String tipo) {
		super();
		this.user = user;
		this.contra = contra;
		this.tipo = tipo;
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
}
