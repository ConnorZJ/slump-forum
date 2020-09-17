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
 * 论坛附件下载表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_attachment_download")
@ApiModel(value="AttachmentDownloadModel对象", description="论坛附件下载表")
public class AttachmentDownloadModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "附件id")
    private String attachmentId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "同一用户下载次数")
    private Integer count;

    @ApiModelProperty(value = "消费积分")
    private Integer point;

    @ApiModelProperty(value = "最后一次下载时间")
    private LocalDateTime downloadTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public LocalDateTime getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(LocalDateTime downloadTime) {
        this.downloadTime = downloadTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AttachmentDownloadModel{" +
        "id=" + id +
        ", attachmentId=" + attachmentId +
        ", userId=" + userId +
        ", count=" + count +
        ", point=" + point +
        ", downloadTime=" + downloadTime +
        ", createTime=" + createTime +
        "}";
    }
}
