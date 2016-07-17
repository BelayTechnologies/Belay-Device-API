/*
 * Copyright (C) 2016 Belay Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
