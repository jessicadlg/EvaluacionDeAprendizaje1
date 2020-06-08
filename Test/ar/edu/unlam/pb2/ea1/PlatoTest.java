package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlatoTest {

	@Test
	public void testQueSePuedanAgregarIngredientesIguales() {
		// preparacion
		Ingrediente i1 = new Ingrediente("Carne", 2, 5);
		Ingrediente i2 = new Ingrediente("Carne", 2, 5);
		Plato p1 = new Plato("Canelones");
		// ejecucion
		p1.agregarIngredienteAlPlato(i1);
		p1.agregarIngredienteAlPlato(i2);
		// verificacion
		assertTrue(i1.equals(i2));
		assertEquals(2,p1.getIngredientes().size());
	}

//	@Test
//	public void testQueSeObtengaLaCantidadDeSalCorrecta() {
//		// preparacion
//		Ingrediente i1 = new Ingrediente("Carne", 2, 5);
//		Ingrediente i2 = new Ingrediente("Huevo", 1, 5);
//		Plato p1 = new Plato("Canelones");
//		p1.agregarIngredienteAlPlato(i1);
//		p1.agregarIngredienteAlPlato(i2);
//		// ejecucion + verificacion
//		Integer valorEsperado = 3;
//		Integer valorObtenido = p1.obtenerCantidadDeSal();
//
//		assertEquals(valorEsperado, valorObtenido);
//
//	}

//	@Test
//	public void testQueSeObtenegaLaCantidadDeAzucarCorrecta() {
//		//preparacion
//				Ingrediente i1 = new Ingrediente("Carne",2,25);
//				Ingrediente i2 = new Ingrediente("Huevo",1,5);
//				Plato p1= new Plato("Canelones");
//				p1.agregarIngredienteAlPlato(i1);
//				p1.agregarIngredienteAlPlato(i2);
//				
//				// ejecucion + verificacion
//				Integer valorEsperado =30;
//				Integer valorObtenido = p1.obtenerCantidadDeAzucar();
//
//				assertEquals(valorEsperado, valorObtenido);
///////////////FALLA EL TOPE DE CANTIDAD MAX!!!!!!!!!!!!!!
//	}

}
