package com.community.article.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.baomidou.mybatisplus.annotation.IdType.ID_WORKER_STR;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author hcq
 * @since 2019-03-27
 */
@Data
@TableName("comm_article")
public class ArticleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = ID_WORKER_STR)
    private String id;
    /**
     * 专栏ID
     */
    private String columnid;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章正文
     */
    private String content;

    /**
     * 文章封面
     */
    private String image;

    /**
     * 发表日期
     */
    private LocalDateTime createtime;

    /**
     * 修改日期
     */
    private LocalDateTime updatetime;

    /**
     * 是否公开
     */
    private String ispublic;

    /**
     * 是否置顶
     */
    private String istop;

    /**
     * 浏览量
     */
    private Integer visits;

    /**
     * 点赞数
     */
    private Integer thumbup;

    /**
     * 评论数
     */
    private Integer comment;

    /**
     * 审核状态
     */
    private String state;

    /**
     * 所属频道
     */
    private String channelid;

    /**
     * URL
     */
    private String url;

    /**
     * 类型
     */
    private String type;


}
