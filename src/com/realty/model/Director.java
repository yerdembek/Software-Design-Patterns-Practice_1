package com.realty.model;

import com.realty.builder.ApartmentBuilder;

public class Director {
    ApartmentBuilder  builder;
    public void setBuilder(ApartmentBuilder builder){
        this.builder = builder;
    }

    public Apartment BuildApartment(){
        builder.createApartment();
        builder.buildAddress();
        builder.buildArea();
        builder.buildRooms();
        builder.buildFloor();
        builder.buildPrice();
        Apartment apartment = builder.getApartment();
        return apartment;
    }
}
