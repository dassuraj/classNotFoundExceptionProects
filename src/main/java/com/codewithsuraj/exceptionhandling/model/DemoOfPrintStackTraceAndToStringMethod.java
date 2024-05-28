package com.codewithsuraj.exceptionhandling.model;

/**
 * this class is getting different message
 * from catch block
 */
public class DemoOfPrintStackTraceAndToStringMethod {

    public static void main(String[] args) {
        ClassLoader classLoader = Student.class.getClassLoader();
        try {
            /**
             *  e.printStackTrace method message handling details is given below
             */
            classLoader.loadClass("com.codewithsuraj.exceptionhandling." +
                    "model.Student1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            /**
             * printStackTrace methods is used to print the name of the exception ,
             * descriptions of exceptions and stack-trace
             *
             */
            /**
             * Exceptions in this example
             * ---------------------
             * java.lang.ClassNotFoundException: com.codewithsuraj.exceptionhandling.model.Student1
             * 	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
             * 	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
             * 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
             * 	at com.codewithsuraj.exceptionhandling.model.DemoOfDifferentMessage.main(DemoOfDifferentMessage.java:15)
             *
             * Point1(//java.lang.ClassNotFoundException: type of exceptions
             * point2
             * com.codewithsuraj.exceptionhandling.model.Student1:::Descriptions of exceptions
             * and exceptions is in the package and class  com.codewithsuraj.exceptionhandling.model.Student1)
             *
             *
             * Point3(DemoOfDifferentMessage.java:15)
             * this is stack-trace that is exceptions is occurring in line 15
             * */
            /**
             * using toString method Now
             */
            System.out.println(e.toString());
            /**
             * it only prints the type of exceptions and descriptions
             * of exceptions and not the stack-trace i.e,line number
             *
             * here exceptions in the command line is
             * java.lang.ClassNotFoundException::: type of exceptions
             * com.codewithsuraj.exceptionhandling.model.Student1::: --descriptions of exceptions
             */
        }

    }
}

