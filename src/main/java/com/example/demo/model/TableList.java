package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableList {
    public List<String> table_name = new ArrayList<>();
    public List<String>tbcell_row_name = new ArrayList<>();
    public Map<String,Integer> table_row= new HashMap<>();
    public TableList(){
        table_name.add("tbAdjCell");
        table_name.add("tbATUC2I");
        table_name.add("tbATUData");
        table_name.add("tbATUHandOver");
        table_name.add("tbC2I");
        table_name.add("tbCell");
        table_name.add("tbHandOver");
        table_name.add("tbKPI");
        table_name.add("tbMROData");
        table_name.add("tbOptCell");
        table_name.add("tbPCIAssignment");
        table_name.add("tbPRB");
        table_name.add("tbSecAdjcell");

        table_row.put("tbAdjCell",4);
        table_row.put("tbATUC2I",8);
        table_row.put("tbATUData",35);
        table_row.put("tbATUHandOver",6);
        table_row.put("tbC2I",5);
        table_row.put("tbCell",19);
        table_row.put("tbHandOver",3);
        table_row.put("tbKPI",42);
        table_row.put("tbMROData",7);
        table_row.put("tbOptCell",4);
        table_row.put("tbPCIAssignment",12);
        table_row.put("tbPRB",105);
        table_row.put("tbSecAdjcell",2);

        tbcell_row_name.add("CITY");
        tbcell_row_name.add("SECTOR_ID");
        tbcell_row_name.add("SECTOR_NAME");
        tbcell_row_name.add("ENODEBID");
        tbcell_row_name.add("ENODEB_NAME");
        tbcell_row_name.add("EARFCN");
        tbcell_row_name.add("PCI");
        tbcell_row_name.add("PSS");
        tbcell_row_name.add("SSS");
        tbcell_row_name.add("TAC");
        tbcell_row_name.add("VENDOR");
        tbcell_row_name.add("LONGITUDE");
        tbcell_row_name.add("LATITUDE");
        tbcell_row_name.add("STYLE");
        tbcell_row_name.add("AZIMUTH");
        tbcell_row_name.add("HEIGHT");
        tbcell_row_name.add("ELECTTILT");
        tbcell_row_name.add("MECHTILT");
        tbcell_row_name.add("TOTLETILT");





    }
}
