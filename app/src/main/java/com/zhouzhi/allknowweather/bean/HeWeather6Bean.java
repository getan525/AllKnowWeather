package com.zhouzhi.allknowweather.bean;

import java.util.List;


    public  class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101180901","location":"洛阳","parent_city":"洛阳","admin_area":"河南省","cnty":"中国","lat":"34.66304016","lon":"112.43447113","tz":"+8.00"}
         * update : {"loc":"2021-01-09 15:26","utc":"2021-01-09 07:26"}
         * status : ok
         * now : {"cloud":"10","cond_code":"100","cond_txt":"晴","fl":"-3","hum":"14","pcpn":"0.0","pres":"986","tmp":"3","vis":"17","wind_deg":"180","wind_dir":"南风","wind_sc":"3","wind_spd":"18"}
         * daily_forecast : [{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2021-01-09","hum":"27","mr":"03:15","ms":"14:03","pcpn":"0.0","pop":"0","pres":"1002","sr":"07:37","ss":"17:38","tmp_max":"5","tmp_min":"-3","uv_index":"3","vis":"25","wind_deg":"270","wind_dir":"西风","wind_sc":"3-4","wind_spd":"16"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2021-01-10","hum":"27","mr":"04:25","ms":"14:47","pcpn":"0.0","pop":"0","pres":"1002","sr":"07:37","ss":"17:39","tmp_max":"5","tmp_min":"-2","uv_index":"1","vis":"24","wind_deg":"270","wind_dir":"西风","wind_sc":"3-4","wind_spd":"20"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2021-01-11","hum":"22","mr":"05:36","ms":"15:38","pcpn":"0.0","pop":"0","pres":"990","sr":"07:37","ss":"17:40","tmp_max":"5","tmp_min":"-2","uv_index":"3","vis":"25","wind_deg":"270","wind_dir":"西风","wind_sc":"1-2","wind_spd":"4"}]
         * lifestyle : [{"type":"comf","brf":"不舒适","txt":"白天多云，但仍会使您感觉偏冷，不舒适，请注意适时添加衣物，以防感冒。"},{"type":"drsg","brf":"冷","txt":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"},{"type":"flu","brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"type":"sport","brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"},{"type":"trav","brf":"一般","txt":"天空状况还是比较好的，但温度稍微有点低，且风稍大，会让您感觉些许凉意。外出请注意防风。"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<LifestyleBean> lifestyle;

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

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<LifestyleBean> getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
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
             * loc : 2021-01-09 15:26
             * utc : 2021-01-09 07:26
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

        public static class NowBean {
            /**
             * cloud : 10
             * cond_code : 100
             * cond_txt : 晴
             * fl : -3
             * hum : 14
             * pcpn : 0.0
             * pres : 986
             * tmp : 3
             * vis : 17
             * wind_deg : 180
             * wind_dir : 南风
             * wind_sc : 3
             * wind_spd : 18
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 101
             * cond_code_n : 101
             * cond_txt_d : 多云
             * cond_txt_n : 多云
             * date : 2021-01-09
             * hum : 27
             * mr : 03:15
             * ms : 14:03
             * pcpn : 0.0
             * pop : 0
             * pres : 1002
             * sr : 07:37
             * ss : 17:38
             * tmp_max : 5
             * tmp_min : -3
             * uv_index : 3
             * vis : 25
             * wind_deg : 270
             * wind_dir : 西风
             * wind_sc : 3-4
             * wind_spd : 16
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d() {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n() {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d() {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n() {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max() {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min() {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 不舒适
             * txt : 白天多云，但仍会使您感觉偏冷，不舒适，请注意适时添加衣物，以防感冒。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

    //{"HeWeather6":[{"basic":{"cid":"CN101180901","location":"洛阳","parent_city":"洛阳","admin_area":"河南省","cnty":"中国","lat":"34.66304016","lon":"112.43447113","tz":"+8.00"},"update":{"loc":"2021-01-09 15:26","utc":"2021-01-09 07:26"},"status":"ok","now":{"cloud":"10","cond_code":"100","cond_txt":"晴","fl":"-3","hum":"14","pcpn":"0.0","pres":"986","tmp":"3","vis":"17","wind_deg":"180","wind_dir":"南风","wind_sc":"3","wind_spd":"18"},"daily_forecast":[{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2021-01-09","hum":"27","mr":"03:15","ms":"14:03","pcpn":"0.0","pop":"0","pres":"1002","sr":"07:37","ss":"17:38","tmp_max":"5","tmp_min":"-3","uv_index":"3","vis":"25","wind_deg":"270","wind_dir":"西风","wind_sc":"3-4","wind_spd":"16"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2021-01-10","hum":"27","mr":"04:25","ms":"14:47","pcpn":"0.0","pop":"0","pres":"1002","sr":"07:37","ss":"17:39","tmp_max":"5","tmp_min":"-2","uv_index":"1","vis":"24","wind_deg":"270","wind_dir":"西风","wind_sc":"3-4","wind_spd":"20"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2021-01-11","hum":"22","mr":"05:36","ms":"15:38","pcpn":"0.0","pop":"0","pres":"990","sr":"07:37","ss":"17:40","tmp_max":"5","tmp_min":"-2","uv_index":"3","vis":"25","wind_deg":"270","wind_dir":"西风","wind_sc":"1-2","wind_spd":"4"}],"lifestyle":[{"type":"comf","brf":"不舒适","txt":"白天多云，但仍会使您感觉偏冷，不舒适，请注意适时添加衣物，以防感冒。"},{"type":"drsg","brf":"冷","txt":"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。"},{"type":"flu","brf":"易发","txt":"昼夜温差很大，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。"},{"type":"sport","brf":"较不宜","txt":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。"},{"type":"trav","brf":"一般","txt":"天空状况还是比较好的，但温度稍微有点低，且风稍大，会让您感觉些许凉意。外出请注意防风。"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]}]}

}
