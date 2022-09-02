package io.ms.leetcodechallenges.August2022;

public class Day30_RotateImage_48 {


    public static void main(String[] args) {

       int[][] matrix = {
               {5,1,9,11},
               {2,4,8,10},
               {13,3,6,7},
               {15,14,12,16}
       };

        System.out.println("Before rotate");
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println("");
        }


       rotate(matrix);


        System.out.println("After rotate");
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println("");
        }


    }

    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    private static void reverse(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp = 0;
                 temp = matrix[i][j];
                 matrix[i][j] = matrix[i][matrix.length-1-j];
                 matrix[i][matrix.length-1-j] = temp;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp =0 ;
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    
    
}
