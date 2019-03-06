package com.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class objectIdentityTest {

    objectIdentity oi1 = objectIdentity.getInstance();
    objectIdentity oi2 = objectIdentity.getInstance();

    @Test
    public void getInstance() {

        Assert.assertSame(oi1, oi2);
    }
}