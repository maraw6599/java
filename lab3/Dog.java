public class Dog{
 private String name;
 private int age;
 
 public String getName(){
   return this.name;
 }
 public int getAge(){
   return this.age;
 }
 public void setName(String name){
   this.name = name;
 }
 public void setAge(int age){
   this.age = age;
 }
 public Dog(String name, int age){
   this.name = name;
   this.age = age;
 }
 public void bark(){
   System.out.println("Ruff ruff, my name is "+this.name+"! Ruff! I am "+this.age+" years old. In dog years I am "+(this.age*7)+" years old");
 }
 public void attack(Mouse victim){
   System.out.println("Grrrrrr");
   victim.loseHealth();
  }
 public void makeLove(Dog d){
   System.out.println("You have a cute puppy!" + this.name);
  
 }
 public void puppy(){
   System.out.println("You have a cute puppy!");
   bark();
 }
}
 