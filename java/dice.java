class Die {
  private int sides;
  
  public Die(){
    this.sides = 6;
  } //END CONSTRUCTOR
    
  public Die(int sides){
    this.sides = sides;
  } //END CONSTRUCTOR
  
  public int roll(){
    return (int) Math.floor(Math.random() * this.sides +1);
  } //END FUNC
} //END CLASS

class Dice extends Die{
   private int num;
   private int sides;
  
  public Dice(){
    super();
    this.num = 1;
  } //END CONSTRUCTOR
  
  public Dice(int num){
    super();
    this.num = num;
  } //END CONSTRUCTOR
  
  public Dice(int num, int sides){
    super(sides);
    this.num = num;
  } //END CONSTRUCTOR 
  
  public int roll(){
    int out = 0;
    for (int i = 0; i < this.num; i++){
      out += super.roll();
    } //END LOOP
    return out;
  } //END FUNC
} //END CLASS
