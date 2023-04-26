package com.example.oa.entity.process;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 审批类型
 * @TableName oa_process
 */
@TableName(value ="oa_process")
@Data
public class OaProcess implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 审批code
     */
    @TableField(value = "process_code")
    private String processCode;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 审批模板id
     */
    @TableField(value = "process_template_id")
    private Long processTemplateId;

    /**
     * 审批类型id
     */
    @TableField(value = "process_type_id")
    private Long processTypeId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 表单值
     */
    @TableField(value = "form_values")
    private String formValues;

    /**
     * 流程实例id
     */
    @TableField(value = "process_instance_id")
    private String processInstanceId;

    /**
     * 当前审批人
     */
    @TableField(value = "current_auditor")
    private String currentAuditor;

    /**
     * 状态（0：默认 1：审批中 2：审批通过 -1：驳回）
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
        OaProcess other = (OaProcess) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessCode() == null ? other.getProcessCode() == null : this.getProcessCode().equals(other.getProcessCode()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProcessTemplateId() == null ? other.getProcessTemplateId() == null : this.getProcessTemplateId().equals(other.getProcessTemplateId()))
            && (this.getProcessTypeId() == null ? other.getProcessTypeId() == null : this.getProcessTypeId().equals(other.getProcessTypeId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getFormValues() == null ? other.getFormValues() == null : this.getFormValues().equals(other.getFormValues()))
            && (this.getProcessInstanceId() == null ? other.getProcessInstanceId() == null : this.getProcessInstanceId().equals(other.getProcessInstanceId()))
            && (this.getCurrentAuditor() == null ? other.getCurrentAuditor() == null : this.getCurrentAuditor().equals(other.getCurrentAuditor()))
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
        result = prime * result + ((getProcessCode() == null) ? 0 : getProcessCode().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProcessTemplateId() == null) ? 0 : getProcessTemplateId().hashCode());
        result = prime * result + ((getProcessTypeId() == null) ? 0 : getProcessTypeId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getFormValues() == null) ? 0 : getFormValues().hashCode());
        result = prime * result + ((getProcessInstanceId() == null) ? 0 : getProcessInstanceId().hashCode());
        result = prime * result + ((getCurrentAuditor() == null) ? 0 : getCurrentAuditor().hashCode());
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
        sb.append(", processCode=").append(processCode);
        sb.append(", userId=").append(userId);
        sb.append(", processTemplateId=").append(processTemplateId);
        sb.append(", processTypeId=").append(processTypeId);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", formValues=").append(formValues);
        sb.append(", processInstanceId=").append(processInstanceId);
        sb.append(", currentAuditor=").append(currentAuditor);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}