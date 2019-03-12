package com.BridgeLabs.Util;

import java.util.Random;

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
					else
						System.out.println("not a single combination is present");
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
		
		public static double calculate(int x, int y)
		{
			double cal=Math.sqrt(x*x+y*y);
			return cal;
				
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

		
  //Permutation LOGIC
		

//Stop Watch
	static long start=0;
	static long stop=0;
	public static long start()
	{
		start=System.currentTimeMillis();
		System.out.println(start);
		return start;
	}
	
	public static long stop()
	{
		stop=System.currentTimeMillis();
		System.out.println(stop);
		return stop;
	}
	public static long elapse()
	{
		long diff = 0;
		if(stop==0)
		{
			System.out.println(start+","+stop);
			long now=System.currentTimeMillis();
			System.out.println(now);
			diff=now-start;
		}
		else
		{
			System.out.println(stop+" ,"+start);
		}
	return diff;
	
	
	
 }
	
	 public static void Username(String name)
	 {
	 	
	 	if(name.length()>=3){
	 		System.out.print("Hello" + name + "How was your day");
	 	}else
	 	System.out.print("invalid name");
	 	
	 }

	public static void betting(int money, int bet) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int max=50;
		int min=0;
		int win=0;
		int count=0,lose=0;
		int pr=r.nextInt((max-min)+1)+min;
		int sr=r.nextInt((max-min)+1)+min;
		 while(money!=0){
			
			if(pr>sr)
			{
				money=money+bet;
				win++;
			}
			if(sr>pr)
			{
				money=money-bet;
				lose--;
			}
			count++;
			
		 }
		 System.out.println("you won"+win);
		 System.out.println("you lose"+lose);
			double moneyperc=win*100/count;
			double betperc=lose*100/count;
			System.out.println("Percentage of money"+ moneyperc);
			System.out.println("percentage of bet"+ betperc);		
		
	}
	 
		
	//Tic-Tac-Toe logic
	
	public static String board[][]=new String[3][3];
	static String cp="x";

	public static void changeplayer() {
		// TODO Auto-generated method stub
	  if (cp == "x") {
	      cp = "o";

	  }

	  else {

	      cp = "x";

	  }

	}
	public static boolean isBoardFull(){

			         boolean isFull = true;



			         for (int i = 0; i < 3; i++) {

			             for (int j = 0; j < 3; j++) {

			                 if (board[i][j] == "-") {

			                     isFull = false;

			                 }

			             }

			         }



			         return isFull;


	}
	public static void printBoard()
	{
		 System.out.println("-------------");
	        for (int i = 0; i < 3; i++) {

	            System.out.print("| ");

	            for (int j = 0; j < 3; j++) {

	                System.out.print(board[i][j] + " | ");

	            }

	            System.out.println();

	            System.out.println("-------------");

	        }

	}
	public static boolean checkForWin() {
		        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
		    }
	public static boolean checkRowsForWin() {

	  for (int i = 0; i < 3; i++) {

	      if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {

	          return true;

	      }

	  }

	  return false;
	}
	public static boolean checkColumnsForWin() {

		        for (int i = 0; i < 3; i++) {

		            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {

		                return true;

		            }

		        }

		        return false;

		    }
	public static boolean checkDiagonalsForWin() {

		        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

		    }
	public static boolean checkRowCol(String board2, String board3, String board4) {

		        return ((board2 != "-" && (board2 == board3) && (board3 == board4)));

		    }
	public static boolean placeMark(int i, int j) {
		        if ((i >= 0) && (i < 3)) {
		            if ((j >= 0) && (j < 3)) {
		                if (board[i][j] == "-") {

		                    board[i][j] = cp;

		                    return true;

		                }
		            }
		        }
		        return false;

		    }


	
// LOGIC FOR COUPONS
	
	
	public static int collect(int num)
	{
		
		boolean[] isCollected = new boolean[num];
		int count =0;
		int distinct=0;
		while(distinct < num)
		{
			int value = coupon(num);
			count++;
			if(!isCollected[value])
			{
				distinct++;
				isCollected[value]=true;
			}
			
		}
		return count;
	}

	private static int coupon(int num) {
		
		return (int)(Math.random()*num);
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	

	
		
		
		
		
		
		
		

	

	


