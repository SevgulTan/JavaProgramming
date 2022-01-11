package day36_Inheritance.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Nesibe",'F',32,"Sdet",100000,"Apple");

        tester.work();
        tester.testing();
        System.out.println(tester);


        Developer developer = new Developer();
        developer.setInfo("Özgul",'F',37,"Developer",120000,"Apple");
        developer.work();
        developer.coding();
        System.out.println(developer);

        Driver driver = new Driver();
        driver.setInfo("Ahnet",'M',36,"Driver",1200000,"Ford");
        driver.work();
        driver.drive();
        System.out.println(driver);


        Teacher teacher = new Teacher();
        teacher.setInfo("Sevgul",'F',36,"Teacher",130000,"Cydeo");
        teacher.work();
        teacher.teach();
        System.out.println(teacher);

    }
}
