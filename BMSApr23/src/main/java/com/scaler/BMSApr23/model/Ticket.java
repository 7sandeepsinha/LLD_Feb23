package com.scaler.BMSApr23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel{
    private double totalAmount;
    private Date timeOfBooking;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private User bookedBy;
    @OneToOne
    private Payment payment;

    // add ticket status -> if we want to give option for ticket cancellations

}
