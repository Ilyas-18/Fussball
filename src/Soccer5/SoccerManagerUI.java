package Soccer5;

import Soccer4.Coach;
import Soccer4.Goalkeeper;
import Soccer4.Player;

public class SoccerManagerUI {

    public static void main(String[] args) {
        Soccer4.Player p=new Player("Heidemann", 44, 8, 10, 10, 0, 2);
        System.out.println(p);
        System.out.println();
        Soccer4.Coach c=new Coach("Müller", 23, 9);
        System.out.println(c);
        System.out.println(p.shootAtGoal());


        Soccer4.Goalkeeper k=new Goalkeeper("Kahn", 48, 9, 0, 7, 23, 8, 8);

        for(int i=0;i<100;i++) {
            int power=p.shootAtGoal();
            System.out.println(k.ballHold(power));
        }
        Coach coach = new Coach("Terzic", 38, 5);
        Goalkeeper goalkeeper = new Goalkeeper("Bürki", 30, 7, 2, 10, 7);
        Team dortmund = new Team("Borussia Dortmund", coach, goalkeeper);
        dortmund.addPlayer(new Player("Meunier", 29, 7, 5, 8, 0));
        dortmund.addPlayer(new Player("Akanji", 25, 8, 6, 8, 0));
        dortmund.addPlayer(new Player("Hummels", 31, 9, 5, 8, 0));
        dortmund.addPlayer(new Player("Guerreiro", 26, 8, 9, 8, 0));
        dortmund.addPlayer(new Player("Witsel", 31, 9, 6, 8, 0));
        dortmund.addPlayer(new Player("Brandt", 24, 9, 8, 8, 0));
        dortmund.addPlayer(new Player("Sancho", 20, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Bellingham", 17, 7, 7, 7, 0));
        dortmund.addPlayer(new Player("Reus", 31, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Haaland", 20, 9, 9, 8, 0));
        System.out.println(dortmund.toString());
        System.out.println("Mannschaftsstärke: " + dortmund.getTotalForce());
        System.out.println("Motivation: "+ dortmund.getTotalMotivation());
    }
}
