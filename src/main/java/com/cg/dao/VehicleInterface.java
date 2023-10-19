package com.cg.dao;

import java.util.List;

import com.cg.model.Vehicles;

public interface VehicleInterface {
	
	String addVehicles(Vehicles vehicle);
	List<Vehicles> getAllVehicles();

}
