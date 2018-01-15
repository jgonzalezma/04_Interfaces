package interfaz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class MainAlumnos {

	public static void main(String[] args) {
		ArrayList<Persona> alumnos = new ArrayList<Persona>();
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Garcia");
		p1.setDni("99998888E");
		p1.setEdad(25);
		alumnos.add(p1);
		
		Persona p2 = new Persona();
		p2.setNombre("Pedro");
		p2.setApellido("Gonzalez");
		p2.setDni("77778888F");
		p2.setEdad(23);
		alumnos.add(p2);
		
		Persona p3 = new Persona();
		p3.setNombre("Maria");
		p3.setApellido("Gutierrez");
		p3.setDni("77775555G");
		p3.setEdad(20);
		alumnos.add(p3);
		
		Persona p4 = new Persona();
		p4.setNombre("Robert");
		p4.setApellido("Baluta");
		p4.setDni("77776666I");
		p4.setEdad(19);
		alumnos.add(p4);
		
		Persona p5 = new Persona();
		p5.setNombre("Mauricio");
		p5.setApellido("Diaz");
		p5.setDni("77773333N");
		p5.setEdad(18);
		alumnos.add(p5);
		
		//crear lista y rellenarla con nombres <String>
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("imanol");
		nombres.add("ander");
		nombres.add("zubizarreta");
		
		NombreComparator nc = new NombreComparator();
		nombres.sort(nc);
		imprimirListaStrings(nombres);
		
		imprimirListaPersonas(alumnos);
		
		ApellidoComparator pc = new ApellidoComparator();
		alumnos.sort(pc);
		System.out.println("Lista ordenada por apellido:");
		imprimirListaPersonas(alumnos);
		System.out.println("Lista ordenada por edad de menor a mayor");
		
		EdadComparator ec = new EdadComparator();
		alumnos.sort(ec);
		System.out.println("Lista ordenada por edad");
		imprimirListaPersonas(alumnos);
		
	}//fin metodo main
	
	
	private static void imprimirListaPersonas(ArrayList<Persona> alumnos) {
		System.out.println("La lista de personas:----------");
		Iterator<Persona> i = alumnos.iterator();
		while(i.hasNext()){
			//i.next().mostrarNombreApellido();
			i.next().mostrarPersona();
		}
		
		System.out.println("Fin lista de personas:----------");
		
	}


	public static void imprimirListaStrings(ArrayList<String> nombres){
		//imprimir lista por pantalla
				System.out.println("La lista es:----------");
				Iterator<String> i = nombres.iterator();
				
				while(i.hasNext()){
					String nombre = i.next();
					System.out.println(nombre);
				}
				System.out.println("Fin de la lista:----------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
