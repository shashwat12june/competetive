package javaProject;
import java.util.*;

// Find the sub array with given sum
// Sliding window solution

public class subarraycount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
    
        subarraycount sb = new subarraycount();
        int result = sb.subArrayCount(arr, 10, sum);
        System.out.println(result);
    }

    int subArrayCount(int arr[], int n, int sum) {
        int current_count = arr[0];
        int start = 0;
        int i;
        int count = 0;
        int flag = 0;
        for(i = 1; i < n; i++) {
            if(current_count == sum) {
                System.out.println((start+1) + " " + (i));
                return 1;
            }
            else if(current_count < sum) {
                current_count += arr[i];
            } 
            else {
                while(current_count > sum) {
                    current_count -= arr[start++];
                }
            }
        }
        if(current_count == sum) {
            System.out.println(start + " " + (i-1));
        }
        return (flag == 1 ? count : 0);
    }
}