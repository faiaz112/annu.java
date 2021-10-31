import java.lang.Math;
import java.util.Scanner;
public class h3 {
    public static void main(String[] args )
    {
        
        float max_avg = 0;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            int athlete = sc.nextInt();
            if(athlete==-1)
            {
                System.out.println("Athlete " + athlete +" had the highest average of " + max_avg);
                break;

            }

            int a = sc.nextInt();
            while (a>=1)
            {
                
            }

            Float max = Math.max(Math.max(Math.max(b,c),Math.max(d,e)),Math.max(Math.max(f,g),h));
            Float min = Math.min(Math.min(Math.min(b,c),Math.min(d,e)),Math.min(Math.min(f,g),h));
            float total = (b+c+d+e+f+g+h-max-min);
            float average = (total/5);
            System.out.println("The average score of athlete " + athlete + " is " + average);
            if (average>max_avg)
            {
                max_avg=average;
            }
            
        }
        }

    
}