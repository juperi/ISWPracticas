package logica;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	/***********************
	***  Atributos clase ***
	************************/

	private String nombre;
	private double precioModllimitada;
	private double precioModKms;
	private double precioKmModKms;
	private double precioSeguroTRiesgo;
	private double precioSeguroTerceros;
	private Categoria catSuperior;

	//Atr otros metodos
	private List<Coche> coches;


	/*************************
	 ****** Constructor  *****
	 ************************/

	public Categoria(String nombre, double precioModllimitada, double precioModKms, double precioKmModKms, double precioSeguroTRiesgo, double precioSeguroTerceros, Categoria catSuperior){
		this.nombre = nombre;
		this.precioModllimitada = precioModllimitada;
		this.precioModKms = precioModKms;
		this.precioKmModKms = precioKmModKms;
		this.precioSeguroTRiesgo = precioSeguroTRiesgo;
		this.precioSeguroTerceros = precioSeguroTerceros;
		this.catSuperior = catSuperior;
		this.coches = new ArrayList<Coche>();
	}

	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public String getNombre(){return nombre;}
	public double getprecioModllimitada(){return precioModllimitada;}
	public double getprecioModKms(){return precioModKms;}
	public double getprecioKmModKms(){return precioKmModKms;}
	public double getprecioSeguroTRiesgo(){return precioSeguroTRiesgo;}
	public double getprecioSeguroTerceros(){return precioSeguroTerceros;}
	public Categoria getSuperior() {
		return catSuperior;
	}
	public Coche consultar_coche(String matricula){
		for(Coche x : coches) // x en lista de coches
			if (x.getMatricula().equals(matricula)) return x;
		return null;
	}

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setNombre(String nombre){this.nombre = nombre;}
	public void setprecioModllimitada(double precioModllimitada){this.precioModllimitada = precioModllimitada;}
	public void setprecioModKms(double precioModKms){this.precioModKms = precioModKms;}
	public void setprecioKmModKms(double precioKmModKms){this.precioKmModKms = precioKmModKms;}
	public void setprecioSeguroTRiesgo(double precioSeguroTRiesgo){this.precioSeguroTRiesgo = precioSeguroTRiesgo;}
	public void setprecioSeguroTerceros(double precioSeguroTerceros){this.precioSeguroTerceros = precioSeguroTerceros;}
	public void anyadir_Coche(Coche c){coches.add(c);}
	public void eliminar_Coche(Coche c){coches.remove(c);}
	public void setSuperior(Categoria catSuperior) {
		this.catSuperior = catSuperior;
	}

}
