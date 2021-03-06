package com.xenenergy.projects.dao;

import com.xenenergy.projects.entities.DeviceUploadDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xesi on 01/06/2017.
 */
@Repository
public interface DeviceUploadDetailDao extends PagingAndSortingRepository<DeviceUploadDetail, Long> {
    Page<DeviceUploadDetail> findAllByIdMasterOrderByIdDesc(long idMaster, Pageable pageable);
}
