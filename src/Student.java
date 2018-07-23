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

class Student {

    private String name;
    private int gradeYear;
    private String studentID;
    private String studentCourses;
    private String studentTuitionBalance;
    Tuition tuition;


    private static int id = 1000;


    // constructor:  prompts user to enter student's name and year
    Student() {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter student's first name: ");
            String firstName = in.nextLine();
            System.out.println("Enter student's last name: ");
            String lastName = in.nextLine();
            System.out.println("Select student's grade year: ");
            System.out.println("    1 = Freshman");
            System.out.println("    2 = Sophomore");
            System.out.println("    3 = Junior");
            System.out.println("    4 = Senior");
            System.out.println(">   ");
            this.gradeYear = in.nextInt();

            this.studentID = setStudentID();

            this.tuition = new Tuition();


            name = firstName + " " + lastName;


            System.out.println(name + " " + studentID);
        }


    // assign 5 digit ID, starts with grade year
    private String setStudentID() {
        id++;
        studentID = gradeYear + "" + id;
        return studentID;
    }

    private void getStudentID() {
        System.out.println("Student ID: " + studentID);
    }

    private void getName() {
        System.out.println("Name: " + name);
    }


    // show status
    void showInfo() {
        //System.out.println("Name: " + name + "\nCourses Enrolled: " + tuition.getCourses() + "\nBalance: $" + tuition.getTuitionBalance());
        System.out.println();
        getName();
        getStudentID();
        tuition.getTuitionBalance();
        tuition.getCourses();
        System.out.println("");

    }
}






