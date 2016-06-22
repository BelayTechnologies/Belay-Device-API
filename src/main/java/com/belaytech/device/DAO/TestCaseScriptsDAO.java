/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.TestCaseScript;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface TestCaseScriptsDAO {

    public List<TestCaseScript> getAllTestCaseScripts();

    public TestCaseScript getTestCaseScript(int id);

    public List<TestCaseScript> getScriptsForTestCase(int testCaseId);

    public void updateTestCaseScript(TestCaseScript tcs);

    public void deleteTestCaseScript(int id);
}
