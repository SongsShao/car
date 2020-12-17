package com.songshao.test.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author songshao
 * @since 2020-12-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GjgzdjbBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 设备编号
     */
    private String sbbh;

    /**
     * 设备名称
     */
    private String sbmc;

    /**
     * 设备型号
     */
    private String sbxh;

    /**
     * 故障状态描述
     */
    private String gzztms;

    /**
     * 故障时间
     */
    private LocalDate gzsj;

    /**
     * 故障原因  （正常使用、非正常使用）
     */
    private String gzyy;

    /**
     * 故障单号
     */
    private String gzdh;

    /**
     * 部门（区分例行和维修）
     */
    private String gzbm;

    /**
     * 故障填报人
     */
    private String gztbr;

    /**
     * 状态
     */
    private String gzzt;

    /**
     * 备注
     */
    private String gzbz;

    /**
     * 预留字段1
     */
    private String ylzd1;

    /**
     * 预留字段2
     */
    private String ylzd2;

    /**
     * 预留字段3
     */
    private String ylzd3;


}
