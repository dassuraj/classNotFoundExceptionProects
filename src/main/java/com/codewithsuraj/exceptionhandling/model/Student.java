package com.codewithsuraj.exceptionhandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Example of classLoader,loadClass
 * fields
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private String name;
    private String email;
    private long phoneNumber;

    public Student(String names){

    }

    /**
     * we are going to load the Student class with help of class loader
     * and in one try catch block we will put write class path
     * but in another we will put wrong class path
     */
}
class Test{
    public static void main(String[] args) {

        ClassLoader classLoader =Student.class.getClassLoader();
//        classLoader.loadClass("");
        /**
         * line number  29 is showing compile time error as
         * unhandled exceptions now handling the exceptions using try catch
         */

        try {
            /**
             * loading the classPath using correct classPath and className
             */
           classLoader.loadClass("com.codewithsuraj.exceptionhandling." +
                   "model.Student");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            /**
             * we don't get any exceptions while giving correct path and correct className
             */
        }
        /**
         * loading the same Class using wrong className
         */
        try {
            /**
             * loading the classPath using wrong classPath and className
             */
            classLoader.loadClass("com.codewithsuraj1.exceptionhandling." +
                    "model.Student1");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            /**
             * we get any exceptions while giving wrong path and wrong className
             * we get
             * java.lang.ClassNotFoundException: com.codewithsuraj1.exceptionhandling.model.Student1
             * 	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
             * 	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
             * 	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
             * 	at com.codewithsuraj.exceptionhandling.model.Test.main(Student.java:54)
             */

        }

    }
}
