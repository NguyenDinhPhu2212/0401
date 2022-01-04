package views.screen;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

import controller.PaymentController;
import controller.RentBikeController;
import entity.Bike;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import utils.Configs;
import utils.Utils;
import views.screen.BaseScreenHandler;
import views.screen.PaymentScreenHandler;


public class RentalBikeHandler extends BaseScreenHandler {
	
	private static Logger LOGGER = Utils.getLogger(RentalBikeHandler.class.getName());
	
	@FXML
	private ImageView ecobikeImageLogo;
	
	@FXML
	private Label pageTitle;
	
	@FXML
	GridPane gridPaneBikeInfo;
	
	@FXML
	private Label bikeCode;
	
	@FXML
	private Label bikeName;
	
	@FXML
	private Label bikeType;
	
	@FXML
	private Label bikeLicensePlate;
	
	@FXML
	private Label location;
	
	@FXML
	private Label cost;
	
	@FXML
	private Label deposit;
	
	@FXML
	private Button btnRentBike;
	
	@FXML
	private Button btnReturn;
	
	
	public RentalBikeHandler(Stage stage, String screenPath, Bike bike) throws IOException {
		super(stage, screenPath);
		
		//add image logo
		File file = new File("assets/images/Logo.png");
		Image image = new Image(file.toURI().toString());
		ecobikeImageLogo.setImage(image);
		
		//add bike information 
		setRentalBikeInfo(bike);
		
		//add event to return home screen
		ecobikeImageLogo.setOnMouseClicked(e -> {
			homeScreenHandler.show();
		});
		
		btnRentBike.setOnMouseClicked(e -> {
			LOGGER.info("Rent Bike button clicked");
			try {
				requestToPayment();
			} catch (SQLException | IOException e1) {
				e1.printStackTrace();
			}
		});
		
		btnReturn.setOnMouseClicked(e -> {
			LOGGER.info("Return button button clicked");
			try {
				requestToPayment();
			} catch (SQLException | IOException e1) {
				e1.printStackTrace();
			}
		});
		
		
	}
	
	public void setRentalBikeInfo(Bike bike) {
		bikeName.setText(bike.getName());
		bikeCode.setText(bike.getBikeCode());
		bikeType.setText(bike.getTypeOfBikeName());
		bikeLicensePlate.setText(bike.getLicencePlate());
		location.setText(bike.getStationName());
		cost.setText(bike.getRetalDescription());
		deposit.setText(String.valueOf((bike.getDeposit())+ 'D'));
	}
	
//	public void requestToRentBike(BaseScreenHandler prevScreen) {
//		setPreviousScreen(prevScreen);
//		setScreenTitle("RENTAL BIKE");
//		displayRentBikeInfo();
//		show();
//	}
	
	public void requestToPayment() throws SQLException, IOException {
		try {
			//display payment screen
			BaseScreenHandler paymentScreen = new PaymentScreenHandler(stage, Configs.PAYMENT_SCREEN_PATH, null);
			paymentScreen.setBController(new PaymentController());
			paymentScreen.setPreviousScreen(this);
			paymentScreen.setHomeScreenHandler(homeScreenHandler);
			paymentScreen.setScreenTitle("THANH TOÁN");
			paymentScreen.show();
			RentBikeController rentBikeController = new RentBikeController();
			LOGGER.info("Chuyen sang thanh toan");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void displayRentBikeInfo() {
		
	}
}
