package com.mycompany.app;

import lombok.extern.java.Log;

/**
 * Hello world!
 */
@Log
public class App {

    private static final String message = "Hello Jenkins!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private String getMessage() {
        return message;
    }

    private String getVersion() {
        return "v1.0.0";
    }

}
