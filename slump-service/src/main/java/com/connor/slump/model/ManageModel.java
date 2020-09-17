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
 * 论坛版本权限功能表
 * </p>
 *
 * @author Connor
 * @since 2020-09-17
 */
@TableName("slump_manage")
@ApiModel(value="ManageModel对象", description="论坛版本权限功能表")
public class ManageModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @ApiModelProperty(value = "管理权限名称")
    private String manageName;

    @ApiModelProperty(value = "管理权限标识符")
    private String manageKey;

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

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName;
    }

    public String getManageKey() {
        return manageKey;
    }

    public void setManageKey(String manageKey) {
        this.manageKey = manageKey;
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
        return "ManageModel{" +
        "id=" + id +
        ", manageName=" + manageName +
        ", manageKey=" + manageKey +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
