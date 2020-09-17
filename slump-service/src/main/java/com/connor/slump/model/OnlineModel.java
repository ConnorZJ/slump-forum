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
 * 论坛在线用户表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_online")
@ApiModel(value="OnlineModel对象", description="论坛在线用户表")
public class OnlineModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "用户sessionid")
    private String sessionId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "登录时间")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "最后活动时间")
    private LocalDateTime lastActiveTime;

    @ApiModelProperty(value = "最后停留页面")
    private String lastUrl;

    @ApiModelProperty(value = "最后停留页面信息")
    private String lastUrlInfo;

    @ApiModelProperty(value = "最后停留板块分类id")
    private Integer lastClassId;

    @ApiModelProperty(value = "用户id地址")
    private String ipAddress;

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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(LocalDateTime loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDateTime getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(LocalDateTime lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public String getLastUrl() {
        return lastUrl;
    }

    public void setLastUrl(String lastUrl) {
        this.lastUrl = lastUrl;
    }

    public String getLastUrlInfo() {
        return lastUrlInfo;
    }

    public void setLastUrlInfo(String lastUrlInfo) {
        this.lastUrlInfo = lastUrlInfo;
    }

    public Integer getLastClassId() {
        return lastClassId;
    }

    public void setLastClassId(Integer lastClassId) {
        this.lastClassId = lastClassId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
        return "OnlineModel{" +
        "id=" + id +
        ", sessionId=" + sessionId +
        ", userId=" + userId +
        ", loginTime=" + loginTime +
        ", lastActiveTime=" + lastActiveTime +
        ", lastUrl=" + lastUrl +
        ", lastUrlInfo=" + lastUrlInfo +
        ", lastClassId=" + lastClassId +
        ", ipAddress=" + ipAddress +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
