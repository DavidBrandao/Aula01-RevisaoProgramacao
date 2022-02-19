package unitTesting;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCachorro {
	
	public Cachorro toto;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void SetupTest() {
		toto = new Cachorro();
		System.setOut(new PrintStream(outContent));
	}
	
	@Test
	@DisplayName("Verificar saida do print")
	void VerificarPrintCorrer() {
		toto.latir();
		assertEquals("au, au!", outContent.toString().trim());
	}
	
	@Test
	@DisplayName("Verificar palavraa contida na saida do print")
	void VerificarPrintCorrerContido() {
		toto.latir();
		assertTrue(outContent.toString().contains("au, au!"));
	}
	
	@Test
	@DisplayName("Verificar altura do objeto toto")
	void VerificarAltura() {
		toto.setAltura(5.3);
		assertTrue(toto.getAltura() == 5.3, "Altura Não Corresponde");
	}
	
	@Test
	@DisplayName("Verificar Peso do ojeto toto")
	void VerificarPeso() {
		toto.setPeso(100.3);
		assertTrue(toto.getPeso() == 100.3, "Peso Não Corresponde");
	}
	
	@Test
	@DisplayName("Verificar Peso negativo ojeto toto")
	void VerificarPesoNegativo() {
		toto.setPeso(-1200.3);
		assertTrue(toto.getPeso() == 0.0, "Peso Não Corresponde");
	}
	
	@RepeatedTest(100)
	@DisplayName("Verificar Peso Repetidamente")
	void VerificarPesoRepetidamente() {
		toto.setPeso(100.3);
		assertTrue(toto.getPeso() == 100.3, "Peso Não Corresponde");
	}
	
	@ParameterizedTest
	@DisplayName("Verificar Peso Repetidamente com valores diferentes")
	@ValueSource(doubles = {1.6, 3.8, 5.5, 3.2, 15.3})
	void VerificarPesoAleatorio(double number) {
		toto.setPeso(number);
	    assertTrue(toto.getPeso() == number);
	}
	
	@DisplayName("Verificar saida string do metodo caminhar")
	void VerificarMetodoCaminhar(double number) {
	    assertTrue(toto.caminhar().equals("caminhando com o dono.."));
	}
	
	@AfterEach
	public void TearDownTest() {
		toto = null;
		System.setOut(originalOut);
	}

}

