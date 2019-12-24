package com.system_design.model;

import com.system_design.service.CustomerInfoPortal;
import com.system_design.service.EntrancePanel;
import com.system_design.service.ExitPanel;
import com.system_design.service.ParkingDisplayBoard;
import com.system_design.service.ParkingFloor;

public class Admin extends Account {

	public boolean addParkingFloor(ParkingFloor floor) {
		return true;
	}

	public boolean addParkingSpot(String floorName, ParkingSpot spot) {
		return true;
	}

	public boolean addParkingDisplayBoard(String floorName, ParkingDisplayBoard displayBoard) {
		return true;
	}

	public boolean addCustomerInfoPanel(String floorName, CustomerInfoPortal infoPanel) {
		return true;
	}

	public boolean addEntrancePanel(EntrancePanel entrancePanel) {
		return true;
	}

	public boolean addExitPanel(ExitPanel exitPanel) {
		return true;
	}

	@Override
	public boolean resetPassword() {
		// TODO Auto-generated method stub
		return false;
	}

}
