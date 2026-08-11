import java.util.Scanner;

public class isPalindrome {
    static boolean isPal(String x){
        int left = 0;
        int right = x.length() - 1;

        while (left < right){
            if (x.charAt(left) != x.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();

        System.out.println(isPal(pal));
    }
}
