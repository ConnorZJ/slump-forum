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
 * 论坛帖子状态表、例如精华、置顶、推荐等
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_topic_state")
@ApiModel(value="TopicStateModel对象", description="论坛帖子状态表、例如精华、置顶、推荐等")
public class TopicStateModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "主题id")
    private String topicId;

    @ApiModelProperty(value = "状态id")
    private String stateTypeId;

    @ApiModelProperty(value = "排序值")
    private String sort;

    @ApiModelProperty(value = "状态标题")
    private String title;

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

    public String getStateTypeId() {
        return stateTypeId;
    }

    public void setStateTypeId(String stateTypeId) {
        this.stateTypeId = stateTypeId;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "TopicStateModel{" +
        "id=" + id +
        ", topicId=" + topicId +
        ", stateTypeId=" + stateTypeId +
        ", sort=" + sort +
        ", title=" + title +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
