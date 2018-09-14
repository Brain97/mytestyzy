package com.example.demo.dao;

import com.example.demo.model.TbKPI;
import com.example.demo.model.TbKPIPiProvider;
import com.example.demo.model.TbPRB;
import com.example.demo.model.TbPRBPiProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbKPIPiDao {
    @InsertProvider(type = TbKPIPiProvider.class,method = "BatchInsertTbKPI")
    void tbKPIBatchInsert(List<TbKPI> tbKPIList);
}