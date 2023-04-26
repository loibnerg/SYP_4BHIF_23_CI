package calc;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @org.junit.jupiter.api.Test
  void sum() {
    Calculator c = new Calculator();

    assertEquals(2, c.sum(1,1));
  }
}