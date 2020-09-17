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
 * 投票帖的投票用户
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_vote_user")
@ApiModel(value="VoteUserModel对象", description="投票帖的投票用户")
public class VoteUserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "投票id")
    private String voteId;

    @ApiModelProperty(value = "投票项id")
    private String voteItemId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


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

    public String getVoteItemId() {
        return voteItemId;
    }

    public void setVoteItemId(String voteItemId) {
        this.voteItemId = voteItemId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "VoteUserModel{" +
        "id=" + id +
        ", voteId=" + voteId +
        ", voteItemId=" + voteItemId +
        ", userId=" + userId +
        ", createTime=" + createTime +
        "}";
    }
}
