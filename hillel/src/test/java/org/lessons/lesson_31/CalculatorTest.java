package org.lessons.lesson_31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private MathOperationService mathOperationService = Mockito.mock(MathOperationService.class);

  private MathOperationService mathOperationServiceSpy = Mockito.spy(MathOperationService.class);
  private Calculator calculator;

  @BeforeEach
  public void setUp(){
    calculator = new Calculator(mathOperationService);
  }

  @Test
  public void testSumNumbers() {
    assertEquals(2, calculator.sum(1, 1));
  }

  @Test
  public void testDivNumbers() {
    assertEquals(1, calculator.div(1, 1));
  }

  @Test
  public void testDivToZero() {
    assertThrows(ArithmeticException.class, () -> {
      calculator.div(1, 0);
    });
  }

  @Test
  public void testExternalOperation() {
    Mockito.when(mathOperationService.operation(Mockito.anyInt(), Mockito.anyInt())).thenReturn(6);
    assertEquals(12, calculator.externalOperation(2, 2));
  }

  @Test
  public void testExternalOperationSpy() {
    calculator = new Calculator(mathOperationServiceSpy);
    Mockito.when(mathOperationServiceSpy.operation(Mockito.anyInt(), Mockito.anyInt())).thenReturn(6);
    assertEquals(12, calculator.externalOperation(2, 2));
    Mockito.verify(mathOperationServiceSpy, Mockito.times(1)).operation(Mockito.anyInt(), Mockito.anyInt());
  }


}
