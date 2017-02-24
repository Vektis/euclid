package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Largest first");
        System.out.println("Enter first number: ");
        int one = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int two = input.nextInt();
        System.out.println("Recursive(1) or iterative(2): ");
        if(input.next().equals("1")){
            System.out.println(rec(one,two));
        }
        else if(input.next().equals("2")){
            System.out.println(iter(one,two));
        }
    }
    public static int rec(int one,int two) {
        int q = one/two;
        int r = one % two;
        if(r == 0){
            return two;
        }
        else {
            return rec(two,r);
        }


    }
    public static int iter(int one,int two) {
        int oneR = one % two;
        int oneD = one / two;
        int temp = 0;
        int ret;
        while (true) {
            ret = oneR;
            oneR = oneR % two;
            oneD = oneD / two;
            if(oneR == 0){
                return ret;
            }
        }
    }


}
