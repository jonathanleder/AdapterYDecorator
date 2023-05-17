package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PorcionAdicionalTest {

	@Test
	void testComboFamiliar() {
		Combo familiar = new ComboFamiliar("Combo familiar", 120.5);
		PorcionAdicional tomate = new Tomate(familiar, " porcion de tomate", 20.0);
		PorcionAdicional papas = new Papas(tomate, " mas una porcion de papas ", 10.0);

		papas.detalles();

		String resultadoEsperado = "Combo familiar porcion de tomate mas una porcion de papas ";

		assertEquals(resultadoEsperado, papas.descripcion());
	}

	@Test
	void testComboBasico() {
		Combo basico = new ComboBasico("Combo basico", 120.5);
		PorcionAdicional queso = new Queso(basico, " porcion de queso", 15.5);
		PorcionAdicional carne = new Carne(queso, " mas una porcion de carne ", 30.0);

		System.out.println("Su combo elegido es:" + carne.descripcion() + "y el total es de: " + carne.precioTotal());
		double resultadoEsperado = 166.0;

		assertEquals(resultadoEsperado, carne.precioTotal());
	}

}
