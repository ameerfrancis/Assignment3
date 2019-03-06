package com.assignment;

public class objectEquality {
    private static objectEquality ourInstance = new objectEquality();

    public static objectEquality getInstance() {
        return ourInstance;
    }

    private objectEquality() {
    }
}
