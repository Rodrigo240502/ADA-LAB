package Lab03;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private ArrayList<Persona> listaPref = new ArrayList<Persona>();
	private boolean emparejado;
	private Persona pareja;
	
	public Persona() {
		this("Sin Nombre");	
	}
	
	public Persona(String name) {
		setNombre(name);
	}
	
	public String getNombre() {	
		return nombre;
	}
	
	public void setNombre(String name) {	
		this.nombre = name;	
	}

	public ArrayList<Persona> getLista() {
		return listaPref;	
	}

	public void setLista(Persona parejas) {	
		this.listaPref.add(parejas);	
	}
	
	public boolean getEmparejado() {
		return emparejado;
	}

	public void setEmparejado(boolean emparejado) {
		this.emparejado = emparejado;
	}
	
	public Persona getPareja() {
		return this.pareja;
	}

	public void setPareja(Persona pareja) {
	    this.pareja = pareja;	
	}
	
	@Override
	public String toString() {
		
		ArrayList<Persona> lista = getLista();
		String data = getNombre() + " Prefiere a:  ";
		for(int i = 0; i < lista.size(); i++) {
			data += ((i + 1) + "° " + lista.get(i).getNombre() + "| ");
		}
		return data;
		
	}
	
}
