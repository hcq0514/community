package com.community.base.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

import static com.baomidou.mybatisplus.annotation.IdType.ID_WORKER_STR;

/**
 * @author hcq
 */

@Data
@TableName("comm_label")
public class LabelEntity implements Serializable {
    @TableId(type = ID_WORKER_STR)
    private String id;
    //标签名称
    private String labelname;
    //状态
    private String state;
    //使用数量
    private Long count;
    //关注数
    private Long fans;
    //是否推荐
    private String recommend;

}
