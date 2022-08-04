import java.util.Random;

public enum League {
    BRONZE(0, 9),
    SILVER(10, 19),
    GOLD(20, 29);

    private final int minScore;
    private final int maxScore;

    League(int minScore, int maxScore) {
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    public static boolean isPromotable(Player p) {
        if (p.getAverageScore() > p.getLeague().maxScore) {
            return true;
        } else
            return false;
    }

    public static boolean isDemotable(Player p) {
        if (p.getAverageScore() < p.getLeague().minScore) {
            return true;
        } else return false;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public static League getRandomLeague() {
        Random r = new Random();
        return values()[r.nextInt(values().length)];
    }

    static void changeLeague(Player p) {
        for (League league : League.values()) {
            if (!League.isPromotable(p) && !League.isDemotable(p)) {
                p.setLeague(league);
                break;
            }
        }
    }
}
