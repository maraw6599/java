/**
 * Defines the Car object: model, location, speed, moving direction 
 * @author   Natalia Solovyeva 
 *  @version  12/02/2019  
 */
public class Car {
   private String model;
   private int location;
   private int currentSpeed;
   private boolean movingForward;
   private int maxSpeed;
   private boolean changedDirection;
   
   // constructor creates a car object
   Car(String model, int maxSpeed, int location){
       this.model = model;
       this.location = location;
       this.maxSpeed = maxSpeed;
       this.movingForward = true;
       this.currentSpeed = 0;  
       this.changedDirection = false;
   }
   // getters
    String getModel(){
       return this.model;
   }
   boolean getDirection(){
       return this.movingForward;
   }
   int getLocation(){
       return this.location;
   }
   //method sets the current speeed of car to be the object maxSpeed
   void go(){
     this.currentSpeed = this.maxSpeed;  
   }
   //method sets the current speed of the car to 0
   void stop(){
       this.currentSpeed = 0;
   }
   //method changes the boolean movingForward to be the opposit
   void turnAround(){
       this.movingForward = !this.movingForward; 
       this.changedDirection = true;
   }
   //adds or subtracts the currentSpeed from the location
   void continu(){
        if(movingForward){
            this.location += this.currentSpeed;
        }
        if(movingForward){
            this.location -= this.currentSpeed;
        }
    }
   //prints the name of the car, current speed, direction and location
   void display(){
       String temp = "";
       if (movingForward) {
           temp = "forward";
       } else if (!movingForward){
           temp = "backwards";
       } 
       System.out.println(this.model + ": Located at " + this.location + 
               ", fasing " + temp + " and mooving at " + this.currentSpeed + " speed.");
   }
}
