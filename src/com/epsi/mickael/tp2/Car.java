package com.epsi.mickael.tp2;

public class Car {

    //protected int id;
    protected String licence;
    protected int nbPlace;

    // Minimal Constructor !
    public Car(String licence) {
        this.licence = licence;
    }

    // Utils Constructor.
    public Car(String licence, int nbPlace) {
        this(licence);
        this.nbPlace = nbPlace;
    }

    public String getLicence() {
        return this.licence;
    }

    public Car setLicence(String licence) {
        if (!licence.isEmpty()) {
            this.licence = licence;
        }
        return this;
    }

    public int getNbPlace() {
        return this.nbPlace;
    }

    public Car setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
        return this;
    }

    public String getHash() {
        return this.licence+this.nbPlace;
    }

}
