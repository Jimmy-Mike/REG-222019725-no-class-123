public class switchcase {
 
    public static void main(String [] args){// main class for starting java 
        System.out.println("Switch case statement");//initial message to print 

        String gender = "prefer not say";//declaration of our variable with a value of string type
        switch (gender) {//code to switch out through our declared valiable
         case "FEMALE" :// case the provided gender is female
         System.out.println("i am female ");// message to printout 
         break;// break the statement and allows other statement to be checked
         case "MALE"://same thing if the case is male
         System.out.println("i am male");//print out this message to the console
         break;//break , to allow other statement to be checked 
         case "prefer not say":
         System.out.println("unknown gender");
         break;
        }
    }
}
