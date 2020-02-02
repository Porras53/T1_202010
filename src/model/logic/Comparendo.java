package model.logic;

public class Comparendo {

	private int id;
	private String fecha;
	private String clasevehi;
	private String tiposervi;
	private String infraccion;
	private String desinfraccion;
	private String localidad;
	private Coordenadas coordenadas;
	
	public Comparendo(int id,String fecha, String clasevehiculo,String tiposervicio,String infraccion,String desinfraccion,String localidad, Coordenadas coordenadas)
	{
		this.id= id;
		this.fecha=fecha;
		this.clasevehi=clasevehiculo;
		this.tiposervi=tiposervicio;
		this.infraccion=infraccion;
		this.desinfraccion=desinfraccion;
		this.localidad=localidad;
		this.coordenadas=coordenadas;
	}

	@Override
	public String toString() {
		return "Comparendo [id=" + id + ", fecha=" + fecha + ", clase de vehiculo=" + clasevehi + ", tipo de servicio=" + tiposervi
				+ ", infraccion=" + infraccion + ", descripcion de infraccion=" + desinfraccion + ", localidad=" + localidad
				+ ", coordenadas=" + coordenadas.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getClasevehi() {
		return clasevehi;
	}

	public void setClasevehi(String clasevehi) {
		this.clasevehi = clasevehi;
	}

	public String getTiposervi() {
		return tiposervi;
	}

	public void setTiposervi(String tiposervi) {
		this.tiposervi = tiposervi;
	}

	public String getInfraccion() {
		return infraccion;
	}

	public void setInfraccion(String infraccion) {
		this.infraccion = infraccion;
	}

	public String getDesinfraccion() {
		return desinfraccion;
	}

	public void setDesinfraccion(String desinfraccion) {
		this.desinfraccion = desinfraccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}
	
}
