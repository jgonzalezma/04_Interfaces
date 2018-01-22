package baloncesto;

public class EquiposGanadores {
	private String nombre;
	private String liga;
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
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public void mostrarGanadores(){
		System.out.println(this.getNombre() + " de la liga " + this.getLiga() + " ganó en " + this.getAnio());
	}
	public String getStringGuardadoG(){
		return this.getNombre() + ":" + this.getLiga() + ":" + this.getAnio();
	}
	
}
