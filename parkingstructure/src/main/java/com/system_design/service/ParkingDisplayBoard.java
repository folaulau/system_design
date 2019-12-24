package com.system_design.service;

import com.system_design.model.CompactSpot;
import com.system_design.model.ElectricSpot;
import com.system_design.model.HandicappedSpot;
import com.system_design.model.LargeSpot;
import com.system_design.model.MotorbikeSpot;
import com.system_design.model.ParkingSpot;

public class ParkingDisplayBoard {

	private String id;
	private HandicappedSpot handicappedFreeSpot;
	private CompactSpot compactFreeSpot;
	private LargeSpot largeFreeSpot;
	private MotorbikeSpot motorbikeFreeSpot;
	private ElectricSpot electricFreeSpot;

	public void showEmptySpotNumber() {
		String message = "";
		if (handicappedFreeSpot.IsFree()) {
			message += "Free Handicapped: " + handicappedFreeSpot.getNumber();
		} else {
			message += "Handicapped is full";
		}
		message += System.lineSeparator();

		if (compactFreeSpot.IsFree()) {
			message += "Free Compact: " + compactFreeSpot.getNumber();
		} else {
			message += "Compact is full";
		}
		message += System.lineSeparator();

		if (largeFreeSpot.IsFree()) {
			message += "Free Large: " + largeFreeSpot.getNumber();
		} else {
			message += "Large is full";
		}
		message += System.lineSeparator();

		if (motorbikeFreeSpot.IsFree()) {
			message += "Free Motorbike: " + motorbikeFreeSpot.getNumber();
		} else {
			message += "Motorbike is full";
		}
		message += System.lineSeparator();

		if (electricFreeSpot.IsFree()) {
			message += "Free Electric: " + electricFreeSpot.getNumber();
		} else {
			message += "Electric is full";
		}

		System.out.println(message);
	}

	public ParkingSpot getHandicappedFreeSpot() {
		// TODO Auto-generated method stub
		return this.handicappedFreeSpot;
	}

	public void setHandicappedFreeSpot(HandicappedSpot handicappedSpot) {
		this.handicappedFreeSpot = handicappedSpot;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CompactSpot getCompactFreeSpot() {
		return compactFreeSpot;
	}

	public void setCompactFreeSpot(CompactSpot compactFreeSpot) {
		this.compactFreeSpot = compactFreeSpot;
	}

	public LargeSpot getLargeFreeSpot() {
		return largeFreeSpot;
	}

	public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
		this.largeFreeSpot = largeFreeSpot;
	}

	public MotorbikeSpot getMotorbikeFreeSpot() {
		return motorbikeFreeSpot;
	}

	public void setMotorbikeFreeSpot(MotorbikeSpot motorbikeFreeSpot) {
		this.motorbikeFreeSpot = motorbikeFreeSpot;
	}

	public ElectricSpot getElectricFreeSpot() {
		return electricFreeSpot;
	}

	public void setElectricFreeSpot(ElectricSpot electricFreeSpot) {
		this.electricFreeSpot = electricFreeSpot;
	}

}