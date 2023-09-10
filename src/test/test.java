package test;
import modelo.AdmProducto;
import modelo.Cliente;
import modelo.AdmCarrito;
import modelo.Carrito;
import modelo.AdmCliente;
import modelo.Supermercado;
import modelo.ItemCarrito;

import modelo.Producto;
import java.util.ArrayList;
import java.util.List;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PROBANDO 1°CASO DE USO AGREGAR PRODUCTO ");
		System.out.println("asasas");
		Producto p2= new Producto(4,"huevo",123f);
		Producto p3= new Producto(5,"leche",123f);
		AdmProducto admPro=new AdmProducto();
		System.out.println(admPro.getLstProducto().add(p2));
		System.out.println(admPro.getLstProducto().add(p3));
		System.out.println("agregar producto");
		System.out.println(admPro.agregarProducto("llleche",123f));
		System.out.println("asasas");
	}

}
