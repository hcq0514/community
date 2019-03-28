package com.community.spit.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author hcq
 * @date 2019-03-28
 */
@Data
public class SpitEntity implements Serializable {
    @Id
    private String _id;
    private String content;
    private LocalDateTime publishtime;
    private String userid;
    private String nickname;
    private Integer visits;
    private Integer thumbup;
    private Integer share;
    private Integer comment;
    private String state;
    private String parentid;
}



