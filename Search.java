
import  java.util.*; 
import  java.lang.*;

class A extends Thread {     
     int array1[] ,find1,i,n1, temp=0;     
	 A(int array[],int find,int n)       
	 {                  
	      n1=n;           
		  array1=array;           
		  find1=find;      
    }       
	public void run()  
     {         
	       int last=n1/2;         
		   for(i=0;i<last;i++)             
		   {          
		       if(array1[i]==find1 && temp==0)                  
			   {             
     			   System.out.println("Element found at " +(i+1));             
				   temp=1;                    				  
			   }          
			    else                      
			    temp=0;                
			}           
	 }      
}  

class B extends Thread {     

    int array2[] ,find2,i,n2, temp=0;    
	B(int array[],int find,int n)      
	{                 
        	n2=n;          
			array2=array;           
			find2=find;     
    } 
     
	 public void run()           
	 
	 {      int last=n2/2;      
         	n2=n2-1;         
			for(i=n2;i>last;i--)        
			{          
     			if(array2[i]==find2 && temp==0)            
				{
                   System.out.println("Element found at " +(i+1));              
				   temp=1;                 
			    }         
				else                     
				temp=0;              				
			}            
	}      
} 

class Search 
{    
     public static void main(String args[])   
	 {
         int n,array[],i,find;     
		 Scanner sc = new Scanner(System.in);      
         System.out.println("Menu:\n 1.Linear search \n 2.Binary search \n 3.Bidirectional search");
         System.out.println("Enter the search technique to be used");      
		 int ch = sc.nextInt();      
		 System.out.println("Enter number of elements");     
		 n = sc.nextInt();       
		 array = new int[n];          
		 System.out.println("Enter elements");    
		 for (i=0 ;i<n ;i++)   
		 {         
		     array[i] = sc.nextInt();     
			 
		 }    
		 System.out.println("Enter value to be searched");    
		 find = sc.nextInt();        
		 if (ch == 1)     
		 {       
		      for (i=0 ;i<n ;i++)      
			  {        
    			  if (array[i] == find)     /* Searching element is present */        
				  {          
				       System.out.println(find + " is present at location " + (i + 1) + ".");         
					   break;         
				  }       
			  }        
			  if (i == n)  /* Element to search isn't present */     
			  System.out.println(find + " isn't present in array.");   
			  }   
			  if (ch == 2)   
			  {         
			     int j,temp, itt ; 
                 for(itt=0;itt<n;itt++)        
                {
                   for(i=0;i<n;i++)       
                   {
                      for(j=0;j<n;j++)            
                     {
                        if(array[j]>array[i])            
                       {
                          temp= array[i];
                          array[i]=array[j];
                          array[j]=temp;      
                       }              
                    }           
                 }    
              }
            System.out.println("sorted array is" ); 
            for(i=0;i<n;i++)       
            {
               System.out.println(""+array[i] );     
            }
            int first=0;        
			int last=n-1;        
			int middle=(first+last)/2;         
			int search=find;         
			while( first <= last )    
           {         
        		   if ( array[middle] < search )           
	                   first = middle + 1;             
					else 
					if ( array[middle] == search )     
                   {            
     				   System.out.println(search + " found at location " + (middle + 1) + ".");             
		               break;               
				   }          
				   else                 
				   last = middle - 1;             
				   middle = (first + last)/2;        
		 }        
		  if ( first > last )          
    		  System.out.println(search + " is not present in the list.\n");      
	  }     
	  if (ch == 3)   
	  {      
     	  A a1=new A( array,find,n );      
		  B b1=new B(array,find,n);       
		  System.out.println("Starting thread A");      
		  a1.start();       
		  System.out.println("Starting thread B");      
		  b1.start();     
	 }     
	} 
}    
 




 




 


