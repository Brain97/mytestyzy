package com.example.demo.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.example.demo.dao.TbKPIDao;
import com.example.demo.dao.TbKPIPiDao;
import com.example.demo.dao.TbPRBDao;
import com.example.demo.dao.TbPRBPiDao;
import com.example.demo.model.TbKPI;
import com.example.demo.model.TbPRB;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

@Service
//@Component
public class ImportExcelBigKPI extends DefaultHandler{

    @Autowired
    private TbKPIPiDao tbPi;

    //@Autowired
    //private TbKPIDao tb;
    private SharedStringsTable sst;
    private String lastContents;
    private boolean nextIsString;

    private int sheetIndex = -1;
    private List<String> rowlist = new ArrayList<String>();
    private int curRow = 0;
    private int curCol = 0;
    private List<TbKPI> tbKPIList = new ArrayList<TbKPI>();


    /**
     * 读取第一个工作簿的入口方法
     * @param in
     */
    public int readOneSheet(String path) throws Exception {
        InputStream in = new FileInputStream(path);
        OPCPackage pkg = OPCPackage.open(in);
        XSSFReader r = new XSSFReader(pkg);
        SharedStringsTable sst = r.getSharedStringsTable();

        XMLReader parser = fetchSheetParser(sst);

        InputStream sheet = r.getSheet("rId1");

        InputSource sheetSource = new InputSource(sheet);
        parser.parse(sheetSource);

        sheet.close();
        return curRow - 1;
    }


    /**
     * 读取所有工作簿的入口方法
     * @param path
     * @throws Exception
     */
    public void process(String path) throws Exception {
        OPCPackage pkg = OPCPackage.open(path);
            XSSFReader r = new XSSFReader(pkg);
            SharedStringsTable sst = r.getSharedStringsTable();

            XMLReader parser = fetchSheetParser(sst);

            Iterator<InputStream> sheets = r.getSheetsData();
            while (sheets.hasNext()) {
                curRow = 0;
                sheetIndex++;
                InputStream sheet = sheets.next();
                InputSource sheetSource = new InputSource(sheet);
                parser.parse(sheetSource);
                sheet.close();
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

    private static Double strToDouble(String str) {

        double db = Double.valueOf(str);
        return db;


    }

    private static int strToInt(String str) {
        return Integer.valueOf(str);
    }

    /**
     * 该方法自动被调用，每读一行调用一次，在方法中写自己的业务逻辑即可
     * @param sheetIndex 工作簿序号
     * @param curRow 处理到第几行
     * @param rowList 当前数据行的数据集合
     */
    public void optRow(int sheetIndex, int curRow, List<String> rowList) {
//        String temp = "";
//        for(String str : rowList) {
//            temp += str + "";
//        }
//        System.out.println(temp);
        if(curRow ==0) return;
        try {
            TbKPI kpl = new TbKPI();
            kpl.setStarttime(rowList.get(0));
            kpl.setPeriod(strToDouble(rowList.get(1)));
            kpl.setEnodeb(rowList.get(2));
            kpl.setCell(rowList.get(3));
            kpl.setCell1(rowList.get(4));
            kpl.setPRCFINISH(strToDouble(rowList.get(5)));
            kpl.setPRCREQUIRE(strToDouble(rowList.get(6)));
            kpl.setPRCRATE(strToDouble(rowList.get(7)));
            kpl.setERABTOTALSUCESS(strToDouble(rowList.get(8)));
            kpl.setERABTOTALLINK(strToDouble(rowList.get(9)));
            kpl.setERABRATE(strToDouble(rowList.get(10)));
            kpl.seteNodeBERABTIME(strToDouble(rowList.get(11)));
            kpl.setCELLERAMTIME(strToDouble(rowList.get(12)));
            kpl.setERAMdROPRATE(strToDouble(rowList.get(13)));
            kpl.setWIRELESSRATE(strToDouble(rowList.get(14)));
            kpl.setENODEBRELEASETIME(strToDouble(rowList.get(15)));
            kpl.setUERELEASETIME(strToDouble(rowList.get(16)));
            kpl.setUESUCCESSTIME(strToDouble(rowList.get(17)));
            kpl.setWIRELESSDROPRATE(strToDouble(rowList.get(18)));
            kpl.setENODEBSUCTIMEDIFF(strToDouble(rowList.get(19)));
            kpl.setENODEBTRYTIMEDIFF(strToDouble(rowList.get(20)));
            kpl.setENODEBSUCTIMESAME(strToDouble(rowList.get(21)));
            kpl.seteNBIndifsuctime(strToDouble(rowList.get(22)));
            kpl.seteNBoutdifsuctime(strToDouble(rowList.get(23)));
            kpl.seteNBoutdiftrytime(strToDouble(rowList.get(24)));
            kpl.seteNBoutsamesuctime(strToDouble(rowList.get(25)));
            kpl.seteNBoutsametrytime(strToDouble(rowList.get(26)));
            kpl.seteNBinsucrate(rowList.get(27));
            kpl.seteNBoutsucrate(strToDouble(rowList.get(28)));
            kpl.setZspsamerate(strToDouble(rowList.get(29)));
            kpl.setZspdifrate(rowList.get(30));
            kpl.setZsprate(strToDouble(rowList.get(31)));
            kpl.setTotalupbits(strToDouble(rowList.get(32)));
            kpl.setTotaldownbits(strToDouble(rowList.get(33)));
            kpl.setRrcreconntime(strToDouble(rowList.get(34)));
            kpl.setRrcreconnrate(strToDouble(rowList.get(35)));
            kpl.setRebuildsameoutsuctime(strToDouble(rowList.get(36)));
            kpl.setRebuilddifoutsuctime(strToDouble(rowList.get(37)));
            kpl.setRebuildsameinsuctime(strToDouble(rowList.get(38)));
            kpl.setRebuilddifinsuctime(strToDouble(rowList.get(39)));
            kpl.seteNBSUCTIME(strToDouble(rowList.get(40)));
            kpl.seteNBTRYTIME(strToDouble(rowList.get(41)));
            System.out.println(kpl.toString());
            //tb.InsertPRB(prb);
            tbKPIList.add(kpl);
        }catch (Exception e)
        {
            e.printStackTrace();
        }



    }


    public XMLReader fetchSheetParser(SharedStringsTable sst) throws SAXException {
        XMLReader parser = XMLReaderFactory
                .createXMLReader("org.apache.xerces.parsers.SAXParser");
        this.sst = sst;
        parser.setContentHandler(this);
        return parser;
    }

    public void startElement(String uri, String localName, String name,
                             Attributes attributes) throws SAXException {
        // c => 单元格
        if (name.equals("c")) {
            // 如果下一个元素是 SST 的索引，则将nextIsString标记为true
            String cellType = attributes.getValue("t");
            if (cellType != null && cellType.equals("s")) {
                nextIsString = true;
            } else {
                nextIsString = false;
            }
        }
        // 置空
        lastContents = "";
    }


    public void endElement(String uri, String localName, String name)
            throws SAXException {
        // 根据SST的索引值的到单元格的真正要存储的字符串
        // 这时characters()方法可能会被调用多次
        if (nextIsString) {
            try {
                int idx = Integer.parseInt(lastContents);
                lastContents = new XSSFRichTextString(sst.getEntryAt(idx))
                        .toString();
            } catch (Exception e) {

            }
        }

        // v => 单元格的值，如果单元格是字符串则v标签的值为该字符串在SST中的索引
        // 将单元格内容加入rowlist中，在这之前先去掉字符串前后的空白符
        if (name.equals("v")) {
            String value = lastContents.trim();
            value = value.equals("") ? " " : value;
            rowlist.add(curCol, value);
            curCol++;
        } else {
            // 如果标签名称为 row ，这说明已到行尾，调用 optRows() 方法
            if (name.equals("row")) {
                optRow(sheetIndex, curRow, rowlist);
                rowlist.clear();
                curRow++;
                curCol = 0;
                System.out.println(tbKPIList.size());

                if(tbKPIList.size() >= 15) {

                    tbPi.tbKPIBatchInsert(tbKPIList);
                    tbKPIList = new ArrayList<TbKPI>();

                }
                }
        }
    }
    public void endDocument() throws SAXException{
        tbPi.tbKPIBatchInsert(tbKPIList);
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        // 得到单元格内容的值
        lastContents += new String(ch, start, length);
    }
}
