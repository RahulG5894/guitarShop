package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List guitars;
    public Inventory() {
        this.guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price, int numStrings) {
        guitars.add(new Guitar( serialNumber, price, new GuitarSpec(builder,  model,  type,  backWood,  topWood, numStrings)));
    }
    public Guitar getGuitar(String serialNumber) {
        for(Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if(guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }
    public List<Guitar> search(GuitarSpec specs) {
        List<Guitar> guitarList = null;
        for(Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            boolean available = false;
            if(guitar.getGuitarSpec().matches(specs)) {
                if(guitarList == null) {
                    guitarList = new ArrayList<>();
                }
                guitarList.add(guitar);
            }
        }
        return guitarList;
    }
}