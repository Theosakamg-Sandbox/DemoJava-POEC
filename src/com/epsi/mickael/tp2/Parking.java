package com.epsi.mickael.tp2;

import java.util.ArrayList;

public class Parking {

    protected int maxPlace = 10;
    private ArrayList<Vehicle> storage = new ArrayList<>();

    public ArrayList<Vehicle> getSnapStorage() {
         return (ArrayList<Vehicle>) this.storage.clone();
         //return new ArrayList<Vehicle>();
    }


    // Déposer voiture
    /**
     * Ajout un vehicule dans le parking en echange d'un ticket.
     * @param vehicle a garer dans le parking.
     * @return Le ticket d'identification.
     * @throws ParkingFullException est déclenché si le parking est plein.
     */
    public String put(Vehicle vehicle) throws ParkingFullException {
        if (this.storage.size() < this.maxPlace) {
            this.storage.add(vehicle);
        } else {
            throw new ParkingFullException();
        }

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
