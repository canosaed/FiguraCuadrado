package ar.edu.unlam.tallerweb.cuadrado;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {
	@Test
	public void calculaArea(){
		Cuadrado c= new Cuadrado(2);
		
		Assert.assertEquals(4, c.area(), 0.01);
	}
	
	@Test
	public void calculaPerimetro(){
		Cuadrado c= new Cuadrado(2);
		
		Assert.assertEquals(8, c.perimetro(), 0.01);
	}

}
