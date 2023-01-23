package replitquestions;

import java.util.Scanner;

public class DaysInMonth {
    /*
    This program uses the Scanner class to read in the month number and year from the user.
    It then uses a switch statement to determine the number of days in the month based on the month number.
    It also checks if the entered year is a leap year or not to decide the number of days in february.
    Finally, it prints the name of the month, year and number of days in that month.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month number:");
        int month = sc.nextInt();
        System.out.println("Input a year:");
        int year = sc.nextInt();
        sc.close();
        int days = 0;
        String monthName = "";
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch(month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                if(isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Invalid month number. Please try again.");
                return;
        }
        System.out.println(monthName + " " + year + " has " + days + " days");
    }
}
