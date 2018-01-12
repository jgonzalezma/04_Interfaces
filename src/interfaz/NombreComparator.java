package interfaz;

import java.util.Comparator;

public class NombreComparator implements Comparator<String>{

	@Override
	public int compare(String nombre1, String nombre2) {
		if(nombre1.compareTo(nombre2) < 0){
			return -1;
		}else if(nombre1.compareToIgnoreCase(nombre2) > 0){
			return 1;
		}else{
			return 0;
		}
		//return arg0.compareTo(arg1);  <-- Tambien funcionaria
	}

}
