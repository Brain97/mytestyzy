package com.example.demo.service;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.InputStream;

@Service

public class ImportService {
    @Autowired
    private TbCellPiService tbCellPiService;
    @Autowired
    private ImportExcelBigPRB imPRB;
    @Autowired
    private ImportExcelBigKPI imKPI;
    public void importMethod(String path){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    if ((path.toLowerCase()).contains("cell")) {
                        System.out.println("cell");
                        tbCellPiService.importExcel(path);
                    }
                    else if ((path.toLowerCase()).contains("prb")) {
                        //InputStream inputStream1 = new FileInputStream("D:/tbKPI.xlsx");
                        System.out.println(imPRB.readOneSheet(path));
                        //tbCellPiService.importExcel(path);
                    } else if ((path.toLowerCase()).contains("kpi")) {
                        //tbCellPiService.importExcel(path);
                        imKPI.readOneSheet(path);
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }){

        }.start();
    }

}
