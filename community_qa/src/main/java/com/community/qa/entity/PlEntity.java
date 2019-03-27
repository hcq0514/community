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
public class PlEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 问题ID
     */
    private String problemid;

    /**
     * 标签ID
     */
    private String labelid;


}
