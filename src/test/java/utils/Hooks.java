package utils;

import org.testng.annotations.AfterTest;

public class Hooks {

    @AfterTest
    public static void tearDown() {
        DriverFactory.closeDriver();
    }
}
