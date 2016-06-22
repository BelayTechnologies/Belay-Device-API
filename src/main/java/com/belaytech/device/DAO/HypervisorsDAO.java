/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.Hypervisor;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface HypervisorsDAO {

    public List<Hypervisor> getAllHypervisors();

    public Hypervisor getHypervisor(int id);

    public void updateHypervisor(Hypervisor h);

    public void deleteHypervisor(int id);
}
