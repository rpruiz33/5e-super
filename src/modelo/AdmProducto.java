package modelo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class AdmProducto {

	public AdmProducto() {
		super();
		this.lstProducto = new ArrayList<Producto>();
	}

	private List<Producto> lstProducto;

	public List<Producto> getLstProducto() {
		return lstProducto;
	}

	public void setLstProducto(List<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}

	public boolean agregarProducto(String producto, float precio) {
		boolean resul = false;

		System.out.println(lstProducto.size());
		int i = 0;

		while (i < lstProducto.size()) {
			System.out.println(lstProducto.get(i).getProducto());
			if (lstProducto.get(i).getProducto() == (producto)) {
				resul = false;

				i = lstProducto.size() + 1;
			} else {
				i++;
				resul = true;
			}
		}
		int idPro = 1;
		if (lstProducto.size() > 0) {
			idPro = lstProducto.get(lstProducto.size() - 1).getIdProducto() + 1;
		}
		Producto p1 = new Producto(idPro, producto, precio);

		lstProducto.add(p1);

		i = lstProducto.size() + 1;
		System.out.println("i--> " + i);

		return resul;
	}
}