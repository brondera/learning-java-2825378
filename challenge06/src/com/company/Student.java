package com.company;

//Student class
// TODO: add some error handling etc
public class Student {
    //Attribute variables
    String firstName;
    String lastName;
    int expectedGraduationYear;
    double GPA;
    String declaredMajor;

    //Constructor
    public Student (String firstName, String lastName,
                    int expectedGraduationYear, double GPA, String declaredMajor) {
        //Assign attribute values
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    //Instance methods
    public void incrementExpectedGraduationYear () {
        //Increment the expected graduation year of the student by one
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }

}
