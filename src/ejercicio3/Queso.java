package ejercicio3;

public class Queso extends PorcionAdicional {

	Queso(Combo unCombo, String descripcion, double precio) {
		super(unCombo, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double precioTotal() {
		return combo.precioTotal() + this.precio;
	}

	@Override
	public String descripcion() {
		return combo.descripcion() + this.descripcion;
	}

}
