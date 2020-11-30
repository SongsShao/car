package com.songshao.test.controller;

import java.util.Map;

import com.songshao.test.serviceImpl.CarServiceImpl;
import com.songshao.test.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



/**

 * @author 作者 : ShaoSong

 * @version 创建时间：2019年11月11日 上午10:46:46

 * 类说明

 */

@RestController
@Slf4j
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @RequestMapping(value = "car/pj/getPjmc$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjmc(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjmc(map);
            result.setMsg("查询配件名称！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }

    @RequestMapping(value = "car/pj/getPjcd$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjcd(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjcd(map);
            result.setMsg("查询配件产地！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }

    @RequestMapping(value = "car/pj/getPjcx$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjcx(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjcx(map);
            result.setMsg("查询配件产地！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }

    @RequestMapping(value = "car/pj/getPjDataByMcOrCdOrcx$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjDataByMcOrCdOrcx(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjDataByMcOrCdOrcx(map);
            result.setMsg("查询配件明细！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }

    @RequestMapping(value = "car/pj/getPjCountById$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjCountById(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjCountById(map);
            result.setMsg("查询配件总数！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }

    @RequestMapping(value = "car/pj/getPjDataById$m=query.service", method = RequestMethod.POST)
    public ResultVO<?> getPjDataById(@RequestBody Map<String, Object> map){
        ResultVO<?> result = new ResultVO<Object>();
        try {
            result = carServiceImpl.getPjDataById(map);
            result.setMsg("查询id为：" + map.get("id") + "数据！");
            result.setCode(0);
        } catch (Exception e) {
            // TODO: handle exception
            result.setMsg("查询失败！");
            result.setCode(99);
        }

        return result;
    }
}
