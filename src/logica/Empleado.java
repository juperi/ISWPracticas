package logica;

public class Empleado {

	/***  Atributos clase ***/
	private String nombre;
	private String administrador;
	
	/*************************
	 ****** Constructor  *****
	 ************************/

	public Empleado(String nombre, String administrador) {
		this.nombre = nombre;
		this.administrador = administrador;
	}
	
	/***  Metodos consulta ***/
	public String getNombre(){return nombre;}
	public String getAdministrador(){return administrador;}

	/***  Metodos actualizacion ***/
	public void setNombre(String nombre){this.nombre = nombre;}
	public void setAdministrador(String administrador){this.administrador = administrador;}

}