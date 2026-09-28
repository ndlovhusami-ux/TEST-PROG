/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Student
 */


public abstract class Console implements Iconsole {

    private final String consoleType;
    private final String storeName;
    private final int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    // Subclasses must write their own version of this method
    public abstract void printedReport();
}