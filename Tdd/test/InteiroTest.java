
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InteiroTest {
	Inteiro inteiro;

	@Before
	public void before() {
		inteiro = new Inteiro();
		System.out.println("Inicio da execução");
	}
	
	@After
	public void after() {
		System.out.println("fim da execução");
	}

	@Test
	public void exercicio1Test() {
		assertTrue(6 == inteiro.exercicio1(2, 4));
	}

	@Test
	public void exercicio2Test() {
		assertTrue(-2 == inteiro.exercicio2(2, 4));
	}

	@Test
	public void exercicio3Test() {
		assertTrue(8 == inteiro.exercicio3(2, 4));
	}

	@Test
	public void exercicio4Test() throws DivisaoPorZero {
		assertTrue(2 == inteiro.exercicio4(4, 2));
	}

	@Test(expected = DivisaoPorZero.class)
	@Ignore
	public void exercicio4ExceptionTest() {
		try {
			inteiro.exercicio4(4, 0);
		} catch (DivisaoPorZero e) {
			e.printStackTrace();
		}
	}

	@Test
	public void exercicio5() {
		assertTrue(inteiro.par(2));
		assertFalse(inteiro.par(3));
	}
	
	@Test
	public void exercicio6() {
		assertTrue(3 == inteiro.valorMaior(2 ,3));
		assertTrue(4 == inteiro.valorMaior(4 ,3));
		assertTrue(5 == inteiro.valorMaior(5 ,5));
	}
	
	@Test
	public void exercicio7(){
		List<Integer> lista = inteiro.getImpares(93);
		assertTrue(4 == lista.size());
		assertTrue(93 == lista.get(0));
		assertTrue(95 == lista.get(1));
		assertTrue(97 == lista.get(2));
		assertTrue(99 == lista.get(3));
	}

}
