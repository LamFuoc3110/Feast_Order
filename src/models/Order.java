package models;

import utils.FileHandler;
import java.util.ArrayList;

public class Order {
    private String orderID;
    private String customerCode;
    private String menuCode;
    private int numberOfTables;
    private String eventDate;
    private double totalCost;

    // Constructor
    public Order(String orderID, String customerCode, String menuCode, int numberOfTables, String eventDate) {
        this.orderID = orderID;
        this.customerCode = customerCode;
        this.menuCode = menuCode;
        this.numberOfTables = numberOfTables;
        this.eventDate = eventDate;

        // Get price from menu file
        this.totalCost = calculateTotalCost(menuCode, numberOfTables);
    }

    // Validate menuCode and calculate total cost
    private double calculateTotalCost(String menuCode, int tables) {
        ArrayList<FeastMenu> menus = FileHandler.loadMenusFromFile("data/feastMenu.csv");

        for (FeastMenu menu : menus) {
            if (menu.getMenuCode().equalsIgnoreCase(menuCode)) {
                return menu.getPrice() * tables;
            }
        }
        return 0; // Return 0 if menuCode is invalid
    }

    // Getters
    public String getOrderID() {
        return orderID;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public String getEventDate() {
        return eventDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    // toString() for order details
    @Override
    public String toString() {
        return "Order ID: " + orderID +
               "\nCustomer Code: " + customerCode +
               "\nMenu Code: " + menuCode +
               "\nEvent Date: " + eventDate +
               "\nNumber of Tables: " + numberOfTables +
               "\nTotal Cost: " + totalCost;
    }
}
