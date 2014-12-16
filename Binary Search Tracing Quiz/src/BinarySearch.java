import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch
	{
	private static boolean complete = false;
	private static int rightInput = 0;
	private static int leftInput = 0;
	private static int middleInput = 0;
	private static int middleNumInput = 0;
	private static int right = 0;
	private static int left = 0;
	private static int middle = 0;
	private static int middleNum = 0;
	private static int target = 0;
	private static int nextInt = 0;
	private static int correct = 0;
	private static boolean again = true;
	@SuppressWarnings("rawtypes")
	private static ArrayList array = new ArrayList();
	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args)
		{
		System.out.println("Welcome to my Binary Search Quizer.");
		while(again==true)
			{
			System.out.println("Please enter numbers between 0 and 20 inclusive (hit enter after each number). Use the number -1 to end.");
			while (nextInt != -1)
				{
				Scanner arrayAdder = new Scanner(System.in);
				if(arrayAdder.hasNextInt())
					{
					nextInt = arrayAdder.nextInt();
					if(nextInt<=20&&nextInt>=0)
						{
						array.add(nextInt);
						}
					else if(nextInt != -1)
						{
						System.out.println("Input must be between 0 and 20 inclusive.");
						}
					}
				else
					{
					System.out.println("Please enter a int.");
					}
				}
			Collections.sort(array);
	//		arrayAdder.close();
			target = (int) (Math.random()*20+1);
			System.out.println("The target is " + target);
			int counter = 0;
			right = array.size()-1;
			while(complete==false)
				{
				System.out.println(array.toString());
				counter++;
	//			Scanner traceInput = new Scanner(System.in);
				System.out.print("Pass #" + counter + " Left: ");
				leftInput = new Scanner(System.in).nextInt();
				System.out.print("Right: ");
				rightInput = new Scanner(System.in).nextInt();
				System.out.print("Middle: ");
				middleInput = new Scanner(System.in).nextInt();
				System.out.print("Array[Middle]: ");
				middleNumInput = new Scanner(System.in).nextInt();
	//			traceInput.close();
				middle = (left+right)/2;
				middleNum = (int)array.get(middle);
				if(rightInput == right && leftInput == left && middleInput == middle && middleNumInput == middleNum)
					{
					System.out.println("Correct!");
					correct++;
					}
				else
					{
					System.out.println("Incorrect. The correct answer is:");
					System.out.println("Pass #" + counter + " Left: " + left + " Right: " + right + " Middle: " + middle + " Array[Middle]: " + middleNum);
					System.out.println("Press enter to continue...");
					Scanner pause = new Scanner(System.in);
					pause.nextLine();
					}
				if(target<(int)array.get(middle))
					{
					right = middle - 1;
					}
				else if(target<(int)array.get(middle))
					{
					left = middle + 1;
					}
				else if ( target==(int)array.get(middle))
					{
					complete = true;
					System.out.println("The target was found at index " + middle);
					}
				else
					{
					complete = true;
					System.out.println("The target was not in the array.");
					}
				}
			System.out.println("You got " + ((int)((double)correct/counter*100)) +"% correct.");
			if(((int)((double)correct/counter*100))==100)
				{
				System.out.println("Perfect!");
				}
			else if(((int)((double)correct/counter*100))>90)
				{
				System.out.println("Well done!");
				}
			else if(((int)((double)correct/counter*100))>80)
				{
				System.out.println("Nice.");
				}
			else if(((int)((double)correct/counter*100))>70)
				{
				System.out.println("You could use some practice.");
				}
			else if(((int)((double)correct/counter*100))>60)
				{
				System.out.println("Keep practicing.");
				}
			else
				{
				System.out.println("You need to practice this topic some more.");
				}
			Scanner check = new Scanner(System.in);
			System.out.println("Would you like to play again enter 1 for yes 2 for no.");
			if(check.hasNextInt())
				{
				int repeat = check.nextInt();
				if(repeat==1)
					{
					again = true;
					}
				else
					{
					again = false;
					}
				}
			else
				{
				again = false;
				}
			}
		System.out.println("Goodbye!");
		}
	}
