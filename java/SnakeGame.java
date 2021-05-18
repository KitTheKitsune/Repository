import Hamiltonian.java;

class SnakeGame {
  private int fieldSize;
  private Hamiltonian cycle;
  private String[][] field;
  
  public SnakeGame(){
    this.fieldSize = 20;
    this.field = new String[this.fieldSize][this.fieldSize];
    for (int i = 0; i < this.fieldSize; i++){
      for (int j = 0; j < this.fieldSize; j++) {
        if (i == Math.floor(this.fieldSize/2) && j == Math.floor(this.fieldSize/2)){
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
    int x = (Integer) Math.floor(Math.random() * this.fieldSize);
    int y = (Integer) Math.floor(Math.random() * this.fieldSize);
    
    if (this.field[x][y] == "~") {
      this.field[x][y] = "A";
    }else{
      generateFruit();
    }
  }
  
  
}
