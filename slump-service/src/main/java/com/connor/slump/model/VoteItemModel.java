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
 * 论坛投票帖的投票项
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_vote_item")
@ApiModel(value="VoteItemModel对象", description="论坛投票帖的投票项")
public class VoteItemModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "投票id")
    private String voteId;

    @ApiModelProperty(value = "投票项目名称")
    private String voteName;

    @ApiModelProperty(value = "投票数")
    private Integer voteCount;

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

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public String getVoteName() {
        return voteName;
    }

    public void setVoteName(String voteName) {
        this.voteName = voteName;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
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
        return "VoteItemModel{" +
        "id=" + id +
        ", voteId=" + voteId +
        ", voteName=" + voteName +
        ", voteCount=" + voteCount +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
