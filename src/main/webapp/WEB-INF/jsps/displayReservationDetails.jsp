<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reservation Details</title>
</head>
<body>
    <h2>Flight Details</h2>

    Airlines : ${reservation.flight.operatingAirlines}<br>
    Flight No : ${reservation.flight.flightNumber}<br>
    Departure City : ${reservation.flight.departureCity}<br>
    Arrival City : ${reservation.flight.arrivalCity}<br>
    Date of Departure : ${reservation.flight.dateOfDeparture}<br>
    Estimated Departure Time : ${reservation.flight.estimatedDepartureTime}
<br>
    <h2>Passenger Details</h2><br>
    First Name : ${reservation.passenger.firstName}<br>
    Last Name : ${reservation.passenger.lastName}<br>
    Email : ${reservation.passenger.email}<br>
    Phone : ${reservation.passenger.phone}<br>
    <form action="completeCheckIn" method="post">
        Enter the Number of Bags You want to check in : <input type="text" name="numberOfBags"/><br>
        <input type="hidden" value="${reservation.id}" name="reservationId"/><br>
        <input type="submit" value="Check In"/><br>
    </form>
</body>
</html>