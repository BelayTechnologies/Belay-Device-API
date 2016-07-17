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
package com.belaytech.device.DAO;

import com.belaytech.device.DO.TestSuite;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


/**
 *
 * @author Joshua
 */
public interface TestSuitesDAO {

    @Select("select * from test_suites")
    public List<TestSuite> getAllTestSuites();

    @Select("select * from test_suites where id = #{id}")
    public TestSuite getTestSuite(int id);

    @Update("update test_suites s set s.name=#{name}, s.status=#{status}, s.total_sut=#{totalSut} where id=#{id}")
    public void updateTestSuite(TestSuite ts);

    @Delete("delete from test_suites where id=#{id}")
    public void deleteTestSuite(int id);
}
