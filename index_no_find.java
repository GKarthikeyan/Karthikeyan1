import java.util.*;
import java.io.*;
class index_no_find
{

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String n1[] = str.replaceAll("[{}]", "").split(",");
        int k[]=new int[n1.length];
        for(int i=0;i<n1.length;i++){
    	                               k[i]=Integer.parseInt(n1[i]);
    		                             if(k[i]==i){
    			                                       System.out.println(k[i]);
    			                                       break;
    			                                      }
    	                              }
        }         
    }

