package com.bysj.entity.vo.query;

import com.bysj.common.request.ObjectQuery;
/**
 * <p>
 * ChatRecord 查询条件
 * </p>
 *
 * @author 刘冲
 * @since 2018-12-27
 */

public class ChatRecordQuery extends ObjectQuery {
    private Integer teamId;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}