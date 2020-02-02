package model.data_structures;

public class Node <T extends Comparable<T>>
{
	private T t;
	private Node siguiente;
	
	public Node(T t2)
	{
		t=t2;
		siguiente=null;
	}
	
	public void cambiarSiguiente(Node newnode)
	{
		siguiente=newnode;
	}
	
	public Node darSiguiente()
	{
		return siguiente;
	}
	
	public T darT()
	{
		return t;
	}
	
	
}
