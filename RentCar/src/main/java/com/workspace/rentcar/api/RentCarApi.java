package com.workspace.rentcar.api;

import com.workspace.rentcar.dao.entity.RcCar;
import com.workspace.rentcar.dao.entity.RcEngine;
import com.workspace.rentcar.manager.RcCarManager;
import com.workspace.rentcar.manager.RcEngineManager;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class RentCarApi {

    private RcCarManager rcCars;
    private RcEngineManager rcEngines;



    @Autowired
    public RentCarApi(RcCarManager rcCar) {
        this.rcCars = rcCar;
    }

    @GetMapping("/all")
    public Iterable<RcCar> getAll() {
        return rcCars.findAll();
    }

    @GetMapping
    public Optional<RcCar> getById(@RequestParam Long index) {
        return rcCars.findById(index);
    }


    @PostMapping
    public RcCar addCar() {

        return rcCars.save(new RcCar(22L, "Hyundai", "C30", "Red", "sedan", 70,null ,
                new RcEngine(40L,"RRR4567","Diesel",3.0F,455,"T","Automatic","AWD" )));
    }


//    @PostMapping
//    public RcCar addCar(RcCar rcCar) {
//        return rcCars.save(rcCar);
//    }

//    public RcEngine addEngine(@RequestBody RcEngine rcEngine) {
//        return rcEngines.save(rcEngine);
//    }

    @PutMapping
    public RcCar updateCar(@RequestBody RcCar rcCar) {
        return rcCars.updateCar(rcCar);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long index) {
        rcCars.deleteById(index);
    }
}
