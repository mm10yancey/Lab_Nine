import java.util.*;
public class CircleApp {
	static Scanner sc = new Scanner(System.in);
	static double radius;
	public static void main(String[] args) {
    String toContinue = "Y";
	
	//Circle circ = new Circle();
	
	System.out.println("Welcome to the Circle Tester");
	while(!toContinue.equalsIgnoreCase("N")){
	 
	 double validRad = readValidInteger();
	 //initialized circle object with valid rad as the parameter
	 Circle circ = new Circle(validRad);
	 
	 System.out.println(validRad);
 
     System.out.println(circ.getFormattedCirc());
    
     System.out.println(circ.getFormattedArea());
    
       {
    	System.out.println("Continue? Y/N?");toContinue=sc.nextLine();
	   }
	}
	
	
}   
     
   
	public static double readValidInteger()

	{
		while (true){
			
	   try {
			System.out.println("Please enter Radius");
		    double radius=sc.nextDouble();sc.nextLine();
		    return radius;
			}
			
		catch (InputMismatchException e){
			System.out.println("You canot have input as a String");//sc.nextLine();
			}
	    //general exception refers to all exceptions in java API
		catch (Exception e)
	      {
		   System.out.println("General Error! Contact Admin");//sc.nextLine();
		   
	    } finally {
	    	sc.nextLine();
	    }
			
			
	}
	}
}


