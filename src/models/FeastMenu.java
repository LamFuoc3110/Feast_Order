/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class FeastMenu {
    String menuCode;
    String menuName;
    double price;
    String ingredients;

    public FeastMenu(String menuCode, String menuName, double price, String ingredients) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return menuCode + " - " + menuName + "| price=" + price + "VND |Iingredients: " + ingredients;
    }
    
}
