package hotelsystem;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        Hotel   hotel = new Hotel();
        
        System.out.println("\n==============================");
        System.out.println("   HOTEL MANAGEMENT - Ex 10   ");
        System.out.println("==============================");
        System.out.println(" 1. Add Standard room");
        System.out.println(" 2. Add Deluxe room");
        System.out.println(" 3. Add Suite");
        System.out.println(" 4. Find available rooms");
        System.out.println(" 5. Book a room");
        System.out.println(" 6. Show all rooms");
        System.out.println(" 7. Cheapest available room");
        System.out.println(" 8. Count available by type");
        System.out.println(" 9. #1  Two Sum — match budget");
        System.out.println("10. #283 Move available to front");
        System.out.println(" 0. Exit");
        System.out.println("------------------------------");

        while (true) {
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("--- Add Standard Room ---");
                    hotel.AddRoom(new StandardRoom());
                    break;

                case "2":
                    System.out.println("--- Add Deluxe Room ---");
                    hotel.AddRoom(new DeluxeRoom());
                    break;

                case "3":
                    System.out.println("--- Add Suite ---");
                    hotel.AddRoom(new Suite());
                    break;

                case "4":
                    hotel.FindAvailable();
                    break;

                case "5": {
                    System.out.print("Room number : ");
                    String num = sc.nextLine().trim();
                    int nights = 0;
                    while (true) {
                        System.out.print("Nights      : ");
                        try {
                            nights = Integer.parseInt(sc.nextLine().trim());
                            if (nights < 1) throw new Exception("Nights must be >= 1.");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid integer.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    hotel.BookRoom(num, nights);
                    break;
                }

                case "6":
                    hotel.Show();
                    break;

                case "7":
                    hotel.FindCheapestAvailable();
                    break;

                case "8":
                    hotel.CountAvailableByType();
                    break;

                case "9": {
                    double budget = 0;
                    while (true) {
                        System.out.print("Budget (combined price): ");
                        try {
                            budget = Double.parseDouble(sc.nextLine().trim());
                            if (budget <= 0) throw new Exception("Budget must be > 0.");
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    hotel.TwoSumBudget(budget);
                    break;
                }

                case "10":
                    hotel.MoveAvailableToFront();
                    break;

                case "0":
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Error: Invalid choice. Enter 0-10.");
            }
        }
    }
}

    