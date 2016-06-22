/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.WorkflowAgent;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface WorkflowAgentsDAO {

    public List<WorkflowAgent> getAllWorkflowAgents();

    public WorkflowAgent getWorkflowAgent(int id);

    public void updateWorkflowAgent(WorkflowAgent wa);

    public void deleteWorkflowAgent(int id);
}
