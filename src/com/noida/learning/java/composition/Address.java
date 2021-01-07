package com.noida.learning.java.composition;

public class Address {
    String streetName;
    String pinCode;
    String state;
    String city;

    @Override public String toString() {
        return "Address{" + "streetName='" + streetName + '\'' + ", pinCode='"
                + pinCode + '\'' + ", state='" + state + '\'' + ", city='"
                + city + '\'' + '}';
    }
}
