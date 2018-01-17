package Baloncesto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<PartidoBasket> partidos = new ArrayList<PartidoBasket>();
		partidos = crearLista("D:/Josu/Programación/partidosbasket.txt");
		int opcion;
		final int LISTAR = 1;
		final int INSERTAR = 2;
		final int ELIMINAR = 3;
		final int SALIR = 0;
		
		do {
			System.out.println("---Menu---");
			System.out.println("1- Listar partidos");
			System.out.println("2- Insertar un partido");
			System.out.println("3- Eliminar un partido");
			System.out.println("0- Salir del programa y guardar cambios");
			
			Scanner lector = new Scanner(System.in);
			opcion = Integer.parseInt(lector.nextLine());
			switch (opcion) {
			case LISTAR:
				if (partidos.isEmpty()) {
					System.out.println("La lista esta vacía");
				} else {
					Iterator<PartidoBasket> i = partidos.iterator();
					while (i.hasNext()) {
						PartidoBasket p = i.next();
						p.mostarInfo();
					}
				}
				break;
			case INSERTAR:
				//datos a introducir para guardarlos
				System.out.println("Introduce el equipo local");
				String local = lector.nextLine();
				System.out.println("Introduce los puntos del equipo local");
				int plocal = Integer.parseInt(lector.nextLine());
				System.out.println("Introduce el equipo visitante");
				String visitante = lector.nextLine();
				System.out.println("Introduce los puntos del equipo visitante");
				int pvisitante = Integer.parseInt(lector.nextLine());
				
				//crear el partido
				PartidoBasket partido1 = new PartidoBasket();
				partido1.setEquipoLocal(local);
				partido1.setPuntosLocal(plocal);
				partido1.setEquipoVisitante(visitante);
				partido1.setPuntosVisitante(pvisitante);
				
				//añadir partido a la lista
				partidos.add(partido1);
				break;
			case ELIMINAR:
				System.out.println("Introduce el nombre de un equipo para eliminar su partido");
				String partidoEliminar = lector.nextLine();
				eliminarPartidos(partidoEliminar, partidos);
				break;	
			case SALIR:
				guardarLista(partidos, "D:/Josu/Programación/partidosbasket.txt");
				System.out.println("Guardando y saliendo...");
				break;
			default:
				System.out.println("Opcion mal");
				break;
			}
			
		} while (opcion != SALIR);
	}

	private static ArrayList<PartidoBasket> crearLista(String nombreFichero) {
		ArrayList<PartidoBasket> lista = new ArrayList<PartidoBasket>();
		File file = new File(nombreFichero);
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()){
				String linea = scan.next();
				String[] partes = linea.split(":");
				PartidoBasket p1 = new PartidoBasket();
				p1.setEquipoLocal(partes[0]);
				p1.setPuntosLocal(Integer.parseInt(partes[1]));
				p1.setEquipoVisitante(partes[2]);
				p1.setPuntosVisitante(Integer.parseInt(partes[3]));
				lista.add(p1);
			}
		} catch (Exception e) {
		}
		return lista;
	}
	private static void eliminarPartidos(String nombrefichero, ArrayList<PartidoBasket> partidos){
		Iterator<PartidoBasket> i = partidos.iterator();
		while(i.hasNext()){
			PartidoBasket p = i.next();
			if(p.getEquipoLocal().equals(nombrefichero) || (p.getEquipoVisitante().equals(nombrefichero))){
				i.remove();
				System.out.println("El partido de " + p.getEquipoLocal() + " vs " + p.getEquipoVisitante() + " ha sido eliminado");
			}
		}}
		
		private static void guardarLista(ArrayList<PartidoBasket> partidos, String nombreFichero) {
			try {
				FileWriter fileWriter = new FileWriter(nombreFichero);
				PrintWriter printWriter = new PrintWriter(fileWriter);
				Iterator<PartidoBasket> it = partidos.iterator();
				while(it.hasNext()){
					PartidoBasket partido = it.next();
					printWriter.println(partido.getStringGuardado());
				}
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
	
	


