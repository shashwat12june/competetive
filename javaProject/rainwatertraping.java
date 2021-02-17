package javaProject;

/*package whatever //do not write package name here */

import java.util.*;

class rainwatertraping {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
		    int max_left = 0;
		    int max_right = 0;
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int left[] = new int[n];
		    int right[] = new int[n];
		    for(int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		        left[i] = max_left;
		       if(arr[i] > max_left) {
		           max_left = arr[i];
	           }
		    }
		   
		  for(int i = n-1; i > 0 ; i--) {
		       right[i] = max_right;
		       if(arr[i] > max_right) {
	            max_right = arr[i];
    	        }
 		    }
 		    
 		   int count = 0;
 		   for(int i = 0; i < n; i++) {
 		      int min = (left[i] < right[i]) ? left[i] : right[i];
 		      int diff = min - arr[i];
 		      if(diff > 0) {
 		        count += diff;  
 		      }
 		   }
 		   System.out.println(count);
 		   t--;
		}
	}
}