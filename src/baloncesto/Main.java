package baloncesto;

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
		ArrayList<EquiposGanadores> ganadoresLiga = new ArrayList<EquiposGanadores>();
		ganadoresLiga = crearListaGanadores("D:/equiposganadores.txt");
		int opcion;
		final int LISTAR = 1;
		final int LISTAMAYOR = 2;
		final int LISTAMENOR = 3;
		final int INSERTAR = 4;
		final int ELIMINAR = 5;
		final int AÑADIREQUIPOGANADOR = 6;
		final int LISTARGANADORES = 7;
		final int ELIMINARGANADOR = 8;
		final int SALIR = 0;
		
		do {
			System.out.println("---Menu---");
			System.out.println("1- Listar partidos");
			System.out.println("2- Listar por orden de puntos (mayor a menor)");
			System.out.println("3- Listar por orden de puntos (menor a mayor)");
			System.out.println("4- Insertar un partido");
			System.out.println("5- Eliminar un partido");
			System.out.println("6- Añadir equipo ganador");
			System.out.println("7- Listar equipos ganadores");
			System.out.println("8- Eliminar ganador");
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
			case LISTAMAYOR:
				PuntosComparatorMayor pc = new PuntosComparatorMayor();
				partidos.sort(pc);
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
			case LISTAMENOR:
				PuntosComparatorMenor pm = new PuntosComparatorMenor();
				partidos.sort(pm);
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
			case AÑADIREQUIPOGANADOR:
				System.out.println("Nombra el equipo ganador a añadir");
				String eGanador = lector.nextLine();
				System.out.println("Nombra el año en el que ha ganado");
				int anioGanador = Integer.parseInt(lector.nextLine());
				System.out.println("Equipo ganador añadido");
				EquiposGanadores g1 = new EquiposGanadores();
				g1.setNombre(eGanador);
				g1.setAnio(anioGanador);
				ganadoresLiga.add(g1);
				
				break;
			case LISTARGANADORES:
				if (partidos.isEmpty()) {
					System.out.println("La lista esta vacía");
				} else {
					Iterator<EquiposGanadores> i = ganadoresLiga.iterator();
					while (i.hasNext()) {
						EquiposGanadores eg = i.next();
						eg.mostrarGanadores();
					}
				}
				break;
			case ELIMINARGANADOR:
				System.out.println("Introduce el nombre del equipo que quieres eliminar");
				String ganadorEliminado = lector.nextLine();
				eliminarGanadores(ganadorEliminado, ganadoresLiga);
				break;
			case SALIR:
				guardarLista(partidos, "D:/Josu/Programación/partidosbasket.txt");
				guardarListaGanadores(ganadoresLiga, "D:/equiposganadores.txt");
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
	private static ArrayList<EquiposGanadores> crearListaGanadores(String ficheroGanadores){
		ArrayList<EquiposGanadores> ganadoresLista = new ArrayList<EquiposGanadores>();
		File file2 = new File(ficheroGanadores);
		try {
			Scanner scan = new Scanner(file2);
			while(scan.hasNext()){
				String linea = scan.next();
				String[] partes = linea.split(":");
				EquiposGanadores e1 = new EquiposGanadores();
				e1.setNombre(partes[0]);
				e1.setAnio(Integer.parseInt(partes[1]));
				ganadoresLista.add(e1);
			}
		} catch (Exception e) {
		}
		return ganadoresLista;
		
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
	private static void eliminarGanadores(String nombrefichero, ArrayList<EquiposGanadores> ganadoresLiga){
		Iterator<EquiposGanadores> i = ganadoresLiga.iterator();
		while(i.hasNext()){
			EquiposGanadores a = i.next();
			if(a.getNombre().equals(nombrefichero)){
				i.remove();
				System.out.println("El partido de " + a.getNombre() +" ha sido eliminado");
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
		private static void guardarListaGanadores(ArrayList<EquiposGanadores> guardarGanadores, String nombreFichero) {
			try {
				FileWriter fileWriter = new FileWriter(nombreFichero);
				PrintWriter printWriter = new PrintWriter(fileWriter);
				Iterator<EquiposGanadores> it = guardarGanadores.iterator();
				while(it.hasNext()){
					EquiposGanadores ganador = it.next();
					printWriter.println(ganador.getStringGuardadoG());
				}
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
	
	


