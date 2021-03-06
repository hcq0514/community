package com.community.qa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.baomidou.mybatisplus.annotation.IdType.ID_WORKER_STR;

/**
 * <p>
 * 问题
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
@TableName("comm_problem")
public class ProblemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = ID_WORKER_STR)
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建日期
     */
    private LocalDateTime createtime;

    /**
     * 修改日期
     */
    private LocalDateTime updatetime;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 浏览量
     */
    private Long visits;

    /**
     * 点赞数
     */
    private Long thumbup;

    /**
     * 回复数
     */
    private Long reply;

    /**
     * 是否解决
     */
    private String solve;

    /**
     * 回复人昵称
     */
    private String replyname;

    /**
     * 回复日期
     */
    private LocalDateTime replytime;


}
