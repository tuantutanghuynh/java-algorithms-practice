package hotelsystem;

import java.util.ArrayList;

public class Hotel {

    // ArrayList<Room>: size grows automatically — no separate count variable needed.
    ArrayList<Room> rooms = new ArrayList<>();

    // -------- Add rooms --------

    public void AddRoom(Room r) {
        r.Input();
        rooms.add(r);
        System.out.println("Room added: " + r.roomNumber);
    }

    // -------- Display --------

    // Polymorphism: PrintInfo() dispatches to the correct subclass at runtime.
    public void Show() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms in the system.");
            return;
        }
        System.out.println("=== HOTEL ROOMS (" + rooms.size() + ") ===");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.print((i + 1) + ". ");
            rooms.get(i).PrintInfo();
            System.out.println();
        }
    }

    // Show only rooms that have not been booked yet.
    public void FindAvailable() {
        System.out.println("--- Available rooms ---");
        boolean found = false;
        for (Room r : rooms) {
            if (r.IsAvailable()) {
                r.PrintInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) System.out.println("No available rooms.");
    }

    // -------- Book --------

    // try-catch: guards against invalid nights input.
    public void BookRoom(String num, int nights) {
        try {
            if (nights <= 0) {
                throw new IllegalArgumentException("Nights must be > 0, got: " + nights);
            }

            for (Room r : rooms) {
                if (r.roomNumber.equals(num)) {
                    if (!r.isAvailable) {
                        System.out.println("Room " + num + " is already booked.");
                        return;
                    }
                    r.isAvailable = false;
                    double cost = r.CalcCost(nights); // polymorphic: each type uses its own multiplier
                    System.out.println("Booked room " + num + " for " + nights + " night(s).");
                    System.out.printf("Total cost: %.0f VND%n", cost);
                    return;
                }
            }
            System.out.println("Room not found: " + num);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // -------- Algorithm: Level 2 --------

    // Find the cheapest room that is still available.
    // Technique: filter by boolean condition while tracking running minimum.
    public void FindCheapestAvailable() {
        Room   cheapest = null;
        double minPrice = Double.MAX_VALUE; // start above any real price so first candidate always wins

        for (Room r : rooms) {
            if (r.IsAvailable() && r.pricePerNight < minPrice) {
                minPrice = r.pricePerNight;
                cheapest = r;
            }
        }

        if (cheapest == null) {
            System.out.println("No available rooms.");
        } else {
            System.out.println("Cheapest available room:");
            cheapest.PrintInfo();
        }
    }

    // Count available rooms by concrete type (Standard / Deluxe / Suite).
    // Technique: instanceof identifies the runtime type of each element.
    public void CountAvailableByType() {
        int standard = 0, deluxe = 0, suite = 0;

        for (Room r : rooms) {
            if (r.IsAvailable()) {
                if      (r instanceof StandardRoom) standard++;
                else if (r instanceof DeluxeRoom)   deluxe++;
                else if (r instanceof Suite)        suite++;
            }
        }

        System.out.println("Available rooms by type:");
        System.out.println("  Standard : " + standard);
        System.out.println("  Deluxe   : " + deluxe);
        System.out.println("  Suite    : " + suite);
    }

    // -------- LeetCode #1 - Two Sum --------

    // Find the first pair of rooms whose combined pricePerNight equals the budget.
    // Algorithm: Nested Loop O(n^2) — compare every pair (i, j) where j > i.
    public void TwoSumBudget(double budget) {
        for (int i = 0; i < rooms.size() - 1; i++) {
            for (int j = i + 1; j < rooms.size(); j++) {
                double combined = rooms.get(i).pricePerNight + rooms.get(j).pricePerNight;
                if (Math.abs(combined - budget) < 0.01) { // tolerance: double equality is unreliable
                    System.out.println("Rooms matching budget " + budget + ":");
                    System.out.print("  "); rooms.get(i).PrintInfo();
                    System.out.print("  "); rooms.get(j).PrintInfo();
                    return;
                }
            }
        }
        System.out.println("No pair of rooms matches budget: " + budget);
    }

    // -------- LeetCode #283 - Move Zeroes (variant) --------

    // Move all available rooms to the front; booked rooms to the back.
    // Algorithm: Single-pass partition using insertPos pointer — O(n), in-place.
    public void MoveAvailableToFront() {
        int insertPos = 0;

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).IsAvailable()) {
                Room temp = rooms.get(insertPos);
                rooms.set(insertPos, rooms.get(i));
                rooms.set(i, temp);
                insertPos++;
            }
        }

        System.out.println("Reordered: available rooms moved to front.");
        Show();
    }
}
