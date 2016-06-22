/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
