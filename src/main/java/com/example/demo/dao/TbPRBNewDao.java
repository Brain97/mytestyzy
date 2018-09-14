package com.example.demo.dao;

import com.example.demo.model.TbPRB;

import com.example.demo.model.TbPRBNew;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TbPRBNewDao {
    @Insert({"INSERT INTO tbPRBNew (TIME," +
            "ENODEB," +
           
            "AVGPRB0 ," +
            "AVGPRB1 ," +
            "AVGPRB2 ," +
            "AVGPRB3 ," +
            "AVGPRB4 ," +
            "AVGPRB5 ," +
            "AVGPRB6 ," +
            "AVGPRB7 ," +
            "AVGPRB8 ," +
            "AVGPRB9 ," +
            "AVGPRB10 ," +
            "AVGPRB11 ," +
            "AVGPRB12 ," +
            "AVGPRB13 ," +
            "AVGPRB14 ," +
            "AVGPRB15 ," +
            "AVGPRB16 ," +
            "AVGPRB17 ," +
            "AVGPRB18 ," +
            "AVGPRB19 ," +
            "AVGPRB20 ," +
            "AVGPRB21 ," +
            "AVGPRB22 ," +
            "AVGPRB23 ," +
            "AVGPRB24 ," +
            "AVGPRB25 ," +
            "AVGPRB26 ," +
            "AVGPRB27 ," +
            "AVGPRB28 ," +
            "AVGPRB29 ," +
            "AVGPRB30 ," +
            "AVGPRB31 ," +
            "AVGPRB32 ," +
            "AVGPRB33 ," +
            "AVGPRB34 ," +
            "AVGPRB35 ," +
            "AVGPRB36 ," +
            "AVGPRB37 ," +
            "AVGPRB38 ," +
            "AVGPRB39 ," +
            "AVGPRB40 ," +
            "AVGPRB41 ," +
            "AVGPRB42 ," +
            "AVGPRB43 ," +
            "AVGPRB44 ," +
            "AVGPRB45 ," +
            "AVGPRB46 ," +
            "AVGPRB47 ," +
            "AVGPRB48 ," +
            "AVGPRB49 ," +
            "AVGPRB50 ," +
            "AVGPRB51 ," +
            "AVGPRB52 ," +
            "AVGPRB53 ," +
            "AVGPRB54 ," +
            "AVGPRB55 ," +
            "AVGPRB56 ," +
            "AVGPRB57 ," +
            "AVGPRB58 ," +
            "AVGPRB59 ," +
            "AVGPRB60 ," +
            "AVGPRB61 ," +
            "AVGPRB62 ," +
            "AVGPRB63 ," +
            "AVGPRB64 ," +
            "AVGPRB65 ," +
            "AVGPRB66 ," +
            "AVGPRB67 ," +
            "AVGPRB68 ," +
            "AVGPRB69 ," +
            "AVGPRB70 ," +
            "AVGPRB71 ," +
            "AVGPRB72 ," +
            "AVGPRB73 ," +
            "AVGPRB74 ," +
            "AVGPRB75 ," +
            "AVGPRB76 ," +
            "AVGPRB77 ," +
            "AVGPRB78 ," +
            "AVGPRB79 ," +
            "AVGPRB80 ," +
            "AVGPRB81 ," +
            "AVGPRB82 ," +
            "AVGPRB83 ," +
            "AVGPRB84 ," +
            "AVGPRB85 ," +
            "AVGPRB86 ," +
            "AVGPRB87 ," +
            "AVGPRB88 ," +
            "AVGPRB89 ," +
            "AVGPRB90 ," +
            "AVGPRB91 ," +
            "AVGPRB92 ," +
            "AVGPRB93 ," +
            "AVGPRB94 ," +
            "AVGPRB95 ," +
            "AVGPRB96 ," +
            "AVGPRB97 ," +
            "AVGPRB98 ," +
            "AVGPRB99 " +
            ")" +
            "VALUES"+
            "(#{TIME},"+
            "#{ENODEB},"+
            "#{AVGPRB0} ,"+
            "#{AVGPRB1} ,"+
            "#{AVGPRB2} ,"+
            "#{AVGPRB3} ,"+
            "#{AVGPRB4} ,"+
            "#{AVGPRB5} ,"+
            "#{AVGPRB6} ,"+
            "#{AVGPRB7} ,"+
            "#{AVGPRB8} ,"+
            "#{AVGPRB9} ,"+
            "#{AVGPRB10} ,"+
            "#{AVGPRB11} ,"+
            "#{AVGPRB12} ,"+
            "#{AVGPRB13} ,"+
            "#{AVGPRB14} ,"+
            "#{AVGPRB15} ,"+
            "#{AVGPRB16} ,"+
            "#{AVGPRB17} ,"+
            "#{AVGPRB18} ,"+
            "#{AVGPRB19} ,"+
            "#{AVGPRB20} ,"+
            "#{AVGPRB21} ,"+
            "#{AVGPRB22} ,"+
            "#{AVGPRB23} ,"+
            "#{AVGPRB24} ,"+
            "#{AVGPRB25} ,"+
            "#{AVGPRB26} ,"+
            "#{AVGPRB27} ,"+
            "#{AVGPRB28} ,"+
            "#{AVGPRB29} ,"+
            "#{AVGPRB30} ,"+
            "#{AVGPRB31} ,"+
            "#{AVGPRB32} ,"+
            "#{AVGPRB33} ,"+
            "#{AVGPRB34} ,"+
            "#{AVGPRB35} ,"+
            "#{AVGPRB36} ,"+
            "#{AVGPRB37} ,"+
            "#{AVGPRB38} ,"+
            "#{AVGPRB39} ,"+
            "#{AVGPRB40} ,"+
            "#{AVGPRB41} ,"+
            "#{AVGPRB42} ,"+
            "#{AVGPRB43} ,"+
            "#{AVGPRB44} ,"+
            "#{AVGPRB45} ,"+
            "#{AVGPRB46} ,"+
            "#{AVGPRB47} ,"+
            "#{AVGPRB48} ,"+
            "#{AVGPRB49} ,"+
            "#{AVGPRB50} ,"+
            "#{AVGPRB51} ,"+
            "#{AVGPRB52} ,"+
            "#{AVGPRB53} ,"+
            "#{AVGPRB54} ,"+
            "#{AVGPRB55} ,"+
            "#{AVGPRB56} ,"+
            "#{AVGPRB57} ,"+
            "#{AVGPRB58} ,"+
            "#{AVGPRB59} ,"+
            "#{AVGPRB60} ,"+
            "#{AVGPRB61} ,"+
            "#{AVGPRB62} ,"+
            "#{AVGPRB63} ,"+
            "#{AVGPRB64} ,"+
            "#{AVGPRB65} ,"+
            "#{AVGPRB66} ,"+
            "#{AVGPRB67} ,"+
            "#{AVGPRB68} ,"+
            "#{AVGPRB69} ,"+
            "#{AVGPRB70} ,"+
            "#{AVGPRB71} ,"+
            "#{AVGPRB72} ,"+
            "#{AVGPRB73} ,"+
            "#{AVGPRB74} ,"+
            "#{AVGPRB75} ,"+
            "#{AVGPRB76} ,"+
            "#{AVGPRB77} ,"+
            "#{AVGPRB78} ,"+
            "#{AVGPRB79} ,"+
            "#{AVGPRB80} ,"+
            "#{AVGPRB81} ,"+
            "#{AVGPRB82} ,"+
            "#{AVGPRB83} ,"+
            "#{AVGPRB84} ,"+
            "#{AVGPRB85} ,"+
            "#{AVGPRB86} ,"+
            "#{AVGPRB87} ,"+
            "#{AVGPRB88} ,"+
            "#{AVGPRB89} ,"+
            "#{AVGPRB90} ,"+
            "#{AVGPRB91} ,"+
            "#{AVGPRB92} ,"+
            "#{AVGPRB93} ,"+
            "#{AVGPRB94} ,"+
            "#{AVGPRB95} ,"+
            "#{AVGPRB96} ,"+
            "#{AVGPRB97} ,"+
            "#{AVGPRB98} ,"+
            "#{AVGPRB99} )"




    })
    void InsertAVGPRB(TbPRBNew tbPRBNew);

    @Select({"select * from tbPRBNew "})
    List<TbPRBNew> SelectTbPRBNewAll();

    @Select({"select ${column} from tbPRBNew where enodeb = #{Enodeb} and time between #{startTime} and #{endTime}"})
    List<Object> SelectTbPRBNEWByPara(@Param("column")String column, @Param("Enodeb") String  ENODEB, @Param("startTime")String startTime, @Param("endTime")String  endTime);
}
