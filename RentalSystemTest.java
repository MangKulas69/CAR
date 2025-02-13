package vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIPAN_CpE121
 */
public class RentalSystemTest {
    public static void main(String[] args) {
        // Create an array of Vehicle objects demonstrating polymorphism
        Vehicle[] vehicles = new Vehicle[3];
        
        vehicles[0] = new Car("Toyota", "Camry", 50.0, 4);
        vehicles[1] = new Truck("Ford", "F-150", 80.0, 2.5);
        vehicles[2] = new Motorcycle("Harley-Davidson", "Street 750", 40.0, true);
        
        int rentalDays = 3;
        // Loop through each vehicle and display its details and rental cost
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("-----------------------------");
        }
    }
}
