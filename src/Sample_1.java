import java.util.Scanner;

    
public class Sample_1 {
    
    public static void main(String [] args)
    {
        int age[], customers, height_feet[], height_inches[];
        double size[];
        String[] beverage, name, cup_size;
        
        int[] limit = new int[3];
        
        //input
        //System.out.println("Enter the cup size limits: ");
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
            name[i] = sc.nextLine();
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
                beverage[i] = "water";
            else 
                beverage[i] = "beer";
            if (size[i] < limit[0])
                cup_size[i] = "Extra Small";
            else if(size[i] > limit[0] && size[i] < limit[1])
                cup_size[i] = "Small";
            else if(size[i] > limit[1] && size[i] < limit[2])
                cup_size[i] = "Medium";
            else
                cup_size[i] = "Large";
        }
        
        //output
        for(int i = 0; i < customers; i++)
        {
            System.out.print("Customer Name: " + name[i] + " ");
            System.out.print("Beverage type: " + beverage + " ");
            System.out.print("Cup size: " + cup_size + " ");
            System.out.print("Customer Age: " + age[i] + " ");
            System.out.println("Customer Height: " + height_feet[i] + " " + height_inches[i]);
        }
        
    }

    
    }
