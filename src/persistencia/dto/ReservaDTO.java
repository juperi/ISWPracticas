package persistencia.dto;

import java.util.Date;

public class ReservaDTO {
	private int id;
	private Date fechaRecogida;
	private Date fechaDevolucion;
	private int modalidadAlquiler;
	private String dniCliente;
	private String nombreCategoria;
	private int idSucursalRecogida;
	private int idSucursalDevolucion;

	public ReservaDTO(int id, Date fechaRecogida,
			Date fechaDevolucion, int modalidadAlquiler,
			String dniCliente, String nombreCategoria, int idSucursalRecogida,
			int idSucursalDevolucion) {
		this.id = id;
		this.fechaRecogida = fechaRecogida;
		this.fechaDevolucion = fechaDevolucion;
		this.modalidadAlquiler = modalidadAlquiler;
		this.dniCliente = dniCliente;
		this.nombreCategoria = nombreCategoria;
		this.idSucursalRecogida = idSucursalRecogida;
		this.idSucursalDevolucion = idSucursalDevolucion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getModalidadAlquiler() {
		return modalidadAlquiler;
	}

	public void setModalidadAlquiler(int modalidadAlquiler) {
		this.modalidadAlquiler = modalidadAlquiler;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getIdSucursalRecogida() {
		return idSucursalRecogida;
	}

	public void setIdSucursalRecogida(int idSucursalRecogida) {
		this.idSucursalRecogida = idSucursalRecogida;
	}

	public int getIdSucursalDevolucion() {
		return idSucursalDevolucion;
	}

	public void setIdSucursalDevolucion(int idSucursalDevolucion) {
		this.idSucursalDevolucion = idSucursalDevolucion;
	}


}

