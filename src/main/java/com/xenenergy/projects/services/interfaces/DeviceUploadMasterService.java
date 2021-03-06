package com.xenenergy.projects.services.interfaces;

import com.xenenergy.projects.entities.DeviceUploadMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xesi on 31/05/2017.
 */
@Transactional
public interface DeviceUploadMasterService extends CRUDService<DeviceUploadMaster>{
    Page<DeviceUploadMaster> findAllByOrderByIdDesc(Pageable pageable);
}
