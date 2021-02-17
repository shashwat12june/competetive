package javaProject;
import java.util.*;

class equilibrium {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i;
		while(t > 0) {
		 int n = sc.nextInt();
		 int sum = 0;
		 int arr[] = new int[n];
		 for(i = 0; i< n; i++) {
		   arr[i] = sc.nextInt();
		   sum += arr[i];
		 }
		
	     equilibrium eq = new equilibrium();
	     System.out.println(eq.equisum(arr, n, sum));
		 t--;
	  }
	}
	
	public int equisum(int arr[], int n, int sum) {
	    int sum_left = 0;
	     int j;
		 int sum_right = sum;
	     for(j = 0;j < n; j++) {
		     sum_right = sum_right - arr[j];
		     if(sum_left == sum_right) {
		        return (j+1);
		     }
		     sum_left += arr[j]; 
		 }
		 return -1;
	}
}

static class stack {
   int top = -1;
   int arr[] = new int[100];

   void push(int element) {
	  if(isOverflow()) {
		  System.out.println("Overflow");
	  }
	  else {
		  arr[++top] = element;
	  }

   }

   int pop() {
	   if(isUnderflow() == true) {
		   return -1;
	   }
	   else {
		   System.out.println(arr[top--]);
	   }
   }

   Boolean isOverflow() {
	return (top >= 100) ? true : false;
   }

   Boolean isUnderflow() {
	return (top <= -1) ? true : false;
   }
}

class Linkedlist {
  Node head, current;
  void insert(int element) {
	  current = head;
	Node n = new Node(element);
	if(head == null) {
		n.next = null;
		head = n;
		current = n;
	}
	else {
	while(current.next != null) {
		current = current.next;
	}
	current.next = n;
	}
  }
}

static class Node {
	int value;
	Node next;

	Node(int a) {
		value = a;
	}
}


class insert_linkedlist {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
	}
}



class TreeNode {
	TreeNode left, right;
	int value;
}

class Tree {
	TreeNode root, find_next;
	void insert(int element) {
		TreeNode n = new TreeNode();
		n.value = element;
		if(root == null) {
			n.left = null;
		    n.right = null;
		}
		find_next = next_leaf(root);
	}

	static TreeNode nextNode(TreeNode root) {
		if(root == null){
			return root;
		}
		Queue qu = new Queue();
		  if(qu.empty) {

		  }
		};
	}
}

Find the largest square in a 2D matrix of 0's and 1's. 
