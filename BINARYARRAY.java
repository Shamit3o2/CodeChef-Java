/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0;i<t;i++){
		    int n =  scan.nextInt();
		    int a[] = new int[n];
		    for(int j=0;j<n;j++){
		        a[j] = scan.nextInt();
		    }
		    int s = 0;
		    for(int k=0;k<n;k++){
		        if(a[k]==0){
		            System.out.print("1"+" ");
		        }
		        else{
		            System.out.print("0"+ " ");
		        }
		    }
		    System.out.println();
		}
	}
}
