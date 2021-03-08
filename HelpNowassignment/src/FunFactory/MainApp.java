package FunFactory;

import java.util.Calendar;
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
		
		MainApp obj = new MainApp();
		int i = 0;
		for(UserDetailGameCard gc : queue)
		{
			i++;
			if(gc.user=='n')
			{
				gc.gcBalance=250; //assuming balance at starting to be 250
				gc.start=1; //game always starts from Game 1
			}
			else if(gc.user=='e')
			{
				System.out.println("enter your current balance : " );
				gc.gcBalance=sc.nextInt(); //accepts value from user 
				System.out.println("enter from which game to do want to start 1 or 10");
				gc.start=sc.nextInt();
			}
			System.out.println("****************\n"+gc.toString()+"\n***********\n");
			
			gc.gcBalance=obj.balanceDeduction(gc.start, gc.gcBalance);
			System.out.println("balance is " + gc.gcBalance);
			//on successfull execution remove the user from the queue
			queue.remove("gc" + i);
			System.out.println("gc"+i+" is removed successfully");
		}
		
		
	}
	
	int balanceDeduction(int start, int balance)
	{
		Scanner sc = new Scanner(System.in);
		//find day according to the system 
		Calendar calendar =Calendar.getInstance();
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String day =days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	    System.out.println(balance);
		char ans='y';
		int s = start;
		if(day.equalsIgnoreCase("saturday") || (day.equalsIgnoreCase("sunday")))
		{
			
			//if user starts game from one on saturday and sunday then balance is deducted 20
			if(start == 1)
			do
			{ 
				//checks if balance < 10, so user will not be able to exit from game
				if(balance > 10)
				balance = balance - 20;
				else
				{
					System.out.println("recharge your account enter amount >10");
					int b =sc.nextInt();
					balance +=b;
				}
				System.out.println("New Balance " + balance);
				ans = startFunction(++s);
			}while(ans == 'y' || ans =='Y');
			
			else if(start == 10)
				do
				{ 
					if(balance > 10)
						balance = balance - 20;
						else
						{
							System.out.println("recharge your account enter amount >10");
							int b =sc.nextInt();
							balance +=b;
						}
					System.out.println("New Balance " + balance);
					ans = startFunction(--s);
				}while(ans == 'y' || ans =='Y');
			else
				System.out.println("*********you cannot start from game " + start + " ***********");
		}
		else //on weekdays the amount is deducted 10
		{
			if(start == 1)
				do
				{ 
					if(balance > 10)
						balance = balance - 10;
						else
						{
							System.out.println("recharge your account enter amount >10");
							int b =sc.nextInt();
							balance +=b;
						}
					System.out.println("New Balance " + balance);
					ans = startFunction(++s);
				}while(ans == 'y' || ans =='Y');
				else if(start == 10)
					do
					{ if(balance > 10)
						balance = balance - 10;
					else
					{
						System.out.println("recharge your account enter amount >10");
						int b =sc.nextInt();
						balance +=b;
					}System.out.println("New Balance"+balance);
						ans = startFunction(--s);
					}while(ans == 'y' || ans =='Y');
			
				else
					System.out.println("*********you cannot start from game " + start + " ***********");
		
		
		}
		return balance;
	}

	//this function regulates the start and continuity of the game
	char startFunction(int start)
	{		
		Scanner sc= new Scanner(System.in);
		char ans;
		
		System.out.println("Do you want to move game " +start + " Y / N");
		ans = sc.next().charAt(0);
		
		if(start==10 || start == 1 )
		{
			System.out.println("You have finished all the game");
			return 'n';
		}
		
		return ans;
		
	}
	

}
