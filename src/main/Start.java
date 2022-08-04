package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Start {
    public static void main(String[] args) {


        List<Player> players = new ArrayList<>();
        Random r = new Random();
        //initializes 100 players
        for (int i = 0; i < 100, i++) {
            List<Game> games = new ArrayList<>();
            //I create a random class of games from 1 to 10
            for (int j = 0; j < r.nextInt(1, 10); j++) {
                Game g = new Game(r.nextInt(1, 10), r.nextInt(1, 50));
                games.add(g);
            }
            Player p = new Player(NamePlayerEnum.getRandomNomePlayerEnum(), games, LeagueEnum.getRandomLeague());
            players.add(p);
        }
        int bronzeSize = 0;
        int silverSize = 0;
        int goldSize = 0;

        SortableArray<Player> bronzeArray = new SortableArray<>(bronzeSize);
        SortableArray<Player> silverArray = new SortableArray<>(silverSize);
        SortableArray<Player> goldArray = new SortableArray<>(goldSize);

        int bronzeAdded = 0;
        int silverAdded = 0;
        int goldAdded = 0;

        for (int i = 0; i < players.size(); i++) {
            insertOnLeague(players.get(i));
            System.out.println(players.get(i));

        }

    }


    public static void insertOnLeague(Player p) {
        for (int i = 0; i < League.values().length; i++) {
            if (p.getAverageScore() >= League.BRONZE.getMinScore() & p.getAverageScore() <= League.BRONZE.getMaxScore()) {
                p.setLeague(League.BRONZE);
            } else if (p.getAverageScore() >= League.SILVER.getMinScore() & p.getAverageScore() <= League.SILVER.getMaxScore()) {
                p.setLeague(League.SILVER);
            } else
                p.setLeague(League.GOLD);
        }
    }
}

















