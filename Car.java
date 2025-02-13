package vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIPAN_CpE121
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    
    // Constructor override: calls super constructor and initializes numberOfDoors
    public Car(String make, String model, double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }
    
    // Method override: extend displayDetails to include numberOfDoors
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call Vehicle's displayDetails
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
