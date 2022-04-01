package io.ms.leetcodechallenges.march2022;


public class Search2DMatrix_240 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        int target = 20;

        boolean result = searchMatrix(matrix,target);

        System.out.println(result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

     if(matrix == null || matrix.length ==0){
         return  false;
     }


     int shortDim = Math.min(matrix.length,matrix[0].length);

     for(int i=0;i<shortDim;i++){
         boolean vertical =  binarySearchVal(matrix,target,i,true);
         boolean horizontal = binarySearchVal(matrix,target,i,false);

         if(vertical || horizontal){
             return true;
         }
     }
     return false;

    }

    private static boolean binarySearchVal(int[][] matrix, int target, int start, boolean b) {

        int low = start;
        int high = b ? matrix[0].length-1 : matrix.length-1;

        while (high >= low){
            int mid = (high + low)/2;

            if(b){

                if(matrix[start][mid] < target){
                    low = mid +1;
                }else if(matrix[start][mid] > target){
                    high = mid-1;
                }else{
                    return true;
                }
            }else{

                if(matrix[mid][start]< target){

                    low = mid +1;

                }else if(matrix[mid][start] > target){

                    high = mid -1;
                }else{
                    return true;
                }
            }
        }

        return false;
    }
}
