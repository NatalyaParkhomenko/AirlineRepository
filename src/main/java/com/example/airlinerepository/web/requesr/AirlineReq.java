package com.example.airlinerepository.web.requesr;

import com.example.airlinerepository.enums.Country;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class AirlineReq {
    @NotNull
    @NotBlank(message = "can not be empty")
    private String name;
    @Size(min = 2, max = 2)
    private String iata;
    private LocalDate foundationDate;
    private String ceoEmail;
    @Min(0)
    @Max(10000)
    private int fleet;
    private Country country;

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

