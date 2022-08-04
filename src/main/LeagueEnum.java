package main;

import java.util.Random;

/**
 * @Autor = User.name RaimondNicusorBulai99
 * User.email Condivisionedatiraimond@gmail.com
 * Enumeration for League end yours level.
 */
public enum LeagueEnum {
    BRONZE(0, 9),
    SILVER(10, 19),
    GOLD(20, 29),
    PLATINUM(30, 39),
    DIAMOND(40, 49),
    CHAMPION(50, 59),
    GRAND_CHAMPION(60, 69);
    /**
     * Level for league.
     */
    final int minScore;
    final int maxScore;
    /**
     * Constructor for league
     * @param minScore min score for league.
     * @param maxScore max score for league.
     */
    LeagueEnum(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    /**
     * promotes if he has a higher score than his league.
     * @param p generic Player
     * @return returned 'True' if sore player is greater of max score League.
     */
    public boolean isPromotable(Player p) {
        if (p.getAverageScore() > p.getLeague().maxScore) {
            return true;
        } else return false;
    }

    /**
     * demotable if he has a minor score than his league.
     * @param p generic Player.
     * @return returned 'True' if sore player is minor of min score League.
     */
    public boolean isDemotable(Player p) {
        if (p.getAverageScore() < p.getLeague().minScore) {
            return true;
        } else return false;
    }

    /**
     * assigns binds in mode random.
     * @return random constant.
     */
    public static LeagueEnum getRandomLeague(){
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }

}
