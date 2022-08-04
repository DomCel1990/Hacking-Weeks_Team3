import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Start {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        Random r = new Random();
        //initializes 100 players
        for (int i = 0; i < 100; i++) {
            List<Game> games = new ArrayList<>();
            //I create a random class of games from 1 to 10
            for (int j = 0; j < r.nextInt(1, 10); j++) {
                Game g = new Game(r.nextInt(1, 10), r.nextInt(1, 10));
                games.add(g);
            }
            Player p = new Player("Player" + (i + 1), games, League.getRandomLeague());
            players.add(p);
          System.out.println(p);
        }
        int bronzeSize = 0;
        int silverSize = 0;
        int goldSize = 0;
        //corrects league player if necessary
        for (Player p : players) {
            if (League.isPromotable(p) || League.isDemotable(p))
                League.changeLeague(p);
            //at this point I increase the player's league and increase the size
            if (p.getLeague() == League.BRONZE) {
                bronzeSize++;
            } else if (p.getLeague() == League.SILVER) {
                silverSize++;
            } else {
                goldSize++;
            }
        }
        SortableArray<Player> bronzeArray = new SortableArray<>(bronzeSize);
        SortableArray<Player> silverArray = new SortableArray<>(silverSize);
        SortableArray<Player> goldArray = new SortableArray<>(goldSize);

        int bronzeAdded = 0;
        int silverAdded = 0;
        int goldAdded = 0;

        for (Player p : players) {
            switch (p.getLeague()) {
                case BRONZE -> {
                    bronzeArray.set(bronzeAdded, p);
                    bronzeAdded++;
                    break;
                }
                case SILVER -> {
                    silverArray.set(silverAdded, p);
                    silverAdded++;
                    break;
                }
                case GOLD -> {
                    goldArray.set(goldAdded, p);
                    goldAdded++;
                    break;
                }
            }
        }
        bronzeArray.sort();
        silverArray.sort();
        goldArray.sort();

    }
}


















        /*
       for (int i = 0; i < r.nextInt(1, 5); i++) {
            listGame.add(new Game(r.nextInt(1, 30), r1.nextInt(1, 30)));
        }
            for (int i = 0; i < r.nextInt(1, 5); i++) {
                listPlayer.add(new Player(r.toString(), listGame, League.getRandomLeague()));
            }
        for (int i = 0; i < listGame.size(); i++) {
            System.out.println(listGame.get(i));
        }

        for (int i = 0; i < listPlayer.size(); i++) {
            System.out.println(listPlayer.get(i).toString());

        }
        System.out.println("--------5555----------");
        for (int j = 0; j < listPlayer.size(); j++) {
            if (listPlayer.get(j).getLeague().isPromotable(listPlayer.get(j)) == true)
                System.out.println(listPlayer.get(j).getLeague().ordinal()+1);
        }
        System.out.println("------------------");

        SortableArray <> listGameSortableArray=new SortableArray<listGame>(r.nextInt());
        listGameSortableArray.sort();
    }/*
}*/


