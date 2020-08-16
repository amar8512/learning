package com.noida.learning.threads;

class Solution {
    public int[] sortedSquares(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException();
        }
        int n = arr.length;
        int[] squares = new int[n];
        int highestSquareIdx = n - 1;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                left++;
            } else {
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }

        }
        return squares;
    }
    }

