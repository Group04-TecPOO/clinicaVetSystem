package clases;

public class Citas {

	private int IdCita;
	private String Dia;
	private String Mes;
	private String Año;
	private String Hora;
	private String DniCliente;
	private String IdMascota;
	private String DniEmpleado;
	private String IdServicio;
	public Citas(int idCita, String dia, String mes, String año, String hora, String dniCliente, String idMascota,
			String dniEmpleado, String idServicio) {
		super();
		IdCita = idCita;
		Dia = dia;
		Mes = mes;
		Año = año;
		Hora = hora;
		DniCliente = dniCliente;
		IdMascota = idMascota;
		DniEmpleado = dniEmpleado;
		IdServicio = idServicio;
	}
	public int getIdCita() {
		return IdCita;
	}
	public void setIdCita(int idCita) {
		IdCita = idCita;
	}
	public String getDia() {
		return Dia;
	}
	public void setDia(String dia) {
		Dia = dia;
	}
	public String getMes() {
		return Mes;
	}
	public void setMes(String mes) {
		Mes = mes;
	}
	public String getAño() {
		return Año;
	}
	public void setAño(String año) {
		Año = año;
	}
	public String getHora() {
		return Hora;
	}
	public void setHora(String hora) {
		Hora = hora;
	}
	public String getDniCliente() {
		return DniCliente;
	}
	public void setDniCliente(String dniCliente) {
		DniCliente = dniCliente;
	}
	public String getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(String idMascota) {
		IdMascota = idMascota;
	}
	public String getDniEmpleado() {
		return DniEmpleado;
	}
	public void setDniEmpleado(String dniEmpleado) {
		DniEmpleado = dniEmpleado;
	}
	public String getIdServicio() {
		return IdServicio;
	}
	public void setIdServicio(String idServicio) {
		IdServicio = idServicio;
	}
	
	
}
