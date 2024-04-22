import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class FootballTeamTest {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 10})
    void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertThat(team.getGamesWon())
                .as("number of games won")
                .isEqualTo(nbOfGamesWon);
    }

    @ParameterizedTest
    @ValueSource(ints ={-1,-10})
    void constructorShoulThrowExceptionForIllegalGamesNb(int illegalNbOfGames){
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {new FootballTeam(illegalNbOfGames);});
    }

    private static final int ANY_NUMBER = 123;
    @Test
    void shouldBePossibleToCompareTeams(){
        FootballTeam team = new FootballTeam(ANY_NUMBER);
        assertThat(team).isInstanceOf(Comparable.class);
    }
}
//    private static final int THREE_GAMES_WON = 3;
//
//    @Test
//    void constructorShouldSetGamesWon() {
//        FootballTeam team = new FootballTeam(THREE_GAMES_WON);
//        assertThat(team.getGamesWon())
//                .as("number of games won")
//                .isEqualTo(THREE_GAMES_WON);
//    }


//public class FootballTeamTest {
//    @Test
//    void constructorShouldSetGamesWon() {
//        FootballTeam team = new FootballTeam(3);
//        assertThat(team.getGamesWon()).isEqualTo(3);
//        assertThat(team.getGamesWon())
//                .as("number of games won")
//                .isEqualTo(3);
//    }
//}
