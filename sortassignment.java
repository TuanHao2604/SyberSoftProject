package sortassignment;

import java.util.Scanner;

public class sortassignment {
	static final int Min = -100;
	static final int Max = 100;

	public static int[] makeArrays(Scanner scan) {
		int n;
		do {
			System.out.println("please input length of arrays (n>6)");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0);
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Min + (int) (Math.random() * (Max - Min) + 1);
		}
		return a;
	}

	public static void output(int a[]) {
		// System.out.println("Danh sách phần tử trong mảng ");
		for (int i : a) {
			System.out.print(i + "\t");
		}
		System.out.print("\n");
	}

	public static int[] sort(int k[]) {
		for (int i = 0; i < k.length - 1; i++) {
			for (int j = i + 1; j < k.length; j++) {
				if (k[i] > k[j]) {
					int temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		return k;
	}

	public static int[] shufflingSort(int a[], int b[]) {
	    int c[] = new int[a.length + b.length];
	    int i = a.length - 1;
	    int j = b.length - 1;
	    int k = 0;
	    while (i >= 0 && j >= 0) {
	        if (a[i] > b[j]) {
	            c[k++] = a[i--];
	        } else {
	            c[k++] = b[j--];
	        }
	    }
	    while (i >= 0) {
	        c[k++] = a[i--];
	    }
	    while (j >= 0) {
	        c[k++] = b[j--];
	    }
	    return c;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Get array A");
		int a[] = makeArrays(scan);
		System.out.println("Get array B");
		int b[] = makeArrays(scan);
		output(a);
		output(b);
		System.out.println("*************************");
		System.out.print("Array A after sorting: ");
		sort(a);
		output(a);
		System.out.print("Array B after sorting: ");
		sort(b);
		output(b);
		System.out.println("Array C after shufling sorting: ");
		int c[]=shufflingSort(a, b);
		output(c);
	}
}
