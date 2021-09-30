package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("newBooking")
public class FlightNewController {
	@PostMapping("/api/v1.0/flight/airline/register")
	String newAirlineBooking(@RequestBody FlightNewSupport userDetails) {
		System.out.println("Booking Details...");
		System.out.println("Name : " + userDetails.getName());
		System.out.println("Email: " + userDetails.getEmailId());
		System.out.println("NoOfSeats : " + userDetails.getNoOfSeats());
		System.out.println("Details (Name): " + userDetails.getDetails().getName());
		System.out.println("Details (Age): " + userDetails.getDetails().getAge());
		System.out.println("Details (Gender): " + userDetails.getDetails().getGender());
		System.out.println("Meal type : " + userDetails.getMeal());
		System.out.println("Seat no.: " + userDetails.getSeatNo());
		
		return "Booking details displayed";
		
	}
	

}
