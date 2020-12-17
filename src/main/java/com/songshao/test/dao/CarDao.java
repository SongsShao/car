package com.songshao.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**

 * @fileName 文件名：

 * @author 作者 : ShaoSong

 * @createDate 创建时间：2020年3月28日 下午3:45:33

 * @update 修改人 :

 * @Description 描述 :

 * @classDescription 类说明 :

 * @version 版本号: 4.0

 */

@Mapper
public interface CarDao {

    /**
     * @ClassName: CarDao
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author ShaoSong
     * @version 4.0
     * @date 2020年3月28日
     *
     */

    @Select({"select pjmc from quotation where pjmc like #{pjmc} || '%' GROUP BY pjmc"})
    public abstract List<HashMap<String, Object>> getPjmc(Map<String, Object> map);

    @Select({"select pjcd from quotation where pjcd like #{pjcd} || '%' GROUP BY pjcd"})
    public abstract List<HashMap<String, Object>> getPjcd(Map<String, Object> map);

    @Select({"select pjcx from quotation where pjcx like #{pjcx} || '%' GROUP BY pjcx"})
    public abstract List<HashMap<String, Object>> getPjcx(Map<String, Object> map);

    @Select({"select id, pjbm, pjmc, pjcx, pjcd, pjsl, pjdw, jhdj, xsdj "
            + " from quotation "
            + " where pjmc like #{pjmc} "
            + " and pjbm like #{pjbm} and pjcx like #{pjcx}"
            + " ORDER BY id limit ${ size * (page - 1)}, #{size}"})
    public abstract List<HashMap<String, Object>> getPjDataByMcOrCdOrcx(Map<String, Object> map);

    @Select({"select count(*) count from quotation where userid = #{userid}"})
    public abstract List<HashMap<String, Object>> getPjCountById(Map<String, Object> map);

    @Select({"select * from quotation where id = #{id}"})
    public abstract List<HashMap<String, Object>> getPjDataById(Map<String, Object> map);
}

