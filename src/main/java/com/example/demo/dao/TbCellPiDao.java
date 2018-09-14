package com.example.demo.dao;

import com.example.demo.model.TbCell;
import com.example.demo.model.TbCellPiProvider;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TbCellPiDao {
    @InsertProvider(type = TbCellPiProvider.class,method = "BatchInsertTbCell")
    void tbCellBatchInsert(List<TbCell> tbCellList);
}
