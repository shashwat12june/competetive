package javaProject;

import java.util.*;

class kadanealgorithm {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    int max_sum = arr[0];
		    int sum_till_pos = 0;
		    for(int i = 0; i<n;i++) {
		        sum_till_pos += arr[i];
		        if(sum_till_pos > max_sum) {
		            max_sum = sum_till_pos;
		        }
		        if(sum_till_pos < 0) {
		            sum_till_pos = 0;
		        }
		    }
		    System.out.println(max_sum);
		    t--;
		}
	}
}