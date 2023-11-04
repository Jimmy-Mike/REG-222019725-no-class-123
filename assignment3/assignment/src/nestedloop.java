public class nestedloop {
  public static void main(String[] args) {
    int rows = 5;//declaration of the 
      
    for (int i = 1; i <= rows; i++) {//looping for the rows of our pyramid
      for (int j = 1; j <= i; j++) {//this will auto increment the value  by one to our result
        System.out.print(j + " ");// out the values 1,2,3,5 in the pyramid form
      }
      System.out.println();
    }
  }
}
