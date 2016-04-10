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

import miw.exceptions.AdAlreadyExistsException;
import miw.exceptions.AdNotFoundException;
import miw.exceptions.AdWithEmptyFieldsException;

/**
 * @author LigiaElena
 *
 */
public class MarketingTest {

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

	@Test
	public void testAddAdSuccess()throws Exception  {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "description", "objetive"));
		assertNotNull(marketing.findAd("tittle1"));
	}
	
	@Test(expected = AdWithEmptyFieldsException.class)
	public void testAdTitleEmpy() throws AdAlreadyExistsException, AdWithEmptyFieldsException {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("", "description", "objetive"));
	}
	
	@Test(expected = AdWithEmptyFieldsException.class)
	public void testAdDescriptionEmpy() throws AdAlreadyExistsException, AdWithEmptyFieldsException {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "", "objetive"));
	}
	
	@Test(expected = AdWithEmptyFieldsException.class)
	public void testAdObjetiveEmpy() throws AdAlreadyExistsException, AdWithEmptyFieldsException {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "", "objetive"));
	}
	
	@Test(expected = AdAlreadyExistsException.class)
	public void testRepeatedAd()throws AdAlreadyExistsException, AdWithEmptyFieldsException  {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "description", "objetive"));
		marketing.addAd(new Ad("tittle1", "description", "objetive"));
	}
	
	@Test
	public void testEditAdSuccess()throws Exception  {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "description", "objetive"));
		marketing.editAd(new Ad("tittle1", "description1", "objetive1"));
		assertEquals(marketing.findAd("tittle1").getDescription(),"description1");
	}
	
	@Test(expected = AdNotFoundException.class)
	public void testEditAdError()throws AdNotFoundException, AdWithEmptyFieldsException{
		Marketing marketing = new Marketing();
		marketing.editAd(new Ad("tittle", "description1", "objetive1"));
	}
	
	@Test
	public void testRemoveAdSuccess()throws Exception  {
		Marketing marketing = new Marketing();
		marketing.addAd(new Ad("tittle1", "description", "objetive"));
		marketing.removeAd("tittle1");
	}
	
	@Test(expected = AdNotFoundException.class)
	public void testRemoveAdError()throws AdNotFoundException, AdWithEmptyFieldsException{
		Marketing marketing = new Marketing();
		marketing.removeAd("tittle1");
	}
	
	

}
