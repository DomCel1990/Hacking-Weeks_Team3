package main;

public enum League {
    Bronze (0,9),
    Silver(10,19),
    Gold(20,29),
    Platinum(30,39),
    Diamond(40,49),
    Champion(50,59),
    GrandCampion(60,69);

    final int minScore;
    final int maxScore;

    League(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public boolean isPromotable(Player p){
        if (p.getScore() > maxScore) {
            return true;
        }else return false;
    }

   public boolean isDemotable(Player p){
        if (p.getScore() < minScore){
            return true;
        }else return false;
   }

}
