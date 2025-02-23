package com.kunal.arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 4, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
    static int search2(int[] arr , int target){
        int s = 0;
        int e = arr.length-1;

        int m;
        while(s<e) {
            m = (s + e)/2;

            if(arr[m] == target){
                return m;
            }

            if(arr[s] <=  arr[m]){
                if(arr[s] <= target && arr[m] >= target){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }else{
                if(arr[m] <= target && arr[e] >= target){
                    s = m+1;
                }else{
                    e = m-1;
                }
            }

        }
        return -1;
    }
}
