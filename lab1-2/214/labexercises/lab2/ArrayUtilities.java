/**  
 * ArrayUtilities stores methods to calculate a number of elements in given array that are a multiple of some number
 *  @author   Natalia Solovyeva 
 *  @version  01/29/2019 
 */
package labexercises.lab2;
public class ArrayUtilities {
  public int multiple;
  
 /**
   * Calculates the number of elements in the array that are multiple to an integer
   * @param arr is an array
   * @return The number of array's elements that are multiple to a certan integer.
   */
  public int countMultiple(int[] arr){
    int count = 0;
    for (int i=0; i<arr.length; i++){
      if (arr[i] % multiple == 0) count++;
    }
    return count;
  }
   /**
   * Takes as input an int[] and returns all the numbers which are multiples of the multiple property 
   * @param arr is a given array
   * @return The array of all the numbers which are multiples of the multiple property 
   */
  public int[] returnMultiple(int [] arr){
    int count = countMultiple(arr);
    int [] arrEven = new int [count];
    for (int i=0; i<arr.length; i++){
      for (int j=0; j<count; j++){
        if (arr[i] % multiple == 0) {
      arrEven[j]=arr[i];
        }
      }
    }
    return arrEven;
  }
  
}