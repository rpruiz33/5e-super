package modelo;
import java.util.ArrayList;
import java.util.List;
public class AdmCarrito {
public AdmCarrito(List<Carrito> lstCarrito) {
		super();
		 lstCarrito=new ArrayList<Carrito>();

	}

private List<Carrito>lstCarrito;

public List<Carrito> getLstCarrito() {
	return lstCarrito;
}

public void setLstCarrito(List<Carrito> lstCarrito) {
	this.lstCarrito = lstCarrito;
}
}
