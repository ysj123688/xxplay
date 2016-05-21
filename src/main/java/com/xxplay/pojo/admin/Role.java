package com.xxplay.pojo.admin;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.xxplay.core.base.AppContextUtils;

public class Role {
    private Integer id;

    private String roleName;

    private String roleDesc;

    private Date createTime;

    private Integer createId;

    private String status;
    
    private String statusTxt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

	public String getStatusTxt() {
		if(StringUtils.isNotBlank(status)){
			this.statusTxt = AppContextUtils.getSysAprName("ROLE_STATUS", status);
		}
		return statusTxt;
	}
    
}