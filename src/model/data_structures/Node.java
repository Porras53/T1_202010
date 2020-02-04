package model.data_structures;

public class Node <E>
{
	private E t;
	private Node siguiente;
	
	public Node(E t2)
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
	
	public E darT()
	{
		return t;
	}
	
	
}
