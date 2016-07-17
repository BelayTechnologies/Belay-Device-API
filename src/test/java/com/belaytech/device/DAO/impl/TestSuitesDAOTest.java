/*
 * Copyright (C) 2016 Belay Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.belaytech.device.DAO.impl;

import com.belaytech.device.DAO.TestSuitesDAO;
import com.belaytech.device.DO.TestSuite;
import com.belaytech.device.injection.DeviceAPIModule;
import com.belaytech.device.types.Status;
import com.google.inject.Inject;
import java.util.List;
import org.jukito.JukitoRunner;
import org.jukito.UseModules;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Joshua
 */
@RunWith(JukitoRunner.class)
@UseModules({DeviceAPIModule.class})
public class TestSuitesDAOTest {

    @Inject
    TestSuitesDAO dao;

    @Test
    public void testGetAll() {
        List<TestSuite> testSuites = dao.getAllTestSuites();
        System.out.println("Test Suites Count: " + testSuites.size());
        for (TestSuite ts : testSuites) {
            Status s = ts.getStatus();
            System.out.println("ID: " + ts.getId());
            if (s == null) {
                System.out.println("no status!");
            } else {
                System.out.println("status: " + s.getDesc());
            }
            System.out.println(ts.toJson());
        }
        assertFalse("The testSuites returned as empty", testSuites.isEmpty());
    }

}
