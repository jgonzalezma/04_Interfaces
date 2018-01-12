package interfaz;

import java.util.ArrayList;

public class MainAlumnos {

	public static void main(String[] args) {
		ArrayList<Persona> alumnos = new ArrayList<Persona>();
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Garcia");
		p1.setDni("99998888E");
		alumnos.add(p1);
		
		Persona p2 = new Persona();
		p2.setNombre("Pedro");
		p2.setApellido("Gonzalez");
		p2.setDni("77778888F");
		alumnos.add(p2);
		
		Persona p3 = new Persona();
		p3.setNombre("Maria");
		p3.setApellido("Gutierrez");
		p3.setDni("77775555G");
		alumnos.add(p3);
		
		Persona p4 = new Persona();
		p4.setNombre("Robert");
		p4.setApellido("Baluta");
		p4.setDni("77776666I");
		alumnos.add(p4);
		
		Persona p5 = new Persona();
		p5.setNombre("Mauricio");
		p5.setApellido("Diaz");
		p5.setDni("77773333N");
		alumnos.add(p5);

	}

}
