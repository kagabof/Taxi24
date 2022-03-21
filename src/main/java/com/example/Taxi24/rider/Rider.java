package com.example.Taxi24.rider;

import javax.persistence.*;

@Entity
@Table
public class Rider {
    @Id
    @SequenceGenerator(
            name= "rider_sequence",
            sequenceName= "rider_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rider_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private double lon;
    private double lat;

    public Rider() {
    }

    public Rider(Long id, String name, String email, String phoneNumber, double lon, double lat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lon = lon;
        this.lat = lat;
    }

    public Rider(String name, String email, String phoneNumber, double lon, double lat) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lon = lon;
        this.lat = lat;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
