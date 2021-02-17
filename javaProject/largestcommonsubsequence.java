package javaProject;
import java.util.*;

public class largestcommonsubsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
  
        largestcommonsubsequence l = new largestcommonsubsequence();
        System.out.println(s1 + " " + s2);
        int lcscount = l.lcs(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
        System.out.println(lcscount);
      }

	int lcs(char a[], char b[], int m, int n) {
        if(m==0 || n == 0) {
          return 0;
        }
        if(a[m-1] == b[n-1]){
          return 1 + lcs(a, b, m-1, n-1);
        }
        else {
          return max(lcs(a, b, m-1, n), lcs(a, b, m, n-1));
        }
      }

      int max(int a, int b) {
       return (a > b ? a : b);
      }
}