package com.community.article.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 频道
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChannelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 频道名称
     */
    private String name;

    /**
     * 状态
     */
    private String state;


}
