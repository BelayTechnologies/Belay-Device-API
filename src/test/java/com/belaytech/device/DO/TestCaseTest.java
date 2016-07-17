/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.DO.TestCase;
import com.belaytech.device.types.Result;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.belaytech.device.types.Status;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Joshua
 */
public class TestCaseTest {

    public TestCaseTest() {
    }

    private final String jsonTest = "{\"id\":1,\"name\":\"myNewTestCase\",\"sut_id\":1,\"status\":6,\"result\":6}";

    @Test
    public void testFromJson() {
        TestCase tc = TestCase.fromJson(jsonTest, TestCase.class);

        assertEquals("Id is equal to 1", 1, tc.getId());
        assertEquals("Name is equal to myNewTestCase", "myNewTestCase", tc.getName());
        assertEquals("SUT ID is equal to 1", 1, tc.getSutId());
        assertEquals("Status is equal to RUNNING", Status.RUNNING, tc.getStatus());
        assertEquals("Result is equal to UNKNOWN", Result.UNKNOWN, tc.getResult());
    }

    @Test
    public void testToJson() {
        TestCase tc = new TestCase();
        tc.setId(1);
        tc.setName("myNewTestCase");
        tc.setResult(Result.UNKNOWN);
        tc.setStatus(Status.RUNNING);
        tc.setSutId(1);

        String convertedJson = tc.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The TestCase was properly converted to JSON", true);
        } else {
            assertFalse("The TestCase was not properly converted to JSON", true);
        }
    }
}
