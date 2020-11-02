package com.workspace.rentcar.dao.entity;

import javax.persistence.*;

@Entity
@Table
public class RcEngine {

    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_rcEngine")
//    @SequenceGenerator(name = "id_rCEngine", sequenceName = "RC_ENGINE_SEQ")
    private Long id;
    @Column
    private String serialNumber;
    @Column
    private String fuelType;
    @Column
    private Float capacity;
    @Column
    private Integer power;
    @Column
    private String turbine;
    @Column
    private String gearbox;
    @Column
    private String typeOfDrive;


    public RcEngine() {
    }

    public RcEngine(Long id, String serialNumber, String fuelType, Float capacity, Integer power, String turbine, String gearbox, String typeOfDrive) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.power = power;
        this.turbine = turbine;
        this.gearbox = gearbox;
        this.typeOfDrive = typeOfDrive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getTurbine() {
        return turbine;
    }

    public void setTurbine(String turbine) {
        this.turbine = turbine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }



    @Override
    public String toString() {
        return "RcEngine{" +
                "id=" + id +
                ", vin='" + serialNumber + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", capacity=" + capacity +
                ", power=" + power +
                ", turbine='" + turbine + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ", typeOfDrive='" + typeOfDrive + '\'' +
                '}';
    }
}
