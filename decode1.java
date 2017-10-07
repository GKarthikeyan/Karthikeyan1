import java.util.*;
class decode1
{
  public static void main(String[] args)  
  {	  
    Scanner sc=new Scanner(System.in);	  
    String s=sc.nextLine();	  
    ArrayList<Integer> a=new ArrayList<Integer>();	  
    for(int i=0;i<s.length();i++)	  
    {		  
       if(Character.isDigit(s.charAt(i)))		  
       {			  
         a.add(Integer.parseInt(Character.toString(s.charAt(i))));		  
       }	  
     }	  
     int d[]=new int[a.size()];	 
     for(int i=0;i<a.size();i++)	 
     {		  
        d[i]=a.get(i);	 
     }	  
     Arrays.sort(d);	 
     int small=d[0],large=d[d.length-1],A=0,B=1,dig3=0;		
     for(int i=0;i<d.length;i++)	  
     {		  
        A +=large*d[i];
        B *= small+d[i];	 
     }		 
     int s1=A%9,s2=B%9;	 
     if(s1>s2)		
     dig3=s2;
     else		
     dig3=s1;		
     System.out.println(dig3*dig3);	
   }
 }
