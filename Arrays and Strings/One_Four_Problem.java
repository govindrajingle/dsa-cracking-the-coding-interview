import java.util.*;

public class One_Four_Problem {
    public static void main(String[] args) {
        String s = "radfar";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;
        for (Integer count : map.values()) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.print("Palindrome Possible");
        } else {
            System.out.print("Not Possible");
        }

        System.out.print("\n" + map);
    }
}
