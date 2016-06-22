/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.TestSuite;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface TestSuitesDAO {

    public List<TestSuite> getAllTestSuites();

    public TestSuite getTestSuite(int id);

    public void updateTestSuite(TestSuite ts);

    public void deleteTestSuite(int id);
}
