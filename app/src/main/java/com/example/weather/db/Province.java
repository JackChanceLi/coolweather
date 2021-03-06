package com.example.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 蚍蜉 on 2017/2/17.
 */

public class Province extends DataSupport {

    private int id;//每个类都有

    private String provinceName;//省名称

    private int provinceCode;//省代号

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
