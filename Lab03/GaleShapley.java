package Lab03;
import java.util.ArrayList;

public class GaleShapley {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Persona>> personas = crearLista();
		
		ArrayList<Persona> hombres = personas.get(0);
		ArrayList<Persona> mujeres = personas.get(1);
		
		System.out.println("Lista de preferencia hombres");
		imprimir(hombres);
		
		System.out.println("Lista de preferencia mujeres");
		imprimir(mujeres);

		//Desde la lista de hombres
		galeShapley(hombres);
		imprimirParejas(hombres);
        //Desde la lista de mujeres
        galeShapley(mujeres);
        imprimirParejas(mujeres);
		
	}
	
	static void galeShapley(ArrayList<Persona> lista1) {
		
		int aux1 = 0;
        int aux2 = 0;
		while(!tienePareja(lista1)) {
			Persona persona1 = lista1.get(aux1);
			Persona persona2 = persona1.getLista().get(aux2);
			if(!persona2.getEmparejado()) {
				System.out.println(persona2.getNombre() + " aun no tiene pareja");
				// Creando vinculo
				persona1.setPareja(persona2);
                persona1.setEmparejado(true);
				persona2.setPareja(persona1);
				persona2.setEmparejado(true);
				aux1++;
			} 
            else if(comparePareja(persona2, persona1)) {

				System.out.println("Cambio de pareja");
				Persona antiguaPareja = persona2.getPareja();
				antiguaPareja.setPareja(null);
				antiguaPareja.setEmparejado(false);
				persona1.setPareja(persona2);
                persona1.setEmparejado(true);
				persona2.setPareja(persona1);
				persona2.setEmparejado(true);
				reasignarPareja(antiguaPareja, persona2);
				aux1++;
				aux2 = 0;
			} 
            else {
				String personaActual = persona1.getNombre();
				String parejaActual = persona2.getPareja().getNombre();
				if(!personaActual.equals(parejaActual)) {
					aux2++;
				} else {
					aux1++;
				}
			}
			System.out.println();
		}
		
	}
	
	public static void reasignarPareja(Persona personaEx, Persona exPareja) {
		
		int indice = personaEx.getLista().indexOf(exPareja);
		while(true) {
			Persona posiblePareja = personaEx.getLista().get(indice + 1);
            //En caso de la posible nueva pareja este soltera se vinculara
			if(!posiblePareja.getEmparejado()) {
				personaEx.setPareja(posiblePareja);
				posiblePareja.setPareja(personaEx);
				personaEx.setEmparejado(true);
				posiblePareja.setEmparejado(true);
				break;
			} 
            //En caso tener pareja pasar a la siguiente
            else {
				indice++;
			}
		}
		
	}
	
	public static boolean comparePareja(Persona persona, Persona posiblePareja) {
		
		Persona parejaActual = persona.getPareja();
		// Comparamos posiciones en la tabla
		int indexPA = persona.getLista().indexOf(parejaActual);
		int indexNP = persona.getLista().indexOf(posiblePareja);
		if(indexPA > indexNP) {
			// Si la nueva pareja tiene mas preferencia retorna true para el cambio 
			return true;
		} else {
			// Si la preferencia es menor se deja la misma
			return false;
		}
	}
	
	public static boolean tienePareja(ArrayList<Persona> personas) {
		boolean respuesta = true;
		for(int i = 0; i < personas.size(); i++) {
			respuesta = respuesta && personas.get(i).getEmparejado();
		}
		return respuesta;	
	}
	
	public static ArrayList<ArrayList<Persona>> crearLista() {
		//Hombres
		Persona andy = new Persona("Andy");
		Persona beto = new Persona("Beto");
		Persona carlo = new Persona("Carlo");
		Persona denis = new Persona("Denis");
		//Mujeres
		Persona wendy = new Persona("Wendy");
		Persona xena = new Persona("Xena");
		Persona yvonne = new Persona("Yvonne");
		Persona zoe = new Persona("Zoe");
		
		andy.setLista(xena);
		andy.setLista(wendy);
		andy.setLista(yvonne);
		andy.setLista(zoe);
		
		beto.setLista(yvonne);
		beto.setLista(zoe);
		beto.setLista(xena);
		beto.setLista(wendy);
		
		carlo.setLista(yvonne);
		carlo.setLista(xena);
		carlo.setLista(zoe);
		carlo.setLista(wendy);
		
		denis.setLista(wendy);
		denis.setLista(zoe);
		denis.setLista(yvonne);
		denis.setLista(xena);
		
		wendy.setLista(carlo);
		wendy.setLista(denis);
		wendy.setLista(beto);
		wendy.setLista(andy);
		
		xena.setLista(carlo);
		xena.setLista(beto);
		xena.setLista(andy);
		xena.setLista(denis);
		
		yvonne.setLista(andy);
		yvonne.setLista(beto);
		yvonne.setLista(carlo);
		yvonne.setLista(denis);
		
		zoe.setLista(denis);
		zoe.setLista(carlo);
		zoe.setLista(beto);
		zoe.setLista(andy);
		
		ArrayList<Persona> hombres = new ArrayList<Persona>();
		hombres.add(andy);
		hombres.add(beto);
		hombres.add(carlo);
		hombres.add(denis);
		
		ArrayList<Persona> mujeres = new ArrayList<Persona>();
		mujeres.add(wendy);
		mujeres.add(xena);
		mujeres.add(yvonne);
		mujeres.add(zoe);
		
		ArrayList<ArrayList<Persona>> personas = new ArrayList<ArrayList<Persona>>();
		personas.add(hombres);
		personas.add(mujeres);
		
		return personas;
		
	}
	
	public static void imprimirParejas(ArrayList<Persona> array) {
		
		// Metodo auxiliar para imprimir las parejas de un arreglo de personas
		
		for(int i = 0; i < array.size(); i++) {
			
			Persona persona = array.get(i);
			System.out.println( "\t" + persona.getNombre() +
					" : " + persona.getPareja().getNombre());
			
		}
		
	}
	
	public static void imprimir(ArrayList<Persona> array) {
		
		// Metodo auxiliar para imprimir las personas de un arreglo de personas
		
		for(int i = 0; i < array.size(); i++) {
			
			System.out.println(array.get(i));
			
		}
		
	}
	
}
