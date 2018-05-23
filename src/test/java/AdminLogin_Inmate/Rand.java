package AdminLogin_Inmate;


import java.util.*;
public class Rand{
	  public static void main(String[] args) {
	    
	      System.out.println(randomize());
	    
	  }
	

private static String randomize(){
    Random r = new Random();
    List<Integer> digits=  new ArrayList<Integer>();
    String number = "";
    for (int i = 0; i < 10; i++) {
        digits.add(i);
    }
    for (int i = 10; i > 0; i--) {
        int randomDigit = r.nextInt(i);
        number+=digits.get(randomDigit);
        digits.remove(randomDigit);
    }
    return number;
}}

/*public class Rand
{
    public static void main(String[] args)
    {
        int num1, num2, num3; //3 numbers in area code
        int set2, set3; //sequence 2 and 3 of the phone number
        
        Random generator = new Random();
        
        //Area code number; Will not print 8 or 9
        num1 = generator.nextInt(7) + 1; //add 1 so there is no 0 to begin  
        num2 = generator.nextInt(8); //randomize to 8 becuase 0 counts as a number in the generator
        num3 = generator.nextInt(8);
        
        // Sequence two of phone number
        // the plus 100 is so there will always be a 3 digit number
        // randomize to 643 because 0 starts the first placement so if i randomized up to 642 it would only go up yo 641 plus 100
        // and i used 643 so when it adds 100 it will not succeed 742 
        set2 = generator.nextInt(643) + 100;
        
        //Sequence 3 of numebr
        // add 1000 so there will always be 4 numbers
        //8999 so it wont succed 9999 when the 1000 is added
        set3 = generator.nextInt(8999) + 1000;
        
        System.out.println ( "" + num1 + "" + num2 + "" + num3 + "" + "" + set2 + "" + set3 );
       
    }
}*/