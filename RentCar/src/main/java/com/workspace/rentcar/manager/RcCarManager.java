package com.workspace.rentcar.manager;

import com.workspace.rentcar.dao.RcCarRepo;
import com.workspace.rentcar.dao.entity.RcCar;
import com.workspace.rentcar.dao.entity.RcEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RcCarManager {

    private RcCarRepo rcCarRepo;

    @Autowired
    public RcCarManager(RcCarRepo rcCarRepo) {
        this.rcCarRepo = rcCarRepo;
    }

    public Iterable<RcCar> findAll() {
        return rcCarRepo.findAll();
    }

    public Optional<RcCar> findById(Long id) {
        return rcCarRepo.findById(id);
    }

    public RcCar save(RcCar rcCar) {
        return rcCarRepo.save(rcCar);
    }

    public RcCar updateCar(RcCar rcCar) {
        return rcCarRepo.save(rcCar);
    }

    public void deleteById(Long id) {
        rcCarRepo.deleteById(id);
    }
}
