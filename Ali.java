import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ma {

	public static void main(String[] args) {
		//double result = new Ma().leartCurve(3, 1, 3, 1);
		double result = 0;
		double x = 2;
		double y = 2;
		
		result = Math.pow((Math.pow(x, 2) + Math.pow(y, 2) - 1), 2) - (Math.pow(x, 2) * Math.pow(y, 2));
		System.out.println(result);
	}
	
	 static double leartCurve(double mu1, double sigma1, double mu2, double sigma2) {
		 double x = 0;
		 double y = 0;
		 float f = 0;
		 float inside = 0;
		 float outside = 0;
		 //double pi = Math.PI;
		 Random r = new Random();
		 
		 
		 for(int i = 0; i < 10000; i++){
			 x = Math.sqrt(sigma1) * r.nextGaussian() + mu1;
			 y = Math.sqrt(sigma2) * r.nextGaussian() + mu2;
			
			 if (Math.pow((Math.pow(x, 2) + Math.pow(y, 2) - 1), 2) - (Math.pow(x, 2) * Math.pow(y, 2)) <= 0){
				 inside ++;
			 }else{
				 outside ++;
			 }
			 
		 }
		 
		 f = inside / (inside + outside);
		 return f;
    }

}