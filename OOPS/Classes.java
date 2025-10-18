package OOPS;
//Class is blueprint
//Object is instance of a class
class Car{
    String brand;
    String color;
    int speed;

    void drive(){
        System.out.print(brand + " is driving at " + speed + " km/hr");
    }
}
public class Classes {
    public static void main(String[]args){
         Car obj1 = new  Car();

         obj1.brand = "Jaquer";
         obj1.color = "Blue";
         obj1.speed = 120;

         obj1.drive();
    }
}
