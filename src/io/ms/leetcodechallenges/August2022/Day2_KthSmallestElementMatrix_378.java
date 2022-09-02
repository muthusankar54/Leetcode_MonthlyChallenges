package io.ms.leetcodechallenges.August2022;

import java.util.Collections;
import java.util.PriorityQueue;

public class Day2_KthSmallestElementMatrix_378 {

    public static void main(String[] args) {

       int[][] matrix = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
       int k = 8;

//       int result = kthSmallest(matrix,k);
//
//        System.out.println(result);
    }


//    public static int kthSmallest(int[][] matrix, int k) {
//
//        if(matrix == null || matrix.length ==0){
//            return k;
//        }
//
//        int row = matrix.length;
//        int column = matrix[0].length;
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int i=0;i<row;i++){
//
//            for(int j=0;j<column;j++){
//
//                maxHeap.offer(matrix[i][j]);
//
//                if(maxHeap.size() > k){
//                    maxHeap.poll();
//                }
//            }
//        }
//
//        return maxHeap.poll();
//    }


//    public static int kthSmallest(int[][] matrix, int k) {
//
//    }
}
