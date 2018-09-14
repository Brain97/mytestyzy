
package com.example.demo.service;

import com.example.demo.dao.TbCellDao;

import com.example.demo.model.Circle;

import com.example.demo.model.TbCell;
import org.apache.ibatis.session.SqlSession;
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
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

@Service
public class TbCellService {
    private final static String XLS = "xls";
    public static final String XLSX = "xlsx";

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private TbCellDao tbCellDao ;


    public void importExcel(String path) {
        // 1。使用HSSFWorkbook打开或者创建"Excel对象"
        // 2。用HSSFWorkbook返回对象或者创建片对象
        // 3。用片材返回行对象，用行对象得到细胞对象
        // 4。对细胞对象进行读写
new Thread(new Runnable() {
    @Override
    public void run() {
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

            List<TbCell> tbCellLists = new ArrayList<TbCell>();
            System.out.println(rows);
            Double p = 0.0;
            for (int i = 1; i <= rows -1; i++) {

                /*int min = 0, j = i;
                if (j + 49 > rows + 1) {
                    min = rows + 1;
                } else {
                    min = j + 49;
                }*/

                if(Double.valueOf(i)/(rows-1) >p)
                {
                    p += 0.01;
                    Circle.i+=1;
                    System.out.println(Circle.i);

                }
                Row row = null;
                tbCellLists = new ArrayList<TbCell>();
                /*for (; j <= min; j++) {
                    System.out.println("j is");
                    System.out.println(j);
*/
                if (flag == 1) {
                    row = (HSSFRow) ((HSSFSheet) sheet).getRow(i);
                } else if (flag == 2) {
                    row = (XSSFRow) ((XSSFSheet) sheet).getRow(i);
                }

                try{
                    if (row != null) {
                        //System.out.println("row not null");
                        TbCell tempRow = new TbCell();

                        //String temp = getCellValue(row.getCell(0), "String");
                        String temp = getCellValue(row.getCell(0), "String");
                        tempRow.setCITY(temp);

                        temp = getCellValue(row.getCell(1), "String");
                        tempRow.setSECTORID(temp);

                        temp = getCellValue(row.getCell(2), "String");
                        tempRow.setSECTORNAME(temp);

                        temp = getCellValue(row.getCell(3), "Int");
                        if (temp == null)
                            tempRow.setENODEBID(null);
                        else
                            tempRow.setENODEBID(Integer.valueOf(temp));

                        temp = getCellValue(row.getCell(4), "String");
                        tempRow.setENODEBNAME(temp);

                        temp = getCellValue(row.getCell(5), "Int");
                        if (temp == null)
                            tempRow.setEARFCN(null);
                        else
                            tempRow.setEARFCN(Integer.valueOf(temp));

                        temp = getCellValue(row.getCell(6), "Int");
                        if (temp == null)
                            tempRow.setPCI(null);
                        else
                            tempRow.setPCI(Integer.valueOf(temp));


                        temp = getCellValue(row.getCell(7), "Int");
                        if (temp == null)
                            tempRow.setPSS(null);
                        else
                            tempRow.setPSS(Integer.valueOf(temp));

                        temp = getCellValue(row.getCell(8), "Int");

                        if (temp == null)
                            tempRow.setSSS(null);
                        else
                            tempRow.setSSS(Integer.valueOf(temp));


                        temp = getCellValue(row.getCell(9), "Int");
                        if (temp == null)
                            tempRow.setTAC(null);
                        else
                            tempRow.setTAC(Integer.valueOf(temp));


                        tempRow.setVENDOR(getCellValue(row.getCell(10), "String"));


                        tempRow.setLONGITUDE(Double.valueOf(getCellValue(row.getCell(11), "Double")));

                        tempRow.setLATITUDE(Double.valueOf(getCellValue(row.getCell(12), "Double")));


                        tempRow.setSTYLE(getCellValue(row.getCell(13), "String"));


                        tempRow.setAZIMUTH(Double.valueOf(getCellValue(row.getCell(14), "Double")));


                        tempRow.setHEIGHT(Double.valueOf(getCellValue(row.getCell(15), "Double")));
                        //System.out.println("i is");
                        //System.out.println(i);

                        tempRow.setELECTTILT(Double.valueOf(getCellValue(row.getCell(16), "Double")));


                        tempRow.setMECHTILT(Double.valueOf(getCellValue(row.getCell(17), "Double")));


                        tempRow.setTOTLETILT(Double.valueOf(getCellValue(row.getCell(18), "Double")));
                        tbCellDao.batchInsert(tempRow);


                    }}
                catch (Exception e){
                    e.printStackTrace();
                }

                //tbCellLists.add(tempRow);
                //tbagentMapper.insert(tbagent);

                //System.out.println(tempRow.toString());
                //System.out.println("******************************************************one time");
                //logger.info( "插入数据完成");
            }


                /*System.out.println("******************************************************two time");
                if(tbCellLists == null)
                    System.out.println("******************************************************null");
                tbcellDao.batchInsert(tbCellLists);
                //SqlSession session = sqlSession
                //for(tbCell tempcell:tbCellLists)*/


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}).start();

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
