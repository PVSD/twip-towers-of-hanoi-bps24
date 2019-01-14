package com.company;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("Insert number of disks: ");

        int a = k.nextInt();
        int i,b,j,l;

        int [] pos = new int [a];

        System.out.println(Arrays.toString(pos));
        l=(int)Math.pow(2,a);

        for(i=1;i<l;i++)
        {
            b=Integer.parseInt(Integer.toBinaryString(i));
            for(j=1;j<a;j++)
            {
                if(b%10==1) break;
                else b/=10;
            }
            System.out.println("Move disk " + j);
            if(j%2!=a%2)
            {
                pos[j-1]=pos[j-1]+1;
            }
            else
            {
                pos[j-1]=pos[j-1]-1;
            }
            System.out.println(Arrays.toString(pos));
        }
    }
}
