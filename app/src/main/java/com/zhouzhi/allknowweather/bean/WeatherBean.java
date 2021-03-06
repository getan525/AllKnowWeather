package com.zhouzhi.allknowweather.bean;

import java.util.List;

public class WeatherBean {
    /**
     * data : {"yesterday":{"date":"6日星期三","high":"高温 0℃","fx":"东北风","low":"低温 -9℃","fl":"<![CDATA[2级]]>","type":"多云"},"city":"雁塔区","forecast":[{"date":"7日星期四","high":"高温 -3℃","fengli":"<![CDATA[2级]]>","low":"低温 -9℃","fengxiang":"东风","type":"阴"},{"date":"8日星期五","high":"高温 2℃","fengli":"<![CDATA[2级]]>","low":"低温 -8℃","fengxiang":"西风","type":"晴"},{"date":"9日星期六","high":"高温 2℃","fengli":"<![CDATA[1级]]>","low":"低温 -4℃","fengxiang":"东北风","type":"多云"},{"date":"10日星期天","high":"高温 2℃","fengli":"<![CDATA[3级]]>","low":"低温 -5℃","fengxiang":"西风","type":"阴"},{"date":"11日星期一","high":"高温 4℃","fengli":"<![CDATA[2级]]>","low":"低温 -7℃","fengxiang":"西南风","type":"晴"}],"ganmao":"感冒多发期，适当减少外出频率，适量补充水分，适当增减衣物。","wendu":"-4"}
     * status : 1000
     * desc : OK
     */

    private DataBean data;
    private int status;
    private String desc;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static class DataBean {
        /**
         * yesterday : {"date":"6日星期三","high":"高温 0℃","fx":"东北风","low":"低温 -9℃","fl":"<![CDATA[2级]]>","type":"多云"}
         * city : 雁塔区
         * forecast : [{"date":"7日星期四","high":"高温 -3℃","fengli":"<![CDATA[2级]]>","low":"低温 -9℃","fengxiang":"东风","type":"阴"},{"date":"8日星期五","high":"高温 2℃","fengli":"<![CDATA[2级]]>","low":"低温 -8℃","fengxiang":"西风","type":"晴"},{"date":"9日星期六","high":"高温 2℃","fengli":"<![CDATA[1级]]>","low":"低温 -4℃","fengxiang":"东北风","type":"多云"},{"date":"10日星期天","high":"高温 2℃","fengli":"<![CDATA[3级]]>","low":"低温 -5℃","fengxiang":"西风","type":"阴"},{"date":"11日星期一","high":"高温 4℃","fengli":"<![CDATA[2级]]>","low":"低温 -7℃","fengxiang":"西南风","type":"晴"}]
         * ganmao : 感冒多发期，适当减少外出频率，适量补充水分，适当增减衣物。
         * wendu : -4
         */

        private YesterdayBean yesterday;
        private String city;
        private String ganmao;
        private String wendu;
        private List<ForecastBean> forecast;

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 6日星期三
             * high : 高温 0℃
             * fx : 东北风
             * low : 低温 -9℃
             * fl : <![CDATA[2级]]>
             * type : 多云
             */

            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class ForecastBean {
            /**
             * date : 7日星期四
             * high : 高温 -3℃
             * fengli : <![CDATA[2级]]>
             * low : 低温 -9℃
             * fengxiang : 东风
             * type : 阴
             */

            private String date;
            private String high;
            private String fengli;
            private String low;
            private String fengxiang;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
    //{"data":{"yesterday":{"date":"6日星期三","high":"高温 0℃","fx":"东北风","low":"低温 -9℃","fl":"<![CDATA[2级]]>","type":"多云"},"city":"雁塔区","forecast":[{"date":"7日星期四","high":"高温 -3℃","fengli":"<![CDATA[2级]]>","low":"低温 -9℃","fengxiang":"东风","type":"阴"},{"date":"8日星期五","high":"高温 2℃","fengli":"<![CDATA[2级]]>","low":"低温 -8℃","fengxiang":"西风","type":"晴"},{"date":"9日星期六","high":"高温 2℃","fengli":"<![CDATA[1级]]>","low":"低温 -4℃","fengxiang":"东北风","type":"多云"},{"date":"10日星期天","high":"高温 2℃","fengli":"<![CDATA[3级]]>","low":"低温 -5℃","fengxiang":"西风","type":"阴"},{"date":"11日星期一","high":"高温 4℃","fengli":"<![CDATA[2级]]>","low":"低温 -7℃","fengxiang":"西南风","type":"晴"}],"ganmao":"感冒多发期，适当减少外出频率，适量补充水分，适当增减衣物。","wendu":"-4"},"status":1000,"desc":"OK"}

}
