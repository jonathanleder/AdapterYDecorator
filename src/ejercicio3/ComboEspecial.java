package ejercicio3;

import java.util.Objects;

public class ComboEspecial implements Combo {

	private String descripcion;
	private double precio;

	ComboEspecial(String descripcion, double precio) {
		Objects.requireNonNull(descripcion);
		Objects.requireNonNull(precio);

		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public double precioTotal() {
		return this.precio;
	}

	@Override
	public String descripcion() {

		return this.descripcion;
	}

	@Override
	public void detalles() {
		System.out.println("Su pedido: " + this.descripcion());
		System.out.println("El precio total de su pedido es de: " + this.precioTotal());
	}
}
