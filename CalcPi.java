// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	int times = Integer.parseInt(args[0]);
	int sign = 1 , denominator = 1;
	double sum = 0;
	for(int i=0; i<times; i++){
		sum += sign*1.0/denominator;
		sign = sign*-1;
		denominator +=2;
	}
	System.out.println("pi according to Java: " +Math.PI);
	System.out.println("pi, approximated:	 " + sum*4);	
	}
}
