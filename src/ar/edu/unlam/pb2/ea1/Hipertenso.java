package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Hipertenso extends Paciente{
	
	private Integer prensionMinima;
	private Integer presionMaxima;
	
	public Hipertenso(String nombre, String apellido, Integer dni,Integer prensionMinima,Integer presionMaxima) {
		super(nombre, apellido, dni);
		this.prensionMinima=prensionMinima;
		this.presionMaxima=presionMaxima;
	}
	
	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {

		super.getIngesta().add(dieta);
		
	}
	
}
