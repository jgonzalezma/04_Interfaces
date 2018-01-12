package interfaz;

public class Actuacion implements Mostrator {
	private String nombreGrupo;
	private int duracion;
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
