package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;

public class DietaDiaria {
	// mio meti composicion:
// 	private Ingrediente ingrediente;
	/**
	 * No se permite repetir platos duarante todo el día.
	 */
	private HashSet<Plato> platos;

	// constructor
	public DietaDiaria(/* Ingrediente ingrediente */) {
//	miodecomp	this.ingrediente=ingrediente;
		this.platos = new HashSet<>();
	}

	// GETY SET-----------------------------
	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

//	public Ingrediente getIngrediente() {
//		return ingrediente;
//	}
//
//	public void setIngrediente(Ingrediente ingrediente) {
//		this.ingrediente = ingrediente;
//	}
	// GETY SET-----------------------------

	// mioAGREGO PLATO------------------------------------
	public Boolean agregarPlatoALaDieta(Plato plato) {

		return platos.add(plato);
	}
////metodo p probar q tenga un solo plato ingresado:
	public Integer cantidadDePlatos() {
		return platos.size() ;
	}
	// mioAGREGO PLATO------------------------------------

	private Integer totalDeSalEnDieta() {
		Integer totalCantidadDeSal = 0;
		for (Plato actual : platos) {
			totalCantidadDeSal +=actual.obtenerCantidadDeSal();
		}
		return totalCantidadDeSal;
	}

	private Integer totalDeAzucarEnDieta() {
		Integer totalCantidadDeAzucar = 0;
		for (Plato actual : platos) {
			totalCantidadDeAzucar += actual.obtenerCantidadDeAzucar();
		}
		return totalCantidadDeAzucar;
	}
//	public Boolean aptaHipertenso(){
//		Integer totalCantidadDeSal = 0;
//		for (Plato plato : this.platos) {
//			totalCantidadDeSal += plato.obtenerCantidadDeSal();
//		}
//		if (totalCantidadDeSal<=3) {
//			return true;
//		}
//		return false;
//	}	
//	public Boolean aptaDiabetico() {
//		Integer totalCantidadDeAzucar = 0;
//		for (Plato plato : platos) {
//			if (totalCantidadDeAzucar<=25) 
//			totalCantidadDeAzucar += plato.obtenerCantidadDeAzucar();
//			return true;
//		}
//		return false;	
//	}
//	mio PRUEBAAA
	public Boolean aptaDiabetico() {
		Integer cantidadAzucar = 0;
		for (Plato plato : platos) {
			if (cantidadAzucar<=25) {
			cantidadAzucar += plato.obtenerCantidadDeAzucar();
			return true;
			}
		}
		return false;	
	}
}
