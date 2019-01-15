package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Insert number of disks: ");

        int a = k.nextInt(),j;
        int [] pos = new int [a];

        for(long i=1;i<Math.pow(2,a);i++) {
            String b = Long.toBinaryString(i);
            for(j=1;j<a;j++)
                if(b.substring(b.length()-j,b.length()-j+1).equals("1"))
                    break;
            if(j%2!=a%2) pos[j-1]=pos[j-1]+1;
            else pos[j-1]=pos[j-1]+2;
            System.out.println("Move disk " + j + " to peg " + (pos[j-1]%3+1));
        }
    }
}
