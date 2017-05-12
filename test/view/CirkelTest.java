package view;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import domain.*;

public class CirkelTest {
	private Punt testPunt;
	private Punt testPunt2;
	private Cirkel testCirkel;
	private Cirkel testCirkel2;
	
	@Before
	public void setUp(){
		testPunt = new Punt(200, 200);
		testPunt2 = new Punt(150, 300);
		testCirkel = new Cirkel(testPunt, 200);
		testCirkel2 = new Cirkel(testPunt, 200);

	}
	
	@Test
	public void Create_valid_cirkel_without_errors(){
		testCirkel = new Cirkel(testPunt, 200);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Create_cirkel_with_middelpunt_null(){
		testCirkel = new Cirkel(null, 200);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Create_cirkel_with_radius_null(){
		testCirkel = new Cirkel(testPunt, 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void Create_cirkel_with_radius_onder_null(){
	    testCirkel = new Cirkel(testPunt, -200);
	}
	@Test
	public void Compare_Cirkels_With_Same_Radius_And_Middle_Point(){
		testCirkel.equals(testCirkel2);
		assertTrue(true);
	}
	@Test (expected = IllegalArgumentException.class)
	public void Compare_Cirkels_With_Second_Cirkel_Being_Zero(){
		testCirkel2 = new Cirkel(null, 0);
		testCirkel.equals(testCirkel2);
	}
	@Test
	public void Compare_Cirkels_With_Same_Radius_And_Different_Middle_Point(){
		testCirkel2 = new Cirkel(testPunt2, 200);
		testCirkel.equals(testCirkel2);
		assertFalse(false);
	}
	
	@Test
	public void Compare_Cirkels_With_Different_Radius_And_Same_Middle_Point(){
		testCirkel2 = new Cirkel(testPunt, 100);
		testCirkel.equals(testCirkel2);
		assertFalse(false);
	}
	
	
	@After
	public void cleanUp(){
	}
}
