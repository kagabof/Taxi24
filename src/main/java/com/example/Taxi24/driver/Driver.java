package com.example.Taxi24.driver;

import javax.persistence.*;

@Entity
@Table
public class Driver {
    @Id
    @SequenceGenerator(
            name= "driver_sequence",
            sequenceName= "driver_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "driver_sequence"
    )
    private Long id;
    private String diverName;
    private String email;
    private String phoneNumber;
    private double lon;
    private double lat;

    public Driver() {
    }

    public Driver(Long id, String diverName, String email, String phoneNumber, double lon, double lat) {
        this.id = id;
        this.diverName = diverName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lon = lon;
        this.lat = lat;
    }

    public Driver(String diverName, String email, String phoneNumber, double lon, double lat) {
        this.diverName = diverName;
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

    public String getDriverName() {
        return diverName;
    }

    public void setDriverName(String diverName) {
        this.diverName = diverName;
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
        return "Driver{" +
                "id=" + id +
                ", diverName='" + diverName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}

