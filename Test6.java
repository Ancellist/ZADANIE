package src;

import java.util.HashMap;

public class Test6 {
    public static void main(String args[]){
        String str = "qweeukfgeeeet";
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : chars ){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1  );
            }
            else {
                map.put(i,1);
            }
        }
    }
}
