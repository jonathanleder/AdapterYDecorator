package ejercicio2;

import java.io.File;

public class NoSobreescribir implements RegistroReporte {

	private RegistroReporte registro;

	public NoSobreescribir(RegistroReporte registro) {
		this.registro = registro;
	}

	@Override
	public void export(File file) {
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		this.registro.export(file);
	}
}
