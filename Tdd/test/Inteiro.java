import java.util.ArrayList;
import java.util.List;

public class Inteiro {

	public Integer exercicio1(Integer valor1, Integer valor2) {
		return valor1 + valor2;

	}

	public int exercicio2(int valor1, int valor2) {
		return valor1 - valor2;
	}

	public int exercicio3(int valor1, int valor2) {
		return valor1 * valor2;
	}

	public int exercicio4(int valor1, int valor2) throws DivisaoPorZero {
		return valor1 / valor2;

	}

	public Boolean par(int valor) {
		return valor % 2 == 0;
	}

	public int valorMaior(int valor1, int valor2) {
		return valor1 > valor2 ? valor1 : valor2;
	}

	public List<Integer> getImpares(int valorInicial) {
		List<Integer> listaImpares = new ArrayList<>();
		for (Integer contador = valorInicial; contador < 100; contador++){
			if (!par(contador)){
				listaImpares.add(contador);
			}
		}
		return listaImpares;
	}

}
