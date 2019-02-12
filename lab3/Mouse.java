public class Mouse{
  private String name;
  private int health;
  
  public String getName(){
    return this.name;
  }
  public int getHealth(){
    return this.health;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setHealth(int health){
    this.health= health;
  }
  public Mouse(String name, int health){
    this.name = name;
    this.health = health;
  }
  public void squeal(){
    if (this.health<=0){
      System.out.println("I am dead. XP");
    }
    else if (this.health>0 && this.health<=10){
       System.out.println("I am almost dead.");
    }else{
    System.out.println("Sqqqqqqeeeal");
  }
  }
  public int loseHealth(){
    return this.health-=5;
  }
  public int addHealth(){
    System.out.println("I'm Supermouse! I'll save you!");
    return this.health+=5;
  }
}