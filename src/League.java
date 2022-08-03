import java.util.Random;

public enum League {
    BRONZE (0,9),
    Silver(10,19),
    Gold(20,29),
    Platinum(30,39),
    Diamond(40,49),
    Chamiopn(50,59),
    GrandCampion(60,69);

    private final int minScore;
    private final int maxScore;

    League(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public boolean isPromotable(Player p){
        if (p.getAverageScore()> getMaxScore()) {
            return true;
        }else return false;
    }

   public boolean isDemotable(Player p){
        if (p.getAverageScore() < getMinScore()){
            return true;
        }else return false;
   }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }
    /*public static League[] getRandomLeague(){
        Random r=new Random();
        r.nextInt(values().length);
        return values();

    }*/

}
