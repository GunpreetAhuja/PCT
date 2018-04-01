import java.util.Scanner;

public class pct2 {

	public class Node<T>
	{
		public int value;
		public Node left;
		Node right;
		
		public Node(int value)
		{
			this.value = value;
		}
	}
	public static void main(String args[])
	{
		int n, m;
		String[] data_sets, relations;
		
		//input
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		data_sets = new String[n];
		for(int i=0; i<n; i++)
		{
			data_sets[i] = sc.next();
		}
		
		m = sc.nextInt();
		
		relations = new String[m];
		
		sc.close();
	}
	
}
