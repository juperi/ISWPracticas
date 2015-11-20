package logica;

import java.util.Date;

public class Cliente {

	/***********************
	***  Atributos clase ***
	************************/

	private String dni;
	private String nombreyApellidos;
	private String direccion;
	private String poblacion;
	private int codPostal;
	private Date fechaCarnetConducir;
	private int digitosTC;
	private int mesTC;
	private int añoTC;
	private int cvcTC;
	private String tipoTC;

	/*************************
	 ****** Constructor  *****
	 ************************/

	public Cliente(String dni,String nombreyApellidos, String direccion, String poblacion, int codPostal, Date fechaCarnetConducir, int digitosTC, int mesTC, int añoTC, int cvcTC, String tipoTC){
		this.nombreyApellidos = nombreyApellidos;
		this.direccion = direccion;
		this.poblacion = poblacion;
		this.fechaCarnetConducir = fechaCarnetConducir;
		this.digitosTC = digitosTC;
		this.mesTC = mesTC;
		this.añoTC = añoTC;
		this.cvcTC = cvcTC;
		this.tipoTC = tipoTC;
		this.dni = dni;
	}

	/*************************
	 ***  Metodos consulta ***
	 ************************/
	public String getdni(){return dni;}
	public String getnombreyApellidos(){return nombreyApellidos;}
	public String getDireccion(){return direccion;}
	public String getPoblacion(){return poblacion;}
	public int getCodPostal(){return codPostal;}
	public Date getFechaCarnetConducir(){return fechaCarnetConducir;}
	public int getDigitosTC(){return digitosTC;}
	public int getMesTC(){return mesTC;}
	public int getAñoTC(){return añoTC;}
	public int getCvcTC(){return cvcTC;}
	public String getTipoTC(){return tipoTC;}

	/******************************
	**** Metodos actualizacion ****
	******************************/
	public void setdni(String dni){this.dni=dni;}
	public void setnombreyApellidos(String nombreyApellidos){this.nombreyApellidos = nombreyApellidos;}
	public void setDireccion(String direccion){this.direccion = direccion;}
	public void setPoblacion(String poblacion){this.poblacion = poblacion;}
	public void setCodPostal(int codPostal){this.codPostal = codPostal;}
	public void setFechaCarnetConducir(Date fechaCarnetConducir){this.fechaCarnetConducir = fechaCarnetConducir;}
	public void setDigitosTC(int digitosTC){this.digitosTC = digitosTC;}
	public void setMesTC(int mesTC){this.mesTC = mesTC;}
	public void setAñoTC(int añoTC){this.añoTC = añoTC;}
	public void setCvcTC(int cvcTC) {this.cvcTC = cvcTC;}
	public void setTipoTC(String tipoTC){this.tipoTC = tipoTC;}

}