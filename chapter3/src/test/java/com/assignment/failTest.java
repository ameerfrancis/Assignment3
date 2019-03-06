package com.assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class failTest {

    @Test
    public void fail() {

        fail failure = new fail();

        Assert.assertEquals("passed", failure.fail());
    }
}