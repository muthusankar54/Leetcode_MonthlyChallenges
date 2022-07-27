package io.ms.leetcodechallenges.june2022;

public class Day24_SearchIn2DMatrix_II_240 {

    public static void main(String[] args) {

        int [][] matrix = {{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 5;

        boolean result = searchMatrix(matrix,target);

        System.out.println(result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;

        int n =0;

        if(m!=0){
            n = matrix[0].length;
        }

        if( m ==0 || n==0 ){
            return false;
        }

        int i = m-1;
        int j =0;

        while (i >=0 && j <n){
            int current = matrix[i][j];
            if(current == target){
                return true;
            }else if(current > target){
                i--;
            }else {
                j++;
            }
        }

        return false;
    }
}
