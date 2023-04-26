package com.example.oa.entity.process;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 审批模板
 * @TableName oa_process_template
 */
@TableName(value ="oa_process_template")
@Data
public class OaProcessTemplate implements Serializable {
    /**
     * 角色id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 模板名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 图标路径
     */
    @TableField(value = "icon_url")
    private String iconUrl;

    /**
     * 
     */
    @TableField(value = "process_type_id")
    private String processTypeId;

    /**
     * 表单属性
     */
    @TableField(value = "form_props")
    private String formProps;

    /**
     * 表单选项
     */
    @TableField(value = "form_options")
    private String formOptions;

    /**
     * 流程定义key
     */
    @TableField(value = "process_definition_key")
    private String processDefinitionKey;

    /**
     * 流程定义上传路径
     */
    @TableField(value = "process_definition_path")
    private String processDefinitionPath;

    /**
     * 流程定义模型id
     */
    @TableField(value = "process_model_id")
    private String processModelId;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 删除标记（0:不可用 1:可用）
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OaProcessTemplate other = (OaProcessTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIconUrl() == null ? other.getIconUrl() == null : this.getIconUrl().equals(other.getIconUrl()))
            && (this.getProcessTypeId() == null ? other.getProcessTypeId() == null : this.getProcessTypeId().equals(other.getProcessTypeId()))
            && (this.getFormProps() == null ? other.getFormProps() == null : this.getFormProps().equals(other.getFormProps()))
            && (this.getFormOptions() == null ? other.getFormOptions() == null : this.getFormOptions().equals(other.getFormOptions()))
            && (this.getProcessDefinitionKey() == null ? other.getProcessDefinitionKey() == null : this.getProcessDefinitionKey().equals(other.getProcessDefinitionKey()))
            && (this.getProcessDefinitionPath() == null ? other.getProcessDefinitionPath() == null : this.getProcessDefinitionPath().equals(other.getProcessDefinitionPath()))
            && (this.getProcessModelId() == null ? other.getProcessModelId() == null : this.getProcessModelId().equals(other.getProcessModelId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        result = prime * result + ((getProcessTypeId() == null) ? 0 : getProcessTypeId().hashCode());
        result = prime * result + ((getFormProps() == null) ? 0 : getFormProps().hashCode());
        result = prime * result + ((getFormOptions() == null) ? 0 : getFormOptions().hashCode());
        result = prime * result + ((getProcessDefinitionKey() == null) ? 0 : getProcessDefinitionKey().hashCode());
        result = prime * result + ((getProcessDefinitionPath() == null) ? 0 : getProcessDefinitionPath().hashCode());
        result = prime * result + ((getProcessModelId() == null) ? 0 : getProcessModelId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", processTypeId=").append(processTypeId);
        sb.append(", formProps=").append(formProps);
        sb.append(", formOptions=").append(formOptions);
        sb.append(", processDefinitionKey=").append(processDefinitionKey);
        sb.append(", processDefinitionPath=").append(processDefinitionPath);
        sb.append(", processModelId=").append(processModelId);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}