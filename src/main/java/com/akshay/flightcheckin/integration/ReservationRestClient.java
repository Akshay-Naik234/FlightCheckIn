package com.akshay.flightcheckin.integration;

import com.akshay.flightcheckin.integration.dto.Reservation;
import com.akshay.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservaion(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
