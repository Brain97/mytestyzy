package com.example.demo.service;

import com.example.demo.dao.TbPRBDao;
import com.example.demo.dao.TbPRBPiDao;
import com.example.demo.model.TbPRB;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
//@Component
public class ImportExcelBigPRB extends DefaultHandler{

    @Autowired
    private TbPRBPiDao tbPi;

    @Autowired
    private TbPRBDao tb;
    private SharedStringsTable sst;
    private String lastContents;
    private boolean nextIsString;

    private int sheetIndex = -1;
    private List<String> rowlist = new ArrayList<String>();
    private int curRow = 0;
    private int curCol = 0;
    private List<TbPRB> tbPRBList = new ArrayList<TbPRB>();


    /**
     * 读取第一个工作簿的入口方法
     * @param in
     */
    public int readOneSheet(String path) throws Exception {
        System.out.println("in one sheet");
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

    private static double strToDouble(String str) {
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
//            temp += str + "_";
//        }
//        System.out.println(temp);
        if(curRow ==0) return;
        TbPRB prb = new TbPRB();
        prb.setSTARTTIME(rowList.get(0));
        prb.setPERIOD(strToInt(rowList.get(1)));
        prb.setENODEB(rowList.get(2));
        prb.setCELL(rowList.get(3));
        prb.setCELLNAME(rowList.get(4));
        prb.setPRB0(strToInt(rowList.get(5)));
        prb.setPRB1(strToInt(rowList.get(6)));
        prb.setPRB2(strToInt(rowList.get(7)));
        prb.setPRB3(strToInt(rowList.get(8)));
        prb.setPRB4(strToInt(rowList.get(9)));
        prb.setPRB5(strToInt(rowList.get(10)));
        prb.setPRB6(strToInt(rowList.get(11)));
        prb.setPRB7(strToInt(rowList.get(12)));
        prb.setPRB8(strToInt(rowList.get(13)));
        prb.setPRB9(strToInt(rowList.get(14)));
        prb.setPRB10(strToInt(rowList.get(15)));
        prb.setPRB11(strToInt(rowList.get(16)));
        prb.setPRB12(strToInt(rowList.get(17)));
        prb.setPRB13(strToInt(rowList.get(18)));
        prb.setPRB14(strToInt(rowList.get(19)));
        prb.setPRB15(strToInt(rowList.get(20)));
        prb.setPRB16(strToInt(rowList.get(21)));
        prb.setPRB17(strToInt(rowList.get(22)));
        prb.setPRB18(strToInt(rowList.get(23)));
        prb.setPRB19(strToInt(rowList.get(24)));
        prb.setPRB20(strToInt(rowList.get(25)));
        prb.setPRB21(strToInt(rowList.get(26)));
        prb.setPRB22(strToInt(rowList.get(27)));
        prb.setPRB23(strToInt(rowList.get(28)));
        prb.setPRB24(strToInt(rowList.get(29)));
        prb.setPRB25(strToInt(rowList.get(30)));
        prb.setPRB26(strToInt(rowList.get(31)));
        prb.setPRB27(strToInt(rowList.get(32)));
        prb.setPRB28(strToInt(rowList.get(33)));
        prb.setPRB29(strToInt(rowList.get(34)));
        prb.setPRB30(strToInt(rowList.get(35)));
        prb.setPRB31(strToInt(rowList.get(36)));
        prb.setPRB32(strToInt(rowList.get(37)));
        prb.setPRB33(strToInt(rowList.get(38)));
        prb.setPRB34(strToInt(rowList.get(39)));
        prb.setPRB35(strToInt(rowList.get(40)));
        prb.setPRB36(strToInt(rowList.get(41)));
        prb.setPRB37(strToInt(rowList.get(42)));
        prb.setPRB38(strToInt(rowList.get(43)));
        prb.setPRB39(strToInt(rowList.get(44)));
        prb.setPRB40(strToInt(rowList.get(45)));
        prb.setPRB41(strToInt(rowList.get(46)));
        prb.setPRB42(strToInt(rowList.get(47)));
        prb.setPRB43(strToInt(rowList.get(48)));
        prb.setPRB44(strToInt(rowList.get(49)));
        prb.setPRB45(strToInt(rowList.get(50)));
        prb.setPRB46(strToInt(rowList.get(51)));
        prb.setPRB47(strToInt(rowList.get(52)));
        prb.setPRB48(strToInt(rowList.get(53)));
        prb.setPRB49(strToInt(rowList.get(54)));
        prb.setPRB50(strToInt(rowList.get(55)));
        prb.setPRB51(strToInt(rowList.get(56)));
        prb.setPRB52(strToInt(rowList.get(57)));
        prb.setPRB53(strToInt(rowList.get(58)));
        prb.setPRB54(strToInt(rowList.get(59)));
        prb.setPRB55(strToInt(rowList.get(60)));
        prb.setPRB56(strToInt(rowList.get(61)));
        prb.setPRB57(strToInt(rowList.get(62)));
        prb.setPRB58(strToInt(rowList.get(63)));
        prb.setPRB59(strToInt(rowList.get(64)));
        prb.setPRB60(strToInt(rowList.get(65)));
        prb.setPRB61(strToInt(rowList.get(66)));
        prb.setPRB62(strToInt(rowList.get(67)));
        prb.setPRB63(strToInt(rowList.get(68)));
        prb.setPRB64(strToInt(rowList.get(69)));
        prb.setPRB65(strToInt(rowList.get(70)));
        prb.setPRB66(strToInt(rowList.get(71)));
        prb.setPRB67(strToInt(rowList.get(72)));
        prb.setPRB68(strToInt(rowList.get(73)));
        prb.setPRB69(strToInt(rowList.get(74)));
        prb.setPRB70(strToInt(rowList.get(75)));
        prb.setPRB71(strToInt(rowList.get(76)));
        prb.setPRB72(strToInt(rowList.get(77)));
        prb.setPRB73(strToInt(rowList.get(78)));
        prb.setPRB74(strToInt(rowList.get(79)));
        prb.setPRB75(strToInt(rowList.get(80)));
        prb.setPRB76(strToInt(rowList.get(81)));
        prb.setPRB77(strToInt(rowList.get(82)));
        prb.setPRB78(strToInt(rowList.get(83)));
        prb.setPRB79(strToInt(rowList.get(84)));
        prb.setPRB80(strToInt(rowList.get(85)));
        prb.setPRB81(strToInt(rowList.get(86)));
        prb.setPRB82(strToInt(rowList.get(87)));
        prb.setPRB83(strToInt(rowList.get(88)));
        prb.setPRB84(strToInt(rowList.get(89)));
        prb.setPRB85(strToInt(rowList.get(90)));
        prb.setPRB86(strToInt(rowList.get(91)));
        prb.setPRB87(strToInt(rowList.get(92)));
        prb.setPRB88(strToInt(rowList.get(93)));
        prb.setPRB89(strToInt(rowList.get(94)));
        prb.setPRB90(strToInt(rowList.get(95)));
        prb.setPRB91(strToInt(rowList.get(96)));
        prb.setPRB92(strToInt(rowList.get(97)));
        prb.setPRB93(strToInt(rowList.get(98)));
        prb.setPRB94(strToInt(rowList.get(99)));
        prb.setPRB95(strToInt(rowList.get(100)));
        prb.setPRB96(strToInt(rowList.get(101)));
        prb.setPRB97(strToInt(rowList.get(102)));
        prb.setPRB98(strToInt(rowList.get(103)));
        prb.setPRB99(strToInt(rowList.get(104)));
        System.out.println(prb.toString());
        //tb.InsertPRB(prb);
        tbPRBList.add(prb);
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
                System.out.println(tbPRBList.size());

                if(tbPRBList.size() >= 15) {
                    System.out.println((tbPRBList.get(1)).toString());
                    tbPi.tbPRBBatchInsert(tbPRBList);
                    tbPRBList = new ArrayList<TbPRB>();

                }
                }
        }
    }
    public void endDocument() throws SAXException{
        tbPi.tbPRBBatchInsert(tbPRBList);
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        // 得到单元格内容的值
        lastContents += new String(ch, start, length);
    }
}
