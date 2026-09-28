/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Student
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


    public static void main(String[] args) {

        // Single arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        int[] cityTotals = new int[3];

        // Two-dimensional array (rows = cities, columns = PS5, XBOX, SWITCH)
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Work out the total for each city
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cityTotals[i] = cityTotals[i] + sales[i][j];
            }
        }

        // Display the report
        System.out.println("NUMBER 1 ELECTRONICS - YEARLY SALES REPORT");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("City: " + cities[i]);
            System.out.println("PS5: " + sales[i][0]);
            System.out.println("XBOX: " + sales[i][1]);
            System.out.println("NINTENDO SWITCH: " + sales[i][2]);
            System.out.println("Total sales: " + cityTotals[i]);
            System.out.println();
        }
    }
