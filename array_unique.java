import java.util.*;
public class array_unique{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
        int n, flag = 0, count = 0,l=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");   
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                       flag = 1;
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
            	l=1;
                count++;
                System.out.print("Non repeated elements are:"+a[i]+" ");
            }
        }
        System.out.println("");
        if(l!=1)
       	 System.out.print("No unique element in array");
    }
}
