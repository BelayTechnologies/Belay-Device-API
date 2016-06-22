/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.test;

import com.belaytech.device.DO.TestSuite;
import com.belaytech.device.types.Status;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class TestSuiteTest {

    public TestSuiteTest() {
    }

    private final String jsonTest = "{\"id\":1,\"name\":\"myNewTestSuite\",\"status\":6,\"total_sut\":2}";

    @Test
    public void testFromJson() {
        TestSuite ts = TestSuite.fromJson(jsonTest, TestSuite.class);

        assertEquals("Id is equal to 1", 1, ts.getId());
        assertEquals("Name is equal to myNewTestSuite", "myNewTestSuite", ts.getName());
        assertEquals("Status is equal to RUNNING", Status.RUNNING, ts.getStatus());
    }

    @Test
    public void testToJson() {
        TestSuite ts = new TestSuite();
        ts.setId(1);
        ts.setName("myNewTestSuite");
        ts.setStatus(Status.RUNNING);
        ts.setTotalSut(2);

        String convertedJson = ts.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The TestSuite was properly converted to JSON", true);
        } else {
            assertFalse("The TestSuite was not properly converted to JSON", true);
        }
    }

}
