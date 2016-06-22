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
public class HypervisorVM extends DeviceJsonObject<HypervisorVM> {

    private int id;
    @SerializedName("hypervisor_id")
    private int hypervisorId;
    @SerializedName("vm_template_id")
    private int vmTemplateId;
    private Boolean active;
    @SerializedName("tools_available")
    private Boolean toolsAvailable;
}
