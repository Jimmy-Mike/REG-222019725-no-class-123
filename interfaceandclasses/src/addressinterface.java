//creation of an interface
interface adddressinterface1{
    // creation of method that should be in our interface
    void country();
    void city();
    void district();
    void sector();
    void cell();
}
// creation of our first class which will implement all the method icluded in our interface
class person1 implements adddressinterface1{
    //calling method1 to be implemented in our class from implemented interface "addressinterface1"
    public void country(){
        System.out.println("Burundi");
    }
    //calling method2 to be implemented in our class from implemented interface "addressinterface1"
    public void city(){
        System.out.println("Ngonzi");
    }
    //calling method3 to be implemented in our class from implemented interface "addressinterface1"
    public void district(){
        System.out.println("jabo");
    }
    //calling method4 to be implemented in our class from implemented interface "addressinterface1"
    public void sector(){
        System.out.println("Mwama");
    }
    //calling method5 to be implemented in our class from implemented interface "addressinterface1"
    public void cell(){
        System.out.println("Kiringo2");
    }
}
// same logic implemented and used through the whole program
class person2 implements adddressinterface1 {
    public void country() {
        System.out.println("Kenya");
    }

    public void city() {
        System.out.println("Nairobi");
    }

    public void district() {
        System.out.println("Ragati");
    }

    public void sector() {
        System.out.println("Mwema");
    }

    public void cell() {
        System.out.println("Kiringo");
    }
}
// this is inheriting from class person2 which is same
class person3 extends person2{
    public void country(){
        System.out.println("Tanzania");
    }
    public void city(){
        System.out.println("mwanza");
    }
    public void district(){
        System.out.println("tandale");
    }
    public void sector(){
        System.out.println("Mwama");
    }
    public void cell(){
        System.out.println("Kigoma");
    }
}
class person4 implements adddressinterface1{
    
    public void country(){
        System.out.println("Rwanda");
    }
    public void city(){
        System.out.println("Ngoma");
    }
    public void district(){
        System.out.println("nyarugenge");
    }
    public void sector(){
        System.out.println("Nyanza");
    }
    public void cell(){
        System.out.println("Kacyiru");
    }
}// creation of our main class to help print out to the console the expected outputs
public class addressinterface{
public static void main(String[] args){
    
     person1 p = new person1();
     person2 pe = new person2();
     person3 p3 = new person3();
     person4 p4 = new person4();
     System.out.println("Your Address is:");
     p.country();
     p.city();
     p.district();
     p.sector();
     p.cell();
     System.out.println("Your Address is:");
     pe.country();
     pe.city();
     pe.district();
     pe.sector();
     pe.cell();
     System.out.println("Your Address is:");
     p3.country();
     p3.city();
     p3.district();
     p3.sector();
     p3.cell();
     System.out.println("Your Address is:");
     p4.country();
     p4.city();
     p4.district();
     p4.sector();
     p4.cell();

}

}
