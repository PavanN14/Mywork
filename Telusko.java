package red;

public class Telusko {

	public static void main(String[] args) 
	
	{
		System.out.println();
		
		//Telusko starts here----
		
		for(int i =1;i<=7;i++)    //1st line
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==2||i==5)
				{
					System.out.print(" *");
					
				}
				else if(i==3&&j==1)
				{
					System.out.print(" *");
				}
				else if((i==4||i==6)&&(j==1||j==5))
				{
					System.out.print(" *");
					
				}
				else if((i==7)&&(j==2||j==3||j==4))
					
				{
					System.out.print(" *");
				 
				}
				else 
				{
				System.out.print("  ");
				}
			}
			 System.out.print(" \t");		
		}
		
		System.out.println( );
	
		for(int k=1;k<=7;k++ )  // 2nd line
		{
			for (int l=1;l<=5;l++)
			{
				if((k==1)&&(l==3))
				{
					System.out.print(" *");
				}
				else if((k==2||k==3||k==5)&&(l==1))
					{
							System.out.print(" *");
					}
				else if ((k==4||k==7)&&(l==1||l==5))
				{
					System.out.print(" *");
				}
				else if ((k==6)&&(l==1||l==4))
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print(" \t");
		}
		
		System.out.println( );
		
		for(int m=1;m<=7;m++)  //3rd line
		{
			for(int n=1;n<=5;n++)
			{
				if((m==1)&&(n==3))
			{
				System.out.print(" *");
			}
			else if((m==2||m==3||m==5)&&(n==1))
			{
					System.out.print(" *");
			}
			else if ((m==4||m==7)&&(n==1||n==5))
			{
				System.out.print(" *");
			}
			else if ((m==6)&&(n==1||n==3))
			{
				System.out.print(" *");
			}
			else 
			{
				System.out.print("  ");
			}
				
				
			}
			System.out.print(" \t");
		}
		
		System.out.println( );
		
		for(int o=1;o<=7;o++)  //4th line
		{
			for(int p=1;p<=5;p++)
			{
				if((o==1)&&(p==3))
				{
					System.out.print(" *");
				}
				else if (o==2||o==5)
				{
					System.out.print(" *");
				}
				else if (o==3&&p==1)
				{
					System.out.print(" *");
				}
				else if ((o==4||o==7)&&(p==1||p==5))
				{
					System.out.print(" *");
				}
				else if ((o==6)&&(p==1||p==2))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" \t");
		}
		
		System.out.println( );
		
		
		for(int q=1;q<=7;q++)  //5th line
		{
			for(int r=1;r<=5;r++)
			{
				if((q==1)&&(r==3))
				{
					System.out.print(" *");
				}
				else if((q==2||q==3)&&(r==1))
				{
						System.out.print(" *");
				}
				else if ((q==4||q==7)&&(r==1||r==5))
				{
					System.out.print(" *");
				}
				else if(q==5&&r==5)
				{
					System.out.print(" *");
				}
				else if ((q==6)&&(r==1||r==3))
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
					
					
				}
				System.out.print(" \t");
				
		}
		
		System.out.println( );
		
		
		
		for(int s=1;s<=7;s++)    //6th line
		{
			for (int t=1;t<=5;t++)
			{
				if((s==1)&&(t==3))
				{
					System.out.print(" *");
				}
				else if((s==2||s==3)&&(t==1))
					{
							System.out.print(" *");
					}
				else if ((s==4||s==7)&&(t==1||t==5))
				{
					System.out.print(" *");
				}
				else if(s==5&&t==5)
				{
					System.out.print(" *");
				}
				else if ((s==6)&&(t==1||t==4))
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print(" \t");
				
			}
		
		System.out.println( );
		
		for (int u=1;u<=7;u++)  //7th line
		{
			for (int v=1;v<=5;v++)
			{
				if(u==1&&v==3)
				{
					System.out.print(" *");
				}
			  else if(u==2||u==3||u==5)
				{
					System.out.print(" *");
				}
				else if ((u==6)&&(v==1||v==5))
				{
					System.out.print(" *");
				}
				else if((u==4||u==7)&&(v==2||v==3||v==4))
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.print(" \t");
		}
		
		
		System.out.println("\n");
		
		System.out.println("\n");
		
		//iNeuron starts here---
		
		
		for(int a=1;a<=7;a++)  //1st line
		{
			for(int b=1;b<=7;b++)
			{
				if(a==1)
				{
					System.out.print(" *");
				}
				else if((a==2||a==4||a==7)&&(b==1||b==7))
				{
					System.out.print(" *");
				}
				else if(a==3)
				{
					System.out.print(" *");
				}
				else if((a==5)&&(b==1||b==2||b==3||b==4||b==5))
				
				{
					System.out.print(" *");
				}
				
				else if((a==6)&&(b==3||b==4||b==5))
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(" \t");
		}
		
		System.out.println( );
		
		for(int c=1;c<=7;c++)    //2nd line
		{
			for(int d=1;d<=7;d++)
			{
				if(c==1&&d==4)
				{
					System.out.print(" *");
				}
				else if ((c==2||c==7)&&(d==1||d==2||d==7))
				{
					System.out.print(" *");
				}
				else if(c==3&&d==1)
				{
					System.out.print(" *");
				}
				else if((c==4)&&(d==1||d==7))
				{
					System.out.print(" *");
				}
				else if ((c==5)&&(d==1||d==6))
				{
					System.out.print(" *");
				}
				else if ((c==6)&&(d==2||d==6))
				{
					System.out.print(" *");
				}
				
				else 
				{
					System.out.print("  ");
				}
				
			}
			System.out.print(" \t");
		}
		
		System.out.println( );
		
		
		for(int e=1;e<=7;e++)        //3rd line
		{
			for(int f=1;f<=7;f++)
			{
				if (e==1&&f==4) {
				System.out.print(" *");
			}
				else if ((e==2||e==7) && (f==1 ||f==3||f==7)) {
					System.out.print(" *");
				}
				else if(e==3&&f==1) {
					System.out.print(" *");
				}
				else if((e==4||e==6)&&(f==1||f==7)) {
					System.out.print(" *");
				}
				else if ((e==5)&&(f==1||f==6))
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
				System.out.print(" \t");
		}
		
		System.out.println( );
		
		for(int g=1;g<=7;g++)        //4th line
		{
			for(int h=1;h<=7;h++)
			{
				if (g==1&&h==4) {
				System.out.print(" *");
			}
				else if ((g==2||g==7) && (h==1 ||h==4||h==7)) {
					System.out.print(" *");
				}
				else if(g==3) {
					System.out.print(" *");
				}
				else if((g==4||g==6)&&(h==1||h==7)) {
					System.out.print(" *");
				}
				else if((g==5)&&(h==1||h==2||h==3||h==4||h==5)) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
				System.out.print(" \t");
		}
		
		System.out.println( );
		
		
		for(int e=1;e<=7;e++)        //5th line
		{
			for(int f=1;f<=7;f++)
			{
				if (e==1&&f==4) {
				System.out.print(" *");
			}
				else if ((e==2||e==7) && (f==1 ||f==5||f==7)) {
					System.out.print(" *");
				}
				else if(e==3&&f==1) {
					System.out.print(" *");
				}
				else if((e==4||e==6)&&(f==1||f==7)) {
					System.out.print(" *");
				}
				else if ((e==5)&&(f==1||f==6))
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
				System.out.print(" \t");
		}
		
		System.out.println( );
		
		
		for(int e=1;e<=7;e++)        //6th line
		{
			for(int f=1;f<=7;f++)
			{
				if (e==1&&f==4) {
				System.out.print(" *");
			}
				else if ((e==2||e==7) && (f==1 ||f==6||f==7)) {
					System.out.print(" *");
				}
				else if(e==3&&f==1) {
					System.out.print(" *");
				}
				else if((e==4||e==6)&&(f==2||f==6)) {
					System.out.print(" *");
				}
				else if ((e==5)&&(f==1||f==6))
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
				
			}
				System.out.print(" \t");
		}
		
		System.out.println( );
		
		for(int a=1;a<=7;a++)  //7th line
		{
		for(int b=1;b<=7;b++)
		{
			if(a==1)
			{
				System.out.print(" *");
			}
			else if((a==2||a==7)&&(b==1||b==7))
			{
				System.out.print(" *");
			}
			else if(a==3)
			{
				System.out.print(" *");
			}
			else if((a==5)&&(b==1||b==6))
			
			{
				System.out.print(" *");
			}
			
			else if((a==4||a==6)&&(b==3||b==4||b==5))
			{
				System.out.print(" *");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.print(" \t");
	}
		
}
}
