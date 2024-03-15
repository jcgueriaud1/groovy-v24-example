package com.vaadin.starter.skeleton

import groovy.transform.CompileStatic

@CompileStatic
public class GreetService {

    public static String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello " + name;
        }
    }
}
