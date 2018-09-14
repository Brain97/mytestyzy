package com.example.demo;


import com.example.demo.model.TbCell;
import com.example.demo.model.TbKPI;
import com.example.demo.model.TbPRB;
import com.example.demo.model.TbPRBNew;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

@Component
public class MyExcelOpertate {
    public static List<String> tbKPIHead;
    public static List<String> tbCellHead;
    public static List<String> tbPRBHead;
    public static List<String> tbPrbNewHead;
    public static List<String> tbC2INewHead;
    public MyExcelOpertate() {
        String[] TbCellArray = {"CITY" , "SECTORID" , "SECTORNAME" ,
                "ENODEBID" ,
                "ENODEBNAME" ,

                "EARFCN" ,
                "PCI" ,
                "PSS" ,
                "SSS" ,
                "TAC" ,
                "VENDOR" ,
                "LONGITUDE" ,
                "LATITUDE" ,
                "STYLE" ,


                "AZIMUTH" ,
                "HEIGHT" ,
                "ELECTTILT" ,
                "MECHTILT" ,
                "TOTLETILT"};
        tbCellHead = Arrays.asList(TbCellArray);
        String[] tbPRBArray = {"STARTTIME" ,
                "PERIOD" ,
                "ENODEB" ,
                "CELL" ,
                "CELLNAME" ,
                "PRB0 " ,
                "PRB1 " ,
                "PRB2 " ,
                "PRB3 " ,
                "PRB4 " ,
                "PRB5 " ,
                "PRB6 " ,
                "PRB7 " ,
                "PRB8 " ,
                "PRB9 " ,
                "PRB10 " ,
                "PRB11 " ,
                "PRB12 " ,
                "PRB13" ,
                "PRB14" ,
                "PRB15" ,
                "PRB16" ,
                "PRB17" ,
                "PRB18" ,
                "PRB19" ,
                "PRB20" ,
                "PRB21" ,
                "PRB22" ,
                "PRB23" ,
                "PRB24" ,
                "PRB25" ,
                "PRB26" ,
                "PRB27" ,
                "PRB28" ,
                "PRB29" ,
                "PRB30" ,
                "PRB31" ,
                "PRB32" ,
                "PRB33" ,
                "PRB34" ,
                "PRB35" ,
                "PRB36" ,
                "PRB37" ,
                "PRB38" ,
                "PRB39" ,
                "PRB40" ,
                "PRB41" ,
                "PRB42" ,
                "PRB43" ,
                "PRB44" ,
                "PRB45" ,
                "PRB46" ,
                "PRB47" ,
                "PRB48" ,
                "PRB49" ,
                "PRB50" ,
                "PRB51" ,
                "PRB52" ,
                "PRB53" ,
                "PRB54" ,
                "PRB55" ,
                "PRB56" ,
                "PRB57" ,
                "PRB58" ,
                "PRB59" ,
                "PRB60" ,
                "PRB61" ,
                "PRB62" ,
                "PRB63" ,
                "PRB64" ,
                "PRB65" ,
                "PRB66" ,
                "PRB67" ,
                "PRB68" ,
                "PRB69" ,
                "PRB70" ,
                "PRB71" ,
                "PRB72" ,
                "PRB73" ,
                "PRB74" ,
                "PRB75" ,
                "PRB76" ,
                "PRB77" ,
                "PRB78" ,
                "PRB79" ,
                "PRB80" ,
                "PRB81" ,
                "PRB82" ,
                "PRB83" ,
                "PRB84" ,
                "PRB85" ,
                "PRB86" ,
                "PRB87" ,
                "PRB88" ,
                "PRB89" ,
                "PRB90" ,
                "PRB91" ,
                "PRB92" ,
                "PRB93" ,
                "PRB94" ,
                "PRB95" ,
                "PRB96" ,
                "PRB97" ,
                "PRB98" ,
                "PRB99"};
        tbPRBHead = Arrays.asList(tbPRBArray);
        String[] tbKPIArray = {"starttime" ,
                "period" ,
                "enodeb" ,
                "cell" ,
                "cell1" ,
                "PRCFINISH" ,
                "PRCREQUIRE" ,
                "PRCRATE" ,
                "ERABTOTALSUCESS" ,
                "ERABTOTALLINK" ,
                "ERABRATE" ,
                "eNodeBERABTIME" ,
                "CELLERAMTIME" ,
                "ERAMdROPRATE" ,

                "WIRELESSRATE" ,
                "ENODEBRELEASETIME" ,
                "UERELEASETIME" ,
                "UESUCCESSTIME" ,
                "WIRELESSDROPRATE" ,
                "ENODEBSUCTIMEDIFF" ,
                "ENODEBTRYTIMEDIFF" ,
                "ENODEBSUCTIMESAME" ,
                "eNBIndifsuctime" ,
                "eNBoutdifsuctime" ,
                "eNBoutdiftrytime" ,
                "eNBoutsamesuctime" ,
                "eNBoutsametrytime" ,
                "eNBinsucrate" ,
                "eNBoutsucrate" ,
                "zspsamerate" ,
                "zspdifrate" ,
                "zsprate" ,
                "totalupbits" ,
                "totaldownbits" ,
                "rrcreconntime" ,
                "rrcreconnrate" ,
                "rebuildsameoutsuctime" ,
                "rebuilddifoutsuctime" ,
                "rebuildsameinsuctime" ,
                "rebuilddifinsuctime" ,
                "eNBSUCTIME" ,
                "eNBTRYTIME"
        };
        tbKPIHead = Arrays.asList(tbKPIArray);

        String[] tbPRBNewArray = {"TIME" ,

                "ENODEB" ,

                "AVGPRB0 " ,
                "AVGPRB1 " ,
                "AVGPRB2 " ,
                "AVGPRB3 " ,
                "AVGPRB4 " ,
                "AVGPRB5 " ,
                "AVGPRB6 " ,
                "AVGPRB7 " ,
                "AVGPRB8 " ,
                "AVGPRB9 " ,
                "AVGPRB10 " ,
                "AVGPRB11 " ,
                "AVGPRB12 " ,
                "AVGPRB13" ,
                "AVGPRB14" ,
                "AVGPRB15" ,
                "AVGPRB16" ,
                "AVGPRB17" ,
                "AVGPRB18" ,
                "AVGPRB19" ,
                "AVGPRB20" ,
                "AVGPRB21" ,
                "AVGPRB22" ,
                "AVGPRB23" ,
                "AVGPRB24" ,
                "AVGPRB25" ,
                "AVGPRB26" ,
                "AVGPRB27" ,
                "AVGPRB28" ,
                "AVGPRB29" ,
                "AVGPRB30" ,
                "AVGPRB31" ,
                "AVGPRB32" ,
                "AVGPRB33" ,
                "AVGPRB34" ,
                "AVGPRB35" ,
                "AVGPRB36" ,
                "AVGPRB37" ,
                "AVGPRB38" ,
                "AVGPRB39" ,
                "AVGPRB40" ,
                "AVGPRB41" ,
                "AVGPRB42" ,
                "AVGPRB43" ,
                "AVGPRB44" ,
                "AVGPRB45" ,
                "AVGPRB46" ,
                "AVGPRB47" ,
                "AVGPRB48" ,
                "AVGPRB49" ,
                "AVGPRB50" ,
                "AVGPRB51" ,
                "AVGPRB52" ,
                "AVGPRB53" ,
                "AVGPRB54" ,
                "AVGPRB55" ,
                "AVGPRB56" ,
                "AVGPRB57" ,
                "AVGPRB58" ,
                "AVGPRB59" ,
                "AVGPRB60" ,
                "AVGPRB61" ,
                "AVGPRB62" ,
                "AVGPRB63" ,
                "AVGPRB64" ,
                "AVGPRB65" ,
                "AVGPRB66" ,
                "AVGPRB67" ,
                "AVGPRB68" ,
                "AVGPRB69" ,
                "AVGPRB70" ,
                "AVGPRB71" ,
                "AVGPRB72" ,
                "AVGPRB73" ,
                "AVGPRB74" ,
                "AVGPRB75" ,
                "AVGPRB76" ,
                "AVGPRB77" ,
                "AVGPRB78" ,
                "AVGPRB79" ,
                "AVGPRB80" ,
                "AVGPRB81" ,
                "AVGPRB82" ,
                "AVGPRB83" ,
                "AVGPRB84" ,
                "AVGPRB85" ,
                "AVGPRB86" ,
                "AVGPRB87" ,
                "AVGPRB88" ,
                "AVGPRB89" ,
                "AVGPRB90" ,
                "AVGPRB91" ,
                "AVGPRB92" ,
                "AVGPRB93" ,
                "AVGPRB94" ,
                "AVGPRB95" ,
                "AVGPRB96" ,
                "AVGPRB97" ,
                "AVGPRB98" ,
                "AVGPRB99"};
        tbPrbNewHead = Arrays.asList(tbPRBNewArray);
        String[] tbC2INewArray = {"ServingSector","InterferingSector","Mead","Stdev","PrbC2I9","PrbABS6"}
        tbC2INewHead = Arrays.asList(tbC2INewArray);
    }


    public static void writeExcel(List list, String path, String FILE) {
            System.out.println(FILE);
                XSSFWorkbook workbook = new XSSFWorkbook();
                // 创建一个工作表
                XSSFSheet sheet = workbook.createSheet("sheet0");

                // 添加数据内容
                XSSFCell cell;
                XSSFRow xssfRow = sheet.createRow((0));

                int i = 0;
                switch (FILE) {
                    case "TBCELL":
                        System.out.println("IN TBCELL");
                        for (int j = 0; j < tbCellHead.size(); j++) {
                            cell = xssfRow.createCell(j);
                            cell.setCellValue(tbCellHead.get(j));
                        }
                        for (i = 0; i < list.size(); i++) {
                            System.out.println("IN TBCELL");
                            xssfRow = sheet.createRow((int) (i + 1));

                            cell = xssfRow.createCell(0);
                            cell.setCellValue(((TbCell) list.get(i)).getCITY());
                            cell = xssfRow.createCell(1);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getSECTORID()));
                            cell = xssfRow.createCell(2);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getSECTORNAME()));
                            cell = xssfRow.createCell(3);
                            cell.setCellValue(((TbCell) list.get(i)).getENODEBID());
                            cell = xssfRow.createCell(4);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getENODEBNAME()));

                            cell = xssfRow.createCell(5);
                            cell.setCellValue(((TbCell) list.get(i)).getEARFCN());
                            cell = xssfRow.createCell(6);
                            cell.setCellValue(((TbCell) list.get(i)).getPCI());
                            cell = xssfRow.createCell(7);
                            cell.setCellValue(((TbCell) list.get(i)).getPSS());
                            cell = xssfRow.createCell(8);
                            cell.setCellValue(((TbCell) list.get(i)).getSSS());
                            cell = xssfRow.createCell(9);
                            cell.setCellValue(((TbCell) list.get(i)).getTAC());
                            cell = xssfRow.createCell(10);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getVENDOR()));
                            cell = xssfRow.createCell(11);
                            cell.setCellValue(((TbCell) list.get(i)).getLONGITUDE());
                            cell = xssfRow.createCell(12);
                            cell.setCellValue(((TbCell) list.get(i)).getLATITUDE());


                            cell = xssfRow.createCell(13);
                            cell.setCellValue(((TbCell) list.get(i)).getSTYLE());


                            cell = xssfRow.createCell(14);
                            cell.setCellValue(((TbCell) list.get(i)).getAZIMUTH());
                            cell = xssfRow.createCell(15);
                            cell.setCellValue(((TbCell) list.get(i)).getHEIGHT());
                            cell = xssfRow.createCell(16);
                            cell.setCellValue(((TbCell) list.get(i)).getELECTTILT());
                            cell = xssfRow.createCell(17);
                            cell.setCellValue(((TbCell) list.get(i)).getMECHTILT());
                            cell = xssfRow.createCell(18);
                            cell.setCellValue(((TbCell) list.get(i)).getTOTLETILT());
                            System.out.println("FINISH TBCELL");
                        }
                        break;
                    case "TBPRB":
                        for (int j = 0; j < tbPRBHead.size(); j++) {
                            cell = xssfRow.createCell(j);
                            cell.setCellValue(tbPRBHead.get(j));
                        }
                        for (i = 0; i < list.size(); i++) {

                            xssfRow = sheet.createRow((int) (i + 1));

//cell = xssfRow.createCell(0);cell.setCellValue(((tbCell)list.get(i)).getCITY());
                            cell = xssfRow.createCell(0);
                            cell.setCellValue(((TbPRB) list.get(i)).getSTARTTIME());
                            cell = xssfRow.createCell(1);
                            cell.setCellValue(((TbPRB) list.get(i)).getPERIOD());
                            cell = xssfRow.createCell(2);
                            cell.setCellValue(((TbPRB) list.get(i)).getENODEB());
                            cell = xssfRow.createCell(3);
                            cell.setCellValue(((TbPRB) list.get(i)).getCELL());
                            cell = xssfRow.createCell(4);
                            cell.setCellValue(((TbPRB) list.get(i)).getCELLNAME());
                            cell = xssfRow.createCell(5);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB0());
                            cell = xssfRow.createCell(6);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB1());
                            cell = xssfRow.createCell(7);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB2());
                            cell = xssfRow.createCell(8);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB3());
                            cell = xssfRow.createCell(9);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB4());
                            cell = xssfRow.createCell(10);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB5());
                            cell = xssfRow.createCell(11);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB6());
                            cell = xssfRow.createCell(12);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB7());
                            cell = xssfRow.createCell(13);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB8());
                            cell = xssfRow.createCell(14);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB9());
                            cell = xssfRow.createCell(15);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB10());
                            cell = xssfRow.createCell(16);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB11());
                            cell = xssfRow.createCell(17);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB12());
                            cell = xssfRow.createCell(18);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB13());
                            cell = xssfRow.createCell(19);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB14());
                            cell = xssfRow.createCell(20);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB15());
                            cell = xssfRow.createCell(21);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB16());
                            cell = xssfRow.createCell(22);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB17());
                            cell = xssfRow.createCell(23);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB18());
                            cell = xssfRow.createCell(24);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB19());
                            cell = xssfRow.createCell(25);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB20());
                            cell = xssfRow.createCell(26);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB21());
                            cell = xssfRow.createCell(27);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB22());
                            cell = xssfRow.createCell(28);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB23());
                            cell = xssfRow.createCell(29);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB24());
                            cell = xssfRow.createCell(30);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB25());
                            cell = xssfRow.createCell(30);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB26());
                            cell = xssfRow.createCell(31);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB27());
                            cell = xssfRow.createCell(32);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB28());
                            cell = xssfRow.createCell(33);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB29());
                            cell = xssfRow.createCell(34);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB30());
                            cell = xssfRow.createCell(35);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB31());
                            cell = xssfRow.createCell(36);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB32());
                            cell = xssfRow.createCell(37);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB33());
                            cell = xssfRow.createCell(38);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB34());
                            cell = xssfRow.createCell(39);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB35());
                            cell = xssfRow.createCell(40);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB36());
                            cell = xssfRow.createCell(41);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB37());
                            cell = xssfRow.createCell(42);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB38());
                            cell = xssfRow.createCell(43);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB39());
                            cell = xssfRow.createCell(44);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB40());
                            cell = xssfRow.createCell(45);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB41());
                            cell = xssfRow.createCell(46);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB42());
                            cell = xssfRow.createCell(47);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB43());
                            cell = xssfRow.createCell(48);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB44());
                            cell = xssfRow.createCell(49);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB45());
                            cell = xssfRow.createCell(50);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB46());
                            cell = xssfRow.createCell(51);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB47());
                            cell = xssfRow.createCell(52);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB48());
                            cell = xssfRow.createCell(53);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB49());
                            cell = xssfRow.createCell(54);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB50());
                            cell = xssfRow.createCell(55);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB51());
                            cell = xssfRow.createCell(56);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB52());
                            cell = xssfRow.createCell(57);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB53());
                            cell = xssfRow.createCell(58);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB54());
                            cell = xssfRow.createCell(59);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB55());
                            cell = xssfRow.createCell(60);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB56());
                            cell = xssfRow.createCell(61);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB57());
                            cell = xssfRow.createCell(62);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB58());
                            cell = xssfRow.createCell(63);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB59());
                            cell = xssfRow.createCell(64);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB60());
                            cell = xssfRow.createCell(65);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB61());
                            cell = xssfRow.createCell(66);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB62());
                            cell = xssfRow.createCell(67);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB63());
                            cell = xssfRow.createCell(68);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB64());
                            cell = xssfRow.createCell(69);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB65());
                            cell = xssfRow.createCell(70);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB66());
                            cell = xssfRow.createCell(71);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB67());
                            cell = xssfRow.createCell(72);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB68());
                            cell = xssfRow.createCell(73);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB69());
                            cell = xssfRow.createCell(74);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB70());
                            cell = xssfRow.createCell(75);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB71());
                            cell = xssfRow.createCell(76);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB72());
                            cell = xssfRow.createCell(77);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB73());
                            cell = xssfRow.createCell(78);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB74());
                            cell = xssfRow.createCell(79);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB75());
                            cell = xssfRow.createCell(80);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB76());
                            cell = xssfRow.createCell(81);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB77());
                            cell = xssfRow.createCell(82);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB78());
                            cell = xssfRow.createCell(83);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB79());
                            cell = xssfRow.createCell(84);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB80());
                            cell = xssfRow.createCell(85);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB81());
                            cell = xssfRow.createCell(86);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB82());
                            cell = xssfRow.createCell(87);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB83());
                            cell = xssfRow.createCell(88);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB84());
                            cell = xssfRow.createCell(89);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB85());
                            cell = xssfRow.createCell(90);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB86());
                            cell = xssfRow.createCell(91);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB87());
                            cell = xssfRow.createCell(92);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB88());
                            cell = xssfRow.createCell(93);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB89());
                            cell = xssfRow.createCell(94);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB90());
                            cell = xssfRow.createCell(95);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB91());
                            cell = xssfRow.createCell(96);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB92());
                            cell = xssfRow.createCell(97);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB93());
                            cell = xssfRow.createCell(98);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB94());
                            cell = xssfRow.createCell(99);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB95());
                            cell = xssfRow.createCell(100);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB96());
                            cell = xssfRow.createCell(101);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB97());
                            cell = xssfRow.createCell(102);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB98());
                            cell = xssfRow.createCell(103);
                            cell.setCellValue(((TbPRB) list.get(i)).getPRB99());
                        }
                        break;
                    case "TBKPI":
                        for (int j = 0; j < tbKPIHead.size(); j++) {
                            cell = xssfRow.createCell(j);
                            cell.setCellValue(tbKPIHead.get(j));
                        }
                        for (i = 0; i < list.size(); i++) {

                            xssfRow = sheet.createRow((int) (i + 1));
                            cell = xssfRow.createCell(0);
                            cell.setCellValue(((TbKPI) list.get(i)).getStarttime());
                            cell = xssfRow.createCell(1);
                            cell.setCellValue(((TbKPI) list.get(i)).getPeriod());
                            cell = xssfRow.createCell(2);
                            cell.setCellValue(((TbKPI) list.get(i)).getEnodeb());
                            cell = xssfRow.createCell(3);
                            cell.setCellValue(((TbKPI) list.get(i)).getCell());
                            cell = xssfRow.createCell(4);
                            cell.setCellValue(((TbKPI) list.get(i)).getCell1());
                            cell = xssfRow.createCell(5);
                            cell.setCellValue(((TbKPI) list.get(i)).getPRCFINISH());
                            cell = xssfRow.createCell(6);
                            cell.setCellValue(((TbKPI) list.get(i)).getPRCREQUIRE());
                            cell = xssfRow.createCell(7);
                            cell.setCellValue(((TbKPI) list.get(i)).getPRCRATE());
                            cell = xssfRow.createCell(8);
                            cell.setCellValue(((TbKPI) list.get(i)).getERABTOTALSUCESS());
                            cell = xssfRow.createCell(9);
                            cell.setCellValue(((TbKPI) list.get(i)).getERABTOTALLINK());
                            cell = xssfRow.createCell(10);
                            cell.setCellValue(((TbKPI) list.get(i)).getERABRATE());
                            cell = xssfRow.createCell(11);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNodeBERABTIME());
                            cell = xssfRow.createCell(12);
                            cell.setCellValue(((TbKPI) list.get(i)).getCELLERAMTIME());
                            cell = xssfRow.createCell(13);
                            cell.setCellValue(((TbKPI) list.get(i)).getERAMdROPRATE());
                            cell = xssfRow.createCell(14);
                            cell.setCellValue(((TbKPI) list.get(i)).getWIRELESSRATE());
                            cell = xssfRow.createCell(15);
                            cell.setCellValue(((TbKPI) list.get(i)).getENODEBRELEASETIME());
                            cell = xssfRow.createCell(16);
                            cell.setCellValue(((TbKPI) list.get(i)).getUERELEASETIME());
                            cell = xssfRow.createCell(17);
                            cell.setCellValue(((TbKPI) list.get(i)).getUESUCCESSTIME());
                            cell = xssfRow.createCell(18);
                            cell.setCellValue(((TbKPI) list.get(i)).getWIRELESSDROPRATE());
                            cell = xssfRow.createCell(19);
                            cell.setCellValue(((TbKPI) list.get(i)).getENODEBSUCTIMEDIFF());
                            cell = xssfRow.createCell(20);
                            cell.setCellValue(((TbKPI) list.get(i)).getENODEBTRYTIMEDIFF());
                            cell = xssfRow.createCell(21);
                            cell.setCellValue(((TbKPI) list.get(i)).getENODEBSUCTIMESAME());
                            cell = xssfRow.createCell(22);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBIndifsuctime());
                            cell = xssfRow.createCell(23);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBoutdifsuctime());
                            cell = xssfRow.createCell(24);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBoutdiftrytime());
                            cell = xssfRow.createCell(25);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBoutsamesuctime());
                            cell = xssfRow.createCell(26);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBoutsametrytime());
                            cell = xssfRow.createCell(27);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBinsucrate());
                            cell = xssfRow.createCell(28);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBoutsucrate());
                            cell = xssfRow.createCell(29);
                            cell.setCellValue(((TbKPI) list.get(i)).getZspsamerate());
                            cell = xssfRow.createCell(30);
                            cell.setCellValue(((TbKPI) list.get(i)).getZspdifrate());
                            cell = xssfRow.createCell(31);
                            cell.setCellValue(((TbKPI) list.get(i)).getZsprate());
                            cell = xssfRow.createCell(32);
                            cell.setCellValue(((TbKPI) list.get(i)).getTotalupbits());
                            cell = xssfRow.createCell(33);
                            cell.setCellValue(((TbKPI) list.get(i)).getTotaldownbits());
                            cell = xssfRow.createCell(34);
                            cell.setCellValue(((TbKPI) list.get(i)).getRrcreconntime());
                            cell = xssfRow.createCell(35);
                            cell.setCellValue(((TbKPI) list.get(i)).getRrcreconnrate());
                            cell = xssfRow.createCell(36);
                            cell.setCellValue(((TbKPI) list.get(i)).getRebuildsameoutsuctime());
                            cell = xssfRow.createCell(37);
                            cell.setCellValue(((TbKPI) list.get(i)).getRebuilddifoutsuctime());
                            cell = xssfRow.createCell(38);
                            cell.setCellValue(((TbKPI) list.get(i)).getRebuildsameinsuctime());
                            cell = xssfRow.createCell(39);
                            cell.setCellValue(((TbKPI) list.get(i)).getRebuilddifinsuctime());
                            cell = xssfRow.createCell(40);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBSUCTIME());
                            cell = xssfRow.createCell(41);
                            cell.setCellValue(((TbKPI) list.get(i)).geteNBTRYTIME());
                        }
                        break;
                    case "TBPRBNEW":
                        System.out.println("TBPRBNEW");
                        for (int j = 0; j < tbPrbNewHead.size(); j++) {
                            cell = xssfRow.createCell(j);
                            cell.setCellValue(tbPrbNewHead.get(j));
                        }
                        for (i = 0; i < list.size(); i++) {
                            //System.out.println((list.get(i)).toString());
                            xssfRow = sheet.createRow((int) (i + 1));

//cell = xssfRow.createCell(0);cell.setCellValue(((tbCell)list.get(i)).getCITY());
                            cell = xssfRow.createCell(0);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getTIME());
                            cell = xssfRow.createCell(1);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getENODEB());

                            cell = xssfRow.createCell(2);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB0());
                            cell = xssfRow.createCell(3);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB1());
                            cell = xssfRow.createCell(4);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB2());
                            cell = xssfRow.createCell(5);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB3());
                            cell = xssfRow.createCell(6);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB4());
                            cell = xssfRow.createCell(7);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB5());
                            cell = xssfRow.createCell(8);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB6());
                            cell = xssfRow.createCell(9);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB7());
                            cell = xssfRow.createCell(10);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB8());
                            cell = xssfRow.createCell(11);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB9());
                            cell = xssfRow.createCell(12);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB10());
                            cell = xssfRow.createCell(13);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB11());
                            cell = xssfRow.createCell(14);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB12());
                            cell = xssfRow.createCell(15);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB13());
                            cell = xssfRow.createCell(16);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB14());
                            cell = xssfRow.createCell(17);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB15());
                            cell = xssfRow.createCell(18);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB16());
                            cell = xssfRow.createCell(19);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB17());
                            cell = xssfRow.createCell(20);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB18());
                            cell = xssfRow.createCell(21);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB19());
                            cell = xssfRow.createCell(22);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB20());
                            cell = xssfRow.createCell(23);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB21());
                            cell = xssfRow.createCell(24);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB22());
                            cell = xssfRow.createCell(25);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB23());
                            cell = xssfRow.createCell(26);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB24());
                            cell = xssfRow.createCell(27);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB25());
                            cell = xssfRow.createCell(28);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB26());
                            cell = xssfRow.createCell(29);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB27());
                            cell = xssfRow.createCell(30);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB28());
                            cell = xssfRow.createCell(31);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB29());
                            cell = xssfRow.createCell(32);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB30());
                            cell = xssfRow.createCell(33);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB31());
                            cell = xssfRow.createCell(34);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB32());
                            cell = xssfRow.createCell(35);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB33());
                            cell = xssfRow.createCell(36);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB34());
                            cell = xssfRow.createCell(37);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB35());
                            cell = xssfRow.createCell(38);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB36());
                            cell = xssfRow.createCell(39);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB37());
                            cell = xssfRow.createCell(40);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB38());
                            cell = xssfRow.createCell(41);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB39());
                            cell = xssfRow.createCell(42);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB40());
                            cell = xssfRow.createCell(43);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB41());
                            cell = xssfRow.createCell(44);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB42());
                            cell = xssfRow.createCell(45);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB43());
                            cell = xssfRow.createCell(46);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB44());
                            cell = xssfRow.createCell(47);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB45());
                            cell = xssfRow.createCell(48);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB46());
                            cell = xssfRow.createCell(49);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB47());
                            cell = xssfRow.createCell(50);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB48());
                            cell = xssfRow.createCell(51);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB49());
                            cell = xssfRow.createCell(52);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB50());
                            cell = xssfRow.createCell(53);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB51());
                            cell = xssfRow.createCell(54);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB52());
                            cell = xssfRow.createCell(55);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB53());
                            cell = xssfRow.createCell(56);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB54());
                            cell = xssfRow.createCell(57);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB55());
                            cell = xssfRow.createCell(58);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB56());
                            cell = xssfRow.createCell(59);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB57());
                            cell = xssfRow.createCell(60);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB58());
                            cell = xssfRow.createCell(61);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB59());
                            cell = xssfRow.createCell(62);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB60());
                            cell = xssfRow.createCell(63);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB61());
                            cell = xssfRow.createCell(64);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB62());
                            cell = xssfRow.createCell(65);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB63());
                            cell = xssfRow.createCell(66);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB64());
                            cell = xssfRow.createCell(67);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB65());
                            cell = xssfRow.createCell(68);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB66());
                            cell = xssfRow.createCell(69);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB67());
                            cell = xssfRow.createCell(70);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB68());
                            cell = xssfRow.createCell(71);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB69());
                            cell = xssfRow.createCell(72);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB70());
                            cell = xssfRow.createCell(73);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB71());
                            cell = xssfRow.createCell(74);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB72());
                            cell = xssfRow.createCell(75);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB73());
                            cell = xssfRow.createCell(76);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB74());
                            cell = xssfRow.createCell(77);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB75());
                            cell = xssfRow.createCell(78);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB76());
                            cell = xssfRow.createCell(79);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB77());
                            cell = xssfRow.createCell(80);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB78());
                            cell = xssfRow.createCell(81);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB79());
                            cell = xssfRow.createCell(82);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB80());
                            cell = xssfRow.createCell(83);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB81());
                            cell = xssfRow.createCell(84);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB82());
                            cell = xssfRow.createCell(85);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB83());
                            cell = xssfRow.createCell(86);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB84());
                            cell = xssfRow.createCell(87);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB85());
                            cell = xssfRow.createCell(88);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB86());
                            cell = xssfRow.createCell(89);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB87());
                            cell = xssfRow.createCell(90);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB88());
                            cell = xssfRow.createCell(91);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB89());
                            cell = xssfRow.createCell(92);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB90());
                            cell = xssfRow.createCell(93);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB91());
                            cell = xssfRow.createCell(94);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB92());
                            cell = xssfRow.createCell(95);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB93());
                            cell = xssfRow.createCell(96);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB94());
                            cell = xssfRow.createCell(97);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB95());
                            cell = xssfRow.createCell(98);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB96());
                            cell = xssfRow.createCell(99);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB97());
                            cell = xssfRow.createCell(100);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB98());
                            cell = xssfRow.createCell(101);
                            cell.setCellValue(((TbPRBNew) list.get(i)).getAVGPRB99());

                        }
                        break;
                    case "TBC2INEW":
                        for (int j = 0; j < tbC2INewHead.size(); j++) {
                            cell = xssfRow.createCell(j);
                            cell.setCellValue(tbCellHead.get(j));
                        }
                        for (i = 0; i < list.size(); i++) {
                            System.out.println("IN TBc2i");
                            xssfRow = sheet.createRow((int) (i + 1));

                            cell = xssfRow.createCell(0);
                            cell.setCellValue(((TbC2InEW) list.get(i)).getCITY());
                            cell = xssfRow.createCell(1);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getSECTORID()));
                            cell = xssfRow.createCell(2);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getSECTORNAME()));
                            cell = xssfRow.createCell(3);
                            cell.setCellValue(((TbCell) list.get(i)).getENODEBID());
                            cell = xssfRow.createCell(4);
                            cell.setCellValue(String.valueOf(((TbCell) list.get(i)).getENODEBNAME()));

                            cell = xssfRow.createCell(5);
                            cell.setCellValue(((TbCell) list.get(i)).getEARFCN());

                        }
                        break;

                }
                // 保存Excel文件
                try {
                    System.out.println("IN TRY");
                    OutputStream outputStream = new FileOutputStream(path);
                    workbook.write(outputStream);
                    outputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }





    }
