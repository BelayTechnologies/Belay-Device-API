/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.test;

import com.belaytech.device.DO.SUT;
import com.belaytech.device.types.Status;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joshua
 */
public class SUTTest {

    private final String jsonTest = "{\"id\":1,\"name\":\"myNewTestSuite_SUT001\",\"status\":6,\"test_suite_id\":1,\"hypervisor_vm_id\":1,\"hypervisor_workflows_id\":1,\"log_file\":\"myNewTestSuite_SUT001.log\",\"ip_address\":\"192.168.3.54\",\"remote_console_url\":\"smell\",\"console_active\":1}";

    @Test
    public void testFromJson() {
        SUT sut = SUT.fromJson(jsonTest, SUT.class);

        assertEquals("Id is equal to 1", 1, sut.getId());
        assertEquals("Name is equal to myNewTestSuite_SUT001", "myNewTestSuite_SUT001", sut.getName());
        assertEquals("Status is equal to RUNNING", Status.RUNNING, sut.getStatus());
        assertEquals("TestSuiteId is equal to 1", 1, sut.getTestSuiteId());
        assertEquals("HypervisorVMID is equal to 1", 1, sut.getHypervisorVmId());
        assertEquals("HypervisorWorkflowsID is equal to 1", 1, sut.getHypervisorWorkflowsId());
        assertEquals("LogFile is equal to myNewTestSuite_SUT001.log", "myNewTestSuite_SUT001.log", sut.getLogFile());
        assertEquals("IPAddress is equal to 192.168.3.54", "192.168.3.54", sut.getIpAddress());
        assertEquals("RemoteConsoleUrl is equal to http://remote.console.com", "smell", sut.getRemoteConsoleUrl());
        assertEquals("ConsoleActive is equal to 1", 1, sut.getConsoleActive());
    }

    @Test
    public void testToJson() {
        SUT sut = new SUT();
        sut.setId(1);
        sut.setName("myNewTestSuite_SUT001");
        sut.setStatus(Status.RUNNING);
        sut.setTestSuiteId(1);
        sut.setHypervisorVmId(1);
        sut.setHypervisorWorkflowsId(1);
        sut.setLogFile("myNewTestSuite_SUT001.log");
        sut.setIpAddress("192.168.3.54");
        sut.setRemoteConsoleUrl("smell");
        sut.setConsoleActive(1);

        String convertedJson = sut.toJson();
        System.out.println("Converted: " + convertedJson);
        System.out.println("Original: " + jsonTest);
        if (jsonTest.equals(convertedJson)) {
            assertTrue("The SUT was properly converted to JSON", true);
        } else {
            assertFalse("The SUT was not properly converted to JSON", true);
        }
    }

    public SUTTest() {
    }

}
