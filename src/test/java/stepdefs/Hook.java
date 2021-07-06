package stepdefs;

import io.cucumber.java.*;

public class Hook {
    @Before(value = "@MobileTest")
    public void beforeValidation(Scenario scenario) {
        System.out.println("Before mobile hook" + scenario.getName());
    }
    @After("@MobileTest")
    public void afterValidation() {
        System.out.println("After mobile hook");
    }
    @Before("@WebTest")
    public void beforeWebValidation () {
        System.out.println("Before web hook");
    }
    @After("@WebTest")
    public void afterWebValidation() {
        System.out.println("After web hook");
    }
}
