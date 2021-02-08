package com.amos.common.dto.base;

/**
 * 模块名称: common
 * 模块描述: IResponse
 *
 * @author amos.wang
 * @date 2021/2/8 16:43
 */
public interface IResponse {

    /**
     * get error code
     *
     * @return error code
     */
    String getCode();

    /**
     * get error msg
     *
     * @return error message
     */
    String getMessage();

}
