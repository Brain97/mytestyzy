package com.example.demo.model;

import java.util.Date;

public class TbKPI {

    private String starttime  ;
    private Double period    ;
    private String     enodeb    ;
    private String         cell    ;
    private String          cell1    ;
    private Double PRCFINISH    ;
    private Double PRCREQUIRE    ;
    private Double PRCRATE    ;
    private Double ERABTOTALSUCESS    ;
    private Double ERABTOTALLINK    ;
    private Double  ERABRATE    ;
    private Double      eNodeBERABTIME    ;
    private Double      CELLERAMTIME    ;
    private Double      ERAMdROPRATE    ;
    private Double       WIRELESSRATE    ;
    private Double     ENODEBRELEASETIME    ;
    private Double     UERELEASETIME    ;
    private Double     UESUCCESSTIME    ;
    private Double     WIRELESSDROPRATE    ;
    private Double     ENODEBSUCTIMEDIFF    ;
    private Double     ENODEBTRYTIMEDIFF    ;
    private Double       ENODEBSUCTIMESAME    ;
    private Double      eNBIndifsuctime    ;
    private Double      eNBoutdifsuctime    ;
    private Double      eNBoutdiftrytime    ;
    private Double      eNBoutsamesuctime    ;
    private Double      eNBoutsametrytime    ;
    private String        eNBinsucrate    ;
    private Double       eNBoutsucrate    ;
    private Double       zspsamerate    ;
    private String         zspdifrate    ;
    private Double       zsprate    ;
    private Double        totalupbits    ;
    private Double        totaldownbits    ;
    private Double        rrcreconntime    ;
    private Double        rrcreconnrate    ;
    private Double        rebuildsameoutsuctime    ;
    private Double        rebuilddifoutsuctime    ;
    private Double         rebuildsameinsuctime    ;
    private Double        rebuilddifinsuctime    ;
    private Double        eNBSUCTIME    ;
    private Double         eNBTRYTIME ;

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public Double getPeriod() {
        return period;
    }

    public void setPeriod(Double period) {
        this.period = period;
    }

    public String getEnodeb() {
        return enodeb;
    }

    public void setEnodeb(String enodeb) {
        this.enodeb = enodeb;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getCell1() {
        return cell1;
    }

    public void setCell1(String cell1) {
        this.cell1 = cell1;
    }

    public Double getPRCFINISH() {
        return PRCFINISH;
    }

    public void setPRCFINISH(Double PRCFINISH) {
        this.PRCFINISH = PRCFINISH;
    }

    public Double getPRCREQUIRE() {
        return PRCREQUIRE;
    }

    public void setPRCREQUIRE(Double PRCREQUIRE) {
        this.PRCREQUIRE = PRCREQUIRE;
    }

    public Double getPRCRATE() {
        return PRCRATE;
    }

    public void setPRCRATE(Double PRCRATE) {
        this.PRCRATE = PRCRATE;
    }

    public Double getERABTOTALSUCESS() {
        return ERABTOTALSUCESS;
    }

    public void setERABTOTALSUCESS(Double eRABTOTALSUCESS) {
        ERABTOTALSUCESS = eRABTOTALSUCESS;
    }

    public Double getERABTOTALLINK() {
        return ERABTOTALLINK;
    }

    public void setERABTOTALLINK(Double eRABTOTALLINK) {
        ERABTOTALLINK = eRABTOTALLINK;
    }

    public Double getERABRATE() {
        return ERABRATE;
    }

    public void setERABRATE(Double eRABRATE) {
        ERABRATE = eRABRATE;
    }

    public Double geteNodeBERABTIME() {
        return eNodeBERABTIME;
    }

    public void seteNodeBERABTIME(Double eNodeBERABTIME) {
        this.eNodeBERABTIME = eNodeBERABTIME;
    }

    public Double getCELLERAMTIME() {
        return CELLERAMTIME;
    }

    public void setCELLERAMTIME(Double CELLERAMTIME) {
        this.CELLERAMTIME = CELLERAMTIME;
    }

    public Double getERAMdROPRATE() {
        return ERAMdROPRATE;
    }

    public void setERAMdROPRATE(Double eRAMdROPRATE) {
        ERAMdROPRATE = eRAMdROPRATE;
    }

    public Double getWIRELESSRATE() {
        return WIRELESSRATE;
    }

    public void setWIRELESSRATE(Double WIRELESSRATE) {
        this.WIRELESSRATE = WIRELESSRATE;
    }

    public Double getENODEBRELEASETIME() {
        return ENODEBRELEASETIME;
    }

    public void setENODEBRELEASETIME(Double ENODEBRELEASETIME) {
        this.ENODEBRELEASETIME = ENODEBRELEASETIME;
    }

    public Double getUERELEASETIME() {
        return UERELEASETIME;
    }

    public void setUERELEASETIME(Double UERELEASETIME) {
        this.UERELEASETIME = UERELEASETIME;
    }

    public Double getUESUCCESSTIME() {
        return UESUCCESSTIME;
    }

    public void setUESUCCESSTIME(Double UESUCCESSTIME) {
        this.UESUCCESSTIME = UESUCCESSTIME;
    }

    public Double getWIRELESSDROPRATE() {
        return WIRELESSDROPRATE;
    }

    public void setWIRELESSDROPRATE(Double WIRELESSDROPRATE) {
        this.WIRELESSDROPRATE = WIRELESSDROPRATE;
    }

    public Double getENODEBSUCTIMEDIFF() {
        return ENODEBSUCTIMEDIFF;
    }

    public void setENODEBSUCTIMEDIFF(Double ENODEBSUCTIMEDIFF) {
        this.ENODEBSUCTIMEDIFF = ENODEBSUCTIMEDIFF;
    }

    public Double getENODEBTRYTIMEDIFF() {
        return ENODEBTRYTIMEDIFF;
    }

    public void setENODEBTRYTIMEDIFF(Double ENODEBTRYTIMEDIFF) {
        this.ENODEBTRYTIMEDIFF = ENODEBTRYTIMEDIFF;
    }

    public Double getENODEBSUCTIMESAME() {
        return ENODEBSUCTIMESAME;
    }

    public void setENODEBSUCTIMESAME(Double ENODEBSUCTIMESAME) {
        this.ENODEBSUCTIMESAME = ENODEBSUCTIMESAME;
    }

    public Double geteNBIndifsuctime() {
        return eNBIndifsuctime;
    }

    public void seteNBIndifsuctime(Double eNBIndifsuctime) {
        this.eNBIndifsuctime = eNBIndifsuctime;
    }

    public Double geteNBoutdifsuctime() {
        return eNBoutdifsuctime;
    }

    public void seteNBoutdifsuctime(Double eNBoutdifsuctime) {
        this.eNBoutdifsuctime = eNBoutdifsuctime;
    }

    public Double geteNBoutdiftrytime() {
        return eNBoutdiftrytime;
    }

    public void seteNBoutdiftrytime(Double eNBoutdiftrytime) {
        this.eNBoutdiftrytime = eNBoutdiftrytime;
    }

    public Double geteNBoutsamesuctime() {
        return eNBoutsamesuctime;
    }

    public void seteNBoutsamesuctime(Double eNBoutsamesuctime) {
        this.eNBoutsamesuctime = eNBoutsamesuctime;
    }

    public Double geteNBoutsametrytime() {
        return eNBoutsametrytime;
    }

    public void seteNBoutsametrytime(Double eNBoutsametrytime) {
        this.eNBoutsametrytime = eNBoutsametrytime;
    }

    public String geteNBinsucrate() {
        return eNBinsucrate;
    }

    public void seteNBinsucrate(String eNBinsucrate) {
        this.eNBinsucrate = eNBinsucrate;
    }

    public Double geteNBoutsucrate() {
        return eNBoutsucrate;
    }

    public void seteNBoutsucrate(Double eNBoutsucrate) {
        this.eNBoutsucrate = eNBoutsucrate;
    }

    public Double getZspsamerate() {
        return zspsamerate;
    }

    public void setZspsamerate(Double zspsamerate) {
        this.zspsamerate = zspsamerate;
    }

    public String getZspdifrate() {
        return zspdifrate;
    }

    public void setZspdifrate(String zspdifrate) {
        this.zspdifrate = zspdifrate;
    }

    public Double getZsprate() {
        return zsprate;
    }

    public void setZsprate(Double zsprate) {
        this.zsprate = zsprate;
    }

    public Double getTotalupbits() {
        return totalupbits;
    }

    public void setTotalupbits(Double totalupbits) {
        this.totalupbits = totalupbits;
    }

    public Double getTotaldownbits() {
        return totaldownbits;
    }

    public void setTotaldownbits(Double totaldownbits) {
        this.totaldownbits = totaldownbits;
    }

    public Double getRrcreconntime() {
        return rrcreconntime;
    }

    public void setRrcreconntime(Double rrcreconntime) {
        this.rrcreconntime = rrcreconntime;
    }

    public Double getRrcreconnrate() {
        return rrcreconnrate;
    }

    public void setRrcreconnrate(Double rrcreconnrate) {
        this.rrcreconnrate = rrcreconnrate;
    }

    public Double getRebuildsameoutsuctime() {
        return rebuildsameoutsuctime;
    }

    public void setRebuildsameoutsuctime(Double rebuildsameoutsuctime) {
        this.rebuildsameoutsuctime = rebuildsameoutsuctime;
    }

    public Double getRebuilddifoutsuctime() {
        return rebuilddifoutsuctime;
    }

    public void setRebuilddifoutsuctime(Double rebuilddifoutsuctime) {
        this.rebuilddifoutsuctime = rebuilddifoutsuctime;
    }

    public Double getRebuildsameinsuctime() {
        return rebuildsameinsuctime;
    }

    public void setRebuildsameinsuctime(Double rebuildsameinsuctime) {
        this.rebuildsameinsuctime = rebuildsameinsuctime;
    }

    public Double getRebuilddifinsuctime() {
        return rebuilddifinsuctime;
    }

    public void setRebuilddifinsuctime(Double rebuilddifinsuctime) {
        this.rebuilddifinsuctime = rebuilddifinsuctime;
    }

    public Double geteNBSUCTIME() {
        return eNBSUCTIME;
    }

    public void seteNBSUCTIME(Double eNBSUCTIME) {
        this.eNBSUCTIME = eNBSUCTIME;
    }

    public Double geteNBTRYTIME() {
        return eNBTRYTIME;
    }

    public void seteNBTRYTIME(Double eNBTRYTIME) {
        this.eNBTRYTIME = eNBTRYTIME;
    }

    @Override
    public String toString() {
        return "TbKPI{" +
                "starttime=" + starttime +
                ", period=" + period +
                ", enodeb='" + enodeb + '\'' +
                ", cell='" + cell + '\'' +
                ", cell1='" + cell1 + '\'' +
                ", PRCFINISH=" + PRCFINISH +
                ", PRCREQUIRE=" + PRCREQUIRE +
                ", PRCRATE=" + PRCRATE +
                ", ERABTOTALSUCESS=" + ERABTOTALSUCESS +
                ", ERABTOTALLINK=" + ERABTOTALLINK +
                ", ERABRATE=" + ERABRATE +
                ", eNodeBERABTIME=" + eNodeBERABTIME +
                ", CELLERAMTIME=" + CELLERAMTIME +
                ", ERAMdROPRATE=" + ERAMdROPRATE +
                ", WIRELESSRATE=" + WIRELESSRATE +
                ", ENODEBRELEASETIME=" + ENODEBRELEASETIME +
                ", UERELEASETIME=" + UERELEASETIME +
                ", UESUCCESSTIME=" + UESUCCESSTIME +
                ", WIRELESSDROPRATE=" + WIRELESSDROPRATE +
                ", ENODEBSUCTIMEDIFF=" + ENODEBSUCTIMEDIFF +
                ", ENODEBTRYTIMEDIFF=" + ENODEBTRYTIMEDIFF +
                ", ENODEBSUCTIMESAME=" + ENODEBSUCTIMESAME +
                ", eNBIndifsuctime=" + eNBIndifsuctime +
                ", eNBoutdifsuctime=" + eNBoutdifsuctime +
                ", eNBoutdiftrytime=" + eNBoutdiftrytime +
                ", eNBoutsamesuctime=" + eNBoutsamesuctime +
                ", eNBoutsametrytime=" + eNBoutsametrytime +
                ", eNBinsucrate='" + eNBinsucrate + '\'' +
                ", eNBoutsucrate=" + eNBoutsucrate +
                ", zspsamerate=" + zspsamerate +
                ", zspdifrate='" + zspdifrate + '\'' +
                ", zsprate=" + zsprate +
                ", totalupbits=" + totalupbits +
                ", totaldownbits=" + totaldownbits +
                ", rrcreconntime=" + rrcreconntime +
                ", rrcreconnrate=" + rrcreconnrate +
                ", rebuildsameoutsuctime=" + rebuildsameoutsuctime +
                ", rebuilddifoutsuctime=" + rebuilddifoutsuctime +
                ", rebuildsameinsuctime=" + rebuildsameinsuctime +
                ", rebuilddifinsuctime=" + rebuilddifinsuctime +
                ", eNBSUCTIME=" + eNBSUCTIME +
                ", eNBTRYTIME=" + eNBTRYTIME +
                '}';
    }
}
