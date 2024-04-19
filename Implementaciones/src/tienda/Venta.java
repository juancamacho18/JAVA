package tienda;

import java.util.ArrayList;

public class Venta {
	private int numero;
	private Fecha fecha;
	private Persona cliente;
	private ArrayList<Compra> listaCompras;
	private long subtotal;
	private long iva;
	private long total;
	/**
	 * @param numero
	 * @param fecha
	 * @param cliente
	 */
	public Venta(int numero, Fecha fecha, Persona cliente) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.cliente = cliente;
		this.listaCompras =new ArrayList<>();
		this.fecha =new Fecha(2024,3,20);
	}
	/**
	 * Funcion para aregar una instancia d ela clase compa a la
	 * lista de compras
	 * @param compra es un objeto d ela clase Compra
	 */
	public void agregarCompra(Compra compra) {
		listaCompras.add(compra);
	}
	public void calcularTotal() {
		subtotal = 0;
		for (Compra compra : listaCompras) {
			subtotal += compra.getPrecio() * compra.getCantidad();
			Tipo tipoProducto = compra.getProducto().getTipo();
			iva += (compra.getPrecio() * tipoProducto.getIva() / 100) * compra.getCantidad();
		}
		total = subtotal + iva;
	}
	@Override
	public String toString() {
		return "Venta [numero=" + numero + ", fecha=" + fecha + ", cliente=" + cliente + ", listaCompras="
				+ listaCompras + ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}
	
}
