package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public abstract class Paciente {

	private String nombre;
	private String apellido;
	private Integer dni;

	private ArrayList<DietaDiaria> ingesta;

	
	public Paciente(String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.ingesta = new ArrayList<>();
		
	}
	public abstract void agregarDietaDiaria(DietaDiaria dieta);


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public ArrayList<DietaDiaria> getIngesta() {
		return ingesta;
	}


	public void setIngesta(ArrayList<DietaDiaria> ingesta) {
		this.ingesta = ingesta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((ingesta == null) ? 0 : ingesta.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (ingesta == null) {
			if (other.ingesta != null)
				return false;
		} else if (!ingesta.equals(other.ingesta))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
