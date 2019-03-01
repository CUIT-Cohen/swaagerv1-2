package com.bysj.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.*;
import com.bysj.common.request.ActionResponse;
import javax.annotation.Resource;
import com.antiy.common.utils.LogUtils;
import com.bysj.common.request.QueryCondition;
import com.antiy.common.utils.ParamterExceptionUtils;

import com.cuit.bbs.service.ITotalStationInformationService;
import com.cuit.bbs.entity.TotalStationInformation;
import com.cuit.bbs.entity.vo.request.TotalStationInformationRequest;
import com.cuit.bbs.entity.vo.response.TotalStationInformationResponse;
import com.cuit.bbs.entity.vo.query.TotalStationInformationQuery;


/**
 *
 * @author lc
 * @since 2019-02-28
 */
@Api(value = "TotalStationInformation", description = "全站信息表")
@RestController
@RequestMapping("/v1/bbs/totalstationinformation")
public class TotalStationInformationController {


    @Resource
    public ITotalStationInformationService iTotalStationInformationService;

    /**
     * 保存
     * @param totalStationInformationRequest
     * @return actionResponse
     */
    @ApiOperation(value = "保存接口", notes = "传入实体对象信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/save/single", method = RequestMethod.POST)
    public ActionResponse saveSingle(@ApiParam(value = "totalStationInformation") @RequestBody TotalStationInformationRequest totalStationInformationRequest)throws Exception{
        iTotalStationInformationService.saveTotalStationInformation(totalStationInformationRequest);
        return ActionResponse.success();
    }

    /**
     * 修改
     * @param totalStationInformationRequest
     * @return actionResponse
     */
    @ApiOperation(value = "修改接口", notes = "传入实体对象信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/update/single", method = RequestMethod.POST)
    public ActionResponse updateSingle(@ApiParam(value = "totalStationInformation")TotalStationInformationRequest totalStationInformationRequest)throws Exception{
        iTotalStationInformationService.updateTotalStationInformation(totalStationInformationRequest);
        return ActionResponse.success();
    }

    /**
     * 批量查询
     * @param totalStationInformationQuery
     * @return actionResponse
     */
    @ApiOperation(value = "批量查询接口", notes = "传入查询条件")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/query/list", method = RequestMethod.GET)
    public ActionResponse queryList(@ApiParam(value = "totalStationInformation") TotalStationInformationQuery totalStationInformationQuery)throws Exception{
        return ActionResponse.success(iTotalStationInformationService.findPageTotalStationInformation(totalStationInformationQuery));
    }

    /**
     * 通过ID查询
     * @param id
     * @return actionResponse
     */
    @ApiOperation(value = "通过ID查询", notes = "主键封装对象")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public ActionResponse queryById(@ApiParam(value = "totalStationInformation") @PathVariable("id") Integer id)throws Exception{

        return ActionResponse.success(iTotalStationInformationService.getById(id));
    }

    /**
     * 通过ID删除
     * @param id
     * @return actionResponse
     */
    @ApiOperation(value = "通过ID删除接口", notes = "主键封装对象")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ActionResponse deleteById(@ApiParam(value = "id") @PathVariable("id") Integer id)throws Exception{

        return ActionResponse.success(iTotalStationInformationService.deleteById(id));
    }
}

