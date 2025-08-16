package com.TravelNest.www.TravelNest_A.Hotel.Booking.Application.Modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "hotels")
@Getter
@Setter
public class Hotel extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(columnDefinition = "TEXT")
    private String[] photos;

    @Column(columnDefinition = "TEXT")
    private String[] amenities;

    @Column(nullable = false)
    private Boolean active;

    @Embedded
    private HotelContactInfo hotelContactInfo;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    List<Room> rooms;


}
