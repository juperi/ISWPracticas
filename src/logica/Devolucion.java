package logica;

import java.util.ArrayList;
//consultar danyo??
import java.util.List;

public class Devolucion {

	/***********************
	***  Atributos clase ***
	************************/

	private String fecha;
	private double totalACobrar;
	private double cobrado;
	private double kms;
	private String combustible;
	
	/*************************
	 ****** Constructor  *****
	 ************************/

	public Devolucion(String fecha, double totalACobrar, double cobrado,
			double kms, String combustible, Empleado empleado, Entrega entrega
			) {
		super();
		this.fecha = fecha;
		this.totalACobrar = totalACobrar;
		this.cobrado = cobrado;
		this.kms = kms;
		this.combustible = combustible;
		this.empleado = empleado;
		this.entrega = entrega;
		this.danyos = new ArrayList<Danyo>(); ;
	}
	// Atr otras clases
	private Empleado empleado;
	private Entrega entrega;
	private List<Danyo> danyos;

	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public String getFecha(){return fecha;}
	public double getTotalACobrar(){return totalACobrar;}
	public double getCobrado(){return cobrado;}
	public double getkms(){return kms;}
	public String getCombustible(){return combustible;}

	// Consulta de otras clases
	public Empleado getEmpleado(){return empleado;}
	public Entrega getEntrega(){return entrega;}
	
	public Danyo consultar_danyo(String descripcion){
		for(Danyo x : danyos) // x en lista de danyos
			if (x.getDescripcion().equals(descripcion)) return x;
		return null;
	}
	

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setFecha(String fecha){this.fecha = fecha;}
	public void setTotalACobrar(double totalACobrar){this.totalACobrar = totalACobrar;}
	public void setCobrado(int cobrado){this.cobrado = cobrado;}
	public void setKms(int kms){this.kms = kms;}
	public void setCombustible(String combustible){this.combustible = combustible;}

	// Actualizacion otras clases
	public void setEmpleado(Empleado empleado){this.empleado = empleado;}
	public void setEntrega(Entrega entrega){this.entrega = entrega;}
	public void anyadir_danyo(Danyo d){danyos.add(d);}
	public void eliminar_danyo(Danyo d){danyos.remove(d);}

}