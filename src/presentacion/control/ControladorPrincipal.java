package presentacion.control;

import java.awt.event.ActionEvent;

import excepciones.LogicaExcepcion;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ControladorPrincipal{

	private static final String CREAR_CLIENTE = "../vista/crear-cliente.fxml";
	private static final String LISTAR_RESERVAS_SUCURSAL = "../vista/listar-reservas-sucursal.fxml";

	//TODO añadir constantes de tipo String para la vistas correspondientes a los casos de
	//uso Crear Reserva y Listar Reservas de una Sucursal
	private Stage primaryStage;

	@FXML
	void listarSucursales(ActionEvent event) throws LogicaExcepcion {
		initCasoDeUso(LISTAR_SUCURSALES, ControladorListarSucursales.class).show();
	}

	@FXML
	void crearReserva(ActionEvent event) {
		// TODO implementar el manejador del C.U. Crear Reserva
	}

	@FXML
	void listarReservasSucursal(ActionEvent event) throws LogicaExcepcion {
		//TODO implementar el manejador del C.U. Listar reservas de una sucursal
	}

	@FXML void salir(ActionEvent event) {
		Platform.exit();
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	private <T extends ControladorCasoDeUso> T initCasoDeUso(String urlVista, Class<T> controlClass) {
		return ControladorCasoDeUso.initCasoDeUso(urlVista, controlClass,
													primaryStage, ControladorPrincipal.this);
	}

}
