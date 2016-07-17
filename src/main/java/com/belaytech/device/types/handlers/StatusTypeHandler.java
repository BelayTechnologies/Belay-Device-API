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
package com.belaytech.device.types.handlers;

import com.belaytech.device.types.Status;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 *
 * @author Joshua
 */
public class StatusTypeHandler implements TypeHandler<Status> {

    @Override
    public void setParameter(PreparedStatement ps, int iColumn, Status parameter, JdbcType jt) throws SQLException {
        System.out.println("i am here 4");
        if (parameter != null) {
            ps.setString(iColumn,
                    String.valueOf(parameter.getCode()));
        } else {
            ps.setNull(iColumn, jt.TYPE_CODE);
        }
    }

    @Override
    public Status getResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("i am here 1");
        return valueOf(rs.getInt(columnName));
    }

    @Override
    public Status getResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println("i am here 2");
        return valueOf(rs.getInt(columnIndex));
    }

    @Override
    public Status getResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println("i am here 3");
        return valueOf(cs.getInt(columnIndex));
    }

    public Status valueOf(int i) {
        Status eReturn = Status.ASSIGNED;
        if (Integer.valueOf(i) != null) {
            eReturn = Status.fromInt(i);
        }
        return eReturn;
    }
}
