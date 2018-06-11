package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String id;

    private String username;

    private String password;

    private String phonenum;

    private String sex;

    private String sign;

    private String salt;

    private String headpic;

    private String dharmaname;

    private String province;

    private String city;

    private Date date;

    private String status;

    private String duruId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic == null ? null : headpic.trim();
    }

    public String getDharmaname() {
        return dharmaname;
    }

    public void setDharmaname(String dharmaname) {
        this.dharmaname = dharmaname == null ? null : dharmaname.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDuruId() {
        return duruId;
    }

    public void setDuruId(String duruId) {
        this.duruId = duruId == null ? null : duruId.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getHeadpic() == null ? other.getHeadpic() == null : this.getHeadpic().equals(other.getHeadpic()))
            && (this.getDharmaname() == null ? other.getDharmaname() == null : this.getDharmaname().equals(other.getDharmaname()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDuruId() == null ? other.getDuruId() == null : this.getDuruId().equals(other.getDuruId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getHeadpic() == null) ? 0 : getHeadpic().hashCode());
        result = prime * result + ((getDharmaname() == null) ? 0 : getDharmaname().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDuruId() == null) ? 0 : getDuruId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", sex=").append(sex);
        sb.append(", sign=").append(sign);
        sb.append(", salt=").append(salt);
        sb.append(", headpic=").append(headpic);
        sb.append(", dharmaname=").append(dharmaname);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", date=").append(date);
        sb.append(", status=").append(status);
        sb.append(", duruId=").append(duruId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public User() {
    }

    public User(String id, String username, String password, String phonenum, String sex, String sign, String salt, String headpic, String dharmaname, String province, String city, Date date, String status, String duruId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phonenum = phonenum;
        this.sex = sex;
        this.sign = sign;
        this.salt = salt;
        this.headpic = headpic;
        this.dharmaname = dharmaname;
        this.province = province;
        this.city = city;
        this.date = date;
        this.status = status;
        this.duruId = duruId;
    }
}