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
 * 论坛帖子专题分类表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_special")
@ApiModel(value="SpecialModel对象", description="论坛帖子专题分类表")
public class SpecialModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "专题所属板块id")
    private String classId;

    @ApiModelProperty(value = "专题名称")
    private String specialName;

    @ApiModelProperty(value = "专题介绍")
    private String introduce;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "主题总计")
    private Integer topicCount;

    @ApiModelProperty(value = "回复总计")
    private Integer replyCount;

    @ApiModelProperty(value = "是否启用")
    private String enabled;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "SpecialModel{" +
        "id=" + id +
        ", classId=" + classId +
        ", specialName=" + specialName +
        ", introduce=" + introduce +
        ", sort=" + sort +
        ", topicCount=" + topicCount +
        ", replyCount=" + replyCount +
        ", enabled=" + enabled +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
