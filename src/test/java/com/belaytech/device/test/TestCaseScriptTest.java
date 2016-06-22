/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.test;

import com.belaytech.device.DO.TestCaseScript;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class TestCaseScriptTest {

    public TestCaseScriptTest() {
    }

    private final String jsonTest = "{\"id\":1,\"script_path\":\"testCase01.bat\",\"test_case_id\":1}";

    @Test
    public void testFromJson() {
        TestCaseScript tcs = TestCaseScript.fromJson(jsonTest, TestCaseScript.class);

        assertEquals("Id is equal to 1", 1, tcs.getId());
        assertEquals("ScriptPath is equal to testCase01.bat", "testCase01.bat", tcs.getScriptPath());
        assertEquals("TestCaseId is equal to 1", 1, tcs.getTestCaseId());
    }

    @Test
    public void testToJson() {
        TestCaseScript tcs = new TestCaseScript();
        tcs.setId(1);
        tcs.setScriptPath("testCase01.bat");
        tcs.setTestCaseId(1);

        String convertedJson = tcs.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The TestCaseScript was properly converted to JSON", true);
        } else {
            assertFalse("The TestCaseScript was not properly converted to JSON", true);
        }
    }

}
