import java.util.*;

public class Task1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int current = 1;
        int max = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;
            } else {
                current = 1;
            }
            max = Math.max(max, current);
        }
        System.out.printf("%s\n", max);
        sc.close();
    }

}