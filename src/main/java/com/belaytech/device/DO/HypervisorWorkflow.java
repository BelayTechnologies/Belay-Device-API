/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Joshua
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HypervisorWorkflow extends DeviceJsonObject<HypervisorWorkflow> {

    private int id;
    @SerializedName("hypervisor_types_id")
    private int hypervisorTypeId;
    @SerializedName("workflow_agents_id")
    private int workflowAgentId;
}
