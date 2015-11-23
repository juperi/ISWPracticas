package persistencia;

import java.sql.*;

import persistencia.dto.ClienteDTO;
import excepciones.DAOExcepcion;

public class ClienteDAOImp implements IClienteDAO {

	protected ConnectionManager connManager;

	public ClienteDAOImp() throws DAOExcepcion {
		super();
		try{
			connManager= new ConnectionManager("alquilervehiculosBD");
		}
		catch (ClassNotFoundException e){
			throw new DAOExcepcion(e);
		}
	}

	public ClienteDTO buscarCliente(String dni) throws DAOExcepcion {
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from CLIENTE where DNI= '"+dni+"'");
			connManager.close();

			if (rs.next())
				return new ClienteDTO(
						rs.getString("DNI"),
						rs.getString("NOMBREYAPELLIDOS"),
						rs.getString("DIRECCION"),
						rs.getString("POBLACION"),
						rs.getString("CODIGOPOSTAL"),
						rs.getDate("FECHACARNETCONDUCIR"),
						rs.getInt("DIGITOSTC"),
						rs.getInt("MESTC"),
						rs.getInt("AÑOTC"),
						rs.getInt("CVCTC"),
						rs.getString("TIPOTC"));
			else return null;
			} catch (SQLException e){ throw new DAOExcepcion(e);}
		}

	// Falta implementar
	public void crearCliente(ClienteDTO cliente) throws DAOExcepcion{

	}
}