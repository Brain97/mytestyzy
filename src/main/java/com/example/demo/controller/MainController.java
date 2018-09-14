package com.example.demo.controller;

import com.example.demo.dao.TbCellDao;
import com.example.demo.model.Circle;
import com.example.demo.model.TableList;
import com.example.demo.service.CircleService;
import com.example.demo.service.ImportService;
import com.example.demo.service.TableLIstService;
//import com.example.demo.utlis.MyExcelOpertate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes({"user"})
public class MainController {


    @Autowired
    private CircleService circleService;
    @Autowired
    TableLIstService tableLIstService;
    @Autowired
    ImportService importService;
    @Autowired
    TbCellDao tbCellDao;


    @RequestMapping("/upload")
    public String upload(@RequestParam("upload_path") String upload_path,
                         Model model){
        model.addAttribute("input_path",upload_path);
        importService.importMethod(upload_path);
        //circleService.testInputThread();
        return "/main";
    }

    @RequestMapping("/download")
    public String download(@RequestParam("download_path") String download_path,
                           @RequestParam("ouputname") String ouputname,
                         Model model){
        model.addAttribute("ouput_path",download_path+ouputname+".xlsx");



        //MyExcelOpertate.writeExcel(tbCellDao.gettbCell(),download_path+ouputname+".xlsx",ouputname);


        System.out.println(ouputname);



        return "/main";
    }

    @RequestMapping("/tbCell_search")
    public String search(Model model){
        //model.addAttribute("sector_name_list",tableLIstService.tbcellGetSectorName());
        //model.addAttribute("enodeb_name_list",tableLIstService.tbcellGetEnodeb());
        TableList tableList=new TableList();
        model.addAttribute("row_name",tableList.tbcell_row_name);
        return "tbCell_search";
    }

    @RequestMapping("/resualt1")
    public String resualt1(@RequestParam("search_var") String search_var,
                         Model model){

        TableList tableList=new TableList();
        model.addAttribute("row_name",tableList.tbcell_row_name);
       // model.addAttribute("c",tableLIstService.getTbCellBySectorName(search_var));
        return "resualt1";
    }

    @RequestMapping("/resualt2")
    public String resualt2(@RequestParam("search_var2") String search_var2,
                         Model model){

        TableList tableList=new TableList();
        model.addAttribute("row_name",tableList.tbcell_row_name);
        //model.addAttribute("r2",tableLIstService.getTbcellByEnobedName(search_var2));
        return "resualt2";
    }




    @RequestMapping(value = "/ajax/{set}", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> hope(@PathVariable(value = "set") int set){
        Map<String, Object> map = new HashMap<>();
        if (set==0){
            if (Circle.i!=100){
                map.put("stage", "1");
                //System.out.println("ajax stage 1");
            }else {
                map.put("stage", "2");
                //System.out.println("ajax okok");
            }
            map.put("up_num", Circle.i);
        }else {
            if (Circle.O!=100){
                map.put("stage", "1");
                //System.out.println("ajax stage 1");
            }else {
                map.put("stage", "2");
                //System.out.println("ajax okok");
            }
            map.put("up_num", Circle.O);
        }

        return map;

    }

    @RequestMapping("/test")
    public String test(){
        return "test";

    }


}
