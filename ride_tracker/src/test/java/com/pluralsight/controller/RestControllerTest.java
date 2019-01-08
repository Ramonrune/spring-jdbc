package com.pluralsight.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pluralsight.model.Ride;

import org.junit.Test;

public class RestControllerTest {
	/*
	@Test()
	public void testGetRides() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Ride>> ridesResponse = restTemplate.exchange(
				"http://localhost:8080/ride_tracker/rides", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Ride>>() {
				});
		List<Ride> rides = ridesResponse.getBody();

		for (Ride ride : rides) {
			System.out.println("Ride name: " + ride.getName());
		}
	}*/
	 /*
	@Test
	public void testGetRide() {
		RestTemplate restTemplate = new RestTemplate();
		
		Ride ride = restTemplate.getForObject("http://localhost:8080/ride_tracker/ride/19", Ride.class);
		
		System.out.println(ride.getName());
	}*/
	
	/*@Test
	public void testUpdateRide() {
		RestTemplate restTemplate = new RestTemplate();
	
		Ride ride = restTemplate.getForObject("http://localhost:8080/ride_tracker/ride/19", Ride.class);
		ride.setDuration(ride.getDuration() + 1);
		
		restTemplate.put("http://localhost:8080/ride_tracker/ride", ride);
		
		System.out.println("Duration: " + ride.getDuration());
		
	}*/
	
	@Test
	public void testBatchUpdate() {
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.getForObject("http://localhost:8080/ride_tracker/batch", Object.class);
		
	}
	
	/*
	@Test()
	public void testCreateRide() {
		RestTemplate restTemplate = new RestTemplate();

		
		Ride ride = new Ride();
		ride.setName("Passeio até americana");
		ride.setDuration(15);
		
		Ride rideResult = restTemplate.postForObject("http://localhost:8080/ride_tracker/ride", ride, Ride.class);
		
		System.out.println("Created:" + rideResult.getName() + " -- " + rideResult.getId());
	
	}*/
	

	
}
