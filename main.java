package il.ac.tau.cs.sw1.hw3;

import java.util.Arrays;

import static il.ac.tau.cs.sw1.hw3.ArrayUtils.*;
import static il.ac.tau.cs.sw1.hw3.StringUtils.*;

public class main {

    public static void main(String [] args){

        //test q1

        System.out.println("testing q1...");


        tester1(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[][]{{1,4,7},{2,5,8},{3,6,9}},"q1a");
        tester1(new int[][]{{-1,8},{7,-3}},new int[][]{{-1,7},{8,-3}},"q1b");
        tester1(new int[][]{{5,3,2}},new int[][]{{5},{3},{2}},"q1c");
        tester1(new int[][]{{1,2,3},{4,5,6}},new int[][]{{1,4},{2,5},{3,6}},"q1d");
        tester1(new int[][]{},new int[][]{},"q1e");
        tester1(new int[][]{{1,2},{}},new int[][]{{1,2},{}},"my example");



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
        tester2(new int[]{1,2},-13,'L', new int[]{2,1},"my example1");
        tester2(new int[]{1,2,3},-4,'L', new int[]{3,1,2},"my example2");


        // test q3

        System.out.println("testing q3...");

        tester3(new int[]{1,-2,3,4,5},7,"q3a");
        tester3(new int[]{1,2,-3,4,5},9,"q3b");
        tester3(new int[]{},0,"q3c");
        tester3(new int[]{-2,3},3,"my example1");
        tester3(new int[]{-2,3,-2},5,"my example2");

        //test q4

        System.out.println("testing q4...");
        tester4(new int[][]{{1,0,0},{0,1,0},{0,0,1}},1,1,0,0,"q4a");
        tester4(new int[][]{{1,0,0},{0,1,0},{0,0,1}},1,1,1,1,"q4b");
        tester4(new int[][]{{1,0,0},{0,1,0},{0,0,1}},1,1,2,1,"q4c");
        tester4(new int[][]{{0,1,0,0},{0,1,1,0},{0,0,1,1},{1,0,0,1}},0,2,2,1,"q4d");
        tester4(new int[][]{{1,1,0,0},{0,1,1,0},{0,0,1,1},{1,0,0,1}},0,2,1,0,"q4e");


        //test q5

        System.out.println("testing q5...");


        tester5("to be or not to be","not to", "q5a");
        tester5("my mind is an empty zoo","an empty zoo", "q5b");
        tester5("","", "q5c");
        tester5("andy bought candy","andy bought candy", "q5d");
        tester5("life is not not not fair","is not not not", "q5e");
        tester5("art act","act", "q5f");
        tester5("a b f a c d da cd ","a c d da", "my example1");
        tester5("d c b a","a", "my example2");
        tester5("     ","", "my example3");

        //test q6

        System.out.println("testing q6...");


        tester6("mothEr in law","hitlEr woman",true,"q6a");
        tester6("ListeN","SileNt",true,"q6a");
        tester6("software","jeans",false,"q6a");
        tester6("Funeral","real Fun",true,"q6a");
        tester6("Aa","aA",true,"q6a");
        tester6("","   ",true,"q6a");
        tester6("abc","cba ",true,"my example");
        tester6("abcd","abc",false,"my example");
        tester6("aaa","aAa",true,"my example");

        //test q7

        System.out.println("testing q7...");


        tester7("dog","god",false,"q7a");
        tester7("x","x",true,"q7b");
        tester7("main","man",true,"q7c");
        tester7("ab","cab",true,"q7d");
        tester7("a","ab",true,"my example1");
        tester7("abc","ade",false,"my example2");
        tester7("","a",true,"my example3");
        tester7(" ","b",true,"my example4");
        tester7("  ","b",false,"my example4");




    }



    public static void tester1(int [][] arr, int [][] expected,String question){

        int [][] result = ArrayUtils.transposeMatrix(arr);

        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                if (result[i][j]!=expected[i][j]){
                    System.out.println("error in " + question + " got " + "result[i][j] = " + result[i][j] + " expected " + expected[i][j]);
                    break;
                }
            }
        }
    }

    public static void tester2(int [] arr,int move, char direction, int [] expected,String question){

        int [] shifted = shiftArrayCyclic(arr,move,direction);
        if(!Arrays.equals(shifted,expected)){
            System.out.println("error in " + question + " got " + Arrays.toString(shifted) + " expected " + Arrays.toString(expected));
        }

    }

    public static void tester3(int [] arr,int expected,String question){
        int result = alternateSum(arr);
        if (result != expected){
            System.out.println("error in " + question + " got " + result + " expected " + expected);
        }
    }

    public static void tester4(int[][] arr, int i, int j, int k,int expected,String question){

        int result = findPath(arr,i,j,k);

        if (result != expected){
            System.out.println("error in " + question + " got " + result + " expected " + expected);
        }


    }

    public static void tester5(String str, String expected, String question) {

        String result = findSortedSequence(str);

        if (!expected.equals(result)){
            System.out.println("error in " + question + " got " + result + " expected " + expected);
        }



    }

    public static void tester6(String str1,String str2,boolean expected,String question){

        boolean result = isAnagram(str1,str2);

        if (result != expected){
            System.out.println("error in " + question + " got " + result + " expected " + expected);
        }
    }

    private static void tester7(String str1, String str2, boolean expected, String question) {

        boolean result = isEditDistanceOne(str1,str2);

        if (result != expected){
            System.out.println("error in " + question + " got " + result + " expected " + expected);
        }
    }







}
