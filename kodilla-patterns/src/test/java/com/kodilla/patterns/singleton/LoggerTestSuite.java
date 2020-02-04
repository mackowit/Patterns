package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLog() {
        //Given
        //Logger testLog = new Logger();
        //When
        Logger.getInstance().log("2020-02-04 9:52");
        String testLogRetrieve = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(testLogRetrieve, "2020-02-04 9:52");
    }
}
