/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.types.Result;
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
public class TestCase extends DeviceJsonObject<TestCase> {

    private int id;
    private String name;
    @SerializedName("sut_id")
    private int sutId;
    private Status status;
    private Result result;

}
