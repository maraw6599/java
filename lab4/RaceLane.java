/**
 * Stores the main method 
 * @author   Natalia Solovyeva 
 *  @version  12/02/2019 
 */
import java.util.Scanner;

public class RaceLane {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        boolean car1Left = false, car2Left = false, carsCollide = false;
        
    //ask user for input: model, location and maxSpeed
        System.out.println("Model: ");
        String model = reader.next();
        System.out.println("Location: ");
        int location = reader.nextInt();
        System.out.println("Max speed: ");
        int maxSpeed = reader.nextInt();
        
    //first car object 
        Car car1 = new Car(model, maxSpeed, location);
        
    //ask user for input: model, location and maxSpeed 
        System.out.println("Model: ");
        String model2 = reader.next();
        System.out.println("Location: ");
        int location2 = reader.nextInt();
        System.out.println("Max speed: ");
        int maxSpeed2 = reader.nextInt();
        
    //second car object
        Car car2 = new Car(model2, maxSpeed2, location2);
        
    //displays both cars
        car1.display();
        car2.display();
        
    //determines which one is on the left        
        if (car1.getLocation()<car2.getLocation()){
            System.out.println(model + " is to the left of " + model2);
            car2.turnAround();
            car1Left = true;
        }
        if (car2.getLocation()<car1.getLocation()){
            System.out.println(model2 + " is to the left of " + model);
            car1.turnAround();
            car2Left = true;
        }
        
    //displays both cars
        car1.display();
        car2.display();
    
    //makes cars move
        car1.go();
        car2.go();
    
        //makes cars collide
        while(!carsCollide){
            car1.continu();
            car2.continu();
            car1.display();
            car2.display();
            
            if(car1Left && car1.getLocation() >= car2.getLocation()) carsCollide = true;
            else if(car2Left && car1.getLocation() <= car2.getLocation()) carsCollide = true;
        }
        System.out.println("Boom!");
       
    }      
    
}
