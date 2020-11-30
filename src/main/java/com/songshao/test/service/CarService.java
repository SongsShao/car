package com.songshao.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.songshao.test.dao.CarDao;
import com.songshao.test.serviceImpl.CarServiceImpl;
import com.songshao.test.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lombok.extern.slf4j.Slf4j;

/**

 * @fileName 文件名：

 * @author 作者 : ShaoSong

 * @createDate 创建时间：2020年3月28日 下午3:31:22

 * @update 修改人 :

 * @Description 描述 :

 * @classDescription 类说明 :

 * @version 版本号: 4.0

 */
@Slf4j
@Service
public class CarService implements CarServiceImpl {

    /**
     * @ClassName: CarService
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author ShaoSong
     * @version 4.0
     * @date 2020年3月28日
     *
     */

    @Autowired
    private CarDao carDao;

    @Override
    public ResultVO getPjmc(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        if (null != map.get("pjmc")) {
            map.put("pjmc", "%" + map.get("pjmc") + "%");
        } else {
            map.put("pjmc", "%");
        }
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjmc(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }

    @Override
    public ResultVO getPjcd(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        if (null != map.get("pjcd")) {
            map.put("pjcd", "%" + map.get("pjcd") + "%");
        } else {
            map.put("pjcd", "%");
        }
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjcd(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }

    @Override
    public ResultVO getPjcx(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        if (null != map.get("pjcx")) {
            map.put("pjcx", "%" + map.get("pjcx") + "%");
        } else {
            map.put("pjcx", "%");
        }
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjcx(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }

    @Override
    public ResultVO getPjDataByMcOrCdOrcx(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        if (null != map.get("pjcx")) {
            map.put("pjcx", "%" + map.get("pjcx") + "%");
        } else{
            map.put("pjcx", "%");
        }
        if (null != map.get("pjmc")) {
            map.put("pjmc", "%" + map.get("pjmc") + "%");
        } else{
            map.put("pjmc", "%");
        }
        if (null != map.get("pjbm")) {
            map.put("pjbm", "%" + map.get("pjbm") + "%");
        } else{
            map.put("pjbm", "%");
        }
        if (null == map.get("page")) {
            map.put("page", 1);
        }
        if (null == map.get("size")) {
            map.put("size", 20);
        }
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjDataByMcOrCdOrcx(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }

    @Override
    public ResultVO getPjCountById(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjCountById(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }

    @Override
    public ResultVO<?> getPjDataById(Map<String, Object> map) {
        ResultVO resultVO = new ResultVO();
        log.info("查询参数：" + map.toString());
        List<HashMap<String, Object>> list = carDao.getPjDataById(map);
        log.info("返回结果：" + list.toString());
        resultVO.setData(list);
        resultVO.setTotalCount(list.size());
        return resultVO;
    }
}
