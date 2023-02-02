package com.epsi.mickael.tp2;

import java.util.ArrayList;

public class Parking {

    protected int maxPlace = 3;
    private ArrayList<Car> storage = new ArrayList<>();

    // Déposer voiture
    public String put(Car car) {
        if (this.storage.size() < this.maxPlace)
            this.storage.add(car);

        return car.getHash();
    }

    // Récupérer une voiture.
    public Car pop(String ticket) {
        Car result = null;

        for (Car car : this.storage) {
            if (ticket.equals(car.getHash())) {
                result = car;
                break; // Optim !
            }
        }

        if (result != null) {
            this.storage.remove(result);
        }

        return result;
    }
}
