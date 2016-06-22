/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.TestCase;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface TestCasesDAO {

    public List<TestCase> getAllTestCases();

    public TestCase getTestCase(int id);

    public void updateTestCase(TestCase tc);

    public void deleteTestCase(int id);
}
