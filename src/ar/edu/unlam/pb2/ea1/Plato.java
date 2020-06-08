package ar.edu.unlam.pb2.ea1;


import java.util.ArrayList;

public class Plato {
	/** Por ejemplo, si para un Plato se necesitan DOS (2) tomates,
	se deberá agregar DOS(2) unidades de tomate. 
	*/
	private String nombrePlato;
	private ArrayList<Ingrediente> ingredientes;
	//constructor
	public Plato(String nombrePlato) {
		this.nombrePlato= nombrePlato;
		this.ingredientes = new ArrayList<>();
	}
	
	
	public Boolean agregarIngredienteAlPlato(Ingrediente ingrediente) {
		if(!ingredientes.contains(ingrediente));
		return ingredientes.add(ingrediente);
		
	}
	
	public Ingrediente buscarIngredientes(String nombre) {
		for (Ingrediente ingrediente : ingredientes) {
			if(ingrediente.getNombre().equals(nombre)) {
				return ingrediente;
			}
		}
		return null;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nombrePlato == null) ? 0 : nombrePlato.hashCode());
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
		Plato other = (Plato) obj;
		if (ingredientes == null) {
			if (other.ingredientes != null)
				return false;
		} else if (!ingredientes.equals(other.ingredientes))
			return false;
		if (nombrePlato == null) {
			if (other.nombrePlato != null)
				return false;
		} else if (!nombrePlato.equals(other.nombrePlato))
			return false;
		return true;
	}

	public Integer obtenerCantidadDeAzucar(){
		Integer cantidadAzucar =0;
		for (Ingrediente ingrediente : ingredientes) {
			if (cantidadAzucar<=25) 
			 cantidadAzucar+=ingrediente.getCantidadAzucar();
			}
			 return cantidadAzucar;	
		
	}
	public Integer obtenerCantidadDeSal(){
		Integer cantidadSal =0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidadSal+=ingrediente.getCantidadSal();
			}
		return cantidadSal;	
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

}
