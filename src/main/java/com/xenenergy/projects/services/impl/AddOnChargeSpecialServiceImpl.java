package com.xenenergy.projects.services.impl;

import com.xenenergy.projects.dao.AddOnChargeSpecialDao;
import com.xenenergy.projects.entities.AddOnChargeSpecial;
import com.xenenergy.projects.services.interfaces.AddOnChargeSpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xesi on 27/07/2017.
 */
@Service
@Transactional
public class AddOnChargeSpecialServiceImpl implements AddOnChargeSpecialService {

    @Autowired
    private AddOnChargeSpecialDao addOnChargeSpecialDao;

    @Override
    public Page<AddOnChargeSpecial> findAllPageable(Pageable pageable) {
        return addOnChargeSpecialDao.findAll(pageable);
    }

    @Override
    public AddOnChargeSpecial getById(long id) {
        return addOnChargeSpecialDao.findOne(id);
    }

    @Override
    public boolean deleteById(long id) {
        addOnChargeSpecialDao.delete(id);
        return true;
    }

    @Override
    public AddOnChargeSpecial insert(AddOnChargeSpecial addOnChargeSpecial) {
        return addOnChargeSpecialDao.save(addOnChargeSpecial);
    }

    @Override
    public AddOnChargeSpecial update(AddOnChargeSpecial addOnChargeSpecial) {
        return addOnChargeSpecialDao.save(addOnChargeSpecial);
    }
}
