/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DAO;

import com.belaytech.device.DO.VMTemplate;
import java.util.List;

/**
 *
 * @author Joshua
 */
public interface VMTemplatesDAO {

    public List<VMTemplate> getAllVMTemplates();

    public VMTemplate getVMTemplate(int id);

    public void updateVMTemplate(VMTemplate vmt);

    public void deleteVMTemplate(int id);
}
