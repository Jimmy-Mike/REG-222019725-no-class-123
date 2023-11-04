public class question1 {
    public static void main(String[] args) {
        //creating an object using our class name 
    simpleInterest simple = new simpleInterest();// this allow creation of object called "simple"
     simple.principal=100000;// fill in the value for our variables of principal
     simple.rate=5;// fill in the value for our variables of rate
     simple.time=5;// fill in the value for our variables of time
     simple.SI=simple.simpleInterest1();// this allow us to access the constructor which is holding our formula to calculate the simple interest
  
       
      System.out.println("simple interest:" +simple.SI+"RWF");// prints out to the user the calculated value
            
        }
        // creattion of a class
        static class simpleInterest{
          //declaration of valuable of our class
            double principal ;
            double rate;
            int time;
            double SI;
          // A constructor that is holding a formula
            public double simpleInterest1(){
            double SI = (rate*principal*time)/100;//actual formula for simple interest
             return SI;// return the calculated value
               
            }
        }
    }
