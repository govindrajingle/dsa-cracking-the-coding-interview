// String Rotation; Assume you have a method isSubs t rin g which checks if one word is a substring 
// of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one 
// call to isSubs t rin g [e.g., "wate r bottle " is a rotation oP'erbottlewat")

// Its actually SubString problem

public class One_Nine_StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DBAC";
        if (isRotated(s1, s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isRotated(String s1, String s2) {
        String concat = s1 + s2;
        return concat.contains(s2);
    }

    // public static boolean isRotated(String s1, String s2) {
    // char arr[] = s1.toCharArray();
    // char brr[] = s2.toCharArray();
    // int n = arr.length;

    // while (n != 0) {
    // for (int i = n - 1; i > 0; i--) {
    // char temp = arr[i];
    // arr[i] = arr[i - 1];
    // arr[i - 1] = temp;

    // if (Arrays.equals(arr, brr)) {
    // return true;
    // }
    // }
    // n--;
    // }
    // return false;
    // }
}
