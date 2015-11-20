package logica;

public class Coche {

	/***********************
	***  Atributos clase ***
	************************/

	private String matricula;
	private double kmsActuales;

	//Atr otras clases
	private Sucursal sucursal;
	private Categoria categoria;
	
	/*************************
	 ****** Constructor  *****
	 ************************/

	public Coche(String matricula, double kmsActuales, Sucursal sucursal,
			Categoria categoria) {
	
		this.matricula = matricula;
		this.kmsActuales = kmsActuales;
		this.sucursal = sucursal;
		this.categoria = categoria;
	}
	/*************************
	 ***  Metodos consulta ***
	 ************************/

	public String getMatricula(){return matricula;}
	public double getKmsActuales(){return kmsActuales;}

	//Consulta otras clases
	public Sucursal getSucursal(){return sucursal;}
	public Categoria getCategoria(){return categoria;}

	/******************************
	**** Metodos actualizacion ****
	******************************/

	public void setMatricula(String matricula){this.matricula = matricula;}
	public void setKmsActuales(double kmsActuales){this.kmsActuales = kmsActuales;}

	//Actualizacion otras clases
	public void setSucursal(Sucursal sucursal){this.sucursal = sucursal;}
	public void setCategoria(Categoria categoria){this.categoria = categoria;}

}