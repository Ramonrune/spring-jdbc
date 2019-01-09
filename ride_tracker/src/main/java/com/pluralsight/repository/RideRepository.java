package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Ride;

public interface RideRepository {

	Ride updateRide(Ride ride);
	
	Ride getRide(int id);

	List<Ride> getRides();

	Ride createRide(Ride ride);

	void updateRides(List<Object[]> pairs);

	Object deleteRide(int id);

}