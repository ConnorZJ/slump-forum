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
 * 论坛投票帖子
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_vote")
@ApiModel(value="VoteModel对象", description="论坛投票帖子")
public class VoteModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "帖子id")
    private String topicId;

    @ApiModelProperty(value = "类别，1：单选，2：多选")
    private String type;

    @ApiModelProperty(value = "投票总数")
    private Integer count;

    @ApiModelProperty(value = "投票用户总数")
    private Integer userCount;

    @ApiModelProperty(value = "积分权限限制，0：不限制")
    private Integer limit;

    @ApiModelProperty(value = "投票有效天数，0：不限制")
    private Integer availableDay;

    @ApiModelProperty(value = "查看方式，1：直接查看，2：投票后查看")
    private String lookMode;

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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getAvailableDay() {
        return availableDay;
    }

    public void setAvailableDay(Integer availableDay) {
        this.availableDay = availableDay;
    }

    public String getLookMode() {
        return lookMode;
    }

    public void setLookMode(String lookMode) {
        this.lookMode = lookMode;
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
        return "VoteModel{" +
        "id=" + id +
        ", topicId=" + topicId +
        ", type=" + type +
        ", count=" + count +
        ", userCount=" + userCount +
        ", limit=" + limit +
        ", availableDay=" + availableDay +
        ", lookMode=" + lookMode +
        ", enabled=" + enabled +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
