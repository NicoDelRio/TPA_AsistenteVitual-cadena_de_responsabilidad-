package test;

import clase.Asistente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RF10Tests {

	public final static String USUARIO = "delucas";
	public final static int ELEGIDO = 12;

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}

	@Test
	public void adivinando() {
		Assert.assertEquals(
				"@delucas �sale y vale! Pens� un n�mero del 1 al 100",
				jenkins.escuchar("@jenkins jugamos?")
			);
		
		Assert.assertEquals(
				"@delucas �es el 50?",
				jenkins.escuchar("@jenkins listo")
			);
		
		Assert.assertEquals(
				"@delucas �es el 75?",
				jenkins.escuchar("@jenkins m�s grande")
			);
		
		Assert.assertEquals(
				"@delucas �es el 62?",
				jenkins.escuchar("@jenkins m�s chico")
			);
		
		Assert.assertEquals(
				"@delucas �es el 68?",
				jenkins.escuchar("@jenkins m�s grande")
			);
		
		Assert.assertEquals(
				"@delucas fue divertido :)",
				jenkins.escuchar("@jenkins si!")
			);
	}
	
	@Test
	public void pensandoNumero() {
		Assert.assertEquals(
				"@delucas �listo!",
				jenkins.escuchar("@jenkins jugamos? Pens� un n�mero del 1 al 100")
			);
		
		Assert.assertEquals(
				"@delucas m�s chico",
				jenkins.escuchar("@jenkins es el 50?")
			);
		
		Assert.assertEquals(
				"@delucas �si! Adivinaste en 2 pasos...",
				jenkins.escuchar("@jenkins es el 12?")
			);
		
	}

}