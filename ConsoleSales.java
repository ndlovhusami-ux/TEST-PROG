/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Student
 */

    

public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printedReport() {
        System.out.println();
        System.out.println("===== CONSOLE SALES REPORT =====");
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store name: " + getStore());
        System.out.println("Total sales: " + getTotalSales());
    }
}