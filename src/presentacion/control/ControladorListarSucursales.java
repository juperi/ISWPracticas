package presentacion.control;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.StageStyle;

import logica.AlquilerVehiculos;
import logica.Sucursal;


public class ControladorListarSucursales extends ControladorCasoDeUso{

	@FXML
	private TableView<Sucursal> sucursales;

	@FXML
	private TableColumn<Sucursal, Integer> id;

	@FXML
	private TableColumn<Sucursal, String> direccion;

	@FXML
	private Button aceptar;

	@Override
	public void initialize(URL location, ResourceBundle resources){
		stage = new Stage(StageStyle.DECORATED);
		stage.setTitle("LISTADO DE SUCURSALES");
		aceptar.setOnAction(event -> dialog.close());
		id.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getId()));
		direccion.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getDireccion()));
		this.sucursales.getItems().addAll(AlquilerVehiculos.dameAlquilerVehiculos().listarSucursales());
	}

}
