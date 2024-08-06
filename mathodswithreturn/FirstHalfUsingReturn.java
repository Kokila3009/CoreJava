package com.gentech.mathodswithreturn;

class OneDReturn {
    int[] OneDim(int a[]) {
        int b = (a.length +1) / 2; 
        int c[] = new int[b];
        for (int i = 0; i < b; i++) {
            c[i] = a[i];
        }
        return c;
    }
}

public class FirstHalfUsingReturn {
    public static void main(String[] args) {
        OneDReturn ob = new OneDReturn();
        int v[] = {2, 2, 34, 53, 67};
        int res[] = ob.OneDim(v);
        
        
        for (int i=0;i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
