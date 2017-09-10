import java.util.*;
class password
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String fname=sc.next();
        String lname=sc.next();
        String pin=sc.next();
        int no=sc.nextInt();
        String a[]=new String[2];
        a[0]=fname;
        a[1]=lname;
        Arrays.sort(a);
        String small="",big="";
        if(fname.length()!=lname.length())
        {
            small=(fname.length()<lname.length())?fname:lname;
            big=(fname.length()>lname.length())?fname:lname;
        }
        else
        {
            small=a[0];
            big=a[1];
        }
        StringBuilder sb=new StringBuilder(pin);
        String pin1=sb.reverse().toString();
        char a1=big.charAt(0);
        char a3=pin.charAt(no-1);
        char a4=pin1.charAt(no-1);
        String b1=Character.toString(a1).concat(small);
        String b2=Character.toString(a3).concat(Character.toString(a4));
        String b3=b1.concat(b2);
        char c[]=b3.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(Character.isUpperCase(c[i]))
            System.out.print(Character.toString(c[i]).toString().toLowerCase());
            if(Character.isLowerCase(c[i]))
            System.out.print(Character.toString(c[i]).toString().toUpperCase());
            if(Character.isDigit(c[i]))
            System.out.print(c[i]);
        }
   }
}
