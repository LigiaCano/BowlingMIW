/**
 * 
 */
package miw.bowling;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import miw.exceptions.NamePlayerException;
import miw.exceptions.NumPlayerException;

/**
 * @author bm0846
 *
 */
public class PartidaTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Criterio de aceptacion 1 Probar que se crea una peticion con numero de
	 * jugadores por el limite
	 */
	@Test
	public void testNumPlayers6() throws NumPlayerException {
		try {
			Partida game = new Partida(6);
			assertEquals(game.getNumPlayers(), 6);
		} catch (Exception e) {

		}
	}

	@Test(expected = NumPlayerException.class)
	public void testNumPlayers0() throws NumPlayerException {
		Partida game;
		game = new Partida(0);
		assertNull(game);
	}

	@Test(expected = NumPlayerException.class)
	public void testNumPlayers7() throws NumPlayerException {
		Partida game;
		game = new Partida(7);
		assertNull(game);

	}

	@Test(expected = NamePlayerException.class)
	public void testNombreBlanco() throws NumPlayerException, NamePlayerException {
		Partida game = new Partida(1);
		game.add("");

	}

	@Test(expected = NamePlayerException.class)
	public void testNombreEspaciosBlanco() throws NumPlayerException, NamePlayerException {
		Partida game = new Partida(1);
		game.add("     ");

	}

	@Test(expected = Exception.class)
	public void testNombreRepedido() throws NumPlayerException, NamePlayerException {
		Partida game = new Partida(2);
		game.add("Ligia");
		game.add("Ligia");
	}
	
	@Test
	public void testAddPlayer()  {
		try{
			Partida game = new Partida(1);
			game.add("Ligia");
			assertEquals(game.getPlayers().size(),1);
		}catch(Exception e){
			
		}
	}

}
