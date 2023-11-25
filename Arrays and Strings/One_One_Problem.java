/**
 * One_One_Problem
 */

 // character in string duplication

import java.util.HashMap;
public class One_One_Problem {
    public static void main(String[] args) {
        String s = "ghyridsofgyh";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}