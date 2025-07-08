package clases;

import java.math.BigDecimal;

public class Servicio {
	private String IdServicio;
    private String NombreServicio;
    private double PrecioServicio;
	public Servicio(String idServicio, String nombreServicio, double precioServicio) {
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
	public double getPrecioServicio() {
		return PrecioServicio;
	}
	public void setPrecioServicio(double precioServicio) {
		PrecioServicio = precioServicio;
	}
    
    
	
    
    
}
