package com.example.demo;


import JSci.maths.statistics.NormalDistribution;
import com.example.demo.dao.TbCellDao;
import com.example.demo.dao.TbKPIDao;
import com.example.demo.dao.TbPRBDao;
import com.example.demo.dao.TbPRBNewDao;
import com.example.demo.model.TbCell;
import com.example.demo.model.TbKPI;
import com.example.demo.model.TbPRBNew;
import com.example.demo.service.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Sql("/init.sql")
public class DemoApplicationTests {
@Autowired
    TbCellDao tbcelldao;
    @Autowired
    TbKPIDao tbKPIdao;
    @Autowired
    TbPRBDao tbPRBdao;
    @Autowired
    TbPRBNewDao tbPRBNewdao;
    @Autowired
    TbPRBService tbprbservice;
    @Autowired
    TbCellPiService tbcellservice;
    @Autowired
    TbCellPiService tbCellPi;
   @Autowired
   TbPRBPiService tbPRBPi;
   @Autowired
   ImportExcelBigKPI imKPI;
    @Autowired
    ImportExcelBigPRB imPRB;

    @Autowired
    ImportService IS;

    @Test
    public void clockingIn_Img() throws Exception{
        //List<TbPRBNew> list = tbPRBNewdao.SelectTbPRBNewAll();
        //System.out.println(list.size());

        //MyExcelOpertate.writeExcel(list,"D:/PRBNEW.xlsx","TBPRBNEW");
        //NormalDistribution nom = new NormalDistribution(0,1);
        //System.out.println(nom.cumulative(1));
        //List list = tbKPIdao.SelectTbKPIByPara
          //      ("AVGPRB0","三门峡义马常村-HLHF","2016-05-07 00:00:00.000","2017-07-07 00:00:00.000");
        /*for(int i = 0; i < list.size(); i ++)
        {
            System.out.println((list.get(i)).toString());
        }*/
        //List<TbCell> list = tbcelldao.SelectTbCell();
        //System.out.println(list.size());
        //MyExcelOpertate.writeExcel(list,"D:/PRB.xlsx","TBCELL");
        IS.importMethod("D:/tbCell.xlsx");
        //IS.importMethod("D:/tbKPI.xlsx");
        //IS.importMethod("D:/tbPRB.xlsx");
    }



}
