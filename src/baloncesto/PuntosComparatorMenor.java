package baloncesto;

import java.util.Comparator;

public class PuntosComparatorMenor implements Comparator<PartidoBasket> {

	@Override
	public int compare(PartidoBasket p1, PartidoBasket p2) {
		return Integer.compare(p1.getPuntosTotales(), p2.getPuntosTotales());
	}


}
