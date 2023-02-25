package projeler00.map_task;

import java.util.HashMap;
import java.util.Scanner;

public class UserInformation {/*
    private static HashMap<Integer, User> userMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Save user information");
            System.out.println("2. Get user information");
            System.out.println("3. Remove user information");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    saveInfo();
                    break;
                case 2:
                    getInfo();
                    break;
                case 3:
                    removeInfo();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private static void saveInfo() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter ID (4 digits): ");
            int id = sc.nextInt();
            if (id < 1000 || id > 9999) {
                System.out.println("Invalid ID.");
                continue;
            }
            if (userMap.containsKey(id)) {
                System.out.println("ID already exists.");
                continue;
            }
            sc.nextLine();
            System.out.print("Enter firstName: ");
            String firstName = sc.nextLine();
            System.out.print("Enter lastName: ");
            String lastName = sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            System.out.print("Enter phone number: ");
            String phone = sc.nextLine();
            User user = new User(id, firstName, lastName, address, phone);
            userMap.put(id, user);
            System.out.println("User information saved successfully.");
            System.out.print("Do you want to enter more information? (y/n) ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private static void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID (4 digits): ");
        int id = sc.nextInt();
        if (!userMap.containsKey(id)) {
            System.out.println("User not found.");
            return;
        }
        User user = userMap.get(id);
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.firstName());
        System.out.println("Name: " + user.lastName());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone: " + user.getPhone());
    }

    private static void removeInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID (4 digits): ");
        int id = sc.nextInt();
        if (!userMap.containsKey(id)) {
            System.out.println("User not found.");
            return;
        }
        userMap.remove(id);
        System.out.println("User information removed successfully.");
    }

}*/
}
