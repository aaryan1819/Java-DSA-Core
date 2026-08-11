import java.util.Scanner;
//find min max of an array in one loop pass, input from user

public class ArrMinMax {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int j = 1 ; j < 5; j++){
            if (arr[j] < min){
                min = arr[j];
            }
            if (arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("Minimum : " + min + "\nMaximum : " + max);
    }
}
