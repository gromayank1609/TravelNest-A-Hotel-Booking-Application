package com.TravelNest.www.TravelNest_A.Hotel.Booking.Application.Modal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "roomType")
@Getter
@Setter
public class Room extends  BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id",nullable = false)
    private Hotel hotel;

    @Column(nullable = false)
    private String roomType;

    @Column(nullable = false,precision = 10,scale = 2)
    private BigDecimal price;

    @Column(columnDefinition = "TEXT")
    private String[] photos;

    @Column(columnDefinition = "TEXT")
    private String[] amenities;

    @Column(nullable = false)
    private Integer totalCount;

    @Column(nullable = false)
    private Integer capacity;
}
