package com.company;


import com.math.levenstein.Levenstein;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        String ans1 = in.next();
        String ans2 = in.next();

        Levenstein a = new Levenstein(ans1, ans2);
        System.out.print(a.calculate());
    }
}


