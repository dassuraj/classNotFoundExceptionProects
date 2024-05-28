package com.codewithsuraj.exceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this is all about classNotFoundException
 */
@SpringBootApplication
public class ExceptionHandlingApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExceptionHandlingApplication.class, args);
        /**
         * here we are handling exception
         */
        try {
            /**
             * using class.forName
             * class.forName is used to load the class
             * inside the forName method we have to pass the path of the class
             * here inside the model method, I have typed wrong className Employee1
             */
            Class<?> cls=Class.forName("com.codewithsuraj.exceptionhandling.model.Employee1");
            /**
             * when line 24 is executed it founds wrong path and then jump to catch block
             */
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            /**
             * here we will get result as
             * java.lang.ClassNotFoundException: com.codewithsuraj.exceptionhandling.model.Employee1
             * 	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
             * 	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
             * 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
             * 	at java.base/java.lang.Class.forName0(Native Method)
             * 	at java.base/java.lang.Class.forName(Class.java:390)
             * 	at java.base/java.lang.Class.forName(Class.java:381)
             * 	at com.codewithsuraj.exceptionhandling.ExceptionHandlingApplication.main(ExceptionHandlingApplication.java:14)
             *
             */

        }
    }

}
