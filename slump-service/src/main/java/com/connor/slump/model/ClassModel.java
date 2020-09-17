package com.connor.slump.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 论坛板块分类
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_class")
@ApiModel(value="ClassModel对象", description="论坛板块分类")
public class ClassModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "父级id")
    private String parentId;

    @ApiModelProperty(value = "分类名称")
    private String className;

    @ApiModelProperty(value = "分类key值")
    private String classKey;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "板块介绍")
    private String introduce;

    @ApiModelProperty(value = "板块版规")
    private String rule;

    @ApiModelProperty(value = "帖子总数")
    private Integer topicCount;

    @ApiModelProperty(value = "回复总数")
    private Integer replyCount;

    @ApiModelProperty(value = "分类级别路径")
    private String levelPath;

    @ApiModelProperty(value = "分类级别")
    private Integer depth;

    @ApiModelProperty(value = "指定url地址链接")
    private String url;

    @ApiModelProperty(value = "logo图片路径")
    private String imgUrl;

    @ApiModelProperty(value = "创建者id")
    private String createUserId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否可用")
    private String enabled;

    @ApiModelProperty(value = "最后编辑时间")
    private LocalDateTime updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassKey() {
        return classKey;
    }

    public void setClassKey(String classKey) {
        this.classKey = classKey;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getLevelPath() {
        return levelPath;
    }

    public void setLevelPath(String levelPath) {
        this.levelPath = levelPath;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ClassModel{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", className=" + className +
        ", classKey=" + classKey +
        ", sort=" + sort +
        ", introduce=" + introduce +
        ", rule=" + rule +
        ", topicCount=" + topicCount +
        ", replyCount=" + replyCount +
        ", levelPath=" + levelPath +
        ", depth=" + depth +
        ", url=" + url +
        ", imgUrl=" + imgUrl +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", enabled=" + enabled +
        ", updateTime=" + updateTime +
        "}";
    }
}
