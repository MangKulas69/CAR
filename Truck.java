package vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIPAN_CpE121
 */
public class Truck extends Vehicle {
    private double payloadCapacity;
    
    // Constructor override: calls super constructor and initializes payloadCapacity
    public Truck(String make, String model, double rentalPrice, double payloadCapacity) {
        super(make, model, rentalPrice);
        this.payloadCapacity = payloadCapacity;
    }
    
    // Method override: extend displayDetails to include payloadCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}
