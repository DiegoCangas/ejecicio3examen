package defaultPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Ejercicio3Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"1, lunes",
				"2, martes",
				"3, miercoles",
				"4, jueves",
				"5, viernes",
				"6, sabado",
				"7, domingo"})
	
	void testProbarDiaSemana(int input, String expected) throws Exception {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(expected, c.diaSemana(input));
	}
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale Error")
	@CsvSource({"-1",
				"22",
				"0",
				"17",
				"59999",
				"-6000",
				"27"})
	void testProbarDatosErroneos(int input) {
		Ejercicio3 c = new Ejercicio3();
		try {
			c.diaSemana(input);
			assertTrue(false);
		}
		catch (Exception e) {
			assertTrue(true);
		}
	}

}
