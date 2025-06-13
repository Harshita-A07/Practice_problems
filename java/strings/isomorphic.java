package java.strings;

import java.util.HashMap;

public class isomorphic {
public  static boolean isomorphic(String s, String t){
    

    HashMap<Character,Character> hm = new HashMap<>();
    for(int i=0;i<s.length();i++){
        char sc = s.charAt(i);
        char tc = t.charAt(i);
        if(hm.containsKey(sc)) {
            if(hm.get(sc)!=tc){
                return false;
            } 
        } 
            else{
        if(hm.containsValue(tc)){
                return false;
            }
        hm.put(sc,tc);
        }
        
    }
return true;
}
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isomorphic(s, t));
    }
}
