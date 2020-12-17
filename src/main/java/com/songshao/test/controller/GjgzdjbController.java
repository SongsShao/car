package com.songshao.test.controller;


import com.songshao.test.bean.GjgzdjbBean;
import com.songshao.test.serviceImpl.IGjgzdjbService;
import com.songshao.test.utils.DataResult;
import com.songshao.test.utils.Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author songshao
 * @since 2020-12-15
 */
@RestController
@Slf4j
public class GjgzdjbController {

    @Autowired
    private IGjgzdjbService gjgzdjbService;

    @RequestMapping(value = "guzhang/gjgzdjb/getDataSearch$m=query.service", method = RequestMethod.POST)
    public DataResult getDataSearch(@RequestBody GjgzdjbBean gjgzdjb){
        DataResult dataResult = new DataResult();
        try {
            if(gjgzdjb.getSbmc() != null && !gjgzdjb.getSbmc().isEmpty()){
               List<GjgzdjbBean> list = gjgzdjbService.getDataSearch(gjgzdjb);
               if(list.size() > 0 && !list.isEmpty()){
                    dataResult.setData(list);
                    dataResult.setCount(list.size());
                    dataResult.setSuccess(true);
                    dataResult.setMsg("查询故障列表数据成功！");
               } else {
                   dataResult.setMsg("查询暂无数据！");
                   dataResult.setCount(0);
                   dataResult.setSuccess(false);
               }
            } else {
                dataResult.setMsg("参数缺失！");
                dataResult.setCount(0);
                dataResult.setSuccess(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataResult;
    }

    @RequestMapping(value = "guzhang/gjgzdjb/getDataById$m=query.service", method = RequestMethod.POST)
    public DataResult getDataById(@RequestBody GjgzdjbBean bean){
        DataResult dataResult = new DataResult();
        try{
            if(bean.getId() != null && !bean.getId().isEmpty()){
                List<GjgzdjbBean> list = gjgzdjbService.getDataById(bean);
                if(list.size() > 0 && !list.isEmpty()){
                    dataResult.setData(list);
                    dataResult.setCount(list.size());
                    dataResult.setSuccess(true);
                    dataResult.setMsg("通过ID查询数据成功！");
                } else {
                    dataResult.setMsg("通过ID查询暂无数据！");
                    dataResult.setCount(0);
                    dataResult.setSuccess(false);
                }
            } else {
                dataResult.setMsg("参数缺失！");
                dataResult.setCount(0);
                dataResult.setSuccess(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataResult;
    }

    @RequestMapping(value = "guzhang/gjgzdjb/getDataByBmx$m=query.service", method = RequestMethod.POST)
    public DataResult getDataByBmx(@RequestBody GjgzdjbBean bean){
        DataResult dataResult = new DataResult();
        try{
            if(Util.isEmpty(bean.getSbbh()) && Util.isEmpty(bean.getSbmc()) && Util.isEmpty(bean.getSbxh())){
                List<GjgzdjbBean> list = gjgzdjbService.getDataByBmx(bean);
                if(list.size() > 0 && !list.isEmpty()){
                    dataResult.setData(list);
                    dataResult.setCount(list.size());
                    dataResult.setSuccess(true);
                    dataResult.setMsg("通过查询对应设备编号、设备名称、设备型号去定位数据成功！");
                } else {
                    dataResult.setMsg("通过查询对应设备编号、设备名称、设备型号去定位暂无数据！");
                    dataResult.setCount(0);
                    dataResult.setSuccess(false);
                }
            } else {
                dataResult.setMsg("参数缺失！");
                dataResult.setCount(0);
                dataResult.setSuccess(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataResult;
    }

    @RequestMapping(value = "guzhang/gjgzdjb/updateDataState$m=query.service", method = RequestMethod.POST)
    public DataResult updateDataState(@RequestBody GjgzdjbBean bean){
        DataResult dataResult = new DataResult();
        try{
            if(Util.isEmpty(bean.getId())){
                int i = gjgzdjbService.updateDataState(bean);
                if(i > 0){
                    dataResult.setCount(i);
                    dataResult.setSuccess(true);
                    dataResult.setMsg("通过修改为正常状态成功！");
                } else {
                    dataResult.setMsg("暂无数据可以修改哦！");
                    dataResult.setCount(0);
                    dataResult.setSuccess(false);
                }
            } else {
                dataResult.setMsg("参数缺失！");
                dataResult.setCount(0);
                dataResult.setSuccess(false);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataResult;
    }
}
