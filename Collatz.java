// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int n = Integer.parseInt(args[0]);
	String cOrV = args[1];
	if (cOrV.equals("concise") || cOrV.equals("c")) {
		System.out.println("Every one of the first " +n +" hailstone sequences reached 1.");
	} else{ 
			int seed = 1;
	for(int i=0; i<n; i++){
		long num = seed; 
		int counter = 0;
		System.out.print(seed +" "); 
		while (num != 1 || counter==0) {
			if(num % 2 == 0){
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			System.out.print(num +" ");
			counter++;
		}
		System.out.println("(" +(counter+1) +")");
		seed++;
	}
		System.out.println("Every one of the first " +n +" hailstone sequences reached 1.");
	}
	
	}
}
