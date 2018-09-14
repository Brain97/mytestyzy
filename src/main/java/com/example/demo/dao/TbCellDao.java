package com.example.demo.dao;

import com.example.demo.model.TbCell;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TbCellDao {
@Insert({"INSERT INTO tbCell (CITY, SECTORID, SECTORNAME, ENODEBID, ENODEBNAME, EARFCN, PCI, PSS, SSS, TAC, VENDOR, LONGITUDE, LATITUDE, STYLE, AZIMUTH, HEIGHT, ELECTTILT, MECHTILT, TOTLETILT)" +
         "VALUES"+
        "(#{CITY},#{SECTORID},#{SECTORNAME},#{ENODEBID},#{ENODEBNAME},#{EARFCN},#{ PCI},#{ PSS },#{SSS},#{TAC},#{VENDOR},#{LONGITUDE},#{LATITUDE},#{STYLE},#{AZIMUTH},#{HEIGHT},\n" +
        "        #{ELECTTILT},#{MECHTILT},#{TOTLETILT})"})
    void batchInsert(TbCell tbCell);
@Select({"select * from tbCell"})
    List<TbCell> SelectTbCell();
    @Select({"select * from tbCell WHERE SECTORNAME = #{SectorName}"})
    TbCell SelectCellByName(String SectorName);

    @Select({"select * from tbCell WHERE SECTORID = #{SectorID} "})
    List<TbCell> SelectCellByID(String SectorID);

    @Select({"select * from tbCell WHERE eNodeBid = #{eNodeBid} "})
    List<TbCell> SelectEnodeById(String eNodeBid);

    @Select({"select * from tbCell WHERE eNodeB_Name = #{eNodeBName} "})
    List<TbCell> SelectEnodeByName(String eNodeBName);

}
//,javaType="java.lang.Integer" jdbcType="int"
//,javaType="java.lang.Integer" jdbcType="int"