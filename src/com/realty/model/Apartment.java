package com.realty.model;

public class Apartment {
    private String address;
    private double area;
    private int rooms;
    private int floor;
    private double price;

    public void  setAddress(String address) {
        this.address = address;
    }
    public void  setArea(double area) {
        this.area = area;
    }
    public void  setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void  setFloor(int floor) {
        this.floor = floor;
    }
    public void  setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Your Apartment in address: " + address + "\nArea of apartment is: " + area + "\nCount of rooms: " + rooms + "\nFloor: " + floor + "\nPrice: " + price;
    }
}