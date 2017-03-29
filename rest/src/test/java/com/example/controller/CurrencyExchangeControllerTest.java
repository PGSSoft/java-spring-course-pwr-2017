package com.example.controller;


import matchers.NumberMatcher;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

import static matchers.NumberMatcher.isEven;
import static matchers.NumberMatcher.isNegative;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class CurrencyExchangeControllerTest {


    @Before
    public void setUp() {
        System.out.println("seetttting up");
    }

    @After
    public void tearDown() {
        System.out.println("tear down");
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();


    CurrencyExchangeController currencyExchangeController =
            new CurrencyExchangeController();


    @Test
    public void shouldHandleExceptionWhenThrown() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Something went wrong");

        currencyExchangeController.currencyMultiplier("badCode", "PLN", 10L, 2L);

    }


    @Test
    public void twoMultiplyByTwoShouldResturnFour() {


        Long currentNumber = 2L;

        Long result = currentNumber * 5;

        assertEquals(
                result, currencyExchangeController.multiplyByFive(currentNumber)
        );

    }

    @Test
    //@Test(expected = RuntimeException.class)
    public void currencyMuliplierShouldThrowException() {

        String badCode = "ABC";

        try {
            currencyExchangeController.currencyMultiplier(badCode, "PLN", 10L, 2L);
            fail();
        } catch (RuntimeException e) {
            assertEquals("Something went wrong", e.getMessage());
        }
    }


    @Test
    public void shouldReturnEvenWhenMultiplyingFiveyByFour() {
        Long result = currencyExchangeController.multiplyByFive(4L);
        assertThat(result, isEven());

        //Assert.assertTrue(result % 2 == 0);

    }

    @Test
    public void shouldReturnNegativeNumber() {
        Long result = currencyExchangeController.multiplyByFive(-4L);
        assertThat(result, isNegative());

        //Assert.assertTrue(result % 2 == 0);

    }
}
