package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainTest {

    @Test
    public void sayHello() {
        assertEquals(new Main().sayHello(), "Hello");
    }
}
