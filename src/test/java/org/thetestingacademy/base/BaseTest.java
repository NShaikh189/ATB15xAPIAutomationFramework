package org.thetestingacademy.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void setup()
    {}

    @AfterTest
    public void teardown()
    {}

    public String getToken()
    {
        return null;
    }
}
