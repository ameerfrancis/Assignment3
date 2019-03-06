package com.assignment;

public class objectIdentity {
    private static objectIdentity ourInstance = new objectIdentity();

    public static objectIdentity getInstance() {
        return ourInstance;
    }

    private objectIdentity() {
    }
}
