package entity;

import java.util.ArrayList;
import java.util.List;

public class Station {
	private int id;
	private String name;
	private String location;
//	private String image;
	private int bikeQuantity;
	private int eBikeQuantity;
	private int twinBikeQuantity;
	private int emptySlot;
	private List<Bike> listBikes = new ArrayList<>();
	
	public Station() {
		
	}
	
	public Station(int id, String name, String location, 
//			String image, 
			int bikeQuantity, int eBikeQuantity,
			int twinBikeQuantity, int emptySlot,  List<Bike> listBikes) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
//		this.image = image;
		this.bikeQuantity = bikeQuantity;
		this.eBikeQuantity = eBikeQuantity;
		this.twinBikeQuantity = twinBikeQuantity;
		this.listBikes = listBikes;
		this.emptySlot = emptySlot;
	}
	//gettter & setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
//	public String getImage() {
//		return image;
//	}
//	public void setImage(String image) {
//		this.image = image;
//	}
	public List<Bike> getListBikes() {
		return listBikes;
	}
	public void setListBikes(List<Bike> listBikes) {
		this.listBikes = listBikes;
	}
	public int getBikeQuantity() {
		return bikeQuantity;
	}
	public void setBikeQuantity(int bikeQuantity) {
		this.bikeQuantity = bikeQuantity;
	}
	public int geteBikeQuantity() {
		return eBikeQuantity;
	}
	public void seteBikeQuantity(int eBikeQuantity) {
		this.eBikeQuantity = eBikeQuantity;
	}
	public int getTwinBikeQuantity() {
		return twinBikeQuantity;
	}
	public void setTwinBikeQuantity(int twinBikeQuantity) {
		this.twinBikeQuantity = twinBikeQuantity;
	}

	public int getEmptySlot() {
		return emptySlot;
	}

	public void setEmptySlot(int emptySlot) {
		this.emptySlot = emptySlot;
	}
	
	

}
