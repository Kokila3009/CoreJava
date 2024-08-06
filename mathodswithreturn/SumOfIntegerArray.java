package com.gentech.mathodswithreturn;

class OneDReturnSum {
	int[] OneDimSum(int a[]) {
		int b = a.length; 
		int c[] = new int[b];
		for (int i = 0; i < b; i++) {
			c[i] = a[i];
		}
		return c;
	}
}

public class SumOfIntegerArray {

	public static void main(String[] args) {
		OneDReturnSum  ob = new OneDReturnSum ();
		int v[] = {2, 2, 34, 53, 67};
		int res[] = ob.OneDimSum(v);

		int sum=0;
		for (int i=0;i<res.length;i++) {
			
			sum=sum+res[i];

		}
		System.out.print(sum);

	}
}