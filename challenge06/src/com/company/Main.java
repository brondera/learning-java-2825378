package com.company;

public class Main {

    public static void main(String[] args) {
	    // Create two student profiles by calling Student Class
        Student studentA = new Student ("buba", "badjie", 2012, 5.0, "Double major in dentist and Russian");
        Student studentB = new Student ("axel", "bronder", 2013, 4.0, "simple engineering");

        //Call Instance method to increment expected graduation year for studentA by one
        studentA.incrementExpectedGraduationYear();

        //Print the results to the console
        System.out.println(studentA.firstName + " " + studentA.lastName);
        System.out.println("Current expected graduation year: " + studentA.expectedGraduationYear);
        System.out.println(studentB.firstName + " " + studentB.lastName);
        System.out.println("Current expected graduation year: " + studentB.expectedGraduationYear);

    }
}
