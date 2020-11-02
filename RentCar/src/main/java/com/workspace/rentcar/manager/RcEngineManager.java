package com.workspace.rentcar.manager;

import com.workspace.rentcar.dao.entity.RcCar;
import com.workspace.rentcar.dao.entity.RcEngine;
import com.workspace.rentcar.dao.entity.RcEngineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RcEngineManager {

    private RcEngineRepo rcEngineRepo;

    @Autowired
    public RcEngineManager(RcEngineRepo rcEngineRepo) {
        this.rcEngineRepo = rcEngineRepo;
    }


    public RcEngine save(RcEngine rcEngine) {
        return rcEngineRepo.save(rcEngine);
    }
}
