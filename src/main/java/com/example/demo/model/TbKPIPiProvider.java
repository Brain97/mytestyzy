package com.example.demo.model;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class TbKPIPiProvider {
    public String BatchInsertTbKPI(Map<String, List<TbPRB>> map)
    {
        List<TbPRB> tbCellLists = map.get("list");


        StringBuilder sb = new StringBuilder("INSERT INTO tbKPI" +
                "(starttime,"+
                "period,"+
                "enodeb,"+
                "cell,"+
                "cell1,"+
                "PRCFINISH,"+
                "PRCREQUIRE,"+
                "PRCRATE,"+
                "ERABTOTALSUCESS,"+
                "ERABTOTALLINK,"+
                "ERABRATE,"+
                "eNodeBERABTIME,"+
                "CELLERAMTIME,"+
                "ERAMdROPRATE,"+
                "WIRELESSRATE,"+
                "ENODEBRELEASETIME,"+
                "UERELEASETIME,"+
                "UESUCCESSTIME,"+
                "WIRELESSDROPRATE,"+
                "ENODEBSUCTIMEDIFF,"+
                "ENODEBTRYTIMEDIFF,"+
                "ENODEBSUCTIMESAME,"+
                "eNBIndifsuctime,"+
                "eNBoutdifsuctime,"+
                "eNBoutdiftrytime,"+
                "eNBoutsamesuctime,"+
                "eNBoutsametrytime,"+
                "eNBinsucrate,"+
                "eNBoutsucrate,"+
                "zspsamerate,"+
                "zspdifrate,"+
                "zsprate,"+
                "totalupbits,"+
                "totaldownbits,"+
                "rrcreconntime,"+
                "rrcreconnrate,"+
                "rebuildsameoutsuctime,"+
                "rebuilddifoutsuctime,"+
                "rebuildsameinsuctime,"+
                "rebuilddifinsuctime,"+
                "eNBSUCTIME,"+
                "eNBTRYTIME)"+
                "VALUES");

        MessageFormat messageFormat = new MessageFormat( "(#'{'list[{0}].starttime},"+
                "#'{'list[{0}].period},"+
                "#'{'list[{0}].enodeb},"+
                "#'{'list[{0}].cell},"+
                "#'{'list[{0}].cell1},"+
                "#'{'list[{0}].PRCFINISH},"+
                "#'{'list[{0}].PRCREQUIRE},"+
                "#'{'list[{0}].PRCRATE},"+
                "#'{'list[{0}].ERABTOTALSUCESS},"+
                "#'{'list[{0}].ERABTOTALLINK},"+
                "#'{'list[{0}].ERABRATE},"+
                "#'{'list[{0}].eNodeBERABTIME},"+
                "#'{'list[{0}].CELLERAMTIME},"+
                "#'{'list[{0}].ERAMdROPRATE},"+
                "#'{'list[{0}].WIRELESSRATE},"+
                "#'{'list[{0}].ENODEBRELEASETIME},"+
                "#'{'list[{0}].UERELEASETIME},"+
                "#'{'list[{0}].UESUCCESSTIME},"+
                "#'{'list[{0}].WIRELESSDROPRATE},"+
                "#'{'list[{0}].ENODEBSUCTIMEDIFF},"+
                "#'{'list[{0}].ENODEBTRYTIMEDIFF},"+
                "#'{'list[{0}].ENODEBSUCTIMESAME},"+
                "#'{'list[{0}].eNBIndifsuctime},"+
                "#'{'list[{0}].eNBoutdifsuctime},"+
                "#'{'list[{0}].eNBoutdiftrytime},"+
                "#'{'list[{0}].eNBoutsamesuctime},"+
                "#'{'list[{0}].eNBoutsametrytime},"+
                "#'{'list[{0}].eNBinsucrate},"+
                "#'{'list[{0}].eNBoutsucrate},"+
                "#'{'list[{0}].zspsamerate},"+
                "#'{'list[{0}].zspdifrate},"+
                "#'{'list[{0}].zsprate},"+
                "#'{'list[{0}].totalupbits},"+
                "#'{'list[{0}].totaldownbits},"+
                "#'{'list[{0}].rrcreconntime},"+
                "#'{'list[{0}].rrcreconnrate},"+
                "#'{'list[{0}].rebuildsameoutsuctime},"+
                "#'{'list[{0}].rebuilddifoutsuctime},"+
                "#'{'list[{0}].rebuildsameinsuctime},"+
                "#'{'list[{0}].rebuilddifinsuctime},"+
                "#'{'list[{0}].eNBSUCTIME},"+
                "#'{'list[{0}].eNBTRYTIME})");

        int size = tbCellLists.size();
        for (int i = 0; i < size; i++)
        {
            sb.append(messageFormat.format(new Object[]{i}));
            if (i < size - 1) sb.append(",");
        }

        return sb.toString();
    }
}
