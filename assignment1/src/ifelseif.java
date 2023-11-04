 public class ifelseif {
    public static void main(String[] args){
      System.out.println("If-else ladder");
        int age = 17;//declaration of the variable
        if (age >=18){ //setting the condition to follow
         System.out.println("i am adult"); //output to print if specified conditon is met 
        } else if(age >=16 && age < 18 ) {//Another if to print checking if the age is between 16 and 18
         System.out.println("i am almost adult");//output to print to the browser when the else if is met 
         }
       else {
         System.out.println(" i am not adult");// when all conditions are are not met , then it prints out the else statement
       }

    }
}