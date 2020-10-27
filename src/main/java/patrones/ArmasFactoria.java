package patrones;

import armamento.Arma;
import armamento.Cuchillo;
import armamento.Granada;
import armamento.M1911;
import armamento.Remington;

public class ArmasFactoria {

	public ArmasFactoria() {
		super();
	}

	public Arma crearArma(String tipoArma) {
		if (tipoArma == null) {
			return null;
		}
		if (tipoArma.equalsIgnoreCase("cuchillo")) {
			return new Cuchillo();
		} else if (tipoArma.equalsIgnoreCase("granada")) {
			return new Granada();
		} else if (tipoArma.equalsIgnoreCase("remington")) {
			return new Remington();
		} else if (tipoArma.equalsIgnoreCase("m1911")) {
			return new M1911();
		}
		return null;
	}
}
