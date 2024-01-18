package org.example;

import org.example.Guitar;
import org.example.Inventory;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec specs = new GuitarSpec(Builder.FENDER.toString(), "Stratocastor", Type.ELECTRIC.toString(), Wood.ALDER.toString(), Wood.ALDER.toString(), 12);
        List<Guitar> guitars = inventory.search(specs);
        if(guitars != null) {
            System.out.println("Found Required Guitar");
            for(var guitar: guitars) {
                System.out.println(guitar.toString());
            }
        } else {
            System.out.println("Sorry, We have nothing for you!");
        }
    }
    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V65985", "Fender", "Stratocastor", "electric", "Alder", "Alder", 1499.95, 12);
    }
}
