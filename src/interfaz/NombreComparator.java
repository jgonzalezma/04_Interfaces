package interfaz;

import java.util.Comparator;

public class NombreComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		if(arg0.compareTo(arg1) < 0){
			return -1;
		}else if(arg0.compareTo(arg1) > 0){
			return 1;
		}else{
			return 0;
		}
		
	}

}
