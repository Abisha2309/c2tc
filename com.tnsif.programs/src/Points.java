package com.tnsif.overloading;
//function overloading
public class Points {
   private float x;
   private float y;
   public Points()
   {
	   x=0.0f;
	   y=0.0f;
   }
   
	   public Points(float x)
	   {
		   this.x=x;
		   this.y=x;
		   
	   }
	   public Points(float x, float y)
	   {
		   this.x=x;
		   this.y=y;
	   }

	@Override
	public String toString() {
		return "Points [x=" + x + ", y=" + y + "]";
	}
	   
   
}
