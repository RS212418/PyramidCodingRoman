package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter any integer");
        int number;
        number = Input.nextInt();
        int i = 1;
        while (i < number) {
                System.out.print(i);
                i++;

            }


        }
    }
