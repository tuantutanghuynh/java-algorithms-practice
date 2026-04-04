package vehiclemanager;

import java.util.Scanner;

/**
 * Abstract base class representing a generic vehicle.
 * Provides common fields and input/display behavior for all vehicle types.
 *
 * <p>FR: Classe de base représentant un véhicule générique.
 * Fournit les champs communs et le comportement de saisie/affichage.</p>
 *
 * @author tangh
 * @version 1.0
 */
public class Vehicle {
    String brand;
    double speed;
    String fuelType;

    /**
     * Reads common vehicle data from standard input.
     * FR: Saisit les données communes du véhicule depuis l'entrée standard.
     */
    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Brand: ");
        brand = sc.nextLine();

        System.out.println("Input Max Speed: ");
        speed = sc.nextDouble();
        sc.nextLine();

        System.out.println("Input Fuel Type: ");
        fuelType = sc.nextLine();
    }

    /**
     * Displays vehicle information. Overridden in subclasses.
     * FR: Affiche les informations du véhicule. Redéfinie dans les sous-classes.
     */
    public void ShowInfo() {
    }
}
