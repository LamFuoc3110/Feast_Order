package utils;

import models.FeastMenu;
import java.io.*;
import java.util.*;

public class FileHandler {
    public static ArrayList<FeastMenu> loadMenusFromFile(String filename) {
        ArrayList<FeastMenu> menuList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip the header line
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String menuCode = data[0].trim();
                    String menuName = data[1].trim();
                    double price = Double.parseDouble(data[2].trim());
                    String ingredients = data[3].trim();
                    
                    menuList.add(new FeastMenu(menuCode, menuName, price, ingredients));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filename);
        }
        
        return menuList;
    }
}
