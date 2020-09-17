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
 * 论坛权限组
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_group")
@ApiModel(value="GroupModel对象", description="论坛权限组")
public class GroupModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "管理组名称")
    private String groutName;

    @ApiModelProperty(value = "key")
    private String groutKey;

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

    public String getGroutName() {
        return groutName;
    }

    public void setGroutName(String groutName) {
        this.groutName = groutName;
    }

    public String getGroutKey() {
        return groutKey;
    }

    public void setGroutKey(String groutKey) {
        this.groutKey = groutKey;
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
        return "GroupModel{" +
        "id=" + id +
        ", groutName=" + groutName +
        ", groutKey=" + groutKey +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
