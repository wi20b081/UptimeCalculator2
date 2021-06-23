package org.example;

import org.example.UptimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {
    @Test
    public void test_calculateUptime_shouldBeCalculatedCorrectly(){
        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualValue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals("43178,40", actualValue);


        System.out.println("correct calculation");

    }
}
