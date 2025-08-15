package com.TravelNest.www.TravelNest_A.Hotel.Booking.Application.modal;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class hotelContactInfo {

    private String address;
    private String contactNumber;
    private String location;
    private String email;
}
