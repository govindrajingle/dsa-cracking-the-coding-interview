// Replace spaces with characters

public class One_Three_Problem {
    public static void main(String[] args) {
        String s = "h urop aaf gg ";
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                sb.append("%40");
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
