import java.text.DecimalFormat;

public class Circle {
	//created object constructor for Circle 
	public Circle(double radius){
		setRadius(radius);
	}
     //radius is going to be equal to user input
	
	public double radius;
    
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
//called the method for radius in the calc for circ and area instead of actual parameter for radius 
    public double getCircumference()
    {
    	return 2*Math.PI*getRadius();
    }
    
    public double getArea()
    {
    	return Math.PI*(getRadius()*getRadius());
    }
   private String formatNumber(double x)
   {
	   DecimalFormat df = new DecimalFormat("#.00");
	   return df.format(x);
   }
   public String getFormattedCirc()
   {
	   return formatNumber(getCircumference( ));
   }
	
  public String getFormattedArea()
  {
	  return formatNumber(getArea());
  }
}
