package test.data_structures;

import static org.junit.Assert.*;

import org.junit.*;

import model.data_structures.*;

public class TestListaEncadenada 
{

	private ListaEncadenada<String> lista;
	private static int TAMANO= 100;
	
	@Before
	public void setUp1()
	{
		lista= new ListaEncadenada<String>();
	}
	
	public void setUp2()
	{
		int cont=0;
		while(cont<TAMANO)
		{
			lista.insertarFinal(" "+cont);
			cont++;
		}
	}
	
	
	@Test
	public void testListaEncadenada() 
	{
		// TODO
		assertTrue(lista!=null);
		assertEquals(0,lista.darLongitud());
	}
	
	@Test
	public void darLongitud() {
		setUp2();
		// TODO
		assertEquals(100,lista.darLongitud());
		
	}
	
	@Test
	public void darCabeza() {
		setUp2();
		// TODO
		assertEquals(" "+0,lista.darCabeza());
		
	}
	
	@Test
	public void esListaVacia() {
		
		assertTrue(lista.esListaVacia());
		setUp2();
		assertFalse(lista.esListaVacia());
		
	}
	

	@Test
	public void testInsertarFinal() {
		setUp2();
		// TODO
		assertEquals(100,lista.darLongitud());
		assertEquals(" "+99,lista.darObjeto(99));
	}
	
	@Test
	public void testInsertarComienzo() {
		setUp2();
		// TODO
		lista.insertarComienzo(" "+ 200);
		assertEquals(" "+200,lista.darCabeza());
		
	}
	@Test
	public void testInsertarDespuesDe() {
		setUp2();
		// TODO
		lista.insertarDespuesDe(20, " "+200);
		assertEquals(" "+200,lista.darObjeto(21));
	}
	
	@Test
	public void testEliminarComienzo() {
		setUp2();
		// TODO
		lista.eliminarComienzo();
		assertEquals(99,lista.darLongitud());
		assertEquals(" "+1,lista.darObjeto(0));
		
	}
	@Test
	public void testEliminarFinal() {
		setUp2();
		// TODO
		lista.eliminarFinal();
		assertEquals(99,lista.darLongitud());
		assertEquals(" "+98,lista.darObjeto(98));
		
	}
	
	@Test
	public void testEliminarObjeto() {
		setUp2();
		// TODO
		lista.eliminarObjeto(20);
		assertEquals(99,lista.darLongitud());
		assertEquals(" "+21,lista.darObjeto(20));
		
	}
	
	
	
}
