package clases;

public class Servicio {
	private String IdServicio;
    private String NombreServicio;
    private Double PrecioServicio;
    
	public Servicio(String idServicio, String nombreServicio, Double precioServicio) {
		super();
		IdServicio = idServicio;
		NombreServicio = nombreServicio;
		PrecioServicio = precioServicio;
	}

	public String getIdServicio() {
		return IdServicio;
	}

	public void setIdServicio(String idServicio) {
		IdServicio = idServicio;
	}

	public String getNombreServicio() {
		return NombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		NombreServicio = nombreServicio;
	}

	public Double getPrecioServicio() {
		return PrecioServicio;
	}

	public void setPrecioServicio(Double precioServicio) {
		PrecioServicio = precioServicio;
	}
    
    
}
