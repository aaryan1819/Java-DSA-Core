import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 0;
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 0; i < n - 2; i++){
            if (i <= 1){
                System.out.println(i);
            }
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
            System.out.println(curr);
        }
    }
}
