package model.data_structures;

public interface IListaEncadenada <T>
{
	/**
	 * Da el elemento de la clase generica almacenada en la lista.
	 * @return Elemento que esta primero en la Lista
	 */
	T darCabeza();
	
	/**
	 * Retorna el tama�o de la longitud.
	 * @return longitud lista
	 */
	int darLongitud();
	
	/**
	 * Dice si la lista esta vacia o no.
	 * @return true si esta vacia, false de lo contrario
	 */
	boolean esListaVacia();
	
	/**
	 * Inserta un nuvo elemento gen�rico al principio de la lista.
	 * @param t2. Elemento nuevo a agregar.
	 */
	public void insertarComienzo(T t2);
	
	/**
	 * Inserta un nuevo elemento gen�rico al final de la lista.
	 * @param t2. Elemento nuevo a agregar.
	 */
	public void insertarFinal(T t2);
	
	/**
	 * Inserta un nuevo elemento gen�rico despues de una posicion dada en la lista.
	 * @param n. posici�n del elemento donde se insertara.
	 * @param t2. Elemento nuevo a agregar.
	 */
	public void insertarDespuesDe(int n,T t2);
	
	/**
	 * Elimina el primer elemento de la lista.
	 */
	public void eliminarComienzo();
	
	/**
	 * Elimina el ultimo elemento de la lista.
	 */
	public void eliminarFinal();
	
	
	/**
	 * Elimina un elemento con posici�n en lista dada.
	 * @param n. Posicion de elemento a eliminar.
	 */
	public void eliminarObjeto(int n);
	
	/**
	 * Retorna un objeto de la lista , dado su posici�n.
	 * @param n. Posici�n en la lista.
	 * @return Elemento de clase g�nerica.
	 */
	T darObjeto(int n);
	
	/**
	 * Retorna el ultimo elemento g�nerico de la lista
	 * @return Elemento de clase g�nerica.
	 */
	T darUltimo();
}
