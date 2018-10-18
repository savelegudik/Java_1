package perfectNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectNumberTest {

    @Test
    public void main() {
        Assertions.assertEquals(NumberType.PERFECT, PerfectNumber.check(6));
        Assertions.assertEquals(NumberType.DEFICIENT, PerfectNumber.check(7));
        Assertions.assertEquals(NumberType.ABUNDANT, PerfectNumber.check(12));
    }
}
