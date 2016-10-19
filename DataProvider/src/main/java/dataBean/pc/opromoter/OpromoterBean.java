package dataBean.pc.opromoter;

import dataBean.IDataBean;

public class OpromoterBean implements IDataBean {
    private String id;
    private String promoterName;
    private String IdCardNo;
    private String telePhoneNo;
    private String email;
    private String province;
    private String city;
    private String cooperSource;
    private int promotionDirection; // 0代表个人版，1代表企业版

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPromoterName() {
        return promoterName;
    }

    public void setPromoterName(String promoterName) {
        this.promoterName = promoterName;
    }

    public String getIdCardNo() {
        return IdCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        IdCardNo = idCardNo;
    }

    public String getTelePhoneNo() {
        return telePhoneNo;
    }

    public void setTelePhoneNo(String telePhoneNo) {
        this.telePhoneNo = telePhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCooperSource() {
        return cooperSource;
    }

    public void setCooperSource(String cooperSource) {
        this.cooperSource = cooperSource;
    }

    public int getPromotionDirection() {
        return promotionDirection;
    }

    public void setPromotionDirection(int promotionDirection) {
        this.promotionDirection = promotionDirection;
    }

}
