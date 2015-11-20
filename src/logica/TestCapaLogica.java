package logica;

/*
import java.util.Date;
import java.util.List;

public class TestCapaLogica {

	public static void main(String[] args){

		AlquilerVehiculos alquiler = AlquilerVehiculos.getInstance();

		Date fechaRec1 = new Date(2016,05,12);
		Date fechaDev1 = new Date(2016,05,15);
		Date fechaCli1 = new Date(1970,02,12);

		Date fechaRec2 = new Date(2016,10,13);
		Date fechaDev2 = new Date(2016,10,21);
		Date fechaCli2 = new Date(1968,07,12);

		Cliente cli1 = new Cliente("11111111A", "Pepito Grillo", "Hispanidad, 13", "Aldaia", 46960,fechaCli1,12345678,7,2017,123,"Visa" );
		Cliente cli2 = new Cliente("22222222B", "David Bisbal", "Valencia, 23", "Massamagrell", 46130,fechaCli2,12348765,10,2024,432,"American Express" );

		Sucursal suc1 = alquiler.consultar_sucursal(1);
	    Sucursal suc2 = alquiler.consultar_sucursal(2);

	    Categoria cat1 = alquiler.consultar_categoria("sedán");
	    Categoria cat2 = alquiler.consultar_categoria("economy");

		Reserva res1 = new Reserva(1,fechaRec1,fechaDev1,1,cli1, cat1 ,suc1,suc2);
		Reserva res2 = new Reserva(2,fechaRec2,fechaDev2,2,cli2,cat2,suc1,suc2);

		alquiler.anyadir_reserva(res1);
		alquiler.anyadir_reserva(res2);
		System.out.println(res2.getId());
		List<Reserva> lista = alquiler.listarReservas();
		for (int i=0; i<lista.size();i++){
			Reserva r = lista.get(i);
			System.out.println(" ID: "+ r.getId() + "\n"+" Recogida: "+ r.getfechaRecogida()+
					 " Devolucion: "+ r.getfechaDevolucion() + " modalidad " + r.getmodalidadAlquiler() + " Cliente " + r.getCliente().getdni());
		}

	}
}
*/
