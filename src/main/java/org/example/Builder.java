package org.example;

public enum Builder {
    FENDER, MARTIN;
    public String toString() {
        switch(this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            default: return null;
        }
    }
}
