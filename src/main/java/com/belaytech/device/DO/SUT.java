/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.types.Status;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Joshua
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SUT extends DeviceJsonObject<SUT> {

    private int id;
    private String name;
    private Status status;
    @SerializedName("test_suite_id")
    private int testSuiteId;
    @SerializedName("hypervisor_vm_id")
    private int hypervisorVmId;
    @SerializedName("hypervisor_workflows_id")
    private int hypervisorWorkflowsId;
    @SerializedName("log_file")
    private String logFile;
    @SerializedName("ip_address")
    private String ipAddress;
    @SerializedName("remote_console_url")
    private String remoteConsoleUrl;
    @SerializedName("console_active")
    private int consoleActive;

}
