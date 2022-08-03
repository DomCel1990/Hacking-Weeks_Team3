/*5. Implementare una classe Player che rappresenta un giocatore. Ogni giocatore ha un nome,
        una lista di partite giocate ed una lega di appartenenza.
        La classe Player deve fornire anche un metodo getAverageScore() che ritorna il punteggio
        medio ottenuto nelle sue partite.
        Questa classe deve implementare Comparable. Un oggetto Player ha un valore maggiore di un
        altro se il suo punteggio medio è maggiore di quello dell'oggetto con cui lo si confronta.*/

import java.util.List;

public class Player implements Comparable<Player>{

    private String name;
    private List<Game> playedGame;
    private League league;

    public Player(String name, List<Game> playedGame, League league) {

        this.name = name;
        this.playedGame = playedGame;
        this.league = league;
    }



    public int getAverageScore(){

        return playedGame.size()/playedGame.size();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getPlayedGame() {
        return playedGame;
    }

    public void setPlayedGame(List<Game> playedGame) {
        playedGame = playedGame;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public int compareTo(Player o) {
        return o.getAverageScore() - o.getAverageScore();
    }

    @Override
    public String toString() {
        return "-----------Player---------------------" +"\n"+
                "Name: " + name + "\n" +
                "PlayedGame: "+"\n" + playedGame +"\n"+
                "League: " + league + "\n";
    }
}
