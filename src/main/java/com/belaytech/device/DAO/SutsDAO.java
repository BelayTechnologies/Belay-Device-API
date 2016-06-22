/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.SUT;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface SutsDAO {

    public List<SUT> getAllSUTs();

    public SUT getSUT(int id);

    public void updateSUT(SUT sut);

    public void deleteSUT(int id);
}
