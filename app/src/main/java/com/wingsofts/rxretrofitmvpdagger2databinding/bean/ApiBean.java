package com.wingsofts.rxretrofitmvpdagger2databinding.bean;

/**
 * Created by wing on 16/7/21.
 */
public class ApiBean {

    /**
     * errNum : 0
     * retMsg : success
     * retData : {"phone":"15210011578","prefix":"1521001","supplier":"移动 ","province":"北京 ","city":"北京 ","suit":"152卡"}
     */

    private int errNum;
    private String retMsg;
    /**
     * phone : 15210011578
     * prefix : 1521001
     * supplier : 移动
     * province : 北京
     * city : 北京
     * suit : 152卡
     */

    private RetDataBean retData;

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public RetDataBean getRetData() {
        return retData;
    }

    public void setRetData(RetDataBean retData) {
        this.retData = retData;
    }

    public static class RetDataBean {
        private String phone;
        private String prefix;
        private String supplier;
        private String province;
        private String city;
        private String suit;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }
    }
}
