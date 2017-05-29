package com.xenenergy.projects.services.interfaces.arm;

import com.xenenergy.projects.entities.arm.ChargeType;
import com.xenenergy.projects.services.interfaces.CRUDService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Daryll Sabate on 5/29/2017.
 */
public interface ChargeTypeService extends CRUDService<ChargeType> {
    Page<ChargeType> findAllPageable(long idRateMaster, Pageable pageable);
    List<ChargeType> getChargeTypeById(long id);
}