package logica;

import java.util.ArrayList;
import java.util.Collections;
//consultar empleados??
//id necesaria??
//consultar reserva?
import java.util.List;

public class Sucursal {

	/***********************
	***  Atributos clase ***
	************************/

	private int id;
	private String direccion;

	//Atr otras clases
	private List<Reserva> reservas;
	private List<Empleado> empleados;
	private List<Coche> coches;

	/*************************
	 ****** Constructor  *****
	 ************************/

	public Sucursal(int id, String direccion){
		this.id = id;
		this.direccion = direccion;
		this.coches = new ArrayList<Coche>();
		this.empleados = new ArrayList<Empleado>();
		this.reservas = new ArrayList<Reserva>();
		
	}

	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public int getId(){return id;}
	public String getDireccion(){return direccion;}

	//Consulta otras clases
	public List<Reserva> listarReservas(){return Collections.unmodifiableList(reservas);}
	public Reserva consultar_Reserva(int id){
		for(Reserva x : reservas) // x en lista de reservas
			if (x.getId() == id) return x;
		return null;
	}
	
	public Empleado consultar_empleado(String nombre){
		for(Empleado x : empleados) // x en lista de empleados
			if (x.getNombre().equals(nombre)) return x;
		return null;
	}
	
	public Coche consultar_coche(String matricula){
		for(Coche x : coches) // x en lista de coches
			if (x.getMatricula().equals(matricula)) return x;
		return null;
	}

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setDireccion(String direccion){this.direccion = direccion;}

	//Actualizacion otras clases
	public void anyadir_reserva(Reserva r){reservas.add(r);}
	public void eliminar_reserva(Reserva r){reservas.remove(r);}
	public void anyadir_Empleado(Empleado e){empleados.add(e);}
	public void eliminar_Empleado(Empleado e){empleados.remove(e);}
	public void anyadir_Coche(Coche c){coches.add(c);}
	public void eliminar_Coche(Coche c){coches.remove(c);}

}