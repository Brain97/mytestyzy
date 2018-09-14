package com.example.demo.service;

import com.example.demo.dao.TbKPIDao;
import com.example.demo.dao.TbPRBNewDao;
import com.example.demo.model.TbPRBNew;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectService {
@Autowired
    private TbKPIDao  kpiDao;
@Autowired
    private TbPRBNewDao prbNewDao;
public List  Select3(String column,String  ENODEB,String startTime,String  endTime)
{
    return kpiDao.SelectTbKPIByPara(column,ENODEB,startTime,endTime);

}
    public List  Select4(String column,String  ENODEB,String startTime,String  endTime)
    {
        return prbNewDao.SelectTbPRBNEWByPara(column,ENODEB,startTime,endTime);

    }
}
