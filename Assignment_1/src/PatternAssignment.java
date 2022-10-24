
public class PatternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
//**************** To print INEURON*******************************************
		for(int i=0;i<n;i++)
		{
			// To print letter I
			for(int j=0;j<n;j++) 
			{
				if(j==(n-1)/2 || i==0|| i==n-1)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			// To print letter N
			for(int j=0;j<n;j++) 
			{
				if(j==0 || j==n-1 || i==j)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			// To print letter E
			for(int j=0;j<n;j++) 
			{
				if(i==0|| i==n-1 || j==0 || i==(n-1)/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			// To print letter U
			for(int j=0;j<n;j++) 
			{
				if((j==0&& i!=n-1)|| (j==n-1&& i!=n-1) || (i==n-1&&j>0 && j<n-1))
				{
						System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
			}
			// To print letter R
			for(int j=0;j<n;j++) 
			{
				if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2)||
						(i==j && i>=(n-1)/2))
				{
						System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
			}
			// To print letter O
			for(int j=0;j<n;j++) 
			{
				if((i==0 && j>0 && j!=n-1 ) || (i==n-1 && j!=0 && j!=n-1) || (j==0 && i!=n-1 && i!=0) || (j==n-1 && i!=n-1 && i!=0))
				{
						System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
			}
			// To print letter N
			for(int j=0;j<n;j++) 
			{
				if(j==0 || j==n-1 || i==j)
				{
						System.out.print("* ");
				}
				else
				{
						System.out.print("  ");
				}
			}
			System.out.println();
		}
//*************************************************************************************************

System.out.println();

//*************** To print numbers pattern********************************************************
//		              1 1 1 1 
//		              2 2 2 2 
//		              3 3 3 3 
//		              4 4 4 4 
		int k=5;
		for(int i=1;i<k;i++)
		{
			
			for(int j=1;j<k;j++) 
			{
				System.out.print(i+" ");
			}	
			System.out.println();
		}
//****************************************************************************************************************

		
		System.out.println();
		
		
		
//********** To print pattern***********************************************************************************
//		* * * * * * * * * * * * 
//		* * * * *   * * * * * * 
//		* * * *       * * * * * 
//		* * *           * * * * 
//		* *               * * * 
//		*                   * * 
//		*                     * 
//		*                     * 
//		*                     * 
//		*                     * 
//		*                     * 
//		* * * * * * * * * * * * 
		                        
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++) 
			{
				if(i==0 || i==n-1 || j==0 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
//*******************************************************************************************************

		
		System.out.println();
		
//**************To Print Pattern *********************************************************
		
        
        
        
//              *                     * 
//              * *                 * * 
//              * * *             * * * 
//              * * * *         * * * * 
//              * * * * *     * * * * * 
//              * * * * * * * * * * * * 
//              * * * * * * * * * * * * 
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++) 
			{
				if(i==n-1 || (j==0 && i>(n-1)/2) || (j==n-1 && i>(n-1)/2)
						|| (i-j>=(n-1)/2) || (i+j>=((n-1)+(n-1)/2)))
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
//*************************************************************************************************
		
		
		System.out.println();
		
		
		
//*******To print Pattern ***************************************************************************
		
//		* * * * * * * * * * * * 
//		* * * * *               
//		* * * *                 
//		* * *                   
//		* *                     
//		*                       
//		* *                     
//		* * *                   
//		* * * *                 
//		* * * * *               
//		* * * * * *             
//		* * * * * * * * * * * * 
		
		
		System.out.println();
		// To print pattern Question No.5
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(j==0 || i==0 || i==n-1 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
//********************************************************************************
	}

}
