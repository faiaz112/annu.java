import java.util.Scanner; 

public class sampleIIa{ 

    public static void main(String[]args) { 

            int d = 5, c = 3, a = 4, b; 

            Scanner input=new Scanner(System.in); 

            final int LIMIT = 3; 

            for (b = 1; b <= LIMIT; b++)  { 

                if (a >= 2) 

                    a = 0; 

                else 

                    a = b + 1; 

 

                System.out.println("type in a data value"); 

                if (b != 2) 

                    c=input.nextInt(); 

                else 

                    d=input.nextInt(); 

           

                System.out.println(a+" "+b+"\n"+c+" "+d); 

            } 

 

         System.out.println(a+" "+c+" "+d); 

 

         input.close(); 

     } 
    }