import java.util.ArrayList;

function String Encrypt(String string){
  ArrayList<String> arr = Arrays.asList(string.split(""));
  String out = ""
  for(int i = arr.size()-1; i >= 0 ; i--) {
    out = out + arr.get(i);
  } 
  return out;
}
