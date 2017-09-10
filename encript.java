import java.util.*;
class encript
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        char ch[]=str[0].toCharArray();
       char ch1[]=str[1].toCharArray(); 
      
     for(int i=0;i<ch.length;i++)
     {
    	 int l=(int)ch[i];
    	 int h=l+10;
    	 if(h>=97 && h<=122)
    	 {
    		 
    		 System.out.print((char)h);
    	 }
    	 else
    	 {
    		 int k=h-122;
    		 System.out.print((char)(k+96));
    	 }
     }
     System.out.print(" "+ch1[0]);
     for(int i=1;i<ch1.length-1;i++)
     {
    	 int l=(int)ch1[i];
    	 int h=l+10;
    	 if(h>=97 && h<=122)
    	 {
    		 
    		 System.out.print((char)h);
    	 }
    	 else
    	 {
    		 int k=h-122;
    		 System.out.print((char)(k+96));
    	 }
     }
     System.out.print(ch1[ch1.length-1]);
   }
}
