package com.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class objectEqualityTest {

    objectEquality oe1 = objectEquality.getInstance();
    objectEquality oe2 = objectEquality.getInstance();

    @Test
    public void getInstance() {

        Assert.assertEquals(oe1,oe2);
    }
}