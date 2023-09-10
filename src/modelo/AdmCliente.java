package modelo;
import java.util.ArrayList;
import java.util.List;
public class AdmCliente {
private List<Cliente> lstCliente;

public AdmCliente(List<Cliente> lstCliente) {
	super();
	this.lstCliente = new ArrayList<Cliente>();
}

public List<Cliente> getLstCliente() {
	return lstCliente;
}

public void setLstCliente(List<Cliente> lstCliente) {
	this.lstCliente = lstCliente;
}
}
