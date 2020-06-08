package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DietaDiariaTest {
	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {
		//preparacion
		Ingrediente i1 = new Ingrediente("Carne", 2, 5);
		Ingrediente i2 = new Ingrediente("Huevo", 1, 3);
		Plato p1 = new Plato("Canelones");

		
		Ingrediente i3 = new Ingrediente("Carne", 2, 5);
		Ingrediente i4 = new Ingrediente("Huevo", 1, 3);
		Plato p2 = new Plato("Canelones");

		DietaDiaria d1 = new DietaDiaria();
		// ejecucion
		p1.agregarIngredienteAlPlato(i1);
		p1.agregarIngredienteAlPlato(i2);
		p2.agregarIngredienteAlPlato(i3);
		p2.agregarIngredienteAlPlato(i4);
		
		d1.agregarPlatoALaDieta(p1);
		d1.agregarPlatoALaDieta(p2);
		// verificacion
		assertTrue(p1.equals(p2));
		assertEquals(1, d1.cantidadDePlatos(),0.01);
	}

//	@Test
//	public void testQueDietaDiariaSeaAptaHipertenso() {
//		
//		Ingrediente i1 = new Ingrediente("Carne", 2, 5);
//		Ingrediente i2 = new Ingrediente("Huevo", 1, 3);
//		Plato p1 = new Plato("Canelones");
//		p1.agregarIngredienteAlPlato(i1);
//		p1.agregarIngredienteAlPlato(i2);
//		
//		
//		
//	}
	//	@Test
//	public void testQueDietaDiariaNoSeaAptaHipertenso(){
//		
//	}
	@Test
	public void testQueDietaDiariaSeaAptaDiabetico(){
		//preparacion

		Ingrediente i1 = new Ingrediente("Carne", 2, 6);
		Ingrediente i2 = new Ingrediente("Huevo", 1, 10);
		Plato p1 = new Plato("Canelones");

		DietaDiaria d1 = new DietaDiaria();
		d1.agregarPlatoALaDieta(p1);
		// verificacion
		Boolean valorEsperado = true;
		Boolean valorObtendo =d1.aptaDiabetico();
		//NO ME RECONOCE EL TOPE AQUI!!
		assertTrue(d1.aptaDiabetico()); 
		assertEquals(valorEsperado,valorObtendo);
	}
	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico(){
		//preparacion

	Ingrediente i1 = new Ingrediente("Carne", 2, 6);
	Ingrediente i2 = new Ingrediente("Huevo", 1, 10);
	Plato p1 = new Plato("Canelones");

	DietaDiaria d1 = new DietaDiaria();
	
	Boolean valorEsperado = false;
	Boolean valorObtenido =d1.aptaDiabetico();
	
	// verificacion.
	//NO ME RECONOCE EL TOPE AQUI con el false!!
	assertFalse(d1.aptaDiabetico());
	assertEquals(valorEsperado,valorObtenido);
}
}
