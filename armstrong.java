import java.util.*;
class armstrong
{
   public static void main(String args[])
   {
      int n,num,d,sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number to check armstrong");
	  n=sc.nextInt();
	  num=n;
	  while(n>0)
	  {
	         d=num%10;
		 sum=sum+(d*d*d);
		 num=num/10;
	  }
	  if(num==sum)
	  {
	     System.out.println("Given number is armstrong");
	  }
	  else
	  {
         System.out.println("Given number is not armstrong");	  
	  }
   }
}
