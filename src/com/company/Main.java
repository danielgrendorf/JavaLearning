package com.company;

public class Main {
    public static void main(String[] Args){

        int x = 1;
        while (x < 10) {
            System.out.println("now i am "+x);
            x++;
        }


        int y = 1;

        do{
            System.out.println("now i am "+y);
            y++;
        }while(y < 10);

        for (int i =1; i<10; i++){
            System.out.println("now i am "+i);
        }

    }
}