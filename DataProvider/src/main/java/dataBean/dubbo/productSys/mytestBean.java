package dataBean.dubbo.productSys;

import java.util.Date;

import dataBean.IDataBean;

public class mytestBean implements IDataBean {


    private String id;
    
    private String name;

    private Integer age;

    private Date brithday;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

   
    

}