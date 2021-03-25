import java.util.ArrayList;

class Encrypt {
  
  public Encrypt(){}//NO REAL CONSTRUCTOR
  
  public static String reverseEncrypt(String string){
    ArrayList<String> arr = Arrays.asList(string.split(""));
    String out = ""
    for(int i = arr.size()-1; i >= 0 ; i--) {
      out = out + arr.get(i);
    } 
    return out;
  } //END FUNCTION
} //END CLASS
