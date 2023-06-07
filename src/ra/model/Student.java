package ra.model;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private  String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int studentId, String studentName, int age, boolean sex, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void inputData(Scanner sc){
        System.out.print("enter student ID :");
        this.studentId = Integer.parseInt(sc.nextLine());
        System.out.print("enter student name : ");
        this.studentName = sc.nextLine();
        System.out.print("enter student age : ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("enter student sex : ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.print("enter student address : ");
        this.address = sc.nextLine();
        System.out.print("enter student phone number : ");
        this.phoneNumber = sc.nextLine();
    }
    public void displayData(){
        System.out.println("-----------------------------------------");
        System.out.println("Student ID : "+ studentId);
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student age : "+ age);
        System.out.println("Student sex : "+ (sex?"Nam":"Nu"));
        System.out.println("Student Address : "+ address);
        System.out.println("Student phoneNumber : "+ phoneNumber);
        System.out.println("-----------------------------------------");


    }
}
