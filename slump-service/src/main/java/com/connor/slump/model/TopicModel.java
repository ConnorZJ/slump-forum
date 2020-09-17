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
 * 论坛帖子表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_topic")
@ApiModel(value="TopicModel对象", description="论坛帖子表")
public class TopicModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "板块分类id")
    private String classId;

    @ApiModelProperty(value = "主题所属专题id")
    private String specialId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "内容")
    private String body;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "是否启用")
    private String enabled;

    @ApiModelProperty(value = "访问总计")
    private Integer hits;

    @ApiModelProperty(value = "回复总计")
    private Integer replyCount;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "最后编辑时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "最后编辑人")
    private String updateBy;

    @ApiModelProperty(value = "最后回复时间")
    private LocalDateTime repliedTime;

    @ApiModelProperty(value = "最后回复人")
    private String repliedBy;

    @ApiModelProperty(value = "主题图标id")
    private String iconId;

    @ApiModelProperty(value = "是否关闭")
    private String isClose;

    @ApiModelProperty(value = "帖子展示图片")
    private String imgUrl;


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

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
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

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getRepliedTime() {
        return repliedTime;
    }

    public void setRepliedTime(LocalDateTime repliedTime) {
        this.repliedTime = repliedTime;
    }

    public String getRepliedBy() {
        return repliedBy;
    }

    public void setRepliedBy(String repliedBy) {
        this.repliedBy = repliedBy;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String getIsClose() {
        return isClose;
    }

    public void setIsClose(String isClose) {
        this.isClose = isClose;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "TopicModel{" +
        "id=" + id +
        ", classId=" + classId +
        ", specialId=" + specialId +
        ", title=" + title +
        ", body=" + body +
        ", userId=" + userId +
        ", enabled=" + enabled +
        ", hits=" + hits +
        ", replyCount=" + replyCount +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", updateTime=" + updateTime +
        ", updateBy=" + updateBy +
        ", repliedTime=" + repliedTime +
        ", repliedBy=" + repliedBy +
        ", iconId=" + iconId +
        ", isClose=" + isClose +
        ", imgUrl=" + imgUrl +
        "}";
    }
}
