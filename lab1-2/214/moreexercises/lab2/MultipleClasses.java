/**  
 * MultipleClasses creates an array and then call the written methods 
 *  @author   Natalia Solovyeva 
 *  @version  01/29/2019 
 */
package moreexercises.lab2;
import labexercises.lab2.ArrayUtilities;
public class MultipleClasses {
  
/**
 * The main method that launch the code
 */
  public static void main(String[] args){
    int [] arr = {4, 6, 9, 5, 12};
    ArrayUtilities c = new ArrayUtilities();
    c.multiple = 5;
    c.returnMultiple(arr);
  
    System.out.println(c.countMultiple(arr));
    }
 }