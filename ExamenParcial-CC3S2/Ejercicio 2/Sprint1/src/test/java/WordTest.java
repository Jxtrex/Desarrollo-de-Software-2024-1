import com.wordz.domain.Letter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static com.wordz.domain.Letter.*;
public class WordTest {

    @Test
    public void oneIncorrectLetter() {
        // Arrange
        var word = new Word("A");

        // Act
        var score = word.guess("Z");

        // Assert
        assertScoreForGuess(score, INCORRECT);
    }

    @Test
    public void oneCorrectLetter() {
        // Arrange
        var word = new Word("A");

        // Act
        var score = word.guess("A");

        // Assert
        assertScoreForGuess(score, CORRECT);
    }

    @Test
    public void secondLetterWrongPosition() {
        // Arrange
        var word = new Word("AR");

        // Act
        var score = word.guess("ZA");

        // Assert
        assertScoreForGuess(score, INCORRECT, PART_CORRECT);
    }

    @Test
    public void allScoreCombinations() {

        // Arrange
        var word = new Word("ARI");

        // Act
        var score = word.guess("ZAI");

        // Assert
        assertScoreForGuess(score, INCORRECT, PART_CORRECT, CORRECT);
    }

    private void assertScoreForGuess(Score score, Letter... expectedScores) {
        for (int position = 0; position < expectedScores.length; position++) {
            Letter expected = expectedScores[position];
            assertThat(score.letter(position)).isEqualTo(expected);
        }
    }
}