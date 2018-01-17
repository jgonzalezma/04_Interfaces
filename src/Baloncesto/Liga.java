package Baloncesto;

import java.util.ArrayList;

public class Liga {
	private Equipo equipoGanador;
	private int anio;
	ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	
	
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	public Equipo getEquipoGanador() {
		return equipoGanador;
	}
	public void setEquipoGanador(Equipo equipoGanador) {
		this.equipoGanador = equipoGanador;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void addEquipo(Equipo equipo){
		equipos.add(equipo);
	}
	public String mostrarEquipos(){
		return null;
	}
	
}
