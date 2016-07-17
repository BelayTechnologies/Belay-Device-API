/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.DO.TestCaseLogFile;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class TestCaseLogFileTest {
    
    public TestCaseLogFileTest() {
    }

    private final String jsonTest = "{\"test_cases_id\":1,\"log_path\":\"log_path\",\"log_file_name\":\"testCaseOne\"}";

    @Test
    public void testFromJson() {
        TestCaseLogFile test = TestCaseLogFile.fromJson(jsonTest, TestCaseLogFile.class);

        assertEquals("TestCasesId is equal to 1", 1, test.getTestCasesId());
        assertEquals("LogPath is equal to log_path", "log_path", test.getLogPath());
        assertEquals("LogFileName is equal to testCaseOne", "testCaseOne", test.getLogFileName());
    }

    @Test
    public void testToJson() {
        TestCaseLogFile test = new TestCaseLogFile();
        test.setTestCasesId(1);
        test.setLogPath("log_path");
        test.setLogFileName("testCaseOne");

        String convertedJson = test.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The TestCaseLogFile was properly converted to JSON", true);
        } else {
            assertFalse("The TestCaseLogFile was not properly converted to JSON", true);
        }
    }
    
}
