package vehiclemanager;

import java.util.Scanner;

/**
 * Represents a car, extending {@link Vehicle} with number of seats.
 * FR: Représente une voiture, étendant {@link Vehicle} avec le nombre de sièges.
 *
 * @author tangh
 * @version 1.0
 */
public class Car extends Vehicle {
    int numSeats;

    /**
     * Reads car-specific data after collecting base vehicle fields.
     * FR: Saisit les données spécifiques à la voiture après les champs de base.
     */
    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number of Seats: ");
        numSeats = sc.nextInt();
        sc.nextLine();
    }

    /**
     * Displays full car profile including number of seats.
     * FR: Affiche le profil complet de la voiture, y compris le nombre de sièges.
     */
    @Override
    public void ShowInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Fuel type: " + fuelType + ", Seats: " + numSeats);
    }
}
