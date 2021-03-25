class die {
  private int sides;
  
  public die(){
    this.sides = 6;
  } //END CONSTRUCTOR
    
  public die(int sides){
    this.sides = sides;
  } //END CONSTRUCTOR
  
  public int roll(){
    return (int) Math.floor(Math.random() * this.sides +1);
  } //END FUNC
} //END CLASS

class dice extends die{
   private int num;
   private int sides;
  
  public dice(){
    super();
    this.num = 1;
  } //END CONSTRUCTOR
  
  public dice(int sides){
    super(sides);
    this.num = 1;
  } //END CONSTRUCTOR
  
  public dice(int num, int sides){
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
