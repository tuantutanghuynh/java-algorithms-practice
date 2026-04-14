package hotelsystem;

import java.util.Scanner;

public class Suite extends Room {

    int numRooms; // number of separate rooms within this suite (living area + bedrooms)

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();

        while (true) {
            System.out.print("  Number of rooms in suite: ");
            try {
                numRooms = Integer.parseInt(sc.nextLine().trim());
                if (numRooms <= 0) throw new IllegalArgumentException("Number of rooms must be > 0.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("  Error: Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println("  Error: " + e.getMessage());
            }
        }
    }

    @Override
    public void PrintInfo() {
        System.out.println("[SUITE]");
        super.PrintInfo();
        System.out.println("  Rooms in suite: " + numRooms);
    }

    @Override
    public String GetRoomType() {
        return "Suite";
    }

    // Override: Suites are priced at 2x the base rate per night.
    @Override
    public double CalcCost(int nights) {
        return pricePerNight * nights * 2.0;
    }
}
