/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.test;

import com.belaytech.device.DO.HypervisorWorkflow;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class HypervisorWorkflowTest {

    private final String jsonTest = "{\"id\":1,\"hypervisor_types_id\":1,\"workflow_agents_id\":1}";

    @Test
    public void testFromJson() {
        HypervisorWorkflow hvw = HypervisorWorkflow.fromJson(jsonTest, HypervisorWorkflow.class);

        assertEquals("ID is equal to 1", 1, hvw.getId());
        assertEquals("HypervisorTypesID is equal 1", 1, hvw.getHypervisorTypeId());
        assertEquals("WorkflowAgentID is equal to 1", 1, hvw.getWorkflowAgentId());

    }

    @Test
    public void testToJson() {
        HypervisorWorkflow hvw = new HypervisorWorkflow();
        hvw.setId(1);
        hvw.setHypervisorTypeId(1);
        hvw.setWorkflowAgentId(1);

        String convertedJson = hvw.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The HypervisorWorkflow was properly converted to JSON", true);
        } else {
            assertFalse("The HypervisorWorkflow was not properly converted to JSON", true);
        }
    }

}
