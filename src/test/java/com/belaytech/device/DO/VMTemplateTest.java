/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.DO.VMTemplate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class VMTemplateTest {

    private final String jsonTest = "{\"id\":1,"
            + "\"name\":\"Windows_7\","
            + "\"os\":\"Windows 7\","
            + "\"os_type\":\"Windows\","
            + "\"os_version\":\"7\","
            + "\"os_service_pack\":\"2\","
            + "\"os_arch\":\"x86\","
            + "\"os_user_name\":\"belayAdmin\","
            + "\"os_user_pwd\":\"BelayTech2016\"}";

    @Test
    public void testFromJson() {
        VMTemplate vt = VMTemplate.fromJson(jsonTest, VMTemplate.class);

        assertEquals("ID is equal to 1", 1, vt.getId());
        assertEquals("Name is equal Windows_7", "Windows_7", vt.getName());
        assertEquals("OS is equal to Windows 7", "Windows 7", vt.getOperatingSystem());
        assertEquals("OSType is equal to Windows", "Windows", vt.getOperatingSystemType());
        assertEquals("OSVersion is equal to 7", "7", vt.getOperatingSystemVersion());
        assertEquals("OSServicePack is equal to 2", "2", vt.getOperatingSystemServicePack());
        assertEquals("OSArch is equal to x86", "x86", vt.getOperatingSystemArchitecture());
        assertEquals("OSUserName is equal to belayAdmin", "belayAdmin", vt.getOperatingSystemUserName());
        assertEquals("OSUserPWD is equal to BelayTech2016", "BelayTech2016", vt.getOperatingSystemPassword());
    }

    @Test
    public void testToJson() {
        VMTemplate vt = new VMTemplate();
        vt.setId(1);
        vt.setName("Windows_7");
        vt.setOperatingSystem("Windows 7");
        vt.setOperatingSystemType("Windows");
        vt.setOperatingSystemVersion("7");
        vt.setOperatingSystemServicePack("2");
        vt.setOperatingSystemArchitecture("x86");
        vt.setOperatingSystemUserName("belayAdmin");
        vt.setOperatingSystemPassword("BelayTech2016");

        String convertedJson = vt.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The VMTemplate was properly converted to JSON", true);
        } else {
            assertFalse("The VMTemplate was not properly converted to JSON", true);
        }
    }

}
