package com.epsi.mickael.tp2;

public abstract class Vehicle {

    //protected int id;
    protected String licence;
    protected int nbPlace;

    // Minimal Constructor !
    public Vehicle(String licence) {
        this.licence = licence;
    }

    // Utils Constructor.
    public Vehicle(String licence, int nbPlace) {
        this(licence);
        this.nbPlace = nbPlace;
    }

    public String getLicence() {
        return this.licence;
    }

    public Vehicle setLicence(String licence) {
        if (!licence.isEmpty()) {
            this.licence = licence;
        }
        return this;
    }

    public int getNbPlace() {
        return this.nbPlace;
    }

    public Vehicle setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
        return this;
    }

    public String getHash() {
        return this.licence+this.nbPlace;
    }

//    @Override
//    public String toString() {
//        return String.format("Licence %s [%s]", this.licence, this.getClass().getName());
//    }
}
