package logica;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import excepciones.DAOExcepcion;
import persistencia.DAL;
import persistencia.dto.CategoriaDTO;
import persistencia.dto.ClienteDTO;
import persistencia.dto.ReservaDTO;
import persistencia.dto.SucursalDTO;

//***********************************
// Clase que actua como Controlador
//***********************************
public class AlquilerVehiculos {

	/***********************
	 *** Atributos clase ***
	 ************************/

	// Atributos otra clase
	private HashMap<Integer, Sucursal> sucursales;
	private HashMap<String, Categoria> categorias;
	private HashMap<Integer, Reserva> reservas;
	private HashMap<String, Cliente> clientes;
	private DAL dal;

	/*************************
	 ****** Constructor *****
	 ************************/

	/*
	// Unica instancia de la clase (patrón singleton)
	private static AlquilerVehiculos instancia = new AlquilerVehiculos();

	// Método para obtener la instancia de la clase(patrón singleton)
	public static AlquilerVehiculos getInstance() {
		return instancia;
	}
	*/

	public AlquilerVehiculos() throws DAOExcepcion {
		sucursales = new HashMap<Integer, Sucursal>();
		reservas = new HashMap<Integer, Reserva>();
		clientes = new HashMap<String, Cliente>();
		categorias = new HashMap<String, Categoria>();
		this.dal = DAL.getDAL();
		cargaSistema();
	}

	/*************************
	 *** Metodos consulta ***
	 ************************/

	//Consulta otras clases
	public Sucursal consultar_sucursal(int id){
		if( sucursales.containsKey(id)) return sucursales.get(id);
		else return null;
	}

	public Categoria consultar_categoria(String nombre){
		if( categorias.containsKey(nombre)) return categorias.get(nombre);
		else return null;
	}

	public Reserva consultar_reserva(int id){
		if( reservas.containsKey(id)) return reservas.get(id);
		else return null;
	}

	public Cliente consultar_cliente(int id){
		if( clientes.containsKey(id)) return clientes.get(id);
		else return null;
	}

	/******************************
	 **** Metodos actualizacion ****
	 ******************************/

	// Actualizacion otras clases
	  public void anyadir_sucursal(Sucursal s){sucursales.put(s.getId(),s);}
	  public void eliminar_sucursal(Sucursal s){sucursales.remove(s.getId(),s);}
	  public void anyadir_reserva(Reserva r){reservas.put(r.getId(),r);}
	  public void eliminar_reserva(Reserva r){reservas.remove(r.getId(),r);}
	  public void anyadir_cliente(Cliente c){clientes.put(c.getdni(),c);}
	  public void eliminar_cliente(Cliente c){clientes.remove(c.getdni(),c);}
	  public void anyadir_categoria(Categoria cat){categorias.put(cat.getNombre(),cat);}
	  public void eliminar_categoria(Categoria cat){categorias.remove(cat.getNombre(),cat);}

	 /********************************************
	 ****** Caso de uso: Listar Sucursales *****
	 ********************************************/

	public List<Sucursal> listarSucursales(){
		return new ArrayList<Sucursal>(sucursales.values());
	}

	/********************************************
	 *** Caso de uso: Listar Reservas Sucursal ***
	 ********************************************/

	public List<Reserva> listarReservas() {
		return new ArrayList<Reserva>(reservas.values());
	}

	/*********************************
	 *** Caso de uso: Crear Reserva ***
	 **********************************/

	public void crearReserva(Reserva reserva) {
		// Reserva reserva= new Reserva(dni);
		// int dni //cliente introduce su dni
		reservas.put(reserva.getId(), reserva);
		// frecogida = cliente
	}

	/*********************************
	 *** Caso de uso: Crear Cliente ***
	 **********************************/

	public void crearCliente(Cliente cliente) {
		ClienteDTO clienteDTO = new ClienteDTO(cliente.getdni(), cliente.getnombreyApellidos(),
				cliente.getDireccion(), cliente.getPoblacion(), cliente.getCodPostal(),
				cliente.getFechaCarnetConducir(), cliente.getDigitosTC(), cliente.getMesTC(),
				cliente.getAñoTC(), cliente.getCvcTC(), cliente.getTipoTC());
		// Lo añade al a memoria
		clientes.put(cliente.getdni(), cliente);//añadirCliente(cliente);
		// Y le pide a dal que lo persista
		dal.crearCliente(clienteDTO);
	}

	/*********************************
	 ******** Carga datos  ***********
	 **********************************/

	private void cargaSistema() {
		cargaCategorias();
		cargaSucursales();
		cargaClientes();
		cargaReservas();
		/*
		// Creamos dos sucursales
		Sucursal suc1 = new Sucursal(1, "Camino de Vera s/n");
		Sucursal suc2 = new Sucursal(2, "Archiduque Carlos, 3");

		// Creamos dos categorias
		Categoria cat1 = new Categoria("sedán", 45, 23, 0.75, 50.25, 43.23,null);
		Categoria cat2 = new Categoria("economy", 48, 27, 0.85, 75.25, 55.23,cat1.getNombre());

		// Añadimos a colecciones
		sucursales.put(suc1.getId(), suc1);
		sucursales.put(suc2.getId(), suc2);
		categorias.put(cat1.getNombre(), cat1);
		categorias.put(cat2.getNombre(), cat2);
		*/
	}

	private void cargaCategorias(){
		List<CategoriaDTO> listacatDTO = dal.obtenerCategorias();
		// Crear y añadir todas las categorias a la coleccion
		for (CategoriaDTO catDTO : listacatDTO) {
			anyadir_categoria(new Categoria(catDTO.getNombre(),
							catDTO.getPrecioModIlimitada(), catDTO.getPrecioModKms(),
							catDTO.getPrecioKMModKms(), catDTO.getPrecioSeguroTRiesgo(),
							catDTO.getPrecioSeguroTerceros(), null)); // Null por defecto, despues se asigna cat superior
		}
		// Actualizar los enlaces que representan la relacion "superior"
		for (CategoriaDTO catDTO : listacatDTO)
			if (catDTO.getNombreCategoriaSuperior() != null)
				consultar_categoria(catDTO.getNombre()).setSuperior(consultar_categoria(catDTO.getNombreCategoriaSuperior()));
	}

	private void cargaSucursales(){
		List<SucursalDTO> listasucDTO = dal.obtenerSucursales();
		// Crear y añadir todas las sucursales a la coleccion
		for (SucursalDTO sucDTO : listasucDTO) {
			anyadir_sucursal(new Sucursal(sucDTO.getId(), sucDTO.getDirección()));
		}
	}

	private void cargaClientes(){
		List<ClienteDTO> listacliDTO = dal.obtenerClientes();
		// Crear y añadir todos los clientes a la coleccion
		for (ClienteDTO cliDTO : listacliDTO) {
			anyadir_cliente(new Cliente(cliDTO.getDni(), cliDTO.getNombreyApellidos(), cliDTO.getDireccion(),
					cliDTO.getPoblacion(), cliDTO.getCodPostal(), cliDTO.getFechaCanetConducir(), cliDTO.getDigitosTC(),
					cliDTO.getMesTC(), cliDTO.getAñoTC(), cliDTO.getCvcTC(), cliDTO.getTipoTC()));
		}
	}

	//Tema reservas
	private void cargaReservas(){
		List<ReservaDTO> listaresDTO = dal.obtenerReservas();
		// Crear y añadir todas las reservas a la coleccion
		for (ReservaDTO resDTO : listaresDTO) {
			anyadir_reserva(new Reserva(resDTO.getId(), resDTO.getFechaRecogida(), resDTO.getFechaDevolucion(),
					resDTO.getModalidadAlquiler(), resDTO.getDniCliente(), resDTO.getNombreCategoria(),
					resDTO.getIdSucursalRecogida(), resDTO.getIdSucursalDevolucion()));
		}
	}

}