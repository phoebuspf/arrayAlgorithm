package arrayAlgorithm;

import java.util.*;

public class MaxBasinMaxArea {
	public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length-1;
       
        int res = Integer.MIN_VALUE;
        while(i<j)
        {
            int minHeight = height[i]>=height[j]?height[j]:height[i];
            int area = (j-i+1)*minHeight;
            if(area >= res) res = area;
           
            if(height[i]<height[j]) i++;
            else j--;
        }
        return res;
    }



public static int trap(int A[], int n) {

        int h=0,total=0,i;
        if(n<=2) return 0;
        //Find the highest bar
        for(i=0;i<n;i++)
        {
            if(A[i]>A[h]) h = i;
        }    
        int left = 0;
        for(i=1;i<h;i++)
        {
            if(A[i]>=A[left])left = i;
            else total += A[left]-A[i];
        }
       
        int right = n-1;
        for(i=n-1;i>h;i--)
        {
            if(A[i]>=A[right])right = i;
            else total += A[right]-A[i];
        }
        return total;
    }

	public static int trap2(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int result=0;
		int high = 0;
		int highIdx = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > high) {
				highIdx = i;
				high = A[i];
			}
		}
		int lastIdx=0;
		for(int i=1;i<highIdx;i++)
		{
			if(A[i]>A[lastIdx])
			{
				lastIdx=i;
			}
			else{
				result+=A[lastIdx]-A[i];
			}
		}
		lastIdx=A.length-1;
		for(int j=lastIdx-1;j>highIdx;j--)
		{
			if(A[j]>A[lastIdx])
			{
				lastIdx=j;
			}
			else{
				result+=A[lastIdx]-A[j];
			}
		}
		return result;
	}
    
	public static int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function

		int biggest=Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>biggest) biggest=num[i];
			if(num[i]<min) min=num[i];
		}
		int length= (biggest-min)/8+1;
		int count =0;
		int result=0;
		byte[] pos= new byte[length];
		for(int i=0;i<num.length;i++)
		{
			makePos(pos,num[i]-min);
		}
		boolean continuous= true;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((1 & (1<<j))!=0)
				{
					count++;
					if(count>result) result=count;
				}
				else
				{
					count=0;
				}
			}
		}
        return result;
    }
	
	public static void makePos(byte[] pos, int num)
	{
		int c = num/8;
		int d = num%8;
		pos[c]= (byte)(pos[c] | (1<<d));
	}





























}

