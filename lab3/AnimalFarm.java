public class AnimalFarm{
  public static void main(String[] args){
    Mouse m1 = new Mouse("Pinky", 22);
    Mouse m2 = new Mouse("Brain", 20);
    Mouse superM = new Mouse("Supermouse", 1000);
    m1.squeal();
    m2.squeal();
    
    Dog d1 = new Dog("Max", 2);
    Dog d2 = new Dog ("Bella", 3);
    Dog d3 = new Dog ("puppy", 0);
    d1.bark();
    d2.bark();
    
    while(m1.getHealth()>=5){
     d1.attack(m1);
     m1.squeal();
    }
   
    while (m2.getHealth()>=5){
     d2.attack(m2);
     m2.squeal();
    }
    if (m1.getHealth()<=0) m1.addHealth();
    if (m2.getHealth()<=0) m2.addHealth();
    
    d3.puppy();
    
                               
  }
}