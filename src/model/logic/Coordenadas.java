package model.logic;

public class Coordenadas {

	private double longitud;
	private double latitud;
	
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public Coordenadas(double longi,double lati)
	{
		longitud=longi;
		latitud=lati;
	}

	@Override
	public String toString() {
		return "Coordenadas [longitud=" + longitud + ", latitud=" + latitud + "]";
	}
	
}
