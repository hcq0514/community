package com.community.article.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 专栏
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ColumnEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专栏名称
     */
    private String name;

    /**
     * 专栏简介
     */
    private String summary;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 申请日期
     */
    private LocalDateTime createtime;

    /**
     * 审核日期
     */
    private LocalDateTime checktime;

    /**
     * 状态
     */
    private String state;


}
