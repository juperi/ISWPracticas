package logica;

import java.util.ArrayList;
//consultar danyo??
import java.util.List;

public class Entrega {

	/***********************
	***  Atributos clase ***
	************************/

	private String tipoSeguro;
	private String fecha;
	private double kms; //kms lo teniamos como int, creo que deberia ser double
	private String combustible;

	/*************************
	 ****** Constructor  *****
	 ************************/
	
	public Entrega(String tipoSeguro, String fecha, double kms,
			String combustible, Empleado empleado, Coche coche,
			Devolucion devolucion, Reserva reserva) {
		
		this.tipoSeguro = tipoSeguro;
		this.fecha = fecha;
		this.kms = kms;
		this.combustible = combustible;
		this.empleado = empleado;
		this.coche = coche;
		this.devolucion = devolucion;
		this.reserva = reserva;
		this.danyos = new ArrayList<Danyo>();;
	}
	// Atr de otras clases
	private Empleado empleado;
	private Coche coche;
	private Devolucion devolucion;
	private Reserva reserva;
	private List<Danyo> danyos;

	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public String getTipoSeguro(){return tipoSeguro;}
	public String getFecha(){return fecha;}
	public double getkms(){return kms;}
	public String getCombustible(){return combustible;}

	// Consulta de otras clases
	public Empleado getEmpleado(){return empleado;}
	public Coche getCoche(){return coche;}
	public Devolucion getDevolucion(){return devolucion;}
	public Reserva getReserva(){return reserva;}
	
	public Danyo consultar_danyo(String descripcion){
		for(Danyo x : danyos) // x en lista de danyos
			if (x.getDescripcion().equals(descripcion)) return x;
		return null;
	}
	

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setTipoSeguro(String tipoSeguro){this.tipoSeguro = tipoSeguro;}
	public void setFecha(String fecha){this.fecha = fecha;}
	public void setKms(int kms){this.kms = kms;}
	public void setCombustible(String combustible){this.combustible = combustible;}

	// Actualizacion otras clases
	public void setEmpleado(Empleado empleado){this.empleado = empleado;}
	public void setCoche(Coche coche){this.coche = coche;}
	public void setDevolucion(Devolucion devolucion){this.devolucion = devolucion;}
	public void setReserva(Reserva reserva){this.reserva = reserva;}
	public void anyadir_danyo(Danyo d){danyos.add(d);}
	public void eliminar_danyo(Danyo d){danyos.remove(d);}

}
