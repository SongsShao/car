package com.songshao.test.serviceImpl;

import com.songshao.test.vo.ResultVO;

import java.util.Map;

/**

 * @fileName 文件名：

 * @author 作者 : ShaoSong

 * @createDate 创建时间：2020年3月28日 下午3:30:22

 * @update 修改人 :

 * @Description 描述 :

 * @classDescription 类说明 :

 * @version 版本号: 4.0

 */

public abstract interface CarServiceImpl {

    /**
     * @ClassName: CarServiceImpl
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author ShaoSong
     * @version 4.0
     * @date 2020年3月28日
     *
     */

    public abstract ResultVO getPjmc(Map<String, Object> map);

    public abstract ResultVO getPjcd(Map<String, Object> map);

    public abstract ResultVO getPjcx(Map<String, Object> map);

    public abstract ResultVO getPjDataByMcOrCdOrcx(Map<String, Object> map);

    public abstract ResultVO getPjCountById(Map<String, Object> map);

    public abstract ResultVO<?> getPjDataById(Map<String, Object> map);
}
