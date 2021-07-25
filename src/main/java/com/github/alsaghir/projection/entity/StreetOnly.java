package com.github.alsaghir.projection.entity;

import lombok.Data;

@Data
public class StreetOnly {

    private String street;

    StreetOnly(String street) {
        this.street = street;
    }
}
