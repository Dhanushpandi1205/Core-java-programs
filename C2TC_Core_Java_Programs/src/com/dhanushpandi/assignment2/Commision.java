package com.dhanushpandi.assignment2;
import java.util.Scanner;

class Commission {
    
    String name, address;
    String phone;
    double salesAmount;
    
    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    void calculateCommission() {
        double commission = 0;
        
        if (salesAmount >= 100000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 50000) {
            commission = 0.05 * salesAmount;
        } else if (salesAmount >= 30000) {
            commission = 0.03 * salesAmount;
        } else {
            commission = 0;
        }

        System.out.println("Commission for " + name + " is ₹" + commission);
    }
}
