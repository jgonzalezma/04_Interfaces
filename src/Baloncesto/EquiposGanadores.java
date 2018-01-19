package Baloncesto;

public class EquiposGanadores {
	private String nombre;
	private int anio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public void mostrarGanadores(){
		System.out.println(this.getNombre() + " ganó en " + this.getAnio());
	}
	public String getStringGuardadoG(){
		return this.getNombre() + ":" + this.getAnio();
	}
}
