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

import com.belaytech.device.DO.HypervisorWorkflow;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface HypervisorWorkflowsDAO {

    public List<HypervisorWorkflow> getAllHypervisorWorkflows();

    public HypervisorWorkflow getHypervisorWorkflow(int id);

    public void updateHypervisorWorkflow(HypervisorWorkflow hw);

    public void deleteHypervisorWorkflow(int id);
}
