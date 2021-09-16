package com.company;

public class Main {

    static int matrix_traversal(int [][]arr,int col,int row,int row_num,int col_num)
    {
        if(col>=col_num)
            return 0;
        if(row>=row_num)
            return 1;
        System.out.println(arr[row][col]);
        if(matrix_traversal(arr,col+1,row,row_num,col_num)==1)
            return 1;
        return matrix_traversal(arr,0,row+1,row_num,col_num);
    }

    public static void main(String[] args) {

        int [][]arr={{1,2},{3,4}};
        matrix_traversal(arr,0,0,2,2);
    }
}
