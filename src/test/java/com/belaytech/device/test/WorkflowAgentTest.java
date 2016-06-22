/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.test;

import com.belaytech.device.DO.WorkflowAgent;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class WorkflowAgentTest {

    private final String jsonTest = "{\"id\":1,\"name\":\"vBox_Default\",\"script_path\":\"vBoxScriptPath\",\"active\":true}";

    @Test
    public void testFromJson() {
        WorkflowAgent wa = WorkflowAgent.fromJson(jsonTest, WorkflowAgent.class);

        assertEquals("ID is equal to 1", 1, wa.getId());
        assertEquals("Name is equal vBox_Default", "vBox_Default", wa.getName());
        assertEquals("ScriptPath is equal to vBoxScriptPath", "vBoxScriptPath", wa.getScriptPath());
        assertEquals("Active is true", true, wa.getActive());
    }

    @Test
    public void testToJson() {
        WorkflowAgent wa = new WorkflowAgent();
        wa.setId(1);
        wa.setName("vBox_Default");
        wa.setScriptPath("vBoxScriptPath");
        wa.setActive(Boolean.TRUE);

        String convertedJson = wa.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The WorkflowAgent was properly converted to JSON", true);
        } else {
            assertFalse("The WorkflowAgent was not properly converted to JSON", true);
        }
    }

}
