package com.example.demo.service;

import com.example.demo.dao.TbCellPiDao;
import com.example.demo.dao.TbPRBPiDao;
import com.example.demo.model.Circle;
import com.example.demo.model.TbCell;
import com.example.demo.model.TbPRB;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.apache.poi.ss.usermodel.CellType.STRING;

@Service
public class TbPRBPiService{
    private final static String XLS = "xls";
    public static final String XLSX = "xlsx";

    @Autowired
    private TbPRBPiDao tbPRBPiDao ;
    @Transactional
    public void bathInsertTBPRB(List<TbPRB> tbPRBLists)
    {
        if(null != tbPRBLists && tbPRBLists.size()>0)
        {
            tbPRBPiDao.tbPRBBatchInsert(tbPRBLists);
        }
    }
    private static Date strToDate(String obj) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(obj);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public void importExcel(String path) {
        Workbook workbook = null;
        try {
            InputStream inputStream = new FileInputStream(path);

            //logger.info( "【文件名】{}"，文件名);
            Sheet sheet = null;
            int rows = 0;
            int flag = 0;
            if (path.endsWith(XLS)) {
                try {
                    workbook = new HSSFWorkbook(inputStream); // 2003版本
                    sheet = ((HSSFWorkbook) workbook).getSheet("sheet1");
                    rows = ((HSSFSheet) sheet).getLastRowNum();
                    flag = 1;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (path.endsWith(XLSX)) {
                try {
                    workbook = new XSSFWorkbook(inputStream); // 2007版本
                    sheet = ((XSSFWorkbook) workbook).getSheet("sheet1");
                    rows = ((XSSFSheet) sheet).getLastRowNum();
                    flag = 2;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("rows is");

            List<TbPRB> tbPRBLists = new ArrayList<TbPRB>();
            System.out.println(rows);
            Double p = 0.0;
            for (int i = 1; i <= rows - 1; i++) {

                int min = 0, j = i;
                if (j + 49 > rows + 1) {
                    min = rows - 1;
                } else {
                    min = j + 49;
                }

                for(; j <= min; j++, i = j){
                    if(Double.valueOf(i)/(rows-1) >p)
                    {
                        p += 0.01;
                        Circle.i+=1;
                        System.out.println(Circle.i);

                    }
                    tbPRBLists = new ArrayList<TbPRB>();
                Row row = null;

                /*for (; j <= min; j++) {
                    System.out.println("j is");
                    System.out.println(j);
*/
                if (flag == 1) {
                    row = (HSSFRow) ((HSSFSheet) sheet).getRow(i);
                } else if (flag == 2) {
                    row = (XSSFRow) ((XSSFSheet) sheet).getRow(i);
                }

                try {
                    if (row != null) {
                        //System.out.println("row not null");
                        TbPRB tempRow = new TbPRB();

                        //String temp = getCellValue(row.getCell(0), "String");

                        if (getCellValue(row.getCell(0), "String") == null)
                            tempRow.setSTARTTIME(null);
                        else
                            tempRow.setSTARTTIME(getCellValue(row.getCell(0), "String"));
                        String temp = getCellValue(row.getCell(0), "String");
                        temp = getCellValue(row.getCell(1), "Integer");
                        if (temp == null)
                            tempRow.setPERIOD(null);
                        else
                            tempRow.setPERIOD(Integer.valueOf(temp));

                        temp = getCellValue(row.getCell(2), "String");
                        if (temp == null)
                            tempRow.setENODEB(null);
                        else
                            tempRow.setENODEB(temp);

                        temp = getCellValue(row.getCell(3), "String");
                        if (temp == null)
                            tempRow.setCELL(null);
                        else
                            tempRow.setCELL(temp);

                        temp = getCellValue(row.getCell(4), "String");
                        if (temp == null)
                            tempRow.setCELLNAME(null);
                        else
                            tempRow.setCELLNAME(temp);
                        temp = getCellValue(row.getCell(5), "Integer");
                        if (temp == null) tempRow.setPRB0(null);
                        else tempRow.setPRB0(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(6), "Integer");
                        if (temp == null) tempRow.setPRB1(null);
                        else tempRow.setPRB1(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(7), "Integer");
                        if (temp == null) tempRow.setPRB2(null);
                        else tempRow.setPRB2(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(8), "Integer");
                        if (temp == null) tempRow.setPRB3(null);
                        else tempRow.setPRB3(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(9), "Integer");
                        if (temp == null) tempRow.setPRB4(null);
                        else tempRow.setPRB4(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(10), "Integer");
                        if (temp == null) tempRow.setPRB5(null);
                        else tempRow.setPRB5(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(11), "Integer");
                        if (temp == null) tempRow.setPRB6(null);
                        else tempRow.setPRB6(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(12), "Integer");
                        if (temp == null) tempRow.setPRB7(null);
                        else tempRow.setPRB7(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(13), "Integer");
                        if (temp == null) tempRow.setPRB8(null);
                        else tempRow.setPRB8(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(14), "Integer");
                        if (temp == null) tempRow.setPRB9(null);
                        else tempRow.setPRB9(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(15), "Integer");
                        if (temp == null) tempRow.setPRB10(null);
                        else tempRow.setPRB10(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(16), "Integer");
                        if (temp == null) tempRow.setPRB11(null);
                        else tempRow.setPRB11(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(17), "Integer");
                        if (temp == null) tempRow.setPRB12(null);
                        else tempRow.setPRB12(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(18), "Integer");
                        if (temp == null) tempRow.setPRB13(null);
                        else tempRow.setPRB13(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(19), "Integer");
                        if (temp == null) tempRow.setPRB14(null);
                        else tempRow.setPRB14(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(20), "Integer");
                        if (temp == null) tempRow.setPRB15(null);
                        else tempRow.setPRB15(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(21), "Integer");
                        if (temp == null) tempRow.setPRB16(null);
                        else tempRow.setPRB16(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(22), "Integer");
                        if (temp == null) tempRow.setPRB17(null);
                        else tempRow.setPRB17(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(23), "Integer");
                        if (temp == null) tempRow.setPRB18(null);
                        else tempRow.setPRB18(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(24), "Integer");
                        if (temp == null) tempRow.setPRB19(null);
                        else tempRow.setPRB19(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(25), "Integer");
                        if (temp == null) tempRow.setPRB20(null);
                        else tempRow.setPRB20(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(26), "Integer");
                        if (temp == null) tempRow.setPRB21(null);
                        else tempRow.setPRB21(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(27), "Integer");
                        if (temp == null) tempRow.setPRB22(null);
                        else tempRow.setPRB22(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(28), "Integer");
                        if (temp == null) tempRow.setPRB23(null);
                        else tempRow.setPRB23(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(29), "Integer");
                        if (temp == null) tempRow.setPRB24(null);
                        else tempRow.setPRB24(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(30), "Integer");
                        if (temp == null) tempRow.setPRB25(null);
                        else tempRow.setPRB25(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(31), "Integer");
                        if (temp == null) tempRow.setPRB26(null);
                        else tempRow.setPRB26(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(32), "Integer");
                        if (temp == null) tempRow.setPRB27(null);
                        else tempRow.setPRB27(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(33), "Integer");
                        if (temp == null) tempRow.setPRB28(null);
                        else tempRow.setPRB28(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(34), "Integer");
                        if (temp == null) tempRow.setPRB29(null);
                        else tempRow.setPRB29(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(35), "Integer");
                        if (temp == null) tempRow.setPRB30(null);
                        else tempRow.setPRB30(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(36), "Integer");
                        if (temp == null) tempRow.setPRB31(null);
                        else tempRow.setPRB31(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(37), "Integer");
                        if (temp == null) tempRow.setPRB32(null);
                        else tempRow.setPRB32(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(38), "Integer");
                        if (temp == null) tempRow.setPRB33(null);
                        else tempRow.setPRB33(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(39), "Integer");
                        if (temp == null) tempRow.setPRB34(null);
                        else tempRow.setPRB34(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(40), "Integer");
                        if (temp == null) tempRow.setPRB35(null);
                        else tempRow.setPRB35(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(41), "Integer");
                        if (temp == null) tempRow.setPRB36(null);
                        else tempRow.setPRB36(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(42), "Integer");
                        if (temp == null) tempRow.setPRB37(null);
                        else tempRow.setPRB37(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(43), "Integer");
                        if (temp == null) tempRow.setPRB38(null);
                        else tempRow.setPRB38(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(44), "Integer");
                        if (temp == null) tempRow.setPRB39(null);
                        else tempRow.setPRB39(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(45), "Integer");
                        if (temp == null) tempRow.setPRB40(null);
                        else tempRow.setPRB40(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(46), "Integer");
                        if (temp == null) tempRow.setPRB41(null);
                        else tempRow.setPRB41(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(47), "Integer");
                        if (temp == null) tempRow.setPRB42(null);
                        else tempRow.setPRB42(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(48), "Integer");
                        if (temp == null) tempRow.setPRB43(null);
                        else tempRow.setPRB43(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(49), "Integer");
                        if (temp == null) tempRow.setPRB44(null);
                        else tempRow.setPRB44(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(50), "Integer");
                        if (temp == null) tempRow.setPRB45(null);
                        else tempRow.setPRB45(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(51), "Integer");
                        if (temp == null) tempRow.setPRB46(null);
                        else tempRow.setPRB46(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(52), "Integer");
                        if (temp == null) tempRow.setPRB47(null);
                        else tempRow.setPRB47(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(53), "Integer");
                        if (temp == null) tempRow.setPRB48(null);
                        else tempRow.setPRB48(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(54), "Integer");
                        if (temp == null) tempRow.setPRB49(null);
                        else tempRow.setPRB49(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(55), "Integer");
                        if (temp == null) tempRow.setPRB50(null);
                        else tempRow.setPRB50(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(56), "Integer");
                        if (temp == null) tempRow.setPRB51(null);
                        else tempRow.setPRB51(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(57), "Integer");
                        if (temp == null) tempRow.setPRB52(null);
                        else tempRow.setPRB52(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(58), "Integer");
                        if (temp == null) tempRow.setPRB53(null);
                        else tempRow.setPRB53(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(59), "Integer");
                        if (temp == null) tempRow.setPRB54(null);
                        else tempRow.setPRB54(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(60), "Integer");
                        if (temp == null) tempRow.setPRB55(null);
                        else tempRow.setPRB55(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(61), "Integer");
                        if (temp == null) tempRow.setPRB56(null);
                        else tempRow.setPRB56(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(62), "Integer");
                        if (temp == null) tempRow.setPRB57(null);
                        else tempRow.setPRB57(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(63), "Integer");
                        if (temp == null) tempRow.setPRB58(null);
                        else tempRow.setPRB58(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(64), "Integer");
                        if (temp == null) tempRow.setPRB59(null);
                        else tempRow.setPRB59(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(65), "Integer");
                        if (temp == null) tempRow.setPRB60(null);
                        else tempRow.setPRB60(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(66), "Integer");
                        if (temp == null) tempRow.setPRB61(null);
                        else tempRow.setPRB61(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(67), "Integer");
                        if (temp == null) tempRow.setPRB62(null);
                        else tempRow.setPRB62(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(68), "Integer");
                        if (temp == null) tempRow.setPRB63(null);
                        else tempRow.setPRB63(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(69), "Integer");
                        if (temp == null) tempRow.setPRB64(null);
                        else tempRow.setPRB64(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(70), "Integer");
                        if (temp == null) tempRow.setPRB65(null);
                        else tempRow.setPRB65(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(71), "Integer");
                        if (temp == null) tempRow.setPRB66(null);
                        else tempRow.setPRB66(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(72), "Integer");
                        if (temp == null) tempRow.setPRB67(null);
                        else tempRow.setPRB67(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(73), "Integer");
                        if (temp == null) tempRow.setPRB68(null);
                        else tempRow.setPRB68(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(74), "Integer");
                        if (temp == null) tempRow.setPRB69(null);
                        else tempRow.setPRB69(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(75), "Integer");
                        if (temp == null) tempRow.setPRB70(null);
                        else tempRow.setPRB70(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(76), "Integer");
                        if (temp == null) tempRow.setPRB71(null);
                        else tempRow.setPRB71(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(77), "Integer");
                        if (temp == null) tempRow.setPRB72(null);
                        else tempRow.setPRB72(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(78), "Integer");
                        if (temp == null) tempRow.setPRB73(null);
                        else tempRow.setPRB73(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(79), "Integer");
                        if (temp == null) tempRow.setPRB74(null);
                        else tempRow.setPRB74(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(80), "Integer");
                        if (temp == null) tempRow.setPRB75(null);
                        else tempRow.setPRB75(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(81), "Integer");
                        if (temp == null) tempRow.setPRB76(null);
                        else tempRow.setPRB76(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(82), "Integer");
                        if (temp == null) tempRow.setPRB77(null);
                        else tempRow.setPRB77(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(83), "Integer");
                        if (temp == null) tempRow.setPRB78(null);
                        else tempRow.setPRB78(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(84), "Integer");
                        if (temp == null) tempRow.setPRB79(null);
                        else tempRow.setPRB79(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(85), "Integer");
                        if (temp == null) tempRow.setPRB80(null);
                        else tempRow.setPRB80(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(86), "Integer");
                        if (temp == null) tempRow.setPRB81(null);
                        else tempRow.setPRB81(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(87), "Integer");
                        if (temp == null) tempRow.setPRB82(null);
                        else tempRow.setPRB82(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(88), "Integer");
                        if (temp == null) tempRow.setPRB83(null);
                        else tempRow.setPRB83(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(89), "Integer");
                        if (temp == null) tempRow.setPRB84(null);
                        else tempRow.setPRB84(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(90), "Integer");
                        if (temp == null) tempRow.setPRB85(null);
                        else tempRow.setPRB85(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(91), "Integer");
                        if (temp == null) tempRow.setPRB86(null);
                        else tempRow.setPRB86(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(92), "Integer");
                        if (temp == null) tempRow.setPRB87(null);
                        else tempRow.setPRB87(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(93), "Integer");
                        if (temp == null) tempRow.setPRB88(null);
                        else tempRow.setPRB88(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(94), "Integer");
                        if (temp == null) tempRow.setPRB89(null);
                        else tempRow.setPRB89(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(95), "Integer");
                        if (temp == null) tempRow.setPRB90(null);
                        else tempRow.setPRB90(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(96), "Integer");
                        if (temp == null) tempRow.setPRB91(null);
                        else tempRow.setPRB91(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(97), "Integer");
                        if (temp == null) tempRow.setPRB92(null);
                        else tempRow.setPRB92(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(98), "Integer");
                        if (temp == null) tempRow.setPRB93(null);
                        else tempRow.setPRB93(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(99), "Integer");
                        if (temp == null) tempRow.setPRB94(null);
                        else tempRow.setPRB94(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(100), "Integer");
                        if (temp == null) tempRow.setPRB95(null);
                        else tempRow.setPRB95(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(101), "Integer");
                        if (temp == null) tempRow.setPRB96(null);
                        else tempRow.setPRB96(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(102), "Integer");
                        if (temp == null) tempRow.setPRB97(null);
                        else tempRow.setPRB97(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(103), "Integer");
                        if (temp == null) tempRow.setPRB98(null);
                        else tempRow.setPRB98(Integer.valueOf(temp));
                        temp = getCellValue(row.getCell(104), "Integer");
                        if (temp == null) tempRow.setPRB99(null);
                        else tempRow.setPRB99(Integer.valueOf(temp));
                        tbPRBLists.add(tempRow);


                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

                //tbCellLists.add(tempRow);
                //tbagentMapper.insert(tbagent);

                //System.out.println(tempRow.toString());
                //System.out.println("******************************************************one time");
                //logger.info( "插入数据完成");
            }

                tbPRBPiDao.tbPRBBatchInsert(tbPRBLists);
                /*System.out.println("******************************************************two time");
                if(tbCellLists == null)
                    System.out.println("******************************************************null");
                tbcellDao.batchInsert(tbCellLists);
                //SqlSession session = sqlSession
                //for(tbCell tempcell:tbCellLists)*/


        }} catch (Exception e) {
            e.printStackTrace();
        }


    }
    public String getCellValue(Cell cell, String ExpectedType) {
        //System.out.println(cell.getNumericCellValue());
        try{
            if (cell != null){
                if (cell.getCellType()==STRING){

                    //System.out.println(cell.getStringCellValue());
                    return cell.getStringCellValue();
                }else {

                    if( ExpectedType =="Double")
                    {return  String.valueOf(cell.getNumericCellValue());}
                    else {

                        return String.valueOf((int) cell.getNumericCellValue());
                    }
                }
            }}
        catch (Exception e){
            return null;
        }


        return null;
    }
}