package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+ model+" breaks down every 100 miles");
    }
}
/*
  2. BMW:
                extra methods:
                    breaksDown()
                    racing()

 */