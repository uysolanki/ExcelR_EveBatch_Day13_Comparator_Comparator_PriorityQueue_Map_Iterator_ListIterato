package day12.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceStall {

	static PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of mango Juices");
		int mangoJuices=sc.nextInt();
		System.out.println("Enter Number of Orange Juices");
		int orangeJuices=sc.nextInt();
		System.out.println("Enter Number of PineApple Juices");
		int pineAppleJuices=sc.nextInt();
		pq.add(mangoJuices);
		pq.add(orangeJuices);
		pq.add(pineAppleJuices);
		
		int minimumTime=calculateTime();
		System.out.println("Minimum Time Taken to prepare Order "+ minimumTime);
	}
	private static int calculateTime() {
		int counter=0;
		Iterator<Integer> list=pq.iterator();
		int num1,num2;
		while(!pq.isEmpty())
		{
			num1=0;
			num2=0;
			
			if(list.hasNext())
			num1=pq.remove();
			
			if(list.hasNext())
			num2=pq.remove();
			
			if(num1>0 && num2>0 )
			{
				num1--;
				num2--;
				counter++;
			}
			
			if(num1>0)
				pq.add(num1);
			
			if(num2>0)
				pq.add(num2);
			
			if(num1>0  && num2==0)
			{
				counter+=num1;
				break;
			}
			
			if(num1==0  && num2>0)
			{
				counter+=num2;
				break;
			}
		}
		return counter;
	}

}
