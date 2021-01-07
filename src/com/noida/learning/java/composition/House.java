package com.noida.learning.java.composition;

public class House {
    Door door;
    Furniture furniture;
    Address address;

    House(Door door, Furniture furniture, Address address) {
        this.door = door;
        this.furniture = furniture;
        this.address = address;
    }
    public void constructHouse(){
        System.out.println("The address is "+address);
        setDoor(door);

    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
