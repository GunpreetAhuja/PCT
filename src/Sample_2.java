import java.util.Scanner;

public class Sample_2 {

	public static void main(String [] args)
	{
		int age[], customers, height_feet[], height_inches[];
		double size[];
		String[] beverage, name, cup_size;
		
		int[] limit = new int[3];
		
		//input
		//System.out.print("Enter the cup size limits: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
		{
			limit[i] = sc.nextInt();
		}
		//System.out.println("Number of Customers: ");
		customers = sc.nextInt();
		
		name = new String[customers];
		age = new int[customers];
		height_feet = new int[customers];
		height_inches = new int[customers];
		size = new double[customers];
		beverage = new String[customers];
		cup_size = new String[customers];
		
		//input
		for(int i = 0; i < customers; i++)
		{
			
			//System.out.println("Customer " + (i+1) + ":");
			//System.out.println("Name: ");
			name[i] = sc.next();
			//System.out.println("Age: ");
			age[i] = sc.nextInt();
			//System.out.println("Height in feet and inches: ");
			height_feet[i] = sc.nextInt();
			height_inches[i] = sc.nextInt();
			
			if(height_feet[i] <= 5)
				size[i] = height_feet[i] * 10 + 0.0833333 * height_inches[i] * 10;
			else
				size[i] = 50 + (height_feet[i] - 5) * 8 + height_inches[i] * 8 * 0.0833333;
			
			if(age[i] < 18)
				beverage[i] = "Water";
			else 
				beverage[i] = "Beer";
			
			if (size[i] < limit[0])
				cup_size[i] = "Extra Small";
			else if(size[i] > limit[0] && size[i] <= limit[1])
				cup_size[i] = "Small";
			else if(size[i] > limit[1] && size[i] <= limit[2])
				cup_size[i] = "Medium";
			else
				cup_size[i] = "Large";
		}
		sc.close();
		
		//output
		for(int i = 0; i < customers-1; i++)
		{
			for(int j = i+1; j < customers; j++)
			{
				if(name[i].compareTo(name[j]) > 0)
				{
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					int a = age[i];
					age[i] = age[j];
					age[j] = a;
					a = height_feet[i];
					height_feet[i] = height_feet[j];
					height_feet[j] = a;
					a = height_inches[i];
					height_inches[i] = height_inches[j];
					height_inches[j] = a;
					temp = beverage[i];
					beverage[i] = beverage[j];
					beverage[j] = temp;
					temp = cup_size[i];
					cup_size[i] = cup_size[j];
					cup_size[j] = temp;
					double b = size[i];
					size[i] = size[j];
					size[j] = b;
				}
				else if(name[i].compareTo(name[j]) == 0)
				{
					if(cup_size[i].compareTo(cup_size[j]) < 0)
					{
						String temp = name[i];
						name[i] = name[j];
						name[j] = temp;
						int a = age[i];
						age[i] = age[j];
						age[j] = a;
						a = height_feet[i];
						height_feet[i] = height_feet[j];
						height_feet[j] = a;
						a = height_inches[i];
						height_inches[i] = height_inches[j];
						height_inches[j] = a;
						temp = beverage[i];
						beverage[i] = beverage[j];
						beverage[j] = temp;
						temp = cup_size[i];
						cup_size[i] = cup_size[j];
						cup_size[j] = temp;
						double b = size[i];
						size[i] = size[j];
						size[j] = b;
					}
					else if(cup_size[i].compareTo(cup_size[j]) == 0)
					{
						double hf = height_feet[i] + (double)height_inches[i]/12;
						double hi = height_feet[j] + (double)height_inches[j]/12;
						if(Double.compare(hi, hf) < 0)
						{
							String temp = name[i];
							name[i] = name[j];
							name[j] = temp;
							int a = age[i];
							age[i] = age[j];
							age[j] = a;
							a = height_feet[i];
							height_feet[i] = height_feet[j];
							height_feet[j] = a;
							a = height_inches[i];
							height_inches[i] = height_inches[j];
							height_inches[j] = a;
							temp = beverage[i];
							beverage[i] = beverage[j];
							beverage[j] = temp;
							temp = cup_size[i];
							cup_size[i] = cup_size[j];
							cup_size[j] = temp;
							double b = size[i];
							size[i] = size[j];
							size[j] = b;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < customers; i++)
		{
			System.out.print(name[i] + " ");
			System.out.print(beverage[i] + " ");
			System.out.print(cup_size[i] + " ");
			System.out.print(age[i] + " ");
			System.out.println(height_feet[i] + " " + height_inches[i]);
		}
		
	}

}
