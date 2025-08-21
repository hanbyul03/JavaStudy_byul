package com.sist.util;
import java.util.*;
public class 라이브러리_Random_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        int[] reserve=new int[r.nextInt(10)+11];//11~20
        for(int i=0;i<reserve.length;i++)
        {
        	reserve[i]=r.nextInt(31)+1;
        }
        
	}

}
