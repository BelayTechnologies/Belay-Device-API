/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.DO.HypervisorVM;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class HypervisorVMTest {

    private final String jsonTest = "{\"id\":1,\"hypervisor_id\":1,\"vm_template_id\":1,\"active\":true,\"tools_available\":false}";

    @Test
    public void testFromJson() {
        HypervisorVM hv = HypervisorVM.fromJson(jsonTest, HypervisorVM.class);

        assertEquals("ID is equal to 1", 1, hv.getId());
        assertEquals("HypervisorID is equal to 1", 1, hv.getHypervisorId());
        assertEquals("VMTemplateID is equal to 1", 1, hv.getVmTemplateId());
        assertEquals("Active is true", true, hv.getActive());
        assertEquals("ToolsAvailable is false", false, hv.getToolsAvailable());
    }

    @Test
    public void testToJson() {
        HypervisorVM hv = new HypervisorVM();
        hv.setId(1);
        hv.setHypervisorId(1);
        hv.setVmTemplateId(1);
        hv.setActive(Boolean.TRUE);
        hv.setToolsAvailable(Boolean.FALSE);

        String convertedJson = hv.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The HypervisorVM was properly converted to JSON", true);
        } else {
            assertFalse("The HypervisorVM was not properly converted to JSON", true);
        }
    }

}
