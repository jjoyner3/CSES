import java.util.Scanner;

public class Task1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        nums[0] = sc.nextLong();
        long moves = 0;
        for(int i=1; i<n; i++){
            long temp = sc.nextLong();
            if(temp < nums[i-1]){
                moves += nums[i-1]-temp;
                nums[i] = nums[i-1];
            }else{
                nums[i] = temp;
            }
        }
        System.out.println(moves);
        sc.close();
    }
}
