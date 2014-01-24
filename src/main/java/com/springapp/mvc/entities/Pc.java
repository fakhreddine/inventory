package com.springapp.mvc.entities;

import javax.persistence.*;

/**
 * Created by aleksandrs on 12/27/13.
 */
@Entity
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String number;
    @Column
    private String cpu;
    @Column
    private String hdd;
    @Column
    private int ram;
    @Column
    @Enumerated(EnumType.STRING)
    private OpSystem os;
    @Column
    private String vga;
    @Column
    private String office;
    @Column(columnDefinition = "text")
    private String other;
    @Column
    private String buyDate;
    @Column
    private String addDate;
    @Column
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public OpSystem getOs() {
        return os;
    }

    public void setOs(OpSystem os) {
        this.os = os;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram=" + ram +
                ", os=" + os +
                ", vga='" + vga + '\'' +
                ", office='" + office + '\'' +
                ", other='" + other + '\'' +
                ", buyDate='" + buyDate + '\'' +
                ", addDate='" + addDate + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
