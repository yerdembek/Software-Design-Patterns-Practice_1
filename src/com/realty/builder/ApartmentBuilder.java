// src/com/realty/builder/ApartmentBuilder.java
package com.realty.builder;

import com.realty.model.Apartment;

public abstract class ApartmentBuilder{
    protected Apartment apartment;
    public void createApartment(){ apartment = new Apartment(); }

    public abstract void buildAddress();
    public abstract void buildArea();
    public abstract void buildRooms();
    public abstract void buildFloor();
    public abstract void buildPrice();

    public Apartment getApartment() {return apartment;}

//    private String address = "not found";
//    private double area = 0.0;
//    private int rooms = 1;
//    private int floor = 1;
//    private double price = 0.0;

//    public ApartmentBuilder buildAddress(String address){
//        this.address = address;
//        return this;
//    }
//    public ApartmentBuilder buildArea(double area){
//        this.area = area;
//        return this;
//    }
//    public ApartmentBuilder buildRooms(int rooms){
//        this.rooms = rooms;
//        return this;
//    }
//    public ApartmentBuilder buildFloor(int floor){
//        this.floor = floor;
//        return this;
//    }
//    public ApartmentBuilder buildPrice(double price){
//        this.price = price;
//        return this;
//    }

//    public Apartment build(){
//        Apartment apartment = new Apartment();
//        apartment.setAddress(address);
//        apartment.setArea(area);
//        apartment.setRooms(rooms);
//        apartment.setFloor(floor);
//        apartment.setPrice(price);
//        return apartment;
//    }
}