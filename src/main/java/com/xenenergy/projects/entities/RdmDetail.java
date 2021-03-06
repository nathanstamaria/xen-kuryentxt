package com.xenenergy.projects.entities;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

/**
 * Created by xesi on 22/05/2017.
 */
@Entity
@Table(name = "arm_route_definition_detail")
public class RdmDetail {

    @Id
    @Column(name = "ID")
    private long id;
    @Column(name = "ID_RDM", updatable = true, nullable = true)
    private Long idRdm;
    @Column(name = "ID_ROUTE", updatable = true, nullable = true)
    private long idRoute;
    @Column(name = "START_SEQUENCE", updatable = true, nullable = true)
    @Value("0")
    private int startSequence = 0;
    @Column(name = "END_SEQUENCE", updatable = true, nullable = true)
    @Value("99999")
    private int endSequence = 99999;
    @Column(name = "CONSUMER_COUNT")
    private int consumerCount;

    public RdmDetail() {
    }

    public RdmDetail(long id, Long idRdm, long idRoute, int startSequence, int endSequence, int consumerCount) {
        this.id = id;
        this.idRdm = idRdm;
        this.idRoute = idRoute;
        this.startSequence = startSequence;
        this.endSequence = endSequence;
        this.consumerCount = consumerCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getIdRdm() {
        return idRdm;
    }

    public void setIdRdm(Long idRdm) {
        this.idRdm = idRdm;
    }

    public long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(long idRoute) {
        this.idRoute = idRoute;
    }

    public int getStartSequence() {
        return startSequence;
    }

    public void setStartSequence(int startSequence) {
        this.startSequence = startSequence;
    }

    public int getEndSequence() {
        return endSequence;
    }

    public void setEndSequence(int endSequence) {
        this.endSequence = endSequence;
    }

    public int getConsumerCount() {
        return consumerCount;
    }

    public void setConsumerCount(int consumerCount) {
        this.consumerCount = consumerCount;
    }
}
