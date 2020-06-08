package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PacienteTest {
	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		//preparacion
		Diabetico persDiabetico = new Diabetico("Rosa", "Diaz", 33444555);
		
		DietaDiaria d1 = new DietaDiaria();
		persDiabetico.agregarDietaDiaria(d1);
		Plato p1 = new Plato("Canelones");
		Ingrediente i1 = new Ingrediente("Carne", 2,30);
		Ingrediente i2 = new Ingrediente("Huevo", 1, 5);
		p1.agregarIngredienteAlPlato(i1);
		p1.agregarIngredienteAlPlato(i2);
		
		//AGREGO PLATO P1 A LAS DIETA D1
		d1.agregarPlatoALaDieta(p1);
		assertTrue(d1.aptaDiabetico());
		assertEquals(1,persDiabetico.getIngesta().size());
	}
	
//	@Test
//	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {
//
//	}
//	@Test
//	public void testQueUnHipertensoIngesteDietaAptaParaHipertenso() {
//		//preparacion
//				Diabetico persHipertenso = new Diabetico("Rosa", "Diaz", 33444555);
//				
//				DietaDiaria d1 = new DietaDiaria();
//				persHipertenso.agregarDietaDiaria(d1);
//				Plato p1 = new Plato("Canelones");
//				Ingrediente i1 = new Ingrediente("Carne", 4, 5);
//				Ingrediente i2 = new Ingrediente("Huevo", 1, 5);
//				assertTrue(d1.);
//				assertEquals(1,persHipertenso.getIngesta().size());
//	}
//	@Test
//	public void testQueUnHipertensoNoIngesteDietaAptaParaHipertenso() {
//
//	}
}
