package com.gentech.mathodswithreturn;
class TableSeven {
	int[] SevenTable(int num, int st, int stp) {
		int s = (stp - st) + 1;
		int[] a = new int[s];

		int index=0;
		for (int i = stp; i >= st; i--) {

			a[index++] = num * i;
		}

		return a;
	}
}
public class SeventhTable {

	public static void main(String[] args) {
		TableSeven ob = new TableSeven();
		int res[]=ob.SevenTable(7, 1, 10);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

}
