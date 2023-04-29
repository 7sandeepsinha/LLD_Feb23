package com.scaler.BMSApr23.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends BaseModel {
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeats;
    @OneToMany
    private List<Ticket> tickets;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> showFeatures;

    //showType add if required
}

/*
    Show : Movie -> M:1
    Show : Auditorium -> M:1
    Show : ShowSeats -> 1:M
    Show : Ticket -> 1:M
    Show : Features -> M:M
 */