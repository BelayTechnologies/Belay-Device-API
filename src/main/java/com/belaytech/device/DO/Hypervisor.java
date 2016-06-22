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
public class Hypervisor extends DeviceJsonObject<Hypervisor> {

    private int id;
    @SerializedName("ip_address")
    private String ipAddress;
    private String username;
    private String password;
    @SerializedName("hypervisor_type_id")
    private int hypervisorTypeId;
    private String version;
    private String manager;
    private String datacenter;
    private String datastore;
    private Boolean active;
    @SerializedName("max_concurrent_suts")
    private int maxConcurrentSuts;
}
