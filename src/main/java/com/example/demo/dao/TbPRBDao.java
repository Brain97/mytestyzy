package com.example.demo.dao;


import com.example.demo.model.TbKPI;
import com.example.demo.model.TbPRB;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbPRBDao {
    @Insert({"INSERT INTO tbPRB (START_TIME,PERIOD ," +
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
            "VALUES"+
            "(#{START_TIME},"+
            "#{PERIOD} ,"+
            "#{ENODEB},"+
            "#{CELL},"+
            "#{CELLNAME},"+
            "#{PRB0} ,"+
            "#{PRB1} ,"+
            "#{PRB2} ,"+
            "#{PRB3} ,"+
            "#{PRB4} ,"+
            "#{PRB5} ,"+
            "#{PRB6} ,"+
            "#{PRB7} ,"+
            "#{PRB8} ,"+
            "#{PRB9} ,"+
            "#{PRB10} ,"+
            "#{PRB11} ,"+
            "#{PRB12} ,"+
            "#{PRB13} ,"+
            "#{PRB14} ,"+
            "#{PRB15} ,"+
            "#{PRB16} ,"+
            "#{PRB17} ,"+
            "#{PRB18} ,"+
            "#{PRB19} ,"+
            "#{PRB20} ,"+
            "#{PRB21} ,"+
            "#{PRB22} ,"+
            "#{PRB23} ,"+
            "#{PRB24} ,"+
            "#{PRB25} ,"+
            "#{PRB26} ,"+
            "#{PRB27} ,"+
            "#{PRB28} ,"+
            "#{PRB29} ,"+
            "#{PRB30} ,"+
            "#{PRB31} ,"+
            "#{PRB32} ,"+
            "#{PRB33} ,"+
            "#{PRB34} ,"+
            "#{PRB35} ,"+
            "#{PRB36} ,"+
            "#{PRB37} ,"+
            "#{PRB38} ,"+
            "#{PRB39} ,"+
            "#{PRB40} ,"+
            "#{PRB41} ,"+
            "#{PRB42} ,"+
            "#{PRB43} ,"+
            "#{PRB44} ,"+
            "#{PRB45} ,"+
            "#{PRB46} ,"+
            "#{PRB47} ,"+
            "#{PRB48} ,"+
            "#{PRB49} ,"+
            "#{PRB50} ,"+
            "#{PRB51} ,"+
            "#{PRB52} ,"+
            "#{PRB53} ,"+
            "#{PRB54} ,"+
            "#{PRB55} ,"+
            "#{PRB56} ,"+
            "#{PRB57} ,"+
            "#{PRB58} ,"+
            "#{PRB59} ,"+
            "#{PRB60} ,"+
            "#{PRB61} ,"+
            "#{PRB62} ,"+
            "#{PRB63} ,"+
            "#{PRB64} ,"+
            "#{PRB65} ,"+
            "#{PRB66} ,"+
            "#{PRB67} ,"+
            "#{PRB68} ,"+
            "#{PRB69} ,"+
            "#{PRB70} ,"+
            "#{PRB71} ,"+
            "#{PRB72} ,"+
            "#{PRB73} ,"+
            "#{PRB74} ,"+
            "#{PRB75} ,"+
            "#{PRB76} ,"+
            "#{PRB77} ,"+
            "#{PRB78} ,"+
            "#{PRB79} ,"+
            "#{PRB80} ,"+
            "#{PRB81} ,"+
            "#{PRB82} ,"+
            "#{PRB83} ,"+
            "#{PRB84} ,"+
            "#{PRB85} ,"+
            "#{PRB86} ,"+
            "#{PRB87} ,"+
            "#{PRB88} ,"+
            "#{PRB89} ,"+
            "#{PRB90} ,"+
            "#{PRB91} ,"+
            "#{PRB92} ,"+
            "#{PRB93} ,"+
            "#{PRB94} ,"+
            "#{PRB95} ,"+
            "#{PRB96} ,"+
            "#{PRB97} ,"+
            "#{PRB98} ,"+
            "#{PRB99} )"




})
    void InsertPRB(TbPRB tbPRB);



        @Select({"select * from tbPRB"})
        List<TbPRB> SelectTbPRB();


}
//,javaType="java.lang.Integer" jdbcType="int"
//,javaType="java.lang.Integer" jdbcType="int"