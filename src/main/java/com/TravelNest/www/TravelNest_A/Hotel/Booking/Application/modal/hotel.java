package com.TravelNest.www.TravelNest_A.Hotel.Booking.Application.modal;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "hotels")
@Getter
@Setter
public class hotel extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private hotelContactInfo hotelContactInfo;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    List<room> rooms;


}
