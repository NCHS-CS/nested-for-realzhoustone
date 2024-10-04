/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package org.nhs.app;

// Your code goes here
public class App{
    public static void main(String[] args){
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        challenge();
    }
    public static void ex(){
        for(int i = 1; i < 6; i++){

    
            for (int i2 = 0; i2 < 4; i2++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void p1(){
        for (int i = 1; i < 6; i++){
            for (int i2 = 0; i2 < i; i2++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void p2(){
        for (int i = 1; i < 6; i++){
            for (int i2 = 0; i2 < 5; i2++){
                if (i2 < 5 - i){
                    System.out.print(".");
                    continue;
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void p3(){
        for (int i = 1; i < 6; i++){
            for (int i2 = 0; i2 < 5; i2++){
                if (i2 < 5 - i){
                    System.out.print(".");
                    continue;
                }
                if(i2 > 5 - i){
                    System.out.print(".");
                    continue;
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void challenge(){
        int actualI;
        for (int i = -9; i < 10; i++){
            actualI = 9 - Math.abs(i);
            System.out.println(" ".repeat(Math.abs(i))+ (String.valueOf(actualI)).repeat(actualI * 2));
        }
    }
}