package persistencia;

import java.util.List;

import excepciones.DAOExcepcion;
import persistencia.dto.*;

public class DAL {
	private static DAL dal;

	// Declaracion DAOs
	private ICategoriaDAO catDAO;
	private ISucursalDAO sucDAO;

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
    }

    /*************************
	 *******  Metodos  *******
	 ************************/

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

}