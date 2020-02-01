package model.data_structures;

public class ListaEncadenada <T extends Comparable<T>> 
{
	private int longitud;
	private Node<T> cabeza = null;
	
	public ListaEncadenada()
	{
		longitud=0;
		cabeza=null;
	}
	
	public int darLongitud()
	{
		return longitud;
	}
	
	public boolean esListaVacia()
	{
		return cabeza==null;
	}
	
	public void insertarComienzo(T t2)
	{
		
	}
	
	public void insertarFinal(T t2)
	{
		
	}
	public void insertarDespuesDe(int n ,T t2)
	{
		
	}
	
	public void eliminarComienzo(T t2)
	{
		
	}
	
	public void eliminarFinal(T t2)
	{
		
	}
	public void eliminarObjeto(int n,T t2)
	{
		
	}
	
	public T obtener(int n)
	{
		return null;
	}
	
}
