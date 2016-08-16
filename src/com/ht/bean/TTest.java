package com.ht.bean;

/**
 * Created by GMB on 2016/8/12.
 */
public class TTest {
    private String id;
    private String name;
    private double money;
    private String birth;

    public TTest() {
    }

    public TTest(String id, String name, double money,String birth) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.birth=birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", birth=" + birth +
                '}';
    }
}
