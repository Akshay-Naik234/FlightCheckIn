package com.akshay.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akshay.flightcheckin.integration.ReservationRestClient;
import com.akshay.flightcheckin.integration.dto.Reservation;
import com.akshay.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient restClient;

	@RequestMapping("/showstartCheckin")
	public String showStartCheckIn() {
		return "startCheckin";
	}

	@RequestMapping("/startCheckIn")
	public String startCheckIn(@RequestParam("reservationId") Long reservationId, ModelMap model) {
		Reservation reservation = restClient.findReservaion(reservationId);
		model.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}

	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,
			@RequestParam("numberOfBags") int numberOfBags) {
		ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateRequest);
		return "checkInConfirmation";
	}

}
