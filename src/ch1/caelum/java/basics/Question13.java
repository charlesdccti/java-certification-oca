package ch1.caelum.java.basics;

import model.basic.Client;
import model.advanced.*;

/**
 * @author Mariana Azevedo
 * @since 02/02/2019
 * 
 * Question 1.4.3 (page 40) - Choose the appropriate option to save and compile the following file:
 * 
 * public class Test {
 *
 *	  public static void main(String[] args) {
 *		  System.out.println("Welcome " + new Client().name);
 *	  }
 * }
 * 
 * In model/basic/Client.java file:
 * 
 * public class Client {
 * 	  public String name="guilherme";
 * }
 * 
 * In model/advanced/Client.java file:
 * 
 * public class Client {
 *    public String name="mario";
 * } 
 * 
 * a) The code of the first file does not compile, it is error trying to import two classes with the same name.
 * b) The code compiles, but when running, it fails because it imported two classes with the same name.
 * c) The code compiles and prints Welcome guilherme. (x)
 *
 */
public class Question13 {

	public static void main(String[] args) {
		System.out.println("Welcome " + new Client().name);
	}
}
