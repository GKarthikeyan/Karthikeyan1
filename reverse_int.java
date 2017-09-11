import java.util.*;
class reverse_int
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int ch[]=new int[str.length()];
	for(int i=0;i<str.length();i++)
	ch[i]=Integer.parseInt(Character.toString(str.charAt(i)));
	List<Integer>al=new ArrayList<Integer>();
	for(int i=0;i<ch.length;i++)
	al.add(ch[i]);
	Collections.reverse(al);
	for(int k:al)
	System.out.print(k);
	}
}
