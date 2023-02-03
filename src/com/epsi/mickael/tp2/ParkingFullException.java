package com.epsi.mickael.tp2;

public class ParkingFullException extends Exception {

    public ParkingFullException() {	}

    public ParkingFullException(String message) {
        super(message);
    }

    public ParkingFullException(Throwable cause) {
        super(cause);
    }

    public ParkingFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingFullException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
