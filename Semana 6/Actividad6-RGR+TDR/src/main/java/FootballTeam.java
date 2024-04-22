public class FootballTeam{
    private int gamesWon;

    public FootballTeam(int gamesWon) {
        if (gamesWon<0){
            throw new IllegalArgumentException("Not possible to have less than 0 games won! + (was + "+gamesWon+")");
        }
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
//        return 3;
    }
}
