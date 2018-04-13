package calc;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CalculatriceTest extends TestCase {
	
	public static Test suite() {
		return new TestSuite(CalculatriceTest.class);
	}

	//Test de la fonction additionner
	
	public void sommeShouldBeOk () {
		Calculatrice calc2 = new Calculatrice();
		assertTrue(calc2.additionner(1,2)==3);
	}
	
	
	//Test de la fonction soustraire
	public void soustractionShouldBeOk() {
		Calculatrice calc3 = new Calculatrice();
		assertTrue(calc3.soustraire(10, 5)==5);
		
	}
	
	//Test de la fonction multiplier
	public void multiplicationShouldBeOk() {
		Calculatrice calc4 = new Calculatrice();
		assertTrue(calc4.multiplier(4, 6)==24);
		
	}
	
	//Test de la fonction diviser
	public void divisionShouldBeOk() {
		Calculatrice calc5 = new Calculatrice();
		boolean bool =calc5.diviser(10, 5)==2;
		assertTrue(bool);
		
	}
	
	public void divisionbyzero() {
		Calculatrice calc6 = new Calculatrice();
		
	}
}

