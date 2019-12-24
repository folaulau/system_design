package com.system_design.model;

import com.system_design.enums.ParkingSpotType;

public abstract class ParkingSpot {
	private String number;
	private boolean free;
	private Vehicle vehicle;
	private final ParkingSpotType type;

	public ParkingSpot(ParkingSpotType type) {
		this.type = type;
	}

	public boolean assignVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		free = false;

		return free;
	}

	public boolean removeVehicle() {
		this.vehicle = null;
		free = true;

		return free;
	}

	public boolean IsFree() {
		return free;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSpotType getType() {
		return type;
	}

}