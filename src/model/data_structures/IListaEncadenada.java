package model.data_structures;

public interface IListaEncadenada <T>
{
	/**
	 * Da el elemento de la clase generica almacenada en la lista.
	 * @return Elemento que esta primero en la Lista
	 */
	T darCabeza();
	
	/**
	 * Retorna el tamaño de la longitud.
	 * @return longitud lista
	 */
	int darLongitud();
	
	/**
	 * Dice si la lista esta vacia o no.
	 * @return true si esta vacia, false de lo contrario
	 */
	boolean esListaVacia();
	
	/**
	 * Inserta un nuvo elemento genérico al principio de la lista.
	 * @param t2. Elemento nuevo a agregar.
	 */
	public void insertarComienzo(T t2);
	
	/**
	 * Inserta un nuevo elemento genérico al final de la lista.
	 * @param t2. Elemento nuevo a agregar.
	 */
	public void insertarFinal(T t2);
	
	/**
	 * Inserta un nuevo elemento genérico despues de una posicion dada en la lista.
	 * @param n. posición del elemento donde se insertara.
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
	 * Elimina un elemento con posición en lista dada.
	 * @param n. Posicion de elemento a eliminar.
	 */
	public void eliminarObjeto(int n);
	
	/**
	 * Retorna un objeto de la lista , dado su posición.
	 * @param n. Posición en la lista.
	 * @return Elemento de clase génerica.
	 */
	T darObjeto(int n);
	
	/**
	 * Retorna el ultimo elemento génerico de la lista
	 * @return Elemento de clase génerica.
	 */
	T darUltimo();
}
