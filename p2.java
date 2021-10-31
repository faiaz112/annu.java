import java.util.Scanner;


public class p2 {
   
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in); 
        int count =0;
        while (true)
        {
            
            String userName = myObj.nextLine(); 
            if (userName.equals("exit"))
            {

                System.out.println("Total Number of Teams: "+count);
                break;
            }
            String team = userName.substring(0, 4);
            System.out.println("Team "  +  team);
            int won = Character.getNumericValue(userName.charAt(5));
            System.out.println( won  +  " wins ");
            int lost = Character.getNumericValue(userName.charAt(7));
            System.out.println( lost  +  " loses ");
            System.out.println("total number of games played for team "+ team +" is "+ (won+lost));
            int Gr ;
            Gr = 25-(won+lost);
            System.out.println(Gr + " Games remaining " );
            float wr ;
            count++;
            wr = ((float)(won)/(float)(won+lost));
            System.out.format("%.4f%n",wr);
            if ((won+lost) == 25)
            {
                System.out.println("This team is done for the season");

            }
            else {
            System.out.println("This team still has " + (won+lost) + " Games remaining");
            }
            if(Gr >=won)
            {
                System.out.println("Number of games remaning is greater or equal to number won");
            }
            else {
                System.out.println("Number of games remaining is not greater or equal to number lost");
            }

        }   

    }
}
