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
public class VMTemplate extends DeviceJsonObject<VMTemplate> {

    private int id;
    private String name;
    @SerializedName("os")
    private String operatingSystem;
    @SerializedName("os_type")
    private String operatingSystemType;
    @SerializedName("os_version")
    private String operatingSystemVersion;
    @SerializedName("os_service_pack")
    private String operatingSystemServicePack;
    @SerializedName("os_arch")
    private String operatingSystemArchitecture;
    @SerializedName("os_user_name")
    private String operatingSystemUserName;
    @SerializedName("os_user_pwd")
    private String operatingSystemPassword;
}
