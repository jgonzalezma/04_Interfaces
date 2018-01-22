package baloncesto;

import java.util.Comparator;

public class PuntosComparatorMayor implements Comparator<PartidoBasket> {

	@Override
	public int compare(PartidoBasket p1, PartidoBasket p2) {
		return Integer.compare(p2.getPuntosTotales(), p1.getPuntosTotales());
	}


}
