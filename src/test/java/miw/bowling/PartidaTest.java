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

import miw.exceptions.FullPlayersException;
import miw.exceptions.InvalidNamePlayerException;
import miw.exceptions.InvalidNumberPlayersException;

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
	public void testNumPlayers6() throws InvalidNumberPlayersException {
		Partida game = new Partida(6);
		assertEquals(game.getPlayersNumber(), 6);
	}

	@Test(expected = InvalidNumberPlayersException.class)
	public void testNumPlayers0() throws InvalidNumberPlayersException {
		Partida game;
		game = new Partida(0);
		assertNull(game);
	}

	@Test(expected = InvalidNumberPlayersException.class)
	public void testNumPlayers7() throws InvalidNumberPlayersException {
		Partida game;
		game = new Partida(7);
		assertNull(game);

	}

	@Test(expected = InvalidNamePlayerException.class)
	public void testNombreBlanco()
			throws InvalidNumberPlayersException, FullPlayersException, InvalidNamePlayerException {
		Partida game = new Partida(1);
		game.addPlayer("");

	}

	@Test(expected = InvalidNamePlayerException.class)
	public void testNombreEspaciosBlanco()
			throws InvalidNumberPlayersException, FullPlayersException, InvalidNamePlayerException {
		Partida game = new Partida(1);
		game.addPlayer("     ");

	}

	@Test(expected = InvalidNamePlayerException.class)
	public void testRepeadNamePlayer()
			throws InvalidNumberPlayersException, FullPlayersException, InvalidNamePlayerException {
		Partida game = new Partida(2);
		game.addPlayer("Player 1");
		game.addPlayer("Player 1");
	}

	@Test(expected = FullPlayersException.class)
	public void testFullPlayers()
			throws InvalidNumberPlayersException, FullPlayersException, InvalidNamePlayerException {
		Partida game = new Partida(1);
		game.addPlayer("Player 1");
		game.addPlayer("Player 1");
	}

	@Test
	public void testAddPlayer() {
		try {
			Partida game = new Partida(2);
			game.addPlayer("Player 1");
			game.addPlayer("Player 2");
			assertEquals(game.getPlayers().size(), 2);
			System.out.println(game);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
