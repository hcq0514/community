package com.community.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

import static com.baomidou.mybatisplus.annotation.IdType.ID_WORKER_STR;

/**
 * 实体类
 *
 * @author Administrator
 */

@Data
@TableName("comm_admin")
public class AdminEntity implements Serializable {

    @TableId(type = ID_WORKER_STR)
    private String id;//ID


    private String loginname;//登陆名称
    private String password;//密码
    private String state;//状态


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
