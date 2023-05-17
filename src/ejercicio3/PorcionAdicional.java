package ejercicio3;

import java.util.Objects;

public abstract class PorcionAdicional implements Combo {

	protected Combo combo;
	protected String descripcion;
	protected double precio;

	PorcionAdicional(Combo unCombo, String descripcion, double precio) {
		Objects.requireNonNull(unCombo);
		Objects.requireNonNull(descripcion);
		Objects.requireNonNull(precio);

		this.combo = unCombo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public void detalles() {
		System.out.println("Su pedido: " + this.descripcion());
		System.out.println("El precio total de su pedido es de: " + this.precioTotal());
	}

	@Override
	public abstract double precioTotal();

	@Override
	public abstract String descripcion();
}
