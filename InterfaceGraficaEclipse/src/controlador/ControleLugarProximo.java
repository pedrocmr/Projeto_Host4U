package controlador;

import modelo.LugarProximo;

public class ControleLugarProximo {

	LugarProximo lugarProximo;

	public ControleLugarProximo(LugarProximo lPro) {
		this.lugarProximo = lPro;
	}

	public float calcularDistancia(float latitude, float longitude) {

		return Math.abs(latitude * longitude); // MÉTODO NECESSITA DE IMPLEMENTAÇÃO
	}

}
