//String Compression 
//input - aabcccccaaa
//output - a2blc5a3

// String Compression: Implement a method to perform basic string compression using the counts 
// of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the 
// "compressed" string would not become smaller than the original string, your method should return 
// the original string. You can assume the string has only uppercase and lowercase letters (a - z).

import java.util.HashMap;

public class One_Six_Problem {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = stringCompression(input);
        System.out.println(result);
    }

    static String stringCompression(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (i + 1 >= input.length() || ch != input.charAt(i + 1)) { //if size is increased first condition and 
                // second condition to check the next element shoud not be same
                sb.append(ch);
                sb.append(map.get(ch));
                map.clear(); //empty hashmap
            }
        }

        return sb.toString(); //convert stringBuilder to string
    }
}
