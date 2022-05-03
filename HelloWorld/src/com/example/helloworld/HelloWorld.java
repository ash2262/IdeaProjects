package com.example.helloworld;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer>A=new ArrayList<>();
        A.add(1);
        A.add(6);
        A.add(4);
        A.add(6);
        A.add(5);
        A.add(1);
        A.add(5);
        A.add(2);
        A.add(6);
        A.add(4);
        A.add(4);
        A.add(2);
        A.add(1);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            max = Math.max(max, A.get(i));
            min = Math.min(min, A.get(i));
        }
        //System.out.println(max+" "+min);
        int ans=A.size();
        int N=A.size();
        int min_i=-1;
        int max_i=-1;
        int len=0;
        if(min==max)
            System.out.println(1);
        for (int i =N-1 ; i>= 0; i--) {
            if(A.get(i)==min){
                min_i=i;
                if(max_i!=-1){
                    len=max_i-min_i+1;
                    ans=Math.min(len,ans);
                }

            }
            else if(A.get(i)==max){
                max_i=i;
                if(min_i!=-1){
                    len=min_i-max_i+1;
                    ans=Math.min(len,ans);
                }
            }
        }
        System.out.println(ans);
    }
}
