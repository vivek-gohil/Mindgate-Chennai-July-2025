package com.mindgate.main.domain;

public class Address {
	private int addressId;
	private String block;
	private String steet;
	private String city;
	private String state;

	private Address() {
		// TODO Auto-generated constructor stub
	}

	public static Address getAddress() {
		return new Address();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getSteet() {
		return steet;
	}

	public void setSteet(String steet) {
		this.steet = steet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", block=" + block + ", steet=" + steet + ", city=" + city
				+ ", state=" + state + "]";
	}

}
