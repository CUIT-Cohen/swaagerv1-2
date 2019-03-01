package com.bysj.entity.vo.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * TeamRequest 请求对象
 * </p>
 *
 * @author zhangyajun
 * @since 2018-12-27
 */

public class TeamRequest  {

    /**
     *  小组名称
     */
    @ApiModelProperty("小组名称")
    private String teamName;
    /**
     *  成员个数
     */
    @ApiModelProperty("成员个数")
    private Integer memberCount;
    /**
     *  板块id
     */
    @ApiModelProperty("板块id")
    private Integer plateId;
    /**
     *  组长id
     */
    @ApiModelProperty("组长id")
    private String leaderId;
    /**
     *  状态：1 有效 2无效
     */
    @ApiModelProperty("状态：1 有效 2无效")
    private Integer state;
    /**
     *  创建时间
     */
    @ApiModelProperty("创建时间")
    private Date gmtCreate;
    /**
     *  修改时间
     */
    @ApiModelProperty("修改时间")
    private Date gmtModify;
    /**
     *  修改者id
     */
    @ApiModelProperty("修改者id")
    private Integer userModify;



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


    public String getLeaderId() {
    return leaderId;
    }

    public void setLeaderId(String leaderId) {
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




}