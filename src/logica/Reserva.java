package logica;

import java.util.Date;

//id en reserva??
public class Reserva {

	/***********************
	***  Atributos clase ***
	************************/

	private int id;
	private Date fechaRecogida;
	private Date fechaDevolucion;
	private int modalidadAlquiler;

	//Atr otras clases
	private Cliente cliente;
	private Entrega entrega;
	private Categoria categoria;
	private Sucursal sucursal_recogida;
	private Sucursal sucursal_devolucion;

	/*************************
	 ****** Constructor  *****
	 ************************/
	
	 public Reserva(int id, Date fechaRecogida, Date fechaDevolucion, int modalidadAlquiler, Cliente cli, Categoria cat,Sucursal suc1, Sucursal suc2){
		this.id = id;
		this.fechaRecogida = fechaRecogida;
		this.fechaDevolucion = fechaDevolucion;
		this.modalidadAlquiler = modalidadAlquiler;
		this.cliente = cli;
		this.categoria=cat;
		this.sucursal_recogida = suc1;
		this.sucursal_devolucion = suc2;
	}
	 
	 
	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public int getId(){return id;}
	public Date getfechaRecogida(){return fechaRecogida;}
	public Date getfechaDevolucion(){return fechaDevolucion;}
	public int getmodalidadAlquiler(){return modalidadAlquiler;}

	//Consulta otras clases
	public Entrega getEntrega(){return entrega;}
	public Cliente getCliente(){return cliente;}
	public Categoria getCategoria(){return categoria;}
	public Sucursal getSucursal_devolucion(){return sucursal_devolucion;}
	public Sucursal getSucursal_recogida(){return sucursal_recogida;}

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setId(int id){this.id = id;}
	public void setfechaRecogida(Date fechaRecogida){this.fechaRecogida = fechaRecogida;}
	public void setfechaDevolucion(Date fechaDevolucion){this.fechaDevolucion = fechaDevolucion;}
	public void setmodalidadAlquiler(int modalidadAlquiler){this.modalidadAlquiler = modalidadAlquiler;}

	//Actualizacion otras clases
	public void setEntrega(Entrega entrega){this.entrega = entrega;}
	public void setCliente(Cliente cliente){this.cliente = cliente;	}
	public void setCategoria(Categoria cat){this.categoria = cat;}
	public void setSucursal_recogida(Sucursal sucursal_recogida){this.sucursal_recogida = sucursal_recogida;}
	public void setSucursal_devolucion(Sucursal sucursal_devolucion){this.sucursal_devolucion = sucursal_devolucion;}

}
