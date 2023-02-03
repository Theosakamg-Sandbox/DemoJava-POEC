package com.epsi.mickael.demo4;

public class MickaelException extends Exception {

    private String internalCause;

    public MickaelException() {
        // TODO Auto-generated constructor stub
    }

    public MickaelException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public MickaelException(String message, String internalCause) {
        this(message);
        this.internalCause = internalCause;
    }


    public MickaelException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    public MickaelException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public MickaelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
