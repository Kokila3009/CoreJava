package com.gentech.mathodswithreturn;
class Table {
	String[] table(int num, int st, int stp) {
		int s = (stp - st) + 1;
		String[] a = new String[s];

		int k = 0;

		for (int i = stp; i >= st; i--) {
			String str= num + "*" + i + "=" + (num * i);
			a[k++] = str;

		}
		return a;
	}
}
public class CompleteTable {
	public static void main(String[] args) {
		Table ob = new Table();
		String[] res = ob.table(9, 1, 10);
		for (String s : res) {
			System.out.println(s);
		}
	}
}

