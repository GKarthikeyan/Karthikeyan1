import java.util.*;
class notes
{
public static void main(String[] args) 
 {		
 Scanner sc=new Scanner(System.in);		
 String m[]=sc.nextLine().split(" ");		
 String con[]=sc.nextLine().split(" ");		
 String fri[]=sc.nextLine().split(" ");		
 int n=Integer.parseInt(m[0]);		
 int f=Integer.parseInt(m[1]);			
 int notes=0,no=0;		
 for(int i=0;i<f;i++)		
 {			
   int friend=Integer.parseInt(fri[i])-1;			
   for(int j=0;j<n;j++)			
   {				
    if(j==friend)				
    {					
     int con1=Integer.parseInt(con[j]);				
     if(con1==0)						
     notes=1;				
     if(con1==1)					
     no=1;									
     break;				
    }		
   }	
  }	
  if(notes==no)	
  System.out.println("YES");	
  else		
  {		
   if(notes==1)		
   System.out.println("YES");	
   if(no==1)	
   System.out.println("NO");	
  }									
 }
}
