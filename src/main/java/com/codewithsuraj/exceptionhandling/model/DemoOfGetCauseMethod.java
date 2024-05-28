package com.codewithsuraj.exceptionhandling.model;

public class DemoOfGetCauseMethod {


    public static void loadClass(String className) throws ClassNotFoundException {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundException("class " + className + " Not Found");
        }
    }

    public static void main(String[] args) {
        try {
            /**
             * here are learning example of getCause method
             */
            loadClass("com.codewithsuraj" +
                    ".exceptionhandling.model.Employee1");
        } catch (ClassNotFoundException e) {
            /**
             * here we are using getCause method
             */
           System.err.println("error ::" +e.getMessage());
        }
    }
}
