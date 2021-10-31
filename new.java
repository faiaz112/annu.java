import java.util.Scanner;
  

  class asdf {

    public static void main(String[] args)
    {
    int count =0;
    while(true)
    {

    Scanner sc = new Scanner(System.in);
    int team = sc.nextInt();
    if (team == -1)
    {
      System.out.println("Total Number of Teams: "+count);
      break;
    }
    int won = sc.nextInt();
    int lost = sc.nextInt();
    System.out.println("Team " + team);
    System.out.println( won  +  " wins ");
    System.out.println( lost  +  " loses ");
    System.out.println("total number of games played for team "+ team +" is "+ (won+lost));
    int Gr ;
    Gr = 25-(won+lost);
    System.out.println(Gr + " Games remaining " );
    float wr ;
    count++;
    wr = ((float)(won)/(float)(won+lost));
    System.out.format("The winning average is " + "%.4f%n",wr);
    if ((won+lost) == 25)
    {
      System.out.println("This team is done for the season");
    }
    if(Gr >=won)
    {
      System.out.println("Number of games remaning is greater than or equal to number won");
    }
    else {
      System.out.println("Number of games remaining is not greater than number lost");
    }
    }
  }
}