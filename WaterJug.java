
import java.util.*;
class WaterJug
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=0, y=0,j1,j2,goal;
System.out.print("Capacity of Jug1: ");
j1=sc.nextInt();
System.out.print("Capacity of Jug2: ");
j2=sc.nextInt();
System.out.print("Goal: ");
goal=sc.nextInt();
System.out.println("*********************** Menu *********************************");
System.out.println("Rule1:Fill Jug2");
System.out.println("Rule2:Fill Jug1");
System.out.println("Rule3:Transfer all water from Jug2 to Jug1");
System.out.println("Rule4:Transfer all water from Jug1 to Jug2");
System.out.println("Rule5:Transfer some water from Jug2 to Jug1 until Jug1 is full");
System.out.println("Rule6:Transfer some water from Jug1 to Jug2 until Jug2 is full");
System.out.println("Rule7:Empty Jug1");
System.out.println("Rule8:Empty Jug2");
System.out.println();
do
{
System.out.print("Enter your choice: ");
int choice=sc.nextInt();
switch(choice)
{
case 1: if(y<j2)
	{
	y=j2;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 2: if(x<j1)
	{
	x=j1;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 3: if( y>0 && x+y <=j1 )
	{
	x=x+y;
	y=0;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 4: if( x>0 && x+y <=j2)
	{	
	y=x+y;
        x=0;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 5: if(y>0 && x+y>=j1)
	{
	y=y-(j1-x);
	x=j1;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 6: if(x>0 && x+y>=j2)
	{
	x=x-(j2-y);
	y=j2; 
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 7: if(x>0)
	{
	x=0;
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
case 8: if(y>0)
	{
	y=0;	
	System.out.println(x+","+y);
	}
	else{
	System.out.println("Rule not applicable");
	}
	break;
	}
}
while(x!=goal && y!=goal);
System.out.println("Goal Achieved");
}
} 

 


 


