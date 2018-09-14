package com.example.demo.dao;

import com.example.demo.model.TbCell;
import com.example.demo.model.TbKPI;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface TbKPIDao {

    @Select({"select * from tbkpi"})
    List<TbKPI> SelectTbKPIAll();

    @Select({"select ${column} from tbkpi where ENODEB =#{ENODEB} and (starttime between #{startTime} and #{endTime} )"})

    List<Object> SelectTbKPIByPara(@Param("column")String column,@Param("ENODEB") String  ENODEB, @Param("startTime")String startTime, @Param("endTime")String  endTime);
}
