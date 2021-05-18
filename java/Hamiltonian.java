import java.util.ArrayList;

class Hamiltonian {
  private int arraySize;
  private IndexPair start;
  private ArrayList<IndexPair> path;
  private ArrayList<IndexPair> cycle;
  
  public Hamiltonian(array2d){
    this.arraySize = array2d.size;
    if (array2d[0].size > this.arraySize){
      this.arraySize = array2d[0].size;
    }
    this.start = new IndexPair(0,0);
    this.path = new ArrayList<IndexPair>(arraySize * arraySize);
  }
  
  public ArrayList<IndexPair> hamiltonianPath(start){
    ArrayList<IndexPair> path = generatePath(start);
    if (isValidPath(path)){
      return path;
    }else{
      return null;
    }
  }
  
  public void hamiltonianCycle(){
  }
  
  class IndexPair {
    private x;
    private y;
    
    public IndexPair(x,y){
      this.x = x;
      this.y = y;
    }
  }
}
