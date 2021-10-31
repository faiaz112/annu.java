import java.util.Scanner; 

public class sampleIIb{ 

    public static void main(String[]args) { 

    int p = 8, q = 2, r = 0; 

 

    while (p >= q) 
    { 

         System.out.printf("%d %d\n",p,q); 

         p = p - q; //6,3

         q++; //3,4

         if (q < 4) 

              r = r + 10; //10

         else  

              r = r + q * 10; //50

         System.out.printf("%d %d\n%d\n",p,q,r);//6,3,10//3,4,50

    } 

    System.out.printf("%d %d\n%d\n",p,q,r); 
    System.out.printf("%d %d\n%d\n",p,q,r); 

   }  

}