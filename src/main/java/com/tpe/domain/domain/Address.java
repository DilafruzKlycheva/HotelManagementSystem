package com.tpe.domain.domain;

public class Address {
    private String street;
    private String city;
    private String country;
    private int zipcode;

    public Address(String street, String city, String country, int zipcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }
}
