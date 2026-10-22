package Recursion;
//print numbers from 5 to 1
public class Demo1{
    
    public static void printNumb(int n){
        if(n>0){
            System.out.println(n);
            printNumb(n-1);
        }
    }
    public static void main(String[] args) {
        printNumb(5);
    }
}