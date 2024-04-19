package tienda;

public class Compra {
	private Producto producto;
	private int Cantidad;
	private int precio;
	/**
	 * @param producto
	 * @param cantidad
	 * @param precio
	 */
	public Compra(Producto producto, int cantidad, int precio) {
		super();
		this.producto = producto;
		Cantidad = cantidad;
		this.precio = precio;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return Cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return producto + " Cantidad" + Cantidad + " Precio" + precio;
	}
	
	
	

}
