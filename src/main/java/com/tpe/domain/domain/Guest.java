package com.tpe.domain.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Guest {
    private Long id;
    private String name;
    private LocalDateTime createDate;
    private List<Reservation> reservations=new ArrayList<>();

    private Address address;

    //getter setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Address getAddress() {
        return address;
    }




    public void setAddress(Address address) {
        this.address = address;

        //toString

    }
    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", reservations=" + reservations +
                ", address=" + address +
                '}';
    }
}
