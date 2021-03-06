package com.bysj.entity;


import com.bysj.common.request.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * 讨论组表
 * </p>
 *
 * @author lc
 * @since 2019-02-28
 */

public class Team extends BaseEntity {


    private static final long serialVersionUID = 1L;

    /**
     * 小组名称
     */
    @ApiModelProperty("小组名称")
    private String teamName;
    /**
     * 成员个数
     */
    @ApiModelProperty("成员个数")
    private Integer memberCount;
    /**
     * 板块id
     */
    @ApiModelProperty("板块id")
    private Integer plateId;
    /**
     * 组长id
     */
    @ApiModelProperty("组长id")
    private Integer leaderId;
    /**
     * 状态:1 有效 2无效
     */
    @ApiModelProperty("状态:1 有效,0 无效")
    private Integer state;
    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date gmtModify;
    /**
     * 修改者id
     */
    @ApiModelProperty("修改者id")
    private Integer userModify;

    /**
     * 小组说明
     */
    private String memo;


    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }


    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }


    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }


    public Integer getUserModify() {
        return userModify;
    }

    public void setUserModify(Integer userModify) {
        this.userModify = userModify;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"teamName\":\"")
                .append(teamName).append('\"');
        sb.append(",\"memberCount\":")
                .append(memberCount);
        sb.append(",\"plateId\":")
                .append(plateId);
        sb.append(",\"leaderId\":\"")
                .append(leaderId).append('\"');
        sb.append(",\"state\":")
                .append(state);
        sb.append(",\"gmtCreate\":\"")
                .append(gmtCreate).append('\"');
        sb.append(",\"gmtModify\":\"")
                .append(gmtModify).append('\"');
        sb.append(",\"userModify\":")
                .append(userModify);
        sb.append(",\"memo\":\"")
                .append(memo).append('\"');
        sb.append('}');
        return sb.toString();
    }
}