package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import persistencia.dto.ReservaDTO;
import excepciones.DAOExcepcion;


public class ReservaDAOImp implements IReservaDAO{
	protected ConnectionManager connManager;

	public ReservaDAOImp() throws DAOExcepcion {
		super();
		try{
			connManager= new ConnectionManager("alquilervehiculosBD");
		}
		catch (ClassNotFoundException e){
			throw new DAOExcepcion(e);
		}
	}

	public List<ReservaDTO> obtenerReservas() throws DAOExcepcion {
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from RESERVA");
			connManager.close();

			List<ReservaDTO> listaReservaDTO = new ArrayList<ReservaDTO>();
				try{
					while (rs.next()){
						ReservaDTO resDTO = new ReservaDTO(
						rs.getInt("ID"),
						rs.getDate("FECHARECOGIDA"),
						rs.getDate("FECHADEVOLUCION"),
						rs.getInt("MODALIDADALQUILER"),
						rs.getString("DNICLIENTE"),
						rs.getString("NOMBRECATEGORIA"),
						rs.getInt("IDSUCURSALRECOGIDA"),
						rs.getInt("IDSUCURSALDEVOLUCION"));
						listaReservaDTO.add(resDTO);
					}
					return listaReservaDTO;
					} catch (Exception e){ throw new DAOExcepcion(e); }
				} catch (SQLException e){
					throw new DAOExcepcion(e);
				} catch (DAOExcepcion e){
					throw e;
				}
	}

	public ReservaDTO buscarReserva(int id) throws DAOExcepcion {
		try{
			connManager.connect();
			ResultSet rs=connManager.queryDB("select * from RESERVA where ID= '"+id+"'");
			connManager.close();

			if (rs.next())
				return new ReservaDTO(
						rs.getInt("ID"),
						rs.getDate("FECHARECOGIDA"),
						rs.getDate("FECHADEVOLUCION"),
						rs.getInt("MODALIDADALQUILER"),
						rs.getString("DNICLIENTE"),
						rs.getString("NOMBRECATEGORIA"),
						rs.getInt("IDSUCURSALRECOGIDA"),
						rs.getInt("IDSUCURSALDEVOLUCION"));
			else return null;
			} catch (SQLException e){ throw new DAOExcepcion(e);}
		}
}
