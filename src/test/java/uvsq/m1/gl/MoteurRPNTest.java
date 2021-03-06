package uvsq.m1.gl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoteurRPNTest {

	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}
	@Test
	public void testEnregistrerOperande() {
		double val1=1, val2=2,val3=3;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.enregistrerOperande(val3);
		assertEquals(M.listeOperandes().size(), 3);
	}
	
			@Test(expected = ArithmeticException.class)
			public void testEnregistrerOperandeException() {

				double val1 = 3;
				M.enregistrerOperande(val1);

				M.appliquerOperation(Operation.MULT);

			}
			@Test
	public void testAppliquerOperation() throws NumberFormatException{
				double val1=1, val2=2;
				M.enregistrerOperande(val1);
				M.enregistrerOperande(val2);
				M.appliquerOperation(Operation.PLUS);
				assertTrue(M.listeOperandes().get(0)==3);
			}
			@Test(expected = ArithmeticException.class)
			public void testappliquerOperationException() {
				M.appliquerOperation(Operation.MOINS);
			}
			


}
