package com.devix.www;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int random1 = random.nextInt();
        int random2 = random.nextInt(10);

        System.out.println(random1);
        System.out.println(random2);
    }
}
