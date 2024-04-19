package tienda;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Producto> listaProducto;
	private ArrayList<Venta> listaVentas;
	private Tipo tipo =new Tipo(10,"Bebidas azucaradas",25);
	private Persona proveedor; 
	private Persona cliente;
	/**
	 * @param listaProduto
	 * @param listaVentas
	 */
	public Tienda() {
		super();
		this.listaProducto =new ArrayList<>();
		this.listaVentas =new ArrayList<>();
		tipo =new Tipo(10,"Bebidas azucaradas",25);
		proveedor =new Persona(1545,"Juanita");
		cliente =new Persona(2030,"Pachito");
		
	}
	/**
	 * 
	 */
	public void crearProducto() {
		listaProducto.add(new Producto(1020,"Gaseosa",tipo,2500,proveedor)); 
		listaProducto.add(new Producto(1025,"Jugo",tipo,3500,proveedor));
		listaProducto.add(new Producto(1030,"Galletas",tipo,1500,proveedor));
		listaProducto.add(new Producto(1035,"Papas",tipo,2500,proveedor));
		listaProducto.add(new Producto(1040,"Pan",tipo,1200,proveedor));
	}
	/**
	 * 
	 */
	public void mostrarCatalogo() {
		for (Producto producto : listaProducto) {
			System.out.println(producto);
		}
	}
	public void mostrarCliente(){
		System.out.println(cliente);
	}
	/**
	 * 
	 */
	public void realizarVenta(int numero, Fecha fecha, Persona cliente, ArrayList<Compra> listaCompras) {
		Venta nuevaVenta = new Venta(numero, fecha, cliente);
		for (Compra compra : listaCompras) {
			nuevaVenta.agregarCompra(compra);
		}
		nuevaVenta.calcularTotal();
		listaVentas.add(nuevaVenta);
		actualizarInventario(listaCompras); // Actualizar el inventario después de la venta
	}
	public void actualizarInventario(ArrayList<Compra> listaCompras) {
		for (Compra compra : listaCompras) {
			Producto productodecompra = compra.getProducto();
			int cantidadVendida = compra.getCantidad();
			for (Producto producto : listaProducto) {
				if (producto.equals(productodecompra)) {
					int nuevaCantidad = compra.getCantidad() - cantidadVendida;
					compra.setCantidad(nuevaCantidad);
					break;
				}
			}
		}
	}
	
	
	
	
	
	

}
