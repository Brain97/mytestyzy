package com.example.demo.model;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class TbCellPiProvider {

    public String BatchInsertTbCell(Map<String, List<TbCell>> map)
    {
        System.out.println("in tpcellpi");
        List<TbCell> tbCellLists = map.get("list");

        StringBuilder sb = new StringBuilder("INSERT INTO tbCell (CITY, SECTORID, SECTORNAME, ENODEBID, ENODEBNAME, EARFCN, PCI, PSS, SSS, TAC, VENDOR, LONGITUDE, LATITUDE, STYLE, AZIMUTH, HEIGHT, ELECTTILT, MECHTILT, TOTLETILT)" +
                "VALUES");

        MessageFormat messageFormat = new MessageFormat("(#'{'list[{0}].CITY},#'{'list[{0}].SECTORID},#'{'list[{0}].SECTORNAME},#'{'list[{0}].ENODEBID},#'{'list[{0}].ENODEBNAME},#'{'list[{0}].EARFCN},#'{'list[{0}].PCI},#'{'list[{0}].PSS },#'{'list[{0}].SSS},#'{'list[{0}].TAC},#'{'list[{0}].VENDOR},#'{'list[{0}].LONGITUDE},#'{'list[{0}].LATITUDE},#'{'list[{0}].STYLE},#'{'list[{0}].AZIMUTH},#'{'list[{0}].HEIGHT},        #'{'list[{0}].ELECTTILT},#'{'list[{0}].MECHTILT},#'{'list[{0}].TOTLETILT})"
        );
        //"(#'{'list[{0}].CITY},#'{'list[{0}].SECTORID},#'{'list[{0}].SECTORNAME},#'{'list[{0}].ENODEBID},#'{'list[{0}].ENODEBNAME},#'{'list[{0}].EARFCN},#'{'list[{0}]. PCI},#'{'list[{0}]. PSS },#'{'list[{0}].SSS},#'{'list[{0}].TAC},#'{'list[{0}].VENDOR},#'{'list[{0}].LONGITUDE},#'{'list[{0}].LATITUDE},#'{'list[{0}].STYLE},#'{'list[{0}].AZIMUTH},#'{'list[{0}].HEIGHT},        #'{'list[{0}].ELECTTILT},#'{'list[{0}].MECHTILT},#'{'list[{0}].TOTLETILT})"

        int size = tbCellLists.size();
        for (int i = 0; i < size; i++)
        {
            sb.append(messageFormat.format(new Object[]{i}));
            if (i < size - 1) sb.append(",");
        }

        return sb.toString();
    }
}
