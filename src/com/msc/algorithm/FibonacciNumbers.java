/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msc.alguritims;

/**
 *
 * @author master
 */
public class febonachi {

    public static int febonachi(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return febonachi(number-2)+febonachi(number-1);
        }
    }
    
    public static int febonachi2Solution(int number) {
        int n1=0;
        int n2=1;
        int sum=0;
//        if (number == 0) {
//            return 0;
//        } else if (number == 1) {
//            return 1;
//        } else {
            for(int i=0;i<number-1;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            }
            return sum;
//        }
    }
    
    
    

    public static void main(String[] args) {
        System.out.println( febonachi(9));
        System.out.println( febonachi2Solution(9));
    }

//    0 1 2 3 4 5 6 7  8 9 10
//    0 1 1 2 3 5 8 13 21
}
