package com.zhouzhi.allknowweather.bean;

import java.util.List;

public class AirBean {
    /**
     * basic : {"cid":"CN101180901","location":"洛阳","parent_city":"洛阳","admin_area":"河南省","cnty":"中国","lat":"34.66304016","lon":"112.43447113","tz":"+8.00"}
     * update : {"loc":"2021-01-19 21:42","utc":"2021-01-19 13:42"}
     * status : ok
     * air_now_city : {"aqi":"97","qlty":"良","main":"PM2.5","pm25":"72","pm10":"130","no2":"41","so2":"7","co":"0.7","o3":"34","pub_time":"2021-01-19 21:00"}
     * air_now_station : [{"air_sta":"中移产业园","aqi":"100","asid":"CNA3341","co":"0.9","lat":"34.6332","lon":"112.4951","main":"PM2.5","no2":"44","o3":"24","pm10":"128","pm25":"75","pub_time":"2021-01-19 21:00","qlty":"良","so2":"8"},{"air_sta":"豫西宾馆","aqi":"113","asid":"CNA1814","co":"0.6","lat":"34.6869","lon":"112.4664","main":"PM2.5","no2":"42","o3":"34","pm10":"146","pm25":"85","pub_time":"2021-01-19 21:00","qlty":"轻度污染","so2":"6"},{"air_sta":"英才小学","aqi":"98","asid":"CNA3636","co":"0.8","lat":"34.6781","lon":"112.4388","main":"PM2.5","no2":"46","o3":"33","pm10":"138","pm25":"73","pub_time":"2021-01-19 21:00","qlty":"良","so2":"8"},{"air_sta":"伊滨","aqi":"113","asid":"CNA3340","co":"0.8","lat":"34.6326","lon":"112.6005","main":"PM2.5","no2":"41","o3":"29","pm10":"162","pm25":"85","pub_time":"2021-01-19 21:00","qlty":"轻度污染","so2":"6"},{"air_sta":"市委新办公区","aqi":"102","asid":"CNA1817","co":"0.8","lat":"34.6258","lon":"112.4275","main":"PM2.5","no2":"43","o3":"34","pm10":"121","pm25":"76","pub_time":"2021-01-19 21:00","qlty":"轻度污染","so2":"5"},{"air_sta":"市委党校","aqi":"92","asid":"CNA1812","co":"0.8","lat":"34.6511","lon":"112.3939","main":"PM10","no2":"46","o3":"29","pm10":"134","pm25":"67","pub_time":"2021-01-19 21:00","qlty":"良","so2":"10"},{"air_sta":"开发区管委会","aqi":"92","asid":"CNA1816","co":"0.9","lat":"34.6231","lon":"112.3844","main":"PM10","no2":"42","o3":"38","pm10":"134","pm25":"60","pub_time":"2021-01-19 21:00","qlty":"良","so2":"5"},{"air_sta":"吉利监测站","aqi":"103","asid":"CNA3593","co":"0.7","lat":"34.8993","lon":"112.5736","main":"PM2.5","no2":"46","o3":"30","pm10":"128","pm25":"77","pub_time":"2021-01-19 21:00","qlty":"轻度污染","so2":"8"},{"air_sta":"河南林校","aqi":"94","asid":"CNA1815","co":"0.6","lat":"34.6869","lon":"112.4831","main":"PM2.5","no2":"33","o3":"36","pm10":"117","pm25":"70","pub_time":"2021-01-19 21:00","qlty":"良","so2":"8"},{"air_sta":"河科大西苑校区","aqi":"103","asid":"CNA3635","co":"0.6","lat":"34.662","lon":"112.3677","main":"PM2.5","no2":"40","o3":"36","pm10":"126","pm25":"77","pub_time":"2021-01-19 21:00","qlty":"轻度污染","so2":"6"}]
     */

    private BasicBean basic;
    private UpdateBean update;
    private String status;
    private AirNowCityBean air_now_city;
    private List<AirNowStationBean> air_now_station;

    public BasicBean getBasic() {
        return basic;
    }

    public void setBasic(BasicBean basic) {
        this.basic = basic;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AirNowCityBean getAir_now_city() {
        return air_now_city;
    }

    public void setAir_now_city(AirNowCityBean air_now_city) {
        this.air_now_city = air_now_city;
    }

    public List<AirNowStationBean> getAir_now_station() {
        return air_now_station;
    }

    public void setAir_now_station(List<AirNowStationBean> air_now_station) {
        this.air_now_station = air_now_station;
    }

    public static class BasicBean {
        /**
         * cid : CN101180901
         * location : 洛阳
         * parent_city : 洛阳
         * admin_area : 河南省
         * cnty : 中国
         * lat : 34.66304016
         * lon : 112.43447113
         * tz : +8.00
         */

        private String cid;
        private String location;
        private String parent_city;
        private String admin_area;
        private String cnty;
        private String lat;
        private String lon;
        private String tz;

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getParent_city() {
            return parent_city;
        }

        public void setParent_city(String parent_city) {
            this.parent_city = parent_city;
        }

        public String getAdmin_area() {
            return admin_area;
        }

        public void setAdmin_area(String admin_area) {
            this.admin_area = admin_area;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getTz() {
            return tz;
        }

        public void setTz(String tz) {
            this.tz = tz;
        }
    }

    public static class UpdateBean {
        /**
         * loc : 2021-01-19 21:42
         * utc : 2021-01-19 13:42
         */

        private String loc;
        private String utc;

        public String getLoc() {
            return loc;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public String getUtc() {
            return utc;
        }

        public void setUtc(String utc) {
            this.utc = utc;
        }
    }

    public static class AirNowCityBean {
        /**
         * aqi : 97
         * qlty : 良
         * main : PM2.5
         * pm25 : 72
         * pm10 : 130
         * no2 : 41
         * so2 : 7
         * co : 0.7
         * o3 : 34
         * pub_time : 2021-01-19 21:00
         */

        private String aqi;
        private String qlty;
        private String main;
        private String pm25;
        private String pm10;
        private String no2;
        private String so2;
        private String co;
        private String o3;
        private String pub_time;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getQlty() {
            return qlty;
        }

        public void setQlty(String qlty) {
            this.qlty = qlty;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getPub_time() {
            return pub_time;
        }

        public void setPub_time(String pub_time) {
            this.pub_time = pub_time;
        }
    }

    public static class AirNowStationBean {
        /**
         * air_sta : 中移产业园
         * aqi : 100
         * asid : CNA3341
         * co : 0.9
         * lat : 34.6332
         * lon : 112.4951
         * main : PM2.5
         * no2 : 44
         * o3 : 24
         * pm10 : 128
         * pm25 : 75
         * pub_time : 2021-01-19 21:00
         * qlty : 良
         * so2 : 8
         */

        private String air_sta;
        private String aqi;
        private String asid;
        private String co;
        private String lat;
        private String lon;
        private String main;
        private String no2;
        private String o3;
        private String pm10;
        private String pm25;
        private String pub_time;
        private String qlty;
        private String so2;

        public String getAir_sta() {
            return air_sta;
        }

        public void setAir_sta(String air_sta) {
            this.air_sta = air_sta;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getAsid() {
            return asid;
        }

        public void setAsid(String asid) {
            this.asid = asid;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPub_time() {
            return pub_time;
        }

        public void setPub_time(String pub_time) {
            this.pub_time = pub_time;
        }

        public String getQlty() {
            return qlty;
        }

        public void setQlty(String qlty) {
            this.qlty = qlty;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }
    }
}
