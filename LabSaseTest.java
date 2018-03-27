import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LabSaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		Aplicatie app = Aplicatie.getInstance();
		Utilizator teo = new Utilizator("teo","printesica");
		Utilizator delia = new Utilizator("domintoaca","nebuna");
		Utilizator jmq = new Utilizator("HACK","HACK");
		ArrayList<Utilizator> jmeckeri = new ArrayList<Utilizator>();
		jmeckeri.add(teo);
		jmeckeri.add(delia);
		BazaDeDate emag = new BazaDeDate(jmeckeri);
		app.setMyBazadedate(emag);
		teo.Login(app);
		delia.Login(app);
		jmq.Login(app);
		teo.Logout(app);
		
	}

}
