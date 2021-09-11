package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Spaces = 0;
        boolean Input = false;
        while(true) {
            String string = in.nextLine();
            char[] charArray = string.toCharArray();
            for(char ch : charArray) {
                if(ch == ' ') Spaces++;
                if(ch == '.') Input = true;
            }
            if(Input) break;
        }
        System.out.println(Spaces);
    }
}

