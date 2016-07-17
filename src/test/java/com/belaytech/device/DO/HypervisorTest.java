/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.DO.Hypervisor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class HypervisorTest {

    private final String jsonTest = "{\"id\":1,"
            + "\"ip_address\":\"192.168.2.32\","
            + "\"username\":\"belayAdmin\","
            + "\"password\":\"belayTech2016\","
            + "\"hypervisor_type_id\":1,"
            + "\"version\":\"5.0.14\","
            + "\"manager\":\"managerServer\","
            + "\"datacenter\":\"deviceDataCenter\","
            + "\"datastore\":\"deviceDataStore\","
            + "\"active\":true,"
            + "\"max_concurrent_suts\":1}";

    @Test
    public void testFromJson() {
        Hypervisor hv = Hypervisor.fromJson(jsonTest, Hypervisor.class);

        assertEquals("ID is equal to 1", 1, hv.getId());
        assertEquals("IPAddress is equal 192.168.2.32", "192.168.2.32", hv.getIpAddress());
        assertEquals("UserName is equal to belayAdmin", "belayAdmin", hv.getUsername());
        assertEquals("Password is equal to belayTech2016", "belayTech2016", hv.getPassword());
        assertEquals("HypervisorTypeID is equal to 1", 1, hv.getHypervisorTypeId());
        assertEquals("Version is equal to 5.0.14", "5.0.14", hv.getVersion());
        assertEquals("Manager is equal to managerServer", "managerServer", hv.getManager());
        assertEquals("Datacenter is equal to deviceDataCenter", "deviceDataCenter", hv.getDatacenter());
        assertEquals("Datastore is equal to deviceDataStore", "deviceDataStore", hv.getDatastore());
        assertEquals("Active is true", true, hv.getActive());
        assertEquals("MaxConcurrentSUTs is equal to 1", 1, hv.getMaxConcurrentSuts());
    }

    @Test
    public void testToJson() {
        Hypervisor hv = new Hypervisor();
        hv.setId(1);
        hv.setIpAddress("192.168.2.32");
        hv.setUsername("belayAdmin");
        hv.setPassword("belayTech2016");
        hv.setHypervisorTypeId(1);
        hv.setVersion("5.0.14");
        hv.setManager("managerServer");
        hv.setDatacenter("deviceDataCenter");
        hv.setDatastore("deviceDataStore");
        hv.setActive(Boolean.TRUE);
        hv.setMaxConcurrentSuts(1);

        String convertedJson = hv.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The Hypervisor was properly converted to JSON", true);
        } else {
            assertFalse("The Hypervisor was not properly converted to JSON", true);
        }
    }

}
