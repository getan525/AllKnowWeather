package com.zhouzhi.allknowweather.bean;

public class AreaInfo {
    /**
     * areaName : 东城区
     * areaShortName : 东城区
     * id : 0
     * isMunicipality : false
     * isSpecial : false
     * leaf : true
     * level : 2
     * parentCode : 1
     */

    private String areaName;
    private String areaShortName;
    private int id;
    private boolean isMunicipality;
    private boolean isSpecial;
    private boolean leaf;
    private int level;
    private String parentCode;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaShortName() {
        return areaShortName;
    }

    public void setAreaShortName(String areaShortName) {
        this.areaShortName = areaShortName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsMunicipality() {
        return isMunicipality;
    }

    public void setIsMunicipality(boolean isMunicipality) {
        this.isMunicipality = isMunicipality;
    }

    public boolean isIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
    /*{"citylist": [{
        "areaName": "北京市",
                "areaShortName": "北京",
                "citys": [{
            "areaName": "东城区",
                    "areaShortName": "东城区",
                    "id": 0,
                    "isMunicipality": false,
                    "isSpecial": false,
                    "leaf": true,
                    "level": 2,
                    "parentCode": "1"
        }],
        "id": 34,
                "isMunicipality": false,
                "isSpecial": false,
                "leaf": false,
                "level": 1,
                "parentCode": "0"
    }]}*/
}
