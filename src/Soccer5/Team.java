package Soccer5;

import Soccer4.Coach;
import Soccer4.Goalkeeper;
import Soccer4.Player;

import java.util.ArrayList;

public class Team {

    private String name;
    private Soccer4.Goalkeeper goalkeeper;
    private Soccer4.Coach coach;
    private ArrayList<Soccer4.Player> squad;

    public Team(String name, Goalkeeper goalkeeper, Coach coach) {
        this.name = name;
        this.goalkeeper = goalkeeper;
        this.coach = coach;
        this.squad = new ArrayList<>();
    }

    public void addPlayer(Soccer4.Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation() {
        // Motivation aller Spieler addiert
        // + Motivation des Trainers
        // davon der Durchschnitt

        int sum = 0;
        sum += goalkeeper.getMotivation();
        for (Soccer4.Player player : this.squad) {
            sum += player.getMotivation();
        }
        return sum / (this.squad.size() + 1);
    }

    public int getTotalForce() {
        int sum = 0;
        sum += goalkeeper.getForce();
        int count = 0;
        for (int i = 0; i < this.squad.size() && i < 10; i++) {
            Soccer4.Player player = this.squad.get(i);
            sum += player.getMotivation();
            count++;
        }
        return sum / (count + 1);
    }



    @Override
    public String toString() {
        String result = "***Mannschaft***\n";
        result += "Trainer:" + this.coach.getName() + "\n";
        result += "Torwart:" + this.goalkeeper.getName() + "\n";

        for(Player player: this.squad){
            result += "Spieler:" + player.getName() + "\n";
        }
        return result;
        }
    }