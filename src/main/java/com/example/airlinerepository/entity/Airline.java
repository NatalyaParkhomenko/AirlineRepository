package com.example.airlinerepository.entity;

import com.example.airlinerepository.enums.Country;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
@Table(name = "airlinenew")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "IATA")
    private String iata;
    @Column(name = "FOUNDATION_DATE")
    private LocalDate foundationDate;
    @Column(name = "CEO_EMAIL")
    private String ceoEmail;
    @Column(name = "FLEET")
    private int fleet;
    @Enumerated(EnumType.STRING)
    @Column(name = "COUNTRY")
    private Country country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getCeoEmail() {
        return ceoEmail;
    }

    public void setCeoEmail(String ceoEmail) {
        this.ceoEmail = ceoEmail;
    }

    public int getFleet() {
        return fleet;
    }

    public void setFleet(int fleet) {
        this.fleet = fleet;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}

