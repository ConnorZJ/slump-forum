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
 * 论坛用户表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_user")
@ApiModel(value="UserModel对象", description="论坛用户表")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "登录名、用户名")
    private String loginName;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "头像地址")
    private String headUrl;

    @ApiModelProperty(value = "自我介绍")
    private String introduce;

    @ApiModelProperty(value = "个性签名")
    private String signature;

    @ApiModelProperty(value = "发帖数")
    private Integer topicCount;

    @ApiModelProperty(value = "帖子回复数")
    private Integer replyCount;

    @ApiModelProperty(value = "精华贴子数")
    private Integer bestTopicCount;

    @ApiModelProperty(value = "最后发帖id")
    private String lastTopicId;

    @ApiModelProperty(value = "最后回复id")
    private String lastReplyId;

    @ApiModelProperty(value = "积分")
    private Integer amount;

    @ApiModelProperty(value = "是否启用")
    private String enabled;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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

    public Integer getBestTopicCount() {
        return bestTopicCount;
    }

    public void setBestTopicCount(Integer bestTopicCount) {
        this.bestTopicCount = bestTopicCount;
    }

    public String getLastTopicId() {
        return lastTopicId;
    }

    public void setLastTopicId(String lastTopicId) {
        this.lastTopicId = lastTopicId;
    }

    public String getLastReplyId() {
        return lastReplyId;
    }

    public void setLastReplyId(String lastReplyId) {
        this.lastReplyId = lastReplyId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return "UserModel{" +
        "id=" + id +
        ", loginName=" + loginName +
        ", nickname=" + nickname +
        ", password=" + password +
        ", email=" + email +
        ", phone=" + phone +
        ", headUrl=" + headUrl +
        ", introduce=" + introduce +
        ", signature=" + signature +
        ", topicCount=" + topicCount +
        ", replyCount=" + replyCount +
        ", bestTopicCount=" + bestTopicCount +
        ", lastTopicId=" + lastTopicId +
        ", lastReplyId=" + lastReplyId +
        ", amount=" + amount +
        ", enabled=" + enabled +
        ", createTime=" + createTime +
        "}";
    }
}
