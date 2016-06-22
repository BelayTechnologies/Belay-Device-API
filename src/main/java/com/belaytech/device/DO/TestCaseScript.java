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
public class TestCaseScript extends DeviceJsonObject<TestCaseScript> {

    private int id;
    @SerializedName("script_path")
    private String scriptPath;
    @SerializedName("test_case_id")
    private int testCaseId;
}
