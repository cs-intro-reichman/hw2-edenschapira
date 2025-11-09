//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String cheer = args[0];
        int timesToCheer = Integer.parseInt(args[1]);
        String needToBeAn = "AaEeFfHhIiLlMmNnOoRrSsXx";
        int i = 0;
        while (i<cheer.length()) {
                char c = cheer.charAt(i);
                if(needToBeAn.indexOf(c)==-1){
                        System.out.println("Give me a " +c +": " +c +"!");
                } else {
                        System.out.println("Give me an " +c +": " +c +"!");
                }
                i++;                
        }
        System.out.println("What does that spell?");
        for(int times=0; times<timesToCheer; times++){
                System.out.println(cheer +"!!!");
        }        
	    
        }
}
