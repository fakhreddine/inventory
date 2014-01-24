package com.springapp.mvc.entities;

import javax.persistence.*;

/**
 * Created by aleksandrs on 1/3/14.
 */
@Entity
@Table(name = "vlans")
public class VLAN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private long vlan;

    @Column(length = 500)
    private String descr;

    @Column(length = 500)
    private String a_address;

    @Column(length = 500)
    private String b_address;

    @Column
    private String a_device;

    @Column
    private String b_device;

    @Column(length = 1000)
    private String comment;

    @Column(nullable = false, columnDefinition = "Boolean default '0'")
    private boolean active;

    public VLAN() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getVlan() {
        return vlan;
    }

    public void setVlan(long vlan) {
        this.vlan = vlan;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getA_address() {
        return a_address;
    }

    public void setA_address(String a_address) {
        this.a_address = a_address;
    }

    public String getB_address() {
        return b_address;
    }

    public void setB_address(String b_address) {
        this.b_address = b_address;
    }

    public String getA_device() {
        return a_device;
    }

    public void setA_device(String a_device) {
        this.a_device = a_device;
    }

    public String getB_device() {
        return b_device;
    }

    public void setB_device(String b_device) {
        this.b_device = b_device;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "VLAN{" +
                "id=" + id +
                ", vlan=" + vlan +
                ", descr='" + descr + '\'' +
                ", a_address='" + a_address + '\'' +
                ", b_address='" + b_address + '\'' +
                ", a_device='" + a_device + '\'' +
                ", b_device='" + b_device + '\'' +
                ", comment='" + comment + '\'' +
                ", active=" + active +
                '}';
    }
}
