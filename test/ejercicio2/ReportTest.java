package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ReportTest {

	@Test
	public void archivoNoExistente() {
		Report reporte = new Report("Reporte del dia: " + LocalDate.now());

		String mensaje = "";

		try {
			reporte.export(null);
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "File es NULL; no puedo exportar...";

		assertEquals(mensajeEsperado, mensaje);
	}

	@Test
	public void archivoExistente() {
		NoSobreescribir reporte = new NoSobreescribir(new Report("Reporte del dia: " + LocalDate.now()));

		String mensaje = "";

		try {
			reporte.export(new File("Reporte"));
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "El archivo ya existe...";

		assertEquals(mensajeEsperado, mensaje);
	}

	@Test
	public void escribirReporte() {
		Sobreescribir reporte = new Sobreescribir(new Report("Reporte del dia: " + LocalDate.now()));

		String mensaje = "";

		try {
			reporte.export(new File("Reporte"));
		} catch (IllegalArgumentException e) {
			mensaje = e.getMessage();
		}

		String mensajeEsperado = "Se registro el reporte...";

		assertEquals(mensajeEsperado, mensaje);
	}

}
