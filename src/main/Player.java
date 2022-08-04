package main;/*5. Implementare una classe main.Player che rappresenta un giocatore. Ogni giocatore ha un nome,
        una lista di partite giocate ed una lega di appartenenza.
        La classe main.Player deve fornire anche un metodo getAverageScore() che ritorna il punteggio
        medio ottenuto nelle sue partite.
        Questa classe deve implementare Comparable. Un oggetto main.Player ha un valore maggiore di un
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
    public double getAverageScore(){
        double sum = 0;
        for(int i = 0; i<playedGame.size();i++){
            sum += playedGame.get(i).getScore();
        }
        return sum/playedGame.size();
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
    public int  compareTo(Player o) {
        int thisAverageScore = (int) getAverageScore();
        int otherAverageScore = (int) o.getAverageScore();
        return  thisAverageScore - otherAverageScore;

    }

    @Override
    public String toString() {
        return "-----------Player---------------------" +"\n"+
                "Name: " + name + "\n" +
                "PlayedGame: "+"\n" + playedGame +"\n"+
                "League: " + league + "\n";
    }
}
