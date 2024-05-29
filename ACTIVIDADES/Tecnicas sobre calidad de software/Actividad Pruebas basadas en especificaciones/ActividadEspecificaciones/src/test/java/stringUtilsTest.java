import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringUtilsTest {
  @Test
  void FunctionShouldReturnCorrectArrayofStrings(){
    assertThat(stringUtils.substringsBetween("axcaycazc","a","c")).isEqualTo(new String[]{"x","y","z"});
  }
}