package com.songshao.test.Mapper;

import com.songshao.test.bean.GjgzdjbBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author songshao
 * @since 2020-12-15
 */

@Mapper
public interface GjgzdjbMapper {

    @Select({"SELECT id, sbbh, sbmc, sbxh, gzsj , gzdh, gzbm, gztbr, gzzt" +
            "        from gjgzdjb" +
            "        where  sbbh like '%${sbmc}%'" +
            " or sbmc like '%${sbmc}%'" +
            " or sbxh like '%${sbmc}%'" +
            " ORDER BY gzsj DESC"})
    List<GjgzdjbBean> getDataSearch(GjgzdjbBean gjgzdjb);

    @Select({"SELECT id, sbbh, sbmc, sbxh, gzztms, gzsj, gzyy, gzdh, gzbm, gztbr, gzzt, gzbz, ylzd1, ylzd2, ylzd3 " +
            "from gjgzdjb " +
            "where id =#{id}"})
    List<GjgzdjbBean> getDataById(GjgzdjbBean gjgzdjbBean);

    @Select({"select count(*) from gjgzdjb where sbbh = #{sbbh} and sbmc = #{sbmc} and sbxh = #{sbxh}"})
    List<GjgzdjbBean> getDataByBmx(GjgzdjbBean bean);

    @Update({"update gjgzdjb set gzzt = #{gzzt} where id=#{id}"})
    int updateDataState(GjgzdjbBean bean);
}
