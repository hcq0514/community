package com.community.qa.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 回答
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
public class ReplyEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 问题ID
     */
    private String problemid;

    /**
     * 回答内容
     */
    private String content;

    /**
     * 创建日期
     */
    private LocalDateTime createtime;

    /**
     * 更新日期
     */
    private LocalDateTime updatetime;

    /**
     * 回答人ID
     */
    private String userid;

    /**
     * 回答人昵称
     */
    private String nickname;


}
