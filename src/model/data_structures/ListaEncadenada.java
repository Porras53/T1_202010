package model.data_structures;

import java.util.Iterator;

public class ListaEncadenada <T> implements IListaEncadenada<T>
{
	private int longitud;
	
	private Node<T> cabeza = null;
	
	private Node<T> ultimo=null;
	
	public ListaEncadenada()
	{
		longitud=0;
		cabeza=null;
		ultimo=null;
	}
	
	public T darCabeza()
	{
		return cabeza.darT();
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
		Node<T> nodo = new Node<T>(t2);
		if(esListaVacia())
		{
			nodo.cambiarSiguiente(cabeza);
			cabeza= nodo;
			ultimo=cabeza;
		}
		else{
		nodo.cambiarSiguiente(cabeza);
		cabeza= nodo;
		}
		longitud++;
	}
	
	public void insertarFinal(T t2)
	{
		Node<T> node= new Node<T>(t2);
		if(cabeza==null)
		{
			cabeza = node;
			ultimo=cabeza;
		}
		
		else
		{	
			ultimo.cambiarSiguiente(node);
			ultimo=node;
		}
		longitud++;
	}
	
	
	public void insertarDespuesDe(int n ,T t2)
	{
		Node<T> node= new Node<T>(t2);
		if(cabeza== null)
		{
			cabeza = node;
		}
		else
		{
			Node<T> puntero = cabeza;
			int cont=0;
			while(cont < n && puntero.darSiguiente()!=null)
			{
				puntero= puntero.darSiguiente();
				cont++;
			}
			node.cambiarSiguiente(puntero.darSiguiente());
			puntero.cambiarSiguiente(node);
		}
		longitud++;
		
	}
	
	public void eliminarComienzo()
	{
		if(cabeza!=null)
		{
			Node<T> primer= cabeza;
			cabeza= cabeza.darSiguiente();
			primer.cambiarSiguiente(null);
			longitud--;
		}
	}
	
	public void eliminarFinal()
	{
		if(cabeza!= null)
		{
			if(cabeza.darSiguiente()==null)
			{
				cabeza = null;
			}
			else
			{
				Node<T> puntero= cabeza;
				while(puntero.darSiguiente().darSiguiente()!=null)
				{
					puntero=puntero.darSiguiente();
				}
				puntero.cambiarSiguiente(null);
			}
			longitud--;
		}
	}
	
	public void eliminarObjeto(int n)
	{
		if(cabeza != null)
		{
			if(n==0)
			{
				Node<T> primer= cabeza;
				cabeza= cabeza.darSiguiente();
				primer.cambiarSiguiente(null);
				longitud--;
			}
			else if(n < longitud)
			{
				Node<T> puntero = cabeza;
				int cont= 0;
				while(cont < (n-1))
				{
					puntero= puntero.darSiguiente();
					cont++;
				}
				Node<T> temp= puntero.darSiguiente();
				puntero.cambiarSiguiente(temp.darSiguiente());
				temp.cambiarSiguiente(null);
				longitud--;
			}
		}
		
	}
	
	public T darObjeto(int pos)
	{
		if(cabeza==null)
		{
			return null;
		}
		else
		{
			Node<T> puntero= cabeza;
			int cont=0;
			while(cont < pos && puntero.darSiguiente()!=null)
			{
				puntero = puntero.darSiguiente();
				cont++;
			}
			if(cont != pos)
			{
				return null;
			}
			else
			{
				return (T) puntero.darT();
				
			}
		
		}
		
	}
	
	public T darUltimo()
	{
		return ultimo.darT();
	}
	
	
	
	
}
