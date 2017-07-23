import java.util.Scanner;

public class Str_reverse{

	public static void main(String[] args) {
		int pal=0;
		Scanner sc=new Scanner(System.in);
		String no=sc.nextLine();
		sc.close();
		StringBuilder input1 = new StringBuilder();
        input1.append(no);
         input1 = input1.reverse();

       System.out.println(input1);
      

	}

}
