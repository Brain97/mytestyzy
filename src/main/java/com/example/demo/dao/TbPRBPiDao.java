package com.example.demo.dao;

import com.example.demo.model.TbPRB;
import com.example.demo.model.TbPRBPiProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbPRBPiDao {
    @InsertProvider(type = TbPRBPiProvider.class,method = "BatchInsertTbPRB")
    void tbPRBBatchInsert(List<TbPRB> tbRPBList);
}
