package com.example.demo.model;

public class TbCell {
    private String CITY;
    private String SECTORID;
    private String SECTORNAME;
    private Integer ENODEBID;
    private String ENODEBNAME;

    private Integer EARFCN;
    private Integer PCI;
    private Integer        PSS;
    private Integer SSS;
    private Integer       TAC;
    private String VENDOR;
    private Double        LONGITUDE;
    private Double LATITUDE;



    private String        STYLE;



    private Double AZIMUTH;
    private Double HEIGHT;
    private Double ELECTTILT;
    private Double MECHTILT;
    private Double TOTLETILT;
    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSECTORID() {
        return SECTORID;
    }

    public void setSECTORID(String SECTORID) {
        this.SECTORID = SECTORID;
    }

    public String getSECTORNAME() {
        return SECTORNAME;
    }

    public void setSECTORNAME(String SECTORNAME) {
        this.SECTORNAME = SECTORNAME;
    }

    public Integer getENODEBID() {
        return ENODEBID;
    }

    @Override
    public String toString() {
        return "tbCell{" +
                "CITY='" + CITY + '\'' +
                ", SECTORID='" + SECTORID + '\'' +
                ", SECTORNAME='" + SECTORNAME + '\'' +
                ", ENODEBID=" + ENODEBID +
                ", ENODEBNAME='" + ENODEBNAME + '\'' +
                ", EARFCN=" + EARFCN +
                ", PCI=" + PCI +
                ", PSS=" + PSS +
                ", SSS=" + SSS +
                ", TAC=" + TAC +
                ", VENDOR='" + VENDOR + '\'' +
                ", LONGITUDE=" + LONGITUDE +
                ", LATITUDE=" + LATITUDE +
                ", STYLE='" + STYLE + '\'' +
                ", AZIMUTH=" + AZIMUTH +
                ", HEIGHT=" + HEIGHT +
                ", ELECTTILT=" + ELECTTILT +
                ", MECHTILT=" + MECHTILT +
                ", TOTLETILT=" + TOTLETILT +
                '}';
    }

    public void setENODEBID(Integer ENODEBID) {
        this.ENODEBID = ENODEBID;
    }

    public String getENODEBNAME() {
        return ENODEBNAME;
    }

    public void setENODEBNAME(String ENODEBNAME) {
        this.ENODEBNAME = ENODEBNAME;
    }

    public Integer getEARFCN() {
        return EARFCN;
    }

    public void setEARFCN(Integer EARFCN) {
        this.EARFCN = EARFCN;
    }

    public Integer getPCI() {
        return PCI;
    }

    public void setPCI(Integer PCI) {
        this.PCI = PCI;
    }

    public Integer getPSS() {
        return PSS;
    }

    public void setPSS(Integer PSS) {
        this.PSS = PSS;
    }

    public Integer getSSS() {
        return SSS;
    }

    public void setSSS(Integer SSS) {
        this.SSS = SSS;
    }

    public Integer getTAC() {
        return TAC;
    }

    public void setTAC(Integer TAC) {
        this.TAC = TAC;
    }

    public String getVENDOR() {
        return VENDOR;
    }

    public void setVENDOR(String VENDOR) {
        this.VENDOR = VENDOR;
    }

    public Double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(Double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public Double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(Double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getSTYLE() {
        return STYLE;
    }

    public void setSTYLE(String STYLE) {
        this.STYLE = STYLE;
    }

    public Double getAZIMUTH() {
        return AZIMUTH;
    }

    public void setAZIMUTH(Double AZIMUTH) {
        this.AZIMUTH = AZIMUTH;
    }

    public Double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(Double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public Double getELECTTILT() {
        return ELECTTILT;
    }

    public void setELECTTILT(Double ELECTTILT) {
        this.ELECTTILT = ELECTTILT;
    }

    public Double getMECHTILT() {
        return MECHTILT;
    }

    public void setMECHTILT(Double MECHTILT) {
        this.MECHTILT = MECHTILT;
    }

    public Double getTOTLETILT() {
        return TOTLETILT;
    }

    public void setTOTLETILT(Double TOTLETILT) {
        this.TOTLETILT = TOTLETILT;
    }



}
