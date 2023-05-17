package ejercicio1;

public class MotorAdapter extends Motor {
	private MotorElectrico motorElectrico;

	MotorAdapter(MotorElectrico unMotor) {
		this.motorElectrico = unMotor;
	}

	@Override
	void arrancar() {
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	void acelerar() {
		motorElectrico.moverMasRapido();
	}

	@Override
	void apagar() {
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

}
