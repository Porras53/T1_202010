package model.data_structures;

public class Node <E>
{
	/**
	 * Elemento G�nerico que se almacena en el nodo.
	 */
	private E t;
	
	/**
	 * Referencia para el siguiente nodo de la lista.
	 */
	private Node siguiente;
	
	/**
	 * 	M�todo Constructor
	 * @param t2. Elemento que se almacenera en nodo.
	 */
	public Node(E t2)
	{
		t=t2;
		siguiente=null;
	}
	
	/**
	 * Se cambia la referencia del siguiente nodo del actual nodo.
	 * @param newnode. Nueva referencia de nodo.
	 */
	
	public void cambiarSiguiente(Node newnode)
	{
		siguiente=newnode;
	}
	
	/**
	 * Retorna la referencia que se tiene como nodo siguiente.
	 * @return Nodo siguiente del actual.
	 */
	
	public Node darSiguiente()
	{
		return siguiente;
	}
	
	/**
	 * Retorna el elemento gen�rico almacenado en el nodo.
	 * @return Elemento Gen�rico.
	 */
	public E darT()
	{
		return t;
	}
	
	
}
