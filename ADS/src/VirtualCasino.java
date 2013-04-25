import java.io.BufferedReader;
import java.util.Scanner;

public class VirtualCasino {

	
	int []ShuffleCardsint (int toShuffle[])
	{
		for(int i=1;i<toShuffle.length;i++)
		{
			toShuffle[i] = ((125 * i) % 53);  //Using Random shuffling formula
		}
		return toShuffle;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int UnShuffled[] = new int[53];			 //Consider a Array of 52 integers each integer is a card from pack
		for(int i=1;i<UnShuffled.length;i++)   
		{
			UnShuffled[i] = i;                
		}
		System.out.println("Input - Unshuffled Cards");
		for(int i=1;i<UnShuffled.length;i++)
		{
			System.out.print(UnShuffled[i] + " ");        //Printing those Unshuffled cards
		}
		System.out.println("");
		VirtualCasino v = new VirtualCasino();
		int Shuffled[] = new int[53];
		Shuffled = v.ShuffleCardsint(UnShuffled);        //Shuffled Array contains shuffled cards
		System.out.println("Output - Shuffled Cards");
		for(int i=1;i<Shuffled.length;i++)
		{
			System.out.print(Shuffled[i] + " ");        //Printing those Shuffled cards
		}
		System.out.println("");
		System.out.println("Enter Number of person");
		int c = sc.nextInt();
		System.out.println("Enter Number of cards to each person");
		int p = sc.nextInt();
		int count = 1;
		int count1 = 1;
		System.out.println("");
		if(c*p <= 52)
		{
			while(count <= p)
			{
				System.out.print("Person "+count+" ");
				
				for(int i=0;i<c;i++)
				{
					System.out.print(Shuffled[count1]+" ");
					count1++;
				}
				count++;
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Insufficient Cards");
		}
	}
}
