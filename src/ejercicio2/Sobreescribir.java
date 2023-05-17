package ejercicio2;

import java.io.File;
import java.io.IOException;

public class Sobreescribir implements RegistroReporte {

	private RegistroReporte registro;

	public Sobreescribir(RegistroReporte registro) {
		this.registro = registro;
	}

	@Override
	public void export(File file) {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {

		}
		this.registro.export(file);
	}
}
