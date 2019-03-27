package com.community.qa.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
public class UlEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 标签ID
     */
    private String lid;


}
