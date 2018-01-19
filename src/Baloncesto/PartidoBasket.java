package Baloncesto;

public class PartidoBasket {
	private String equipoLocal;
	private String equipoVisitante;
	private int puntosLocal;
	private int puntosVisitante;
	private int puntosTotales;
	
	
	public String getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public String getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public int getPuntosLocal() {
		return puntosLocal;
	}
	public void setPuntosLocal(int puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	public int getPuntosVisitante() {
		return puntosVisitante;
	}
	public void setPuntosVisitante(int puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	public int getPuntosTotales() {
		puntosTotales = getPuntosLocal() + getPuntosVisitante();
		return puntosTotales;
	}
	public void mostarInfo() {
		System.out.println(getEquipoLocal() + " " + getPuntosLocal() + " " + getEquipoVisitante() + " " + getPuntosVisitante());
		
	}
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	public String getStringGuardado() {
		return this.getEquipoLocal() + ":" + this.getPuntosLocal() + ":" + this.getEquipoVisitante() + ":" + this.getPuntosVisitante();
	}
}
