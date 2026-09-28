
import com.mycompany.mavenproject3.ConsoleSales;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Student
 */


public class RunApplication {
 import java.util.Scanner;   




    public static void main(String[] args) {


Scanner input = new Scanner(System.in);

        System.out.println("Select a console device type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();
        input.nextLine(); // clears the leftover Enter key

        String consoleType;
        if (choice == 1) {
            consoleType = "PS5";
        } else if (choice == 2) {
            consoleType = "XBOX";
        } else if (choice == 3) {
            consoleType = "NINTENDO SWITCH";
        } else {
            consoleType = "Invalid choice";
        }

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales: ");
        int totalSales = input.nextInt();

        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);
        report.printedReport();
    }
}
