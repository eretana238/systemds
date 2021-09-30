package org.tugraz.sysds.api;

public class GlobalFlagException extends RuntimeException{
    public GlobalFlagException() {}

    public GlobalFlagException(String msg) {
        super(msg);
    }
}
