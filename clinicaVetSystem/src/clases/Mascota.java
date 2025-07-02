package clases;

public class Mascota {
	private int IdMascota;
	private String NomMascota;
	private int Edad;
	private double Peso;
	private String Raza;
	private String Especie;
	private String Sexo;
	private String Esterilizacion;
	public Mascota(int idMascota, String nomMascota, int edad, double peso, String raza, String especie, String sexo,
			String esterilizacion) {
		super();
		IdMascota = idMascota;
		NomMascota = nomMascota;
		Edad = edad;
		Peso = peso;
		Raza = raza;
		Especie = especie;
		Sexo = sexo;
		Esterilizacion = esterilizacion;
	}
	public int getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(int idMascota) {
		IdMascota = idMascota;
	}
	public String getNomMascota() {
		return NomMascota;
	}
	public void setNomMascota(String nomMascota) {
		NomMascota = nomMascota;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	public String getEspecie() {
		return Especie;
	}
	public void setEspecie(String especie) {
		Especie = especie;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getEsterilizacion() {
		return Esterilizacion;
	}
	public void setEsterilizacion(String esterilizacion) {
		Esterilizacion = esterilizacion;
	}
	
}