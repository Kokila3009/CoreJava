package com.gentech.mathodswithreturn;

class OnedArrayShort {
    short[] OneDShort(short a[]) {
        int b = (a.length + 1) / 2;
        short c[] = new short[b];
        for (int i = 0; i < b; i++) { 
             c[i] = a[b + i]; 
        }
        return c;
    }
}

public class ShortOneDArray {
    public static void main(String[] args) {
        short a[] = {2, 55, 63, 333, 35, 2};
        OnedArrayShort ob = new OnedArrayShort();
        short result[] = ob.OneDShort(a); 
        for (int i = 0; i < result.length; i++) {
            short s = result[i];
            System.out.print(s + " ");
        }
    }
}
