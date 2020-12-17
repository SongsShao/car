package com.songshao.test.service;

import com.songshao.test.bean.GjgzdjbBean;
import com.songshao.test.Mapper.GjgzdjbMapper;
import com.songshao.test.serviceImpl.IGjgzdjbService;
import com.songshao.test.utils.Util;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author songshao
 * @since 2020-12-15
 */
@Service
public class GjgzdjbServiceImpl implements IGjgzdjbService {

    @Autowired
    GjgzdjbMapper gjgzdjbMapper;

    @Override
    public List<GjgzdjbBean> getDataSearch(GjgzdjbBean gjgzdjb) {
        return gjgzdjbMapper.getDataSearch(gjgzdjb);
    }

    @Override
    public List<GjgzdjbBean> getDataById(GjgzdjbBean bean) {
        return gjgzdjbMapper.getDataById(bean);
    }

    @Override
    public List<GjgzdjbBean> getDataByBmx(GjgzdjbBean bean) {
        return gjgzdjbMapper.getDataByBmx(bean);
    }

    @Override
    public int updateDataState(GjgzdjbBean bean) {
        if(Util.isEmpty(bean.getGzzt())){
            bean.setGzzt("正常");
        }
        return gjgzdjbMapper.updateDataState(bean);
    }
}
