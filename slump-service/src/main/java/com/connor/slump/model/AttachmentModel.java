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
 * 论坛附件表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_attachment")
@ApiModel(value="AttachmentModel对象", description="论坛附件表")
public class AttachmentModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "帖子id")
    private String topicId;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "文件路径")
    private String filePath;

    @ApiModelProperty(value = "下载所需积分")
    private Integer point;

    @ApiModelProperty(value = "文件描述")
    private String description;

    @ApiModelProperty(value = "下载的总次数")
    private Integer count;

    @ApiModelProperty(value = "是否可用")
    private String enabled;

    @ApiModelProperty(value = "上传人id")
    private String uploadUserId;

    @ApiModelProperty(value = "上传时间")
    private LocalDateTime uploadTime;

    @ApiModelProperty(value = "关联id")
    private String mainId;

    @ApiModelProperty(value = "关联类型")
    private String mainType;


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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    @Override
    public String toString() {
        return "AttachmentModel{" +
        "id=" + id +
        ", topicId=" + topicId +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", point=" + point +
        ", description=" + description +
        ", count=" + count +
        ", enabled=" + enabled +
        ", uploadUserId=" + uploadUserId +
        ", uploadTime=" + uploadTime +
        ", mainId=" + mainId +
        ", mainType=" + mainType +
        "}";
    }
}
