package tp03.ejercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringBalanceadoTest {

	String s1, s2;
	StringBalanceado sb;
	
	@Before
	public void setUp() throws Exception {
		sb = new StringBalanceado();
		s1 = "{[{{{UUUUU}}}]}";
		s2 = "{{]]";
	}
	
	@Test
	public void testVerificar() {
		//Probando un caso con assertTrue y otro assertFalse
		assertTrue(sb.verificarString(s1));
		assertFalse(sb.verificarString(s2));
	}
}
