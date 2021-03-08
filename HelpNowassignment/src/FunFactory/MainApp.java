package FunFactory;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MainApp 
{

	
	public static void main(String[] args) 
	{
	//four users four test cases: 
		//test 1 : user is new therefore is 
		UserDetailGameCard gc1 = new UserDetailGameCard(101,'n');
		UserDetailGameCard gc2 = new UserDetailGameCard(123,'e');
		UserDetailGameCard gc3 = new UserDetailGameCard(210,'e');
		UserDetailGameCard gc4 = new UserDetailGameCard(511,'e');
		
		Scanner sc = new Scanner(System.in);
		
		Queue<UserDetailGameCard> queue = new PriorityQueue<UserDetailGameCard>();
		
		
		//adding the test cases to the queue 
		queue.add(gc1);
		queue.add(gc2);
		queue.add(gc3);
		queue.add(gc4);
		
		for(UserDetailGameCard gc : queue)
		{
			if(gc.user=='n')
			{
				gc.gcBalance=250;
				gc.start=1;
			}
			else if(gc.user=='e')
			{
				System.out.println("enter your current balance : " );
				gc.gcBalance=sc.nextInt();
				System.out.println("enter from which game to do want to start 1 or 10");
				gc.start=sc.nextInt();
			}
			
		}
	}
	
	

}
