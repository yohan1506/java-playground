package com.yohan;

/**
 * @author yohan1506
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bub = new BubbleSort();
        bub.sort();
    }
    
    public void sort() {
        int a[] = {9,8,7,6,5,4,3,2,1};
        int length = a.length;
        System.out.println("length : " + length);
        printArray(a);
        
        for (int i = 0; i < length -1 ; i++) {
            for (int j = 0; j < length - i - 1 ; j++) {
                System.out.println("a[j] = " + a[j] + " a[j+1] = " + a[j+1]);
                
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
                
                printArray(a);
            }
        }
    }
    
    private void printArray(int[] arr) {
        System.out.println("Result : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n====================");
    }

}
