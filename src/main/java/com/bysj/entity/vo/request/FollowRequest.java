package com.bysj.entity.vo.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * FollowRequest 请求对象
 * </p>
 *
 * @author zhangyajun
 * @since 2018-12-27
 */

public class FollowRequest  {

    /**
     *  粉丝id
     */
    @ApiModelProperty("粉丝id")
    private Integer fanId;
    /**
     *  被关注者id
     */
    @ApiModelProperty("被关注者id")
    private Integer starId;
    /**
     *  创建时间
     */
    @ApiModelProperty("创建时间")
    private Date gmtCreate;


    public Integer getFanId() {
    return fanId;
    }

    public void setFanId(Integer fanId) {
        this.fanId = fanId;
        }


    public Integer getStarId() {
    return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
        }


    public Date getGmtCreate() {
    return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        }




}