package com.workspace.rentcar.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class RcCar {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "RC_CAR_SEQ")
    @Column(name = "ID")
    private Long id;
    @Column
    private String mark;
    @Column
    private String model;
    @Column
    private String color;
    @Column
    private String bodyType;
    @Column
    private Integer milAge;
    @Column
    private Date productionDate;

    @OneToOne
            (cascade = CascadeType.ALL)
//    @JoinColumn(name = "RC_ENGINE_ID")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_rcEngine_rcCar")
//    @SequenceGenerator(name = "id_rcEngine_rcCar", sequenceName = "RC_CAR_RC_ENGINE_SEQ")
    private RcEngine rcEngine;

    public RcCar() {
    }

    public RcCar(Long id, String mark, String model, String color, String bodyType, Integer milAge, Date productionDate, RcEngine rcEngine) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.milAge = milAge;
        this.productionDate = productionDate;
        this.rcEngine = rcEngine;
    }

    public Long getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public Integer getMilAge() {
        return milAge;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public RcEngine getIdEngine() {
        return rcEngine;
    }

    public void setIdEngine(RcEngine idEngine) {
        this.rcEngine = idEngine;
    }

    public void setMilAge(Integer milAge) {
        this.milAge = milAge;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "RcCar{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", milAge=" + milAge +
                ", productionDate=" + productionDate +
                ", idEngine=" + rcEngine +
                '}';
    }
}
