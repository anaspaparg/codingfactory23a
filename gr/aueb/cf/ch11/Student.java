package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * definition of a simple class.
 * POJO (Plain old java objects)
 * Student java bean
 */
public class Student {
    private static int studentsCount;
    static Scanner in = new Scanner(System.in);

    static {
        int num = in.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
        studentsCount++;
    };

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}