package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Ride;

public interface RideService {

	Ride updateRide(Ride ride);
	
	Ride getRide(int id);
	
	List<Ride> getRides();

	Ride createRide(Ride ride);

	void batch();

	Object deleteRide(int id);

}