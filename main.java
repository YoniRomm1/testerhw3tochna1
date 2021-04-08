package il.ac.tau.cs.sw1.hw3;

import java.util.Arrays;

import static il.ac.tau.cs.sw1.hw3.ArrayUtils.*;

public class main {

    public static void main(String [] args){

        // test q2

        System.out.println("testing q2...");


        tester2(new int[]{1, 2, 3, 4, 5},-1,'R', new int[]{2,3,4,5,1},"q2a");
        tester2(new int[]{1, 2, 3, 4, 5},1,'R', new int[]{5,1,2,3,4},"q2b");
        tester2(new int[]{1, 2, 3, 4, 5},1,'r', new int[]{1,2,3,4,5},"q2c");
        tester2(new int[]{1, 2, 3, 4, 5},-2,'g', new int[]{1,2,3,4,5},"q2d");
        tester2(new int[]{1, 2, 3, 4, 5},3,'L', new int[]{4,5,1,2,3},"q2e");
        tester2(new int[]{1, 2, 3, 4, 5},-3,'L', new int[]{3,4,5,1,2},"q2f");
        tester2(new int[]{0,8,9,5,6},6,'L', new int[]{8,9,5,6,0},"q2g");
        tester2(new int[]{},3,'R', new int[]{},"q2h");
        tester2(new int[]{1,2},-13,'L', new int[]{2,1},"my example");
        tester2(new int[]{1,2,3},-4,'L', new int[]{3,1,2},"my example");


        // test q3

        System.out.println("testing q3...");

        tester3(new int[]{1,-2,3,4,5},7,"q3a");
        tester3(new int[]{1,2,-3,4,5},9,"q3b");
        tester3(new int[]{},0,"q3c");
        tester3(new int[]{-2,3},3,"my example");
        tester3(new int[]{-2,3,-2},5,"my example");

        //test q4

        System.out.println("testing q4...");


        tester4(new int[][]{{1,0,0},{0,1,0},{0,0,1}},1,1,1,1,"q4c");


    }

    public static void test1a(){
        //-> [[1, 4, 7], [2,5,8], [3,6,9]]
        int arr [][] = new int[3][3];
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{4,5,6};
        arr[2] = new int[]{7,8,9};
        int [][] result = ArrayUtils.transposeMatrix(arr);
        for (int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static void test1b(){
        //-> [[-1, 7],[8, -3]]
        int arr [][] = new int[2][2];
        arr[0] = new int[]{-1,8};
        arr[1] = new int[]{7,-3};
        int [][] result = ArrayUtils.transposeMatrix(arr);
        for (int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static void test1c(){
        // -> [[5],[3],[2]]
        int arr [][] = new int[1][3];
        arr[0] = new int[]{5,3,2};
        int [][] result = ArrayUtils.transposeMatrix(arr);
        for (int i=0;i< result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static void test1d(){
        //-> [[1, 4, 7], [2,5,8], [3,6,9]]
        int arr [][] = {};
//        System.out.println(Arrays.toString(arr) + " asdasd");
        int [][] result = ArrayUtils.transposeMatrix(arr);
        for (int i=0;i<result.length;i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static void tester2(int [] arr,int move, char direction, int [] expected,String str){

        int [] shifted = shiftArrayCyclic(arr,move,direction);
        if(!Arrays.equals(shifted,expected)){
            System.out.println("error in " + str + " got " + Arrays.toString(shifted) + " expected " + Arrays.toString(expected));
        }

    }

    public static void tester3(int [] arr,int expected,String str){
        int result = alternateSum(arr);
        if (result != expected){
            System.out.println("error in " + str + " got " + result + " expected " + expected);
        }
    }

    public static void tester4(int[][] arr, int i, int j, int k,int expected,String str){

        int result = findPath(arr,i,j,k);

        System.out.println("error in " + str + " got " + result + " expected " + expected);

    }





}
