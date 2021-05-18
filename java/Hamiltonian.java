import java.util.ArrayList;

//DEFINITIONS
//A WALK IS A SERIES OF ALTERNATING VERTICES AND EDGES THAT BEGINS AND ENDS WITH A VERTEX IN WHICH ALL ELEMENTS ARE INCIDENT
      //AN OPEN WALK IF THE STARTING AND ENDING VERTICES ARE DIFFERENT
      //A CLOSED WALK IF THE STARTING AND ENDING VERTICES ARE THE SAME
//A TRAIL IS AN OPEN WALK WITHOUT REPEATED EDGES
//A PATH IS A TRAIL WITHOUT REPEATED VERTICES
//A HAMILTONIAN PATH IS A PATH THAT VISITS ALL VERTICES

//A CIRCUIT IS A CLOSED WALK WITHOUT REPEATED EDGES
//CYCLE IS A CIRCUIT WITHOUT REPEATED VERTICES
//A HAMILTONIAN CYCLE IS A CYCLE THAT VISITS ALL VERTICES



class Hamiltonian {
  private int graphsize;
  private IndexPair start;
  private ArrayList<IndexPair> path;
  private ArrayList<IndexPair> cycle;
  
  public Hamiltonian(int[] array2d){
  }
  
  /**
  *finds a valid hamiltonian path if one exists for the start point given
  *@return returns a valid path or null if a valid path does not exist
  */
  private ArrayList<IndexPair> genHamiltonianPath(){
    return null;
  }
  
  /**
  *finds a valid hamiltonian cycle if one exists
  *@return a valid cycle or null if a valid cycle does not exist
  */
  private ArrayList<IndexPair> genHamiltonianCycle(){
    return null;
  }
  
  /**
  *
  *@return boolean if path is valid hamiltonian
  */
  private boolean isValidPath(ArrayList<IndexPair> path){
    return false;
  }
  
  /**
  */
  private boolean isValidCycle(ArrayList<IndexPair> cycle){
    return false;
  }
  
  /**
  */
  private boolean isValidHamiltonian(ArrayList<IndexPair> ham){
    return false;
  }
  
  /**
  */
  private ArrayList<IndexPair> generateWalk(){
    return null;
  }
  
  
  //GETTERS
  public int getGraphSize(){
    return this.graphsize;
  }
  public IndexPair getStart(){
    return this.start;
  }
  public ArrayList<IndexPair> getPath(){
    return this.path;
  }
  public ArrayList<IndexPair> getCycle(){
    return this.cycle;
  }
  
  
  class IndexPair {
    private int x;
    private int y;
    
    protected IndexPair(int x, int y){
      this.x = x;
      this.y = y;
    }
    
    //GETTERS
    protected int getX(){
      return this.x;
    }
    protected int getY(){
      return this.y;
    }
  }
}
