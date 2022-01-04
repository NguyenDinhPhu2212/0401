package controller;

import entity.Bike;
import entity.RentalDeal;

public class RentBikeController extends BaseController {
	public boolean requestToRentBike(Bike bike) {
		return bike.checkBikeAvaibility();
	}
	
	public void confirmRentBike() {
		
	}
	
	public int calculateDeposit(Bike bike) {
		return bike.getDeposit(); 
	}
	
	public RentalDeal createRentalDeal(Bike bike) {
		return new RentalDeal(bike);
	}

}
