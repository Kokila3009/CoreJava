package com.gentech.mathodswithreturn;
class DoubleOneD{
	double[] DoubleArray(double a[]){
		double[] d=new double[a.length];
		for(int i=a.length-1;i>0;i--) {
			d[i]=a[i];

		}
		return d ;

	}
}
public class OneDDoubleArray {

	public static void main(String[] args) {
		DoubleOneD ob = new DoubleOneD();
		double c[]= {1,31,3,42,34,43,22,11,2,23,21,1,2};
		double result[]=ob.DoubleArray(c);
		for (int i = result.length-1; i >0; i--) {
			double s = (double) result[i];
			System.out.print(s + " ");


		}

	}
}



