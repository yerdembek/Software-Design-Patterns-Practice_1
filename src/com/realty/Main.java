// src/com/realty/Main.java
package com.realty;

import com.realty.builder.MyApartmentBuilder;
import com.realty.model.Apartment;
import com.realty.model.Director;

public  class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new MyApartmentBuilder());
        Apartment apartment = director.BuildApartment();

        System.out.println(apartment);

    }
}