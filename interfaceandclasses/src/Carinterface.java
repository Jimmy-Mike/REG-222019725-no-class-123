//creation of an interface
interface carinterface1{
    // creation of method that should be in our interface
    void  type();
    void countrymanufacture();
    void model();
    void fueltype();
    void priceamt();
}
// creation of our first class which will implement all the method icluded in our interface
class car1 implements carinterface1{
    //calling method1 to be implemented in our class from implemented interface "addressinterface1"
    public void type(){
        System.out.println("sports car");
    }
    //calling method2 to be implemented in our class from implemented interface "addressinterface1"
    public void countrymanufacture(){
        System.out.println("Germany");
    }
    //calling method3 to be implemented in our class from implemented interface "addressinterface1"
    public void model(){
        System.out.println("Ford A1");
    }
    //calling method4 to be implemented in our class from implemented interface "addressinterface1"
    public void fueltype(){
        System.out.println(" diesel");
    }
    //calling method5 to be implemented in our class from implemented interface "addressinterface1"      
     public void priceamt(){
        System.out.println("The price of the car is : 300000$");
    }
}
//same logic through other classes
class car2 implements carinterface1{
    //calling method1 to be implemented in our class from implemented interface "addressinterface1"
    public void type(){
        System.out.println("SUV");
    }
    //calling method2 to be implemented in our class from implemented interface "addressinterface1"
    public void countrymanufacture(){
        System.out.println("Italy");
    }
    //calling method3 to be implemented in our class from implemented interface "addressinterface1"
    public void model(){
        System.out.println("Lamborghini");
    }
    //calling method4 to be implemented in our class from implemented interface "addressinterface1"
    public void fueltype(){
        System.out.println("diesel");
    }
    //calling method5 to be implemented in our class from implemented interface "addressinterface1"      
     public void priceamt(){
        System.out.println("The price of the car is : 1M$");
    }
}
// here, the class is inheriting from car2 which has the same method so its simple to run the program in the same way as we did for class car1!
class car3 extends car2{
    //calling method1 to be implemented in our class from implemented interface "addressinterface1"
    public void type(){
        System.out.println("Sedan Hills");
    }
    //calling method2 to be implemented in our class from implemented interface "addressinterface1"
    public void countrymanufacture(){
        System.out.println("Saudi arabia");
    }
    //calling method3 to be implemented in our class from implemented interface "addressinterface1"
    public void model(){
        System.out.println("Suzuki");
    }
    //calling method4 to be implemented in our class from implemented interface "addressinterface1"
    public void fueltype(){
        System.out.println("Gasoline");
    }
    //calling method5 to be implemented in our class from implemented interface "addressinterface1"      
     public void priceamt(){
        System.out.println("The price of the car is : 15M(RWF)");
    }
}
class car4 implements carinterface1{
    //calling method1 to be implemented in our class from implemented interface "addressinterface1"
    public void type(){
        System.out.println("Coupe");
    }
    //calling method2 to be implemented in our class from implemented interface "addressinterface1"
    public void countrymanufacture(){
        System.out.println("France");
    }
    //calling method3 to be implemented in our class from implemented interface "addressinterface1"
    public void model(){
        System.out.println("Dodge");
    }
    //calling method4 to be implemented in our class from implemented interface "addressinterface1"
    public void fueltype(){
        System.out.println(" diesel");
    }
    //calling method5 to be implemented in our class from implemented interface "addressinterface1"      
     public void priceamt(){
        System.out.println("The price of the car is : 500k$");
    }
}

// creation of our main class to help print out to the console the expected outputs
public class Carinterface{
public static void main(String[] args){
    
     car1 c = new car1();
     car2 d = new car2();
      car3 l = new car3();
     car4 s = new car4();
     System.out.println("Your Car description is:");
    c.type();
    c.countrymanufacture();
    c.model();
    c.fueltype();
    c.priceamt();
   System.out.println("Your Car description is:"); 
    d.type();
    d.countrymanufacture();
    d.model();
    d.fueltype();
    d.priceamt();
    System.out.println("Your Car description is:"); 
    l.type();
    l.countrymanufacture();
    l.model();
    l.fueltype();
    l.priceamt();
    System.out.println("Your Car description is:"); 
    s.type();
    s.countrymanufacture();
    s.model();
    s.fueltype();
    s.priceamt();

}

}
