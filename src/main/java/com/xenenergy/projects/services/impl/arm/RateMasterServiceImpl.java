package com.xenenergy.projects.services.impl.arm;

import com.xenenergy.projects.dao.arm.RateMasterDao;
import com.xenenergy.projects.entities.arm.RateMaster;
import com.xenenergy.projects.services.interfaces.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class RateMasterServiceImpl implements CRUDService<RateMaster> {

    @Autowired
    private RateMasterDao rateMasterDao;

    @Override
    public Page<RateMaster> findAllPageable(Pageable pageable) {
        return rateMasterDao.findAllByOrderByIdDesc(pageable);
    }

    public Page<RateMaster> findAllWithFixCharge(Pageable pageable){
        return rateMasterDao.findAll(pageable);
    }

    @Override
    public RateMaster getById(long id) {
        return rateMasterDao.findOne(id);
    }

    @Override
    public boolean deleteById(long id) {
        rateMasterDao.delete(id);
        return true;
    }

    @Override
    public RateMaster insert(RateMaster rateMaster) {
        return rateMasterDao.save(rateMaster);
    }

    @Override
    public RateMaster update(RateMaster rateMaster) {
        return rateMasterDao.save(rateMaster);
    }
}