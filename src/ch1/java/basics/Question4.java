package ch1.java.basics;

/**
 * @author Mariana Azevedo
 * @since 03/12/2018
 * 
 * Question: choose the appropriate option when attempting to compile 
 * and run the following code
 * 
 * static int x = 15;

   public static void main(String[] x) {
	  x = 200;
	  System.out.println(x);
   }
 * 
 * a) The code compiles and runs, printing 200
 * b) The code compiles and runs, printing 15
 * c) The code doesn't compile (x)
 * d) The code compiles, but it throws error
 *
 */
public class Question4 {

	static int x = 15;

	public static void main(String[] x) {
		//if this section is uncommented, a compilation error occurs
		//x = 200;
		System.out.println(x);
	}

}