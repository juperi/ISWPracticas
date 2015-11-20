package logica;

public class Danyo{

	/***********************
	***  Atributos clase ***
	************************/

	private String zona;
	private String descripcion;
	
	/*************************
	 ****** Constructor  *****
	 ************************/
	
	public Danyo(String zona, String descripcion) {
		this.zona = zona;
		this.descripcion = descripcion;
	}

	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public String getZona(){return zona;}
	public String getDescripcion(){return descripcion;}

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setZona(String zona){this.zona = zona;}
	public void setDescripcion(String descripcion){this.descripcion = descripcion;}

}