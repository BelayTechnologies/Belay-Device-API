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
public class TestCaseLogFile extends DeviceJsonObject<TestCaseLogFile> {

    @SerializedName("test_cases_id")
    private int testCasesId;
    @SerializedName("log_path")
    private String logPath;
    @SerializedName("log_file_name")
    private String logFileName;
}
