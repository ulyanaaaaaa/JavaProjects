package org.example;

public class MyClass {
    @MyAnnotation("Field One")
    private String fieldOne = "Initial Value";

    @MyAnnotation("First method")
    public void firstMethod(){
        System.out.println("Executing method one");
    }

    @MyAnnotation("Second method")
    public void secondMethod(){
        System.out.println("Executing method two");
    }

    @MyAnnotation("Third method")
    public void thirdMethod(){
        System.out.println("Executing method three");
    }
}
