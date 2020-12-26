package com.example.demo.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Data
@Table(name="user_tb")
public class User {
    //lombok 的Data注解 不用再写Getset方法 此处为用户Model 第二版再修改

    @Column(name="id",type= MySqlTypeConstant.INT,length = 255,isAutoIncrement = true,isKey = true)
    private Integer id;

    @Column(name="user_name",type=MySqlTypeConstant.VARCHAR,isUnique = true,isNull = false)
    private String user_name;

    @Column(name="password",type=MySqlTypeConstant.VARCHAR,isNull = false)
    private String password;

    @Column(name="avatar_url",type=MySqlTypeConstant.VARCHAR,length = 500)
    private String avatar_url;

    @Column(name = "create_time",type = MySqlTypeConstant.VARCHAR)
    private String create_time;

    @Column(name = "update_time",type = MySqlTypeConstant.VARCHAR)
    private String update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
