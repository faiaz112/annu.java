import java.lang.Math;
public class assignment_1{
    

    public static void main(String[] args) 
    {
        System.out.println("My name is Juhair Alam and this is the output of my first program");
        double x,y;
        x= -3.0;
        while(x<=3.0)
        {
            y = (4*x*x*x+8*x*x-31*x-35)/(Math.sqrt(3*x*x+1)+ (2* Math.abs(x-1.5)));
            if (y==0)
            {
                System.out.println("X = "+x+ " Y ="+y + " Y IS ZERO");
            }
            if (y>0)
            {
                System.out.println("X = "+x+ " Y ="+y + " Y IS POSITIVE");
            }
            if (y<0) 
            {
                System.out.println("X = "+x+ " Y ="+y+" Y IS NEGATIVE");
            }
            x=x+0.5;
           
        }
        System.out.println("My first program is complete");
    }
}

