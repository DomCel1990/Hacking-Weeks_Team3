import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Start {
    public static void main(String[] args) {

        Random r = new Random();


        List<Game> listGame = new ArrayList<>();
        for (int i = 0; i < r.nextInt(1, 10); i++) {

            listGame.add(new Game(r.nextInt(1, 30), r.nextInt(1, 30)));
        }
        for (int i = 0; i < listGame.size(); i++) {
            System.out.println(listGame.get(i));
        }
        System.out.println("--------and----------");
        List<Player> listPlayer = new ArrayList<>();
        for (int i = 0; i < r.nextInt(1, 10); i++) {
            for (int j = 0; j < League.values().length; j++) {
                for(League d : League.values()) {
                    listPlayer.add(new Player(r.toString(), listGame, d));
                }
            }
        }
        for (int i = 0; i < listPlayer.size(); i++) {
            System.out.println(listPlayer.get(i).toString());

        }
        System.out.println("------------------");
        System.out.println(listPlayer.get(1).getLeague().isDemotable(listPlayer.get(1)));
    }
}


