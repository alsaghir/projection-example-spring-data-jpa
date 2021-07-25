package com.github.alsaghir.projection.entity;

import lombok.Data;

@Data
public class LastNameOnly {

    private String lastName;
    private StreetOnly address;
    private String street;

    public LastNameOnly(String lastName, String street) {
        this.lastName = lastName;
        this.address = new StreetOnly(street);
        this.street = street;
    }
}
