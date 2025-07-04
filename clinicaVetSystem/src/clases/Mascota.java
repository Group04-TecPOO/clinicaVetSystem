package clases;

public class Mascota {
    private int idMascota;
    private String nomMascota;
    private int edad;
    private double peso;
    private String raza;
    private String especie;
    private String sexo;
    private boolean esterilizado;
    private String dniCliente;

    public Mascota(int idMascota, String nomMascota, int edad, double peso, String raza, String especie, String sexo, boolean esterilizado, String dniCliente) {
        this.idMascota = idMascota;
        this.nomMascota = nomMascota;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.especie = especie;
        this.sexo = sexo;
        this.esterilizado = esterilizado;
        this.dniCliente = dniCliente;
    }

    // Constructor sin ID para insertar
    public Mascota(String nomMascota, int edad, double peso, String raza, String especie, String sexo, boolean esterilizado, String dniCliente) {
        this.nomMascota = nomMascota;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;
        this.especie = especie;
        this.sexo = sexo;
        this.esterilizado = esterilizado;
        this.dniCliente = dniCliente;
    }

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNomMascota() {
		return nomMascota;
	}

	public void setNomMascota(String nomMascota) {
		this.nomMascota = nomMascota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isEsterilizado() {
		return esterilizado;
	}

	public void setEsterilizado(boolean esterilizado) {
		this.esterilizado = esterilizado;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

   
}
