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
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.mybatis.guice.transactional.Transactional;

/**
 *
 * @author Joshua
 */
@Singleton
public class TestSuitesDAOImpl implements TestSuitesDAO {

    @Inject
    private TestSuitesDAO DAO;

    @Transactional
    @Override
    public List<TestSuite> getAllTestSuites() {
        List<TestSuite> testSuites = DAO.getAllTestSuites();
        return testSuites;
    }

    @Transactional
    @Override
    public TestSuite getTestSuite(int id) {
        TestSuite t = DAO.getTestSuite(id);
        return t;
    }

    @Transactional
    @Override
    public void updateTestSuite(TestSuite ts) {
        DAO.updateTestSuite(ts);
    }

    @Transactional
    @Override
    public void deleteTestSuite(int id) {
        DAO.deleteTestSuite(id);
    }

}
