package com.Biditvats.domain;

public class Address {
	private Long id;
	private String houseNo;
	private String street;
	private String city;
	private String landmark;
	private String state;
	private Long zipcode;
	
	public Address() {
		//Do Nothing
	}

	public Address(String houseNo, String street, String city, String landmark, String state, Long zipcode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address ID: "+id
				+"\nHouse No: "+houseNo
				+"\nStreet: "+street
				+"\nCity: "+city
				+"\nLandmark: "+landmark
				+"\nState: "+state
				+"\nZipcode: "+zipcode;
}
}
