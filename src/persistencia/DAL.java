package persistencia;

import java.util.List;

import excepciones.DAOExcepcion;
import persistencia.dto.*;

public class DAL {
	private static DAL dal;

	// Declaracion DAOs
	private ICategoriaDAO catDAO;
	private ISucursalDAO sucDAO;
	private IClienteDAO cliDAO;
	private IReservaDAO resDAO;

	/*************************
	 ****** Constructor *****
	 ************************/

    // Patron Singleton
    public static DAL getDAL() throws DAOExcepcion{
    	if(dal==null)
			dal = new DAL();
		return dal;
    }

    public DAL() throws DAOExcepcion{
    	catDAO = new CategoriaDAOImp();
    	sucDAO = new SucursalDAOImp();
    	cliDAO = new ClienteDAOImp();
    	resDAO = new ReservaDAOImp();
    }

    /*************************
	 *******  Metodos  *******
	 ************************/

    // Listar Categorias, Sucursales y Reservas de una sucursal
    public List<CategoriaDTO> obtenerCategorias() {
    	try {
    		return catDAO.obtenerCategorias();
    	} catch (DAOExcepcion e) {
    		return null;
    	}
    }

    public List<SucursalDTO> obtenerSucursales() {
    	try {
    		return sucDAO.obtenerSucursales();
    	} catch (DAOExcepcion e) {
    		return null;
    	}
    }

    public List<ReservaDTO> obtenerReservas() {
    	try {
    		return resDAO.obtenerReservasPorSucursalOrigen();
    	} catch (DAOExcepcion e) {
    		return null;
    	}
    }

    // Crear reserva y cliente
    public void crearCliente(ClienteDTO cliente) {
    	try {
    		cliDAO.crearCliente(cliente);
    	}catch (DAOExcepcion e) { }
    }

    public void crearReserva(ReservaDTO reserva) {
    	try {
    		resDAO.crearReserva(reserva);
    	}catch (DAOExcepcion e) { }
    }

}