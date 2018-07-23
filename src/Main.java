/*
Scenario: You are a Database Administrator for a university and need to create an application to manage student enrollments and balance.
Your application should do the following:
     Ask the user how many new students will be added to the database
     The user should be prompted to enter the name and year for each student
     The student should have a 5-digit unique ID, with the first number being their grade level
     A student can enroll in the following courses: History 101 Mathematics 101 English 101 Chemistry 101 Computer Science 101
     Each course costs $600 to enroll
     The student should be able to view their balance and pay the tuition
     To see the status of the student, we should see their name, ID, courses enrolled, and balance
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ask how many students we want to add
        System.out.println("How many students do you wish to add? ");
        Scanner in = new Scanner(System.in);
        int howManyStudents = in.nextInt();
        Student [] students = new Student[howManyStudents];
        // create n number of new students

        for (int n = 0; n < howManyStudents; n++) {

            students[n] = new Student();

            students[n].tuition.enroll();

            students[n].tuition.payTuition();

            students[n].showInfo();
        }
    }
}