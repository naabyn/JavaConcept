package com.company;

public class EqualityArray {
    public void equalityofarray() {
        int[] A = {2, 5, 1, 7, 4};

        int[] B = {2, 5, 1, 7, 4};

        boolean equal;

        if (A.length == B.length) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] == B[i]) {
                    equal = true;
                }
            }
        } else {
            equal = false;
        }
    }
}
