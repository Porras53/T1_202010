package model.data_structures;

public interface IListaEncadenada <T>
{
	
	T darCabeza();
	
	int darLongitud();
	
	boolean esListaVacia();
	
	public void insertarComienzo(T t2);
	
	public void insertarFinal(T t2);
	
	public void insertarDespuesDe(int n,T t2);
	
	public void eliminarComienzo();
	
	public void eliminarFinal();
	
	public void eliminarObjeto(int n);
	
	T darObjeto(int n);
	
	T darUltimo();
}
