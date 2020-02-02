package model.logic;

import java.io.File;

import com.google.gson.*;

import model.data_structures.*;
import sun.misc.IOUtils;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	/**
	 * Atributos del modelo del mundo
	 */
	private IListaEncadenada datos;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ListaEncadenada();
	}
	
	
	public void cargar()
	{
		//Definir mejor la entrada para el lector de json
		String dir= "./data/comparendos_dei_2018.geojson";
		File archivo= new File("./data/comparendos_dei_2018.geojson");
		JsonObject gsonObj0= JsonParser.parseString(dir).getAsJsonObject();
		
		JsonArray comparendos=gsonObj0.get("features").getAsJsonArray();
		
		for(JsonElement obj : comparendos)
		{
			JsonObject gsonObj= obj.getAsJsonObject();
			
			JsonObject gsonObjpropiedades=gsonObj.get("properties").getAsJsonObject();
			int objid= gsonObjpropiedades.get("OBJECTID").getAsInt();
			String fecha= gsonObjpropiedades.get("FECHA_HORA").getAsString();
			String clasevehiculo=gsonObjpropiedades.get("CLASE_VEHI").getAsString();
			String tiposervi=gsonObjpropiedades.get("TIPO_SERVI").getAsString();
			String infraccion=gsonObjpropiedades.get("INFRACCION").getAsString();
			String desinfraccion=gsonObjpropiedades.get("DES_INFRAC").getAsString();
			String localidad=gsonObjpropiedades.get("LOCALIDAD").getAsString();
			
			JsonObject gsonObjgeometria=gsonObj.get("geometry").getAsJsonObject();
			
			JsonArray gsonArrcoordenadas= gsonObjgeometria.get("coordinates").getAsJsonArray();
			double longitud= gsonArrcoordenadas.get(0).getAsDouble();
			double latitud= gsonArrcoordenadas.get(1).getAsDouble();
			
			datos.insertarFinal((Comparable) new Comparendo(objid, fecha, clasevehiculo, tiposervi, infraccion, desinfraccion, localidad, new Coordenadas(longitud,latitud)));
			
		}
		
		
		
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public IListaEncadenada darListaEncadenada()
	{
		return datos;
	}
	

		
	
}

	