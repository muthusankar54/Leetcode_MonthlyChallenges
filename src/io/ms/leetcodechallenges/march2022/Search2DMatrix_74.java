package io.ms.leetcodechallenges.march2022;

public class Search2DMatrix_74 {


    public static void main(String[] args) {

        int[][] matrix = {
                    {1,3,5,7},
                    {10,11,16,20},
                    {23,30,34,60}
                };

        int target = 3;

        boolean result = searchMatrix(matrix,target);

        System.out.println(result);
    }


    public static boolean searchMatrix(int[][] matrix, int target) {

        int low =0 ;
        if(matrix.length ==0){
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int high = (n*m)-1;

        while (low<= high){
            int mid = low + (high - low)/2;

            if(matrix[mid/m][mid%m] == target){
                return true;
            }

            if(matrix[mid/m][mid%m] < target){
                low = mid+1;
            }else{
               high = mid-1;
            }

        }
        return false;

    }
}
