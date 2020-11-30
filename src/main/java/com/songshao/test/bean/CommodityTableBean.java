package com.songshao.test.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CommodityTableBean {
 private  int    cid;
 private  String cName;
 private  String cDesc;
 private  String cType;
 private  String cSeries;
 private  String cImage;
 private  String whereItBelongs;
 private  String size;
 private  String color;
 private  String stock;
 private  int    isUid;
}
