package com.songshao.test.serviceImpl;

import com.songshao.test.bean.GjgzdjbBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author songshao
 * @since 2020-12-15
 */
public interface IGjgzdjbService {
    public List<GjgzdjbBean> getDataSearch(GjgzdjbBean gjgzdjb);

    public List<GjgzdjbBean> getDataById(GjgzdjbBean bean);

    public List<GjgzdjbBean> getDataByBmx(GjgzdjbBean bean);

    int updateDataState(GjgzdjbBean bean);
}
