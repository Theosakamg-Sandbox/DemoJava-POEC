package com.epsi.mickael.tp2;

import java.util.ArrayList;

public class Parking {

    protected int maxPlace = 3;
    private ArrayList<Vehicle> storage = new ArrayList<>();

    // Déposer voiture
    public String put(Vehicle vehicle) {
        if (this.storage.size() < this.maxPlace)
            this.storage.add(vehicle);

        return vehicle.getHash();
    }

    // Récupérer une voiture.
    public Vehicle pop(String ticket) {
        Vehicle result = null;

        for (Vehicle vehicle : this.storage) {
            if (ticket.equals(vehicle.getHash())) {
                result = vehicle;
                break; // Optim !
            }
        }

        if (result != null) {
            this.storage.remove(result);
        }

        return result;
    }
}
