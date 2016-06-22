/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.TestCaseLogFile;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface TestCaseLogFilesDAO {

    public List<TestCaseLogFile> getAllTestCaseLogFiles();

    public TestCaseLogFile getTestCaseLogFile(int id);

    public void updateTestCaseLogFile(TestCaseLogFile logFile);

    public void deleteTestCaseLogFile(int id);
}
