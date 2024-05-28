package com.codewithsuraj.exceptionhandling.model;


public class DemoOfGetMessageMethod {

    public static void main(String[] args) {
        /**
         * we are using class.forName and getMessage method in
         * this example
         */
        try {
            Class<?>cls=Class.forName("com.codewithsuraj." +
                    "exceptionhandling.model.Teacher");

        }catch (ClassNotFoundException e){
            /**
             * here we are going to print the getMessage Method
             */
            System.out.println(e.getMessage());

            /**
             * getMessage is only printing the description of message
             * in this example we get description as
             * com.codewithsuraj.exceptionhandling.model.Teacher::this is descriptions of
             * exceptions
             */

        }
    }

}
