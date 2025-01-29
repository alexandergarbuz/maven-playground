package com.garbuz.maven01.service;

import java.util.ArrayList;  // Unused import, PMD will warn about it
import java.util.List;

public class BadExample {

    private String name;
    private int count;

    // Constructor with excessive complexity
    public BadExample(String name, int count) {
        this.name = name;
        this.count = count;
    }

    // Method with a simple code smell: unnecessary object creation
    public List<String> getList() {
        // Creating an object unnecessarily each time
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        return list;
    }

    // Too many lines of code in a method
    public void doSomethingComplex() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result += "Line " + i + "\n";  // String concatenation inside loop (inefficient)
        }

        if (result.length() > 0) {
            System.out.println("Result is not empty");
        } else {
            System.out.println("Result is empty");
        }
    }

    // Duplicate code smell - redundant else statement
    public void checkResult() {
        if (count > 10) {
            System.out.println("High count");
        } else {
            System.out.println("Low count");
        }
    }

    // Method with too many lines of code
    public void doAnotherThing() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Doing something: " + i);
        }

        // Let's add an unnecessary else block
        if (name == null) {
            System.out.println("Name is null");
        } else {
            System.out.println("Name is not null");
        }
    }

    // Method with unnecessary return
    public void doNothing() {
        return;  // PMD will flag unnecessary return statements
    }

    // Long method, which can be split into smaller methods (too much code in one method)
    public void doSomethingHuge() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Processing " + i);
        }

        String result = "Processed " + count;
        System.out.println(result);
    }

    // Over-complicated getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
