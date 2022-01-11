package day36_Inheritance.EmployeeTask;

import javax.naming.Name;

public class Employee {
    
    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public double salary;
    public String companyName;

    public void setInfo(String name, char gender, int age, String jobTitle, double salary, String companyName) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
