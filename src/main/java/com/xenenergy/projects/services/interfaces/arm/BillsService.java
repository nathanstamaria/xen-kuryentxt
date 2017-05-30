package com.xenenergy.projects.services.interfaces.arm;

import com.xenenergy.projects.entities.arm.Bills;
import com.xenenergy.projects.services.interfaces.CRUDService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xesi on 29/05/2017.
 */
@Transactional
public interface BillsService extends CRUDService<Bills> {
    int countBills(String dateFrom, String dateTo);
    List<Bills> getAllBills();
}