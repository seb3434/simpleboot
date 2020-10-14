package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.formation.service.calculator;


@SpringBootTest
class ApplicationTests {

    private calculator calculator = new calculator();

    @Test
    public void testSum() {
         assertEquals(5, calculator.sum(2, 3));
    }
}