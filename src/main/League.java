/**
 * @Autor = User.name RaimondNicusorBulai99
 *          User.email Condivisionedatiraimond@gmail.com
 */
public enum League {
    BRONZE(0,9),
    SILVER(10,19),
    GOLD(20,29),
    PLATINUM(30,39),
    DIAMOND(40,49),
    CHAMPION(50,59),
    GRANDCHAMPION(60,69);

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
