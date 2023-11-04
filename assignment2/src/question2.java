class compoundInterest{
    public static void main(String[] args) {
        //creating an object to be able to assign values
        compound compo = new compound();// creation of object compo
        compo.amount=0;
        compo.principal=500000;
        compo.rate=0.18;
        compo.time=3;
        double CI = compo.compoundIntere();
        System.out.println("compound interest is:"+ CI);// output the value of Compound Interest

    }
    //create compound for our calculation 
    public static class compound{
       //variables for our class which our objects will share
     double amount;
     double principal;
     double rate;
     double time;
     double CI;
      
     public double compoundIntere(){ //Method for holding our formula
       
     double CI =principal* Math.pow(1+rate/12,12*time);//variablescompound interest formula
     return CI;
     }
    }
}