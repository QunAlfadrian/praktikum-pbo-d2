package org.vehicle;

public class Bus extends Vehicle {
    void calRent(int distance, float price) {
        float fare = distance*price;
        System.out.println("vehicle price " + fare);
    }
}
