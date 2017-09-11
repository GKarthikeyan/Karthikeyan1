import java.util.*;
class duplicate_str
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        Set<Character>al=new LinkedHashSet<Character>();
        for(int i=0;i<ch.length;i++)
        {
        	al.add(ch[i]);
        	
        }
        
        for(char r:al)
        	System.out.print(r);
        
   }
}
