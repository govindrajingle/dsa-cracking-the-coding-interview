//String permutations : check one string is permutation of another

import java.util.HashMap;

public class One_Two_Problem {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "badc";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.putIfAbsent(ch, 1);
        }
        for (char ch : t.toCharArray()) {
            map.put(ch, map.get(ch) - 1);
        }
        for (Integer i : map.values()) {
            if (i != 0) {
                System.err.println("No permutaion present");
                System.exit(0);
            }
        }
        System.err.println("permutation Present");
    }
}
