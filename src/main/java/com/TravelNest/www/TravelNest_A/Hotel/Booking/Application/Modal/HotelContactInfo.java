package com.TravelNest.www.TravelNest_A.Hotel.Booking.Application.Modal;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class HotelContactInfo {

    private String address;
    private String contactNumber;
    private String location;
    private String email;
}
