package com.example.demo.model;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class TbPRBPiProvider {
    public String BatchInsertTbPRB(Map<String, List<TbPRB>> map)
    {
        List<TbPRB> tbCellLists = map.get("list");
        StringBuilder sb = new StringBuilder("INSERT INTO tbPRB (STARTTIME,PERIOD ," +
                "ENODEB," +
                "CELL ," +
                "CELLNAME," +
                "PRB0 ," +
                "PRB1 ," +
                "PRB2 ," +
                "PRB3 ," +
                "PRB4 ," +
                "PRB5 ," +
                "PRB6 ," +
                "PRB7 ," +
                "PRB8 ," +
                "PRB9 ," +
                "PRB10 ," +
                "PRB11 ," +
                "PRB12 ," +
                "PRB13 ," +
                "PRB14 ," +
                "PRB15 ," +
                "PRB16 ," +
                "PRB17 ," +
                "PRB18 ," +
                "PRB19 ," +
                "PRB20 ," +
                "PRB21 ," +
                "PRB22 ," +
                "PRB23 ," +
                "PRB24 ," +
                "PRB25 ," +
                "PRB26 ," +
                "PRB27 ," +
                "PRB28 ," +
                "PRB29 ," +
                "PRB30 ," +
                "PRB31 ," +
                "PRB32 ," +
                "PRB33 ," +
                "PRB34 ," +
                "PRB35 ," +
                "PRB36 ," +
                "PRB37 ," +
                "PRB38 ," +
                "PRB39 ," +
                "PRB40 ," +
                "PRB41 ," +
                "PRB42 ," +
                "PRB43 ," +
                "PRB44 ," +
                "PRB45 ," +
                "PRB46 ," +
                "PRB47 ," +
                "PRB48 ," +
                "PRB49 ," +
                "PRB50 ," +
                "PRB51 ," +
                "PRB52 ," +
                "PRB53 ," +
                "PRB54 ," +
                "PRB55 ," +
                "PRB56 ," +
                "PRB57 ," +
                "PRB58 ," +
                "PRB59 ," +
                "PRB60 ," +
                "PRB61 ," +
                "PRB62 ," +
                "PRB63 ," +
                "PRB64 ," +
                "PRB65 ," +
                "PRB66 ," +
                "PRB67 ," +
                "PRB68 ," +
                "PRB69 ," +
                "PRB70 ," +
                "PRB71 ," +
                "PRB72 ," +
                "PRB73 ," +
                "PRB74 ," +
                "PRB75 ," +
                "PRB76 ," +
                "PRB77 ," +
                "PRB78 ," +
                "PRB79 ," +
                "PRB80 ," +
                "PRB81 ," +
                "PRB82 ," +
                "PRB83 ," +
                "PRB84 ," +
                "PRB85 ," +
                "PRB86 ," +
                "PRB87 ," +
                "PRB88 ," +
                "PRB89 ," +
                "PRB90 ," +
                "PRB91 ," +
                "PRB92 ," +
                "PRB93 ," +
                "PRB94 ," +
                "PRB95 ," +
                "PRB96 ," +
                "PRB97 ," +
                "PRB98 ," +
                "PRB99 " +
                ")" +
                "VALUES");

        MessageFormat messageFormat = new MessageFormat( "(#'{'list[{0}].STARTTIME},"+
                "#'{'list[{0}].PERIOD} ,"+
                "#'{'list[{0}].ENODEB},"+
                "#'{'list[{0}].CELL},"+
                "#'{'list[{0}].CELLNAME},"+
                "#'{'list[{0}].PRB0} ,"+
                "#'{'list[{0}].PRB1} ,"+
                "#'{'list[{0}].PRB2} ,"+
                "#'{'list[{0}].PRB3} ,"+
                "#'{'list[{0}].PRB4} ,"+
                "#'{'list[{0}].PRB5} ,"+
                "#'{'list[{0}].PRB6} ,"+
                "#'{'list[{0}].PRB7} ,"+
                "#'{'list[{0}].PRB8} ,"+
                "#'{'list[{0}].PRB9} ,"+
                "#'{'list[{0}].PRB10} ,"+
                "#'{'list[{0}].PRB11} ,"+
                "#'{'list[{0}].PRB12} ,"+
                "#'{'list[{0}].PRB13} ,"+
                "#'{'list[{0}].PRB14} ,"+
                "#'{'list[{0}].PRB15} ,"+
                "#'{'list[{0}].PRB16} ,"+
                "#'{'list[{0}].PRB17} ,"+
                "#'{'list[{0}].PRB18} ,"+
                "#'{'list[{0}].PRB19} ,"+
                "#'{'list[{0}].PRB20} ,"+
                "#'{'list[{0}].PRB21} ,"+
                "#'{'list[{0}].PRB22} ,"+
                "#'{'list[{0}].PRB23} ,"+
                "#'{'list[{0}].PRB24} ,"+
                "#'{'list[{0}].PRB25} ,"+
                "#'{'list[{0}].PRB26} ,"+
                "#'{'list[{0}].PRB27} ,"+
                "#'{'list[{0}].PRB28} ,"+
                "#'{'list[{0}].PRB29} ,"+
                "#'{'list[{0}].PRB30} ,"+
                "#'{'list[{0}].PRB31} ,"+
                "#'{'list[{0}].PRB32} ,"+
                "#'{'list[{0}].PRB33} ,"+
                "#'{'list[{0}].PRB34} ,"+
                "#'{'list[{0}].PRB35} ,"+
                "#'{'list[{0}].PRB36} ,"+
                "#'{'list[{0}].PRB37} ,"+
                "#'{'list[{0}].PRB38} ,"+
                "#'{'list[{0}].PRB39} ,"+
                "#'{'list[{0}].PRB40} ,"+
                "#'{'list[{0}].PRB41} ,"+
                "#'{'list[{0}].PRB42} ,"+
                "#'{'list[{0}].PRB43} ,"+
                "#'{'list[{0}].PRB44} ,"+
                "#'{'list[{0}].PRB45} ,"+
                "#'{'list[{0}].PRB46} ,"+
                "#'{'list[{0}].PRB47} ,"+
                "#'{'list[{0}].PRB48} ,"+
                "#'{'list[{0}].PRB49} ,"+
                "#'{'list[{0}].PRB50} ,"+
                "#'{'list[{0}].PRB51} ,"+
                "#'{'list[{0}].PRB52} ,"+
                "#'{'list[{0}].PRB53} ,"+
                "#'{'list[{0}].PRB54} ,"+
                "#'{'list[{0}].PRB55} ,"+
                "#'{'list[{0}].PRB56} ,"+
                "#'{'list[{0}].PRB57} ,"+
                "#'{'list[{0}].PRB58} ,"+
                "#'{'list[{0}].PRB59} ,"+
                "#'{'list[{0}].PRB60} ,"+
                "#'{'list[{0}].PRB61} ,"+
                "#'{'list[{0}].PRB62} ,"+
                "#'{'list[{0}].PRB63} ,"+
                "#'{'list[{0}].PRB64} ,"+
                "#'{'list[{0}].PRB65} ,"+
                "#'{'list[{0}].PRB66} ,"+
                "#'{'list[{0}].PRB67} ,"+
                "#'{'list[{0}].PRB68} ,"+
                "#'{'list[{0}].PRB69} ,"+
                "#'{'list[{0}].PRB70} ,"+
                "#'{'list[{0}].PRB71} ,"+
                "#'{'list[{0}].PRB72} ,"+
                "#'{'list[{0}].PRB73} ,"+
                "#'{'list[{0}].PRB74} ,"+
                "#'{'list[{0}].PRB75} ,"+
                "#'{'list[{0}].PRB76} ,"+
                "#'{'list[{0}].PRB77} ,"+
                "#'{'list[{0}].PRB78} ,"+
                "#'{'list[{0}].PRB79} ,"+
                "#'{'list[{0}].PRB80} ,"+
                "#'{'list[{0}].PRB81} ,"+
                "#'{'list[{0}].PRB82} ,"+
                "#'{'list[{0}].PRB83} ,"+
                "#'{'list[{0}].PRB84} ,"+
                "#'{'list[{0}].PRB85} ,"+
                "#'{'list[{0}].PRB86} ,"+
                "#'{'list[{0}].PRB87} ,"+
                "#'{'list[{0}].PRB88} ,"+
                "#'{'list[{0}].PRB89} ,"+
                "#'{'list[{0}].PRB90} ,"+
                "#'{'list[{0}].PRB91} ,"+
                "#'{'list[{0}].PRB92} ,"+
                "#'{'list[{0}].PRB93} ,"+
                "#'{'list[{0}].PRB94} ,"+
                "#'{'list[{0}].PRB95} ,"+
                "#'{'list[{0}].PRB96} ,"+
                "#'{'list[{0}].PRB97} ,"+
                "#'{'list[{0}].PRB98} ,"+
                "#'{'list[{0}].PRB99})");
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
