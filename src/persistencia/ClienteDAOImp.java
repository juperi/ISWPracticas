package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

	public List<ClienteDTO> obtenerClientes() throws DAOExcepcion {
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from CLIENTE");
			connManager.close();

			List<ClienteDTO> listaClienteDTO = new ArrayList<ClienteDTO>();
				try{
					while (rs.next()){
						ClienteDTO cliDTO = new ClienteDTO(
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
						listaClienteDTO.add(cliDTO);
					}
					return listaClienteDTO;
					} catch (Exception e){ throw new DAOExcepcion(e); }
				} catch (SQLException e){
					throw new DAOExcepcion(e);
				} catch (DAOExcepcion e){
					throw e;
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
}