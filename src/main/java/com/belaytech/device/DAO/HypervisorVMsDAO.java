/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.HypervisorVM;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface HypervisorVMsDAO {

    public List<HypervisorVM> getAllHypervisorVMs();

    public HypervisorVM getHypervisorVM(int id);

    public void updateHypervisorVM(HypervisorVM hv);

    public void deleteHypervisorVM(int id);
}
