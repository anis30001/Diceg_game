import java.util.Random;
import java.util.Scanner;

public class game {
   private static Random rand = new Random();

   private static Player player1, player2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        setupPlayers(sc);

         //till kallar handollroll metoden + skriv 2 gånger för varje player

        handelRoll(sc,player1);
        handelRoll(sc,player1);


        handelRoll(sc,player2);
        handelRoll(sc,player2);

       // resulatatet efter de har rullat klart.

      if(player1.getScore() > player2.getScore()) {
          System.out.println(("Congrats ")+player1.getName() + " wins "+" with "+player1.getScore()+("points"));


      }else if(player2.getScore() > player1.getScore()) {
          System.out.println(("Congrats ")+player2.getName() + " wins!"+ "with "+ player2.getScore()+("points"));

      }else {
          System.out.println("draw!!");
          System.out.println("Better luck next time!");
      }



    }
    //tillkallar scaner och player ine i handelroll metoden , så jg behöver inte göra en ny kod för varje spelare

    public static void handelRoll(Scanner sc,Player player) {
        System.out.println("next turn "+ player.getName());
        System.out.println("___________");
        System.out.println("press enter to roll");
        String input = sc.nextLine();

        if ( input.equalsIgnoreCase("")){
            int roll = rand.nextInt(6) + 1;
            player.addScore(roll);
            System.out.println(player.getName()+" fick "+ roll);
        }

    }

    public static void setupPlayers(Scanner sc ) {

        System.out.println("ange player 1 namn: ");
        String player1_name =sc.nextLine();
        player1= new Player(player1_name);


        System.out.println("ange player 2 namn: ");
        String player2_name =sc.nextLine();
        player2= new Player(player2_name);
        System.out.println(player1.getName() + " och " + player2.getName());

    }


}
