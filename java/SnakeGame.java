import Hamiltonian.java;

class SnakeGame {
  private int fieldsize;
  private Hamiltonian cycle;
  private String[][] field;
  
  public SnakeGame(){
    this.fieldsize = 20;
    this.field = new String[this.fieldsize][this.fieldsize];
    for (int i = 0; i < this.fieldsize; i++){
      for (int j = 0; j < this.fieldsize; j++) {
        if (i == Math.floor(this.fieldsize/2) && j == Math.floor(this.fieldsize/2)){
          this.field[i][j] = "S";
        }else{
          this.field[i][j] = "~";
        }
      }
    }
    this.cycle = new Hamiltonian(this.field);
    generateFruit();
  }
  
  private void generateFruit(){
    int x = (Integer) Math.floor(Math.random() * this.fieldsize);
    int y = (Integer) Math.floor(Math.random() * this.fieldsize);
    
    if (this.field[x][y] == "~") {
      this.field[x][y] = "A";
    }else{
      generateFruit();
    }
  }
  
  
}
