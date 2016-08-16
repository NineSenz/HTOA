package com.ht.bean;

/**
 * Created by please fresh on 2016/8/16.
 */
public class User {
    private String id;
    private String amdid;
    private String depid;
    private String name;
    private String email;
    private String pwd;
    private String phone;
    private String sex;
    private String place;
    private String icard;
    private String anton;
    private String edu;
    private String addr;
    private String create;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmdid() {
        return amdid;
    }

    public void setAmdid(String amdid) {
        this.amdid = amdid;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getIcard() {
        return icard;
    }

    public void setIcard(String icard) {
        this.icard = icard;
    }

    public String getAnton() {
        return anton;
    }

    public void setAnton(String anton) {
        this.anton = anton;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", amdid='" + amdid + '\'' +
                ", depid='" + depid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", place='" + place + '\'' +
                ", icard='" + icard + '\'' +
                ", anton='" + anton + '\'' +
                ", edu='" + edu + '\'' +
                ", addr='" + addr + '\'' +
                ", create='" + create + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
