package com.BridgeLabs.Util;

public class FunctionalProgramming {
	
	public static void power(int n)
	{
		
	 int i=0;
	int power=1;
	if(n<31){
	while(i<=n){
		System.out.println(i +" " +power);
		power=power*2;
		i=i+1;
	}
	
}
	else
		System.out.println("not a valid number");


}
	
//SUMOFTHREE POGRAM//	
	public static void findTriples(int arr[], int n)
	{
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]);
						System.out.print(" ");
						System.out.print(arr[j]);
						System.out.print(" ");
						System.out.print(arr[k]);
						System.out.print("\n");
					}
				}
			
		}
		}
	}
//Logic for Printing 2DArrays
		
		public static void array(int r, int c,int arr[][])
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
// Logic TO Caluculate the distance between Two Points
		
		public static void calculate(int x, int y)
		{
			double cal=Math.sqrt(x*x+y*y);
			System.out.println(cal);
				
		}
		
		
  // Quadratic Equation Logic 
		public static void quadratic(int a,int b,int c)
		{
			double d1=(b*b)-(4*a*c);
			double	Root1  = Math.abs(-b + Math.sqrt(Math.abs(d1)))/(2*a);
			double	Root2 =Math.abs (-b - Math.sqrt(Math.abs(d1)))/(2*a);
			System.out.println("first root is "+ Root1);
			System.out.println("second root is "+Root2);
			}

			
}
		
		
		
		
		
		
		
		
		
		
		
		

	

	


